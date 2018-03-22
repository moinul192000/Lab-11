import java.util.Scanner;
public class Task09{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[15];
        System.out.println("Enter 15 Numbers");
        for (int i = 0; i<a.length; i++){
            a[i] = sc.nextInt();
            if (a[i] < 0 && a[i] > 9){
                System.out.println("Invalid Input");
                i--;
            }
        }

        for (int i = 0; i<=9 ; i++){
            int c = 0;
            for (int j = 0; j<a.length;j++){
                if(i==a[j]){
                    c++;
                }
            }
            System.out.println(i+" is available "+c+" Times");
        }
    }
}
