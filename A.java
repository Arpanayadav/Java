 class A {
    void add(int a ,int b){
        System.out.println(a+b);
    }
    void add(int a ,int b,int c){
        System.out.println(a+b+c);
    }

   
    public static void main(String[] args) {
     A obj = new A();
     obj.add(10,11,12);
     obj.add(11,12);
     
    }
}
