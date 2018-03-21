import java.util.Scanner;
public class Task03 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int large = a[0];
        int largeLocation = 0;
        int small = a[0];
        int smallLocation = 0;
        for (int i = 0; i < a.length ; i++){
            if (large<a[i]){
                large = a[i];
                largeLocation = i;
            }
            if (small>a[i]){
                small = a[i];
                smallLocation = i;
            }
        }
        System.out.println("Smallest Number "+small +" was Found at location "+smallLocation);
        System.out.println("Largest Number "+large +" was Found at location "+largeLocation);
    }
}
