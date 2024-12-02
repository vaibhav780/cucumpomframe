package org.example;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class Propreader {
    public Configuration readProperties() {
        Configurations configurations = new Configurations();
        Configuration config = null;
        try {
            config = configurations.properties("C:/Users/vmuddebi/IdeaProjects/CCUCUPOMFrame/src/test/resources/Application.properties");
            String username = config.getString("url");
        } catch (ConfigurationException cex) {
            System.out.println("Error: " + cex.getMessage());
        }
        return config;
    }

    public String getValue(String key) {
        return readProperties().getString(key);
    }
}
