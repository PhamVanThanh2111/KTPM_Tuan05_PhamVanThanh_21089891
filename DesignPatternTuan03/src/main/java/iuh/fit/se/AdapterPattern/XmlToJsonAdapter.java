package iuh.fit.se.AdapterPattern;

import org.json.JSONObject;
import org.json.XML;

public class XmlToJsonAdapter implements XmlToJson {

    @Override
    public String processXml(String xml) {
        JSONObject jsonObject = XML.toJSONObject(xml);
        return jsonObject.toString();
    }
}
