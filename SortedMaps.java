import java.util.*;
public class SortedMaps {
    public static void main(String args[]){
        SortedMap <Integer,String> s1= new TreeMap<Integer,String>();
        s1.put(11,"qw");
        s1.put(12,"qwf");
        s1.put(13,"qer");
        s1.put(14,"qr");
       System.out.println(s1);
       System.out.println(s1.firstKey());
       System.out.println(s1.lastKey());
       System.out.println(s1.headMap(13));
       System.out.println(s1.tailMap(12));
       System.out.println(s1.subMap(12,14));
    }
}
