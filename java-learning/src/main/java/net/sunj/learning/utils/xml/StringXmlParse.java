package net.sunj.learning.utils.xml;

import java.io.File;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class StringXmlParse {

	public static void main(String[] args) {
		//fileInputTest();
		//xmlStringInputTest();
		kaptResultXmlStringInputTest();
	}

	public static void fileInputTest() {
		System.out.println(">>> fileInputTest START <<<");
		try {
			File inputFile = new File("input.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("student");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(">>> fileInputTest END <<<");
	}
	
	public static void xmlStringInputTest() {
		System.out.println(">>> xmlStringInputTest START <<<");
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<class>"
				+ "	<student rollno=\"393\">"
				+ "		<firstname>dinkar</firstname>"
				+ "		<lastname>kad</lastname>"
				+ "		<nickname>dinkar</nickname>"
				+ "		<marks>85</marks>"
				+ "	</student>"
				+ "	<student rollno=\"493\">"
				+ "		<firstname>Vaneet</firstname>"
				+ "		<lastname>Gupta</lastname>"
				+ "		<nickname>vinni</nickname>"
				+ "		<marks>95</marks>"
				+ "	</student>"
				+ "	<student rollno=\"593\">"
				+ "		<firstname>jasvir</firstname>"
				+ "		<lastname>singn</lastname>"
				+ "		<nickname>jazz</nickname>"
				+ "		<marks>90</marks>"
				+ "	</student>"
				+ "</class>";
		
		try {
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(xml));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("student");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
					System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
					System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
					System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
					System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(">>> xmlStringInputTest END <<<");
	}
	
	public static void kaptResultXmlStringInputTest() {
		System.out.println(">>> xmlStringInputTest START <<<");
		String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><result code=\"2\" msg=\"status This item is missing.\" />";
		
		try {
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(xml));
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(is);
			doc.getDocumentElement().normalize();
			//Element rootElement = doc.getDocumentElement();
			//System.out.println("Root element :" + rootElement.getNodeName());
			Element rootElement = (Element) doc.getDocumentElement();
			System.out.println("code : " + rootElement.getAttribute("code"));
			System.out.println("msg : " + rootElement.getAttribute("msg"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(">>> xmlStringInputTest END <<<");
	}

}
