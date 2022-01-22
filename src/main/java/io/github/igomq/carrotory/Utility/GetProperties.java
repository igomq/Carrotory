package io.github.igomq.carrotory.Utility;

import java.io.IOException;
import java.util.Properties;

import static io.github.igomq.carrotory.Carrotory.me;

public class GetProperties {
    private static final Properties properties = new Properties();
    public static String getProperty(String propertyName) throws IOException {
        properties.load(me);

        return properties.getProperty(propertyName);
    }
}
