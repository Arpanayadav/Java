import java.util.*;
public class Program9 {
    public static void main(String args[]){
        Map<String,Integer> a = new HashMap<>();
        a.put("Alice",30);
        a.put("Bob",25);
        a.forEach((name,age)->System.out.println(name +" is "+age+" years old "));
    }
}
