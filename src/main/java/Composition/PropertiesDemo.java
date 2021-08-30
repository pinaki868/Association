package Composition;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {

        String[] inputTestDetails =   getTestData("RegressionTestData.properties","TC14350");
        System.out.print("details fetched are "+inputTestDetails);
    }

    public static String[] getTestData(String propertyFileName, String key) {
        return getTestData(propertyFileName).getProperty(key).split(";");
    }

    public static Properties getTestData(String propertyFileName) {
        Properties properties = new Properties();
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        try (InputStream resourceStream = loader.getResourceAsStream(propertyFileName)) {
            properties.load(resourceStream);
        } catch (IOException e) {
            e.getCause().printStackTrace();
        }
        return properties;
    }

}
