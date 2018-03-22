import java.util.Scanner;
public class Task09c{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    int a[] = new int[10];
    System.out.println("Enter  "+a.length+" number");
    for(int  i = 0; i<=15; i++){
      int n = sc.nextInt();
      if(n == 0){
        a[0]++;
      }
      if(n == 1){
        a[1]++;
      }
      if(n == 2){
        a[2]++;
      }
      if(n == 3){
        a[3]++;
      }
      if(n == 4){
        a[4]++;
      }
      if(n == 5){
        a[5]++;
      }
      if(n == 6){
        a[6]++;
      }
      if(n == 7){
        a[7]++;
      }
      if(n == 8){
        a[8]++;
      }
      if(n == 9){
        a[9]++;
      }
    }
    for(int i = 0; i<a.length;i++){
      System.out.println(i+" was Found "+a[i]);
    }
  }
}
 