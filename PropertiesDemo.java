import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        // Create Properties object
        Properties props = new Properties();

        // Add key-value pairs
        props.setProperty("db.url", "jdbc:mysql://localhost:3306/mydb");
        props.setProperty("db.user", "admin");
        props.setProperty("db.password", "secret");

        // Get a property
        String url = props.getProperty("db.url");
        System.out.println("DB URL: " + url); // Output: jdbc:mysql://localhost:3306/mydb
    }
}