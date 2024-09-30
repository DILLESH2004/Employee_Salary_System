import java.util.*;
public class Cp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        for (Integer i : a) {
            System.out.print(i+" ");
        }
        System.out.println(a.get(0));
        sc.close();
    }
}
