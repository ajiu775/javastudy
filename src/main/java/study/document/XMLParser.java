package study.document;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @program: java study
 * @description: parser xml document
 * @author: Allen
 * @create: 2020-11-02 10:16
 **/

public class XMLParser {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        StringBuilder stringBuilder = new StringBuilder();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse("/Users/shiqunxing/ideaProject/javastudy/src/main/resources/xmlParser.xml");
        NodeList nodeList = document.getElementsByTagName("person");
        NodeList childNodes = nodeList.item(0).getChildNodes();
        for (int i = 0; i <childNodes.getLength() ; i++) {
            System.out.println(childNodes.item(i).getNodeName());
        }
        System.out.println(childNodes.item(3).getTextContent());

    }
}
