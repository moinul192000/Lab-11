import java.util.Scanner;
public class Task02{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    System.out.println("Enter 5 Numbers");
    for(int i = 0; i < a.length; i++){
      a[i] = sc.nextInt();
    }
    int large = a[0];
    int location = 0;
    for(int i = 0; i < a.length; i++){
      if(large<a[i]){
        large = a[i];
        location = i;
      }
    }
    System.out.println("largest number "+large+" was found at location "+location);
  }
}