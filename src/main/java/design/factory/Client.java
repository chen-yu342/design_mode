package design.factory;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        Chart chart;
        chart = ChartFactory.getChart("pie");
        chart.display();

        chart = ChartFactory.getChart("histogram");
        chart.display();

        chart = ChartFactory.getChart("line");
        chart.display();

        System.out.println("用xml配置优化后");

        String chartType = XMLUtils.getChartType();
        chart = ChartFactory.getChart(chartType);
        chart.display();
    }
}
