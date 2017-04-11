package Tree_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

class Project
{
	private ArrayList<Project> children =new ArrayList<Project>();
	private HashMap<String,Project> map=new HashMap<String,Project>();
	private String name;
	public enum State{complete,partial,blank};
	private State state=State.blank;
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	Project(String name)
{
	this.name=name;
}
public void addNeighbour(Project node)
{
	if(!map.containsKey(node))
	{
		children.add(node);
	}
}
public String getName()
{
	return name;
}
public ArrayList<Project> getChildren(){
	return children;
}
}
class Graph1
{

	private ArrayList<Project> nodes=new ArrayList<Project>();
	private HashMap<String , Project> map=new HashMap<String,Project>();
	public Project getOrCreateNode(String name)
	{
		if(!map.containsKey(name))
		{
			Project node=new Project(name);
			nodes.add(node);
			map.put(name,node);
			
		
	}
	
	return map.get(name);
}
	public void addEdge(String startName,String endName)
	{
		Project start=getOrCreateNode(startName);
		Project end=getOrCreateNode(endName);
		start.addNeighbour(end);
	}
	public ArrayList<Project> getNodes(){ return nodes;}
}

 class Build_order {

static Graph1 buildGraph(String[] Projects,String[][] dependencies)
{
	Graph1 graph=new Graph1();
	for(String Project : Projects)
	{
		graph.getOrCreateNode(Project);
	}
	
	for(String[] dependency : dependencies )
	{
		String first=dependency[0];
		String second=dependency[1];
		graph.addEdge(first, second);
	}
	return graph;
}

static Stack<Project> findBuildOrder(String []projects,String[][]dependencies)
{
	Graph1 graph=buildGraph(projects, dependencies);
	return orderProject(graph.getNodes());
}
static Stack<Project> orderProject(ArrayList<Project> projects)
{
	Stack<Project> stack=new Stack<Project>();
	for(Project project:projects)
	{
		if(project.getState()==Project.State.blank)
		{
			if(!doDfs(project,stack))
				return null;
		}
	}
	return stack;
}

static boolean doDfs(Project project,Stack<Project> stack)
{
	if(project.getState()==Project.State.partial)
		return false;
	if(project.getState()==Project.State.blank)
	{
		project.setState(Project.State.partial);
		ArrayList<Project> children=new ArrayList<Project>();
		children=project.getChildren();
		for(Project child :children)
		{
			if(!doDfs(child,stack))return false;
		}
		project.setState(Project.State.complete);
		stack.push(project);
		
	}
	return true;
}

	 public static void main(String a[])
{
	String[] project={"a","b","c","d","e"};
	String[][] dependencies=new String[5][2];
	dependencies[0][0]="d";
	dependencies[0][1]="a";
	dependencies[1][0]="b";
	dependencies[1][1]="f";
	dependencies[2][0]="d";
	dependencies[2][1]="b";
	dependencies[3][0]="a";
	dependencies[3][1]="f";
	dependencies[4][0]="c";
	dependencies[4][1]="d";
	Stack<Project> stack=findBuildOrder(project,dependencies);
	int i=0;
	System.out.println(stack.size());
	while(stack.size()>i)
	{
		System.out.println(stack.get(i).getName());
		i++;
	}
}

}
