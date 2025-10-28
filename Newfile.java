import java.io.*;
class Newfile{
 public static void main(String args[]){
    try{
 File f=new File("New.txt");
        f.createNewFile();
          System.out.println(f.getName());
          System.out.println(f.getAbsolutePath());
          System.out.println(f.length());
          System.out.println(f.canWrite());
          System.out.println(f.canRead());
          System.out.println(f.delete());
    }
    catch(Exception e){
        System.out.println("Something went wrong");
    }
 }
}

