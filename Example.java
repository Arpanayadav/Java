class A{
    void sound(){
        System.out.println("Roars");
    }
}
class B extends A{
    void sound(){
        System.out.println("Mew");
    }
}


public class Example {
    public static void main (String args[]){
    A a=new A();
    B b= new B();
   
    a.sound();
    b.sound();
   
}
}
