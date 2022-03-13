package study.xmlparse;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

public class XMLParse {

    public static void main(String[] args) {
        try {
            Document document  = new SAXReader().read("/Users/shiqunxing/ideaProject/javastudy/src/main/resources/xmlParser.xml");

        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

}
