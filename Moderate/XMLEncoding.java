package Moderate;

import java.util.ArrayList;

public class XMLEncoding {

	void encodeEnd(StringBuilder sb) {

		sb.append("0");
		sb.append(" ");
	}

	void encode(String s, StringBuilder sb) {
		s = s.replace("0", "\\0");
		sb.append(s);
		sb.append(" ");
	}

	void encode(Attribute a, StringBuilder sb) {
		int tag = a.getTagCode(a.tag);
		encode(String.valueOf(tag), sb);
		encode(a.value, sb);
	}

	void encode(Element root, StringBuilder sb) {
		int tag = root.getNameCode(root.tag);
		ArrayList<Attribute> attribute = root.attribute;
		ArrayList<Element> element = root.element;
		encode(String.valueOf(tag), sb);
		for (Attribute a : attribute) {
			encode(a, sb);
		}
		encodeEnd(sb);
		if (root.value != null || root.value == " ") {
			encode(root.value, sb);
		} else {
			for (Element e : element) {
				encode(e, sb);
			}
		}
		encodeEnd(sb);
	}

	String encode(Element e) {
		StringBuilder sb = new StringBuilder();
		encode(e, sb);
		return sb.toString();
	}

	public static void main(String args[]) {

		XMLEncoding xe = new XMLEncoding();
		Element e = new Element("family");
		Attribute a1 = new Attribute("lastname", "McDowel");
		Attribute a2 = new Attribute("state", "CA");

		Element f = new Element("person", "Some message");
		e.insert(a1);
		e.insert(a2);
		Attribute a3 = new Attribute("firstname", "Gayle");
		f.insert(a3);
		e.insert(f);
		System.out.println(xe.encode(e));
	}

}
