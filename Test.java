class Phone{
    String brand;
    int price;
    static String name;

    static{
        name = "SmartPhone";
        System.out.println("In Static Block");
    }

    public Phone(){
        System.out.println("In constructor");
    }

    public void show(){
        System.out.println("Brand: "+brand+" Price: "+price+" Name:"+name);
    }

    // public static void show1(Phone obj){
    //     System.out.println("Brand: "+obj.brand+" Price: "+obj.price+" Name:"+name);

    // }
}

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Phone");


    }
}
