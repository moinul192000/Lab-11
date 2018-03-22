import java.util.Scanner;
public class Task04{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    System.out.println("Enter 5 Numbers");
    for(int i = 0; i < a.length; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0; i<a.length-1; i++){
      int min = a[i];
      int minLoc = i;
      for(int j = i+1; j<a.length;j++){
        if(a[j]<min){
          min = a[j];
          minLoc = j;
        }
      }
      int temp = a[i];
      a[i] = min;
      a[minLoc] = temp;
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