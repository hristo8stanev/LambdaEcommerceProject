package base;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Utils {
    private static final String MAP = "src/test/resources/map.properties";

    private static Properties loadProperties(String url) {
        Properties properties = new Properties();

        try {
            properties.load(Files.newInputStream(Paths.get(url)));
        } catch (IOException ex) {
        }
        return properties;
    }

    public static String getMappingByKey(String key) {
        String value = loadProperties(MAP).getProperty(key);
        return value != null ? value : key;
    }
}
