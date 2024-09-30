import java.util.*;
class Student {
    int rollno;
    String name;
    int marks;
}
public class sample {
    public static void main(String[] args) {
        String ss = new String("dillesh");
        System.out.println(ss);
        Student s = new Student();
        s.name="dillesh";
        s.rollno=583;
        s.marks = 99;
        StringBuffer S1 = new StringBuffer();
        System.err.println(S1.capacity());
        StringBuilder S2 = new StringBuilder();
        System.out.println(S2.capacity());
        Student[] objarray = new Student[1]; 
        objarray[0] = s;

        for(Student i:objarray){
            System.out.println("Roll No: "+i.rollno+" Name: "+i.name+" ");
        }
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[3][3];
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr1[i][j] = sc.nextInt();
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter integers only.");
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
