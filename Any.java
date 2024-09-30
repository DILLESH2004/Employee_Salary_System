class A{
    public A(){
        System.out.println(("Constructor"));
    }
}

public class Any {
    public static void main(String[] args) throws ClassNotFoundException{
        Class.forName("A");
    }
}
