import java.util.Scanner;
public class Task02 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        //     *******   Loop for Input   ********
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
        }

        int large = a[0];
        int position = 0;
        for (int i = 0; i < a.length ; i++){
            if (a[i]>large){
                large = a[i];
                position = i;
            }
        }
        System.out.println("Largest Number "+large +" was Found at location "+position);
    }
}
