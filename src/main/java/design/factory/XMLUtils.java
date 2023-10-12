package design.factory;

import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import org.w3c.dom.*;

import java.io.*;

public class XMLUtils {
    public static String getChartType() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dfFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = dfFactory.newDocumentBuilder();
        Document doc;
        doc = (Document) builder.parse(new File("src/main/resources/config.xml"));

        NodeList nl = doc.getElementsByTagName("chartType");
        Node node = nl.item(0).getFirstChild();
        String chartType = node.getNodeValue().trim();
        return chartType;
    }
}
