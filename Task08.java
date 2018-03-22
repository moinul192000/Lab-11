import java.util.Scanner;
public class Task08{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    String a[] = new String[]{"zero","one","two","three","four","five","six","seven","eigth","nine"};
    System.out.println("Enter any Numbers");
    int num = sc.nextInt();
    if(num<0 && num>9){
      System.out.println("Invalid Input");
    }else{
      for(int i = 0; i < a.length; i++){
        if(i==num){
          System.out.println(a[i]);
        }
      }
    }
  }
}