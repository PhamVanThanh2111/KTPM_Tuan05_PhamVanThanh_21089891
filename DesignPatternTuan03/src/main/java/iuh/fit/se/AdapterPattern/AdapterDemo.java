package iuh.fit.se.AdapterPattern;

public class AdapterDemo {
    public static void main(String[] args) {
        JsonToXml jsonToXml = new JsonToXmlAdapter();
        XmlToJson xmlToJson = new XmlToJsonAdapter();

        String jsonData1 = "{ \"user\": { \"name\": \"John Doe\", \"age\": 30 } }";
        String xmlData1 = jsonToXml.processJson(jsonData1);

        System.out.println("JSON -> XML: ");
        System.out.println(xmlData1);

        String xmlData2 = "<user><name>John Doe</name><age>30</age></user>";
        String jsonData2 = xmlToJson.processXml(xmlData2);

        System.out.println("XML -> JSON: ");
        System.out.println(jsonData2);
    }
}
