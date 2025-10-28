import java.io.*;
class Program8 {
    public static void main(String args[]){
        try{
            File file =new File("data.txt");
            if (file.createNewFile()){
                System.out.println("File created:"+file.getName());
            }
            FileWriter w=new FileWriter(file);
            w.write("Java file handling");
            w.close();
        }
        catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
