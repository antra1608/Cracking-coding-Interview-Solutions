package DynamicProgramming;

import java.util.HashMap;

public class BooleanEvaluation {

	
	boolean stringToBool(String c)
	{
		return c.equals("1")?true:false;
	}
	int countEval(String s,boolean result,HashMap<String,Integer> memo)
	{
		if(s.length()==0)
			return 0;
		if(s.length() ==1)
			return stringToBool(s)==result?1:0;
		
		if(memo.containsKey(result+s))
			return memo.get(result+s);
		
		int ways=0;
		for(int i=1;i<s.length();i+=2)
		{
			char c=s.charAt(i);
			String left=s.substring(0,i);
			String right=s.substring(i+1,s.length());
			int leftTrue=countEval(left,true,memo);
			int leftFalse=countEval(left,false,memo);
			int rightTrue=countEval(right,true,memo);
			int rightFalse=countEval(right,false,memo);
			
			int total=(leftTrue+leftFalse)*(rightTrue+rightFalse);
			
			int totalTrue=0;
			if(c=='^')
			{
				totalTrue=leftTrue*rightFalse+rightTrue*leftFalse;
			}
			else if(c=='&')
			{
				totalTrue=leftTrue*rightTrue;
			}
			else if(c=='|')
			{
				totalTrue=leftTrue*rightTrue+leftFalse*rightTrue+leftTrue*rightFalse;
			}
			int subways=result?totalTrue:(total-totalTrue);
			ways+=subways;		
		}
		memo.put(result+s, ways);
		return ways;
		
	}

public static void main(String args[])
{
	BooleanEvaluation be=new BooleanEvaluation();
	HashMap<String,Integer> memo=new HashMap<String,Integer>();
	System.out.print(be.countEval("1^0|0|1", true, memo));

}

}
