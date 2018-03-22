import java.util.Scanner;
public class Task03{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    System.out.println("Enter 5 Numbers");
    for(int i = 0; i < a.length; i++){
      a[i] = sc.nextInt();
    }
    int small = a[0];
    int smallLoc = 0;
    int large = a[0];
    int largeLoc = 0;
    for(int i = 0; i < a.length; i++){
      if(small>a[i]){
        small = a[i];
        smallLoc = i;
      }
      if(large<a[i]){
        large = a[i];
        largeLoc = i;
      }
    }
    System.out.println("smallest number "+small+" was found at location "+smallLoc);
    System.out.println("largest number "+large+" was found at location "+largeLoc);
  }
}