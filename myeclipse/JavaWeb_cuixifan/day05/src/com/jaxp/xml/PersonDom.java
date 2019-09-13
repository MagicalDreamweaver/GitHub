package com.jaxp.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class PersonDom {
	//��jaxp������perso.xml����DOMʽ�Ľ���
public static void main(String[] args) throws Exception {
	selectAll();
	//selectFirst();
	//addNode();
	//changeContent();
	//delNode();
	//traverseNode();
}
public static void list1(Node node1){
	if(node1.getNodeType()==Node.ELEMENT_NODE){                                //�жϽڵ��Ƿ�ΪԪ��
		System.out.println(node1.getNodeName());
	}
	
	NodeList list=node1.getChildNodes();                //�õ���Ԫ�ؼ���
	
	for(int i=0;i<list.getLength();i++){
		list1(list.item(i));
	}
	
}

public static void traverseNode() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc=builder.parse("src/person.xml");
	
	list1(doc);                                                                 //���õݹ�˼��
}

public static void delNode() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc =builder.parse("src/person.xml");
	
	Node p1=doc.getElementsByTagName("p1").item(0);
	Node sex1=doc.getElementsByTagName("sex").item(0);
	
	p1.removeChild(sex1);
	
	TransformerFactory transformerFactory=TransformerFactory.newInstance();
	Transformer transformer=transformerFactory.newTransformer();
	transformer.transform(new DOMSource(doc), new StreamResult("src/person.xml"));
	
}

public static void changeContent() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc=builder.parse("src/person.xml");
	
	Node node1=doc.getElementsByTagName("sex").item(0);
	
	node1.setTextContent("nan");
	
	TransformerFactory transformerFactory=TransformerFactory.newInstance();
	Transformer transformer=transformerFactory.newTransformer();
	transformer.transform(new DOMSource(doc),new StreamResult("src/person.xml"));
	
}

public static void addNode() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc=builder.parse("src/person.xml");
	
	Node node1=doc.getElementsByTagName("p1").item(0);
	
	Element sex=doc.createElement("sex");
	Text text1=doc.createTextNode("nv");
	sex.appendChild(text1);
	
	node1.appendChild(sex);
	
	TransformerFactory transformerFactory=TransformerFactory.newInstance();       //��дxml��
	Transformer transformer=transformerFactory.newTransformer();
	transformer.transform(new DOMSource(doc),new StreamResult("src/person.xml"));
	
}

public static void selectFirst() throws Exception{
	DocumentBuilderFactory builderFactory=DocumentBuilderFactory.newInstance();
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	Document doc=builder.parse("src/person.xml");                             
	NodeList list=doc.getElementsByTagName("name");
	Node node1=list.item(0);
	System.out.println(node1.getTextContent());
	
}

public static void selectAll() throws Exception{ 
	DocumentBuilderFactory builderFactory =DocumentBuilderFactory.newInstance();
	
	DocumentBuilder builder=builderFactory.newDocumentBuilder();
	
	Document doc=builder.parse("src/person.xml");                                  //ǰ�涼��Ϊ�˻�ȡdom�ļ�
	
	NodeList list=doc.getElementsByTagName("name");                                	//�����ȡ��ǩ ���ֽڵ� �õ�����
	
	for(int i=0;i<list.getLength();i++){
		Node node1=list.item(i);
		System.out.println(node1.getTextContent());
	}
	
}

}
