import java.util.Scanner;
public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String a[] = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        System.out.print("Enter an integer ");
        int n = sc.nextInt();
        for (int i = 0;i<a.length;i++){
            if (n == i){
                System.out.println(a[i]);
            }
        }
    }
}
