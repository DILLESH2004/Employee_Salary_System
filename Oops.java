class A{
    // public A(){
    //     System.out.println("In A");
    // }
    // public A(int n){
    //     System.out.println("In A Para");
    // }

    public void show(){
        System.out.println("In A Show");
    }

    public void config(){
        System.out.println("In A Config");
    }
}

class B extends A {
    // public B(){
    //     super();
    //     System.out.println("In B");
    // }
    // public B(int n){
    //     this();
    //     System.out.println("In B Para");
    // }
    public void show(){
        System.out.println("In B Show");
    }

}   

public class Oops {
    public static void main(String[] args) {
        // B b = new B(5);
        B b = new B();
        b.show();
        b.config();
        // new A().show();
        
    }
}
