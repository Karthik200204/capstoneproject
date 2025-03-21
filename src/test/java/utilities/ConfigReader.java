package utilities;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;

    public ConfigReader() {
        try {
           // FileInputStream file = new FileInputStream("C:\\Users\\karthik reddy\\eclipse-workspace\\Capstone_project_march\\src\\main\\java\\data\\data.properties");
            FileInputStream file = new FileInputStream("src/main/java/data/data.properties");
            properties = new Properties();
            properties.load(file);
        } catch (IOException e) {
            System.out.println("Error loading properties file: " + e.getMessage());
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key); // Semicolon added here
    }
}