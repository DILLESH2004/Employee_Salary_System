public class Coll {
    public static void main(String[] args) {
        AdvCal obj1 = new AdvCal();
        System.out.println(obj1.add(1,2));
        System.out.println(obj1.sub(1,2));
        // System.out.println(obj1.Mul(2,2));
        int[] res = obj1.Div(1,2);
        System.out.println(res[0]+" "+res[1]);
        // System.out.println(obj1.power(3, 2));
    }
}
