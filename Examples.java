class A{
    void tell(String x,String y){
        System.out.println(x+" "+y);
    }

    void tell(String x,String y,String z){
        System.out.println(x+" "+y+" "+z);
    }
}

public class Examples {
 public 
 static void main(String args[]){
   A a=new A(); 

    a.tell("Lion","roars");
    a.tell("Cat","cannot","roar");
 }   
}
