import java.util.Scanner;
public class Task07{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    System.out.println("Enter "+a.length+" Numbers");
    for(int i = 0; i < a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0; i < a.length; i++){
      if(i%2==0){
        System.out.print(a[i]+",");
      }
    }
    for(int i = 0; i < a.length; i++){
      if(i%2!=0){
        if(i==a.length-1){
          System.out.print(a[i]);
        }else{
          System.out.print(a[i]+",");
        }
      }
    }
  }
}