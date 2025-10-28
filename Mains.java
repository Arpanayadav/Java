class Grandfather{
    void tall(){
      System.out.println("He is tall");
    }
}
class Father extends Grandfather{
    void brownEyes(){
        System.out.println("His eyes are brown");
    }
}
class Son extends Father{
    void curlyHair(){
        System.out.println("He has curly hairs");
    }
}
 public class Mains{
    public static void main (String args[]){
     Son tom = new Son();
     
     tom.curlyHair();
     tom.brownEyes();
     tom.tall();
    }
}




    

