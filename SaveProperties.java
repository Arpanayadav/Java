import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SaveProperties {
    public static void main(String[] args)  {
        Properties props = new Properties();
        props.setProperty("key1", "value1");
        props.setProperty("key2", "value2");

        // Save to file
       try{ props.store(new FileOutputStream("output.properties"), "Sample Properties File");
    
       }
       catch(IOException e){
        System.out.println("something went wrong");
       }
    }
}