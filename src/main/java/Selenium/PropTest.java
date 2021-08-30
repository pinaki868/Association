package Selenium;

import java.lang.String;
import org.bouncycastle.util.Properties;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class PropTest {
    public static void main(String args[]) throws IOException {
          String value = PropTest.getValue("RegressionTestData.properties","TC13769");
        System.out.println(value);
    }

    public static String getValue(String propertyName, String key) throws IOException {
        String prop = "RegressionTestData.properties";
        String desiredValue = "";
        Properties properties = null;
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        InputStream stream = loader.getResourceAsStream(propertyName);
        properties.load(stream);
        Map<String,String> map = new HashMap<>();

        for (String key1: properties.stringPropertyNames()) {
            map.put(key,properties.getProperty(key));
        }

        for (Map.Entry m: map.entrySet()) {
            //System.out.println(m.getKey()+" "+m.getValue());
            if (m.getKey().equals(key)){
                desiredValue = (String)m.getValue();
            }
        }

        return desiredValue;
    }




}
