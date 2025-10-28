class A{
    int x,y,z;
    A(int x,int y,int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    void display()
    {
        System.out.println(x+" "+y+" "+z);
    }
}

class B{
    public static void main(String args[]){
        A obj1=new A(5,6,7);
        A obj2=new A(15,16,7);
        obj1.display();
        obj2.display();
    }
}