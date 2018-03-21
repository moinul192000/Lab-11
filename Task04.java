import java.util.Scanner;
public class Task04 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter "+a.length+" Numbers");
        for (int i = 0; i<a.length; i++){
            a[i]=sc.nextInt();
        }
        //     *******   Loop for sorting   ********
        for (int i = 0; i<a.length ; i++){
            for (int j = 0; j <a.length-i-1; j++){
                if (a[j+1]<a[j]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        //     *******   Loop for Printing   ********
        for (int i = 0; i<a.length;i++){
            if (i==a.length-1){
                System.out.print(a[i]);
            }else {
                System.out.print(a[i]+",");
            }
        }
    }
}
