import java.util.Scanner;
public class Task07 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        for (int i = 0; i<a.length;i=i+2){
                System.out.print(a[i]+",");
        }
        for (int i=1;i<a.length;i=i+2){
            if (i==a.length-1){
                System.out.print(a[i]);
            }else{
                System.out.print(a[i]+",");
            }
        }
    }
}
