import java.util.Scanner;
public class Task09a{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    int a[] = new int[15];
    System.out.println("Enter  "+a.length+" number");
    for(int  i = 0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0;i<=9;i++){
      int cnt = 0;
      for(int j = 0;j<a.length;j++){
        if(a[j]==i){
          cnt++;
        }
      }
      System.out.println(i+" has been entered "+cnt+" times");
    }
  }
}
                         