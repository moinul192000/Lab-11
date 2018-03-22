import java.util.Scanner;
public class Task05{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    System.out.println("Enter 5 Numbers");
    for(int i = 0; i < a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0; i<a.length-1; i++){
      int max = a[i];
      int maxLoc = i;
      for(int j = i+1; j<a.length;j++){
        if(a[j]>max){
          max = a[j];
          maxLoc = j;
        }
      }
      int temp = a[i];
      a[i] = max;
      a[maxLoc] = temp;
    }
    for(int i = 0; i < a.length; i++){
      if(i== a.length-1){
        System.out.print(a[i]);
      }else{
        System.out.print(a[i]+",");
      }
    } 
  }
}