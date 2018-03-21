import java.util.Scanner;
public class Task06 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ammount of number:");
        int num = sc.nextInt();
        int a[] = new int[num];
        System.out.println("Enter "+num+" Numbers");
        for (int i = 0 ; i<a.length ; i++){
            a[i] = sc.nextInt();
        }

//     *******   Loop for sorting   ********

        for (int i = 0; i<a.length ; i++){
            for (int j = 0; j <a.length-1; j++){
                if (a[j+1]>a[j]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        if(num%2 == 0){
            int avg = (a[(a.length-1)/2]+a[a.length/2])/2;
            System.out.println("Average is "+avg);
        }else{
            int avg = a[(a.length-1)/2];
            System.out.println("Average is "+avg);
        }
    }
}
