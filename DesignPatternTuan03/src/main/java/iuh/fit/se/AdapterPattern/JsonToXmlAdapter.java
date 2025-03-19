package iuh.fit.se.AdapterPattern;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXmlAdapter implements JsonToXml {
    @Override
    public String processJson(String json) {
        JSONObject jsonObject = new JSONObject(json);
        return XML.toString(jsonObject);
    }
}
