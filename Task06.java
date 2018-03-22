import java.util.Scanner;
public class Task06{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many numbers to take?");
    int num = sc.nextInt();
    int a[] = new int[num];
    System.out.println("Enter "+num+" Numbers");
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
    if(num%2 == 0){
      int avg = (a[(a.length-1)/2]+a[a.length/2])/2;
      System.out.println(avg);
    }else{
      int avg = a[a.length/2];
      System.out.println(avg);
    }
  }
}