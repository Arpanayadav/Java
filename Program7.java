import java.io.*;

public class Program7{
    public static void main(String args[]){
     try {
        File f= new File("Program.txt");
        f.createNewFile();
            System.out.println("File is readable:"+f.canRead());
            System.out.println("File is writeAble:"+f.canWrite());
            System.out.println("File is present:"+f.exists());
            System.out.println("Delete file"+f.delete());
            System.out.println("File Name:"+f.getName());
            System.out.println("File Path:"+f.getAbsolutePath());
            System.out.println("File size:"+f.length());
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }

     }
    }

