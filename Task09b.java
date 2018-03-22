import java.util.Scanner;
public class Task09b{
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    int a[] = new int[15];
    int zerCount = 0;
    int oneCount = 0;
    int twoCount = 0;
    int threeCount = 0;
    int fourCount = 0;
    int fiveCount = 0;
    int sixCount = 0;
    int sevenCount = 0;
    int eightCount = 0;
    int nineCount = 0;
    System.out.println("Enter  "+a.length+" number");
    for(int  i = 0; i<a.length; i++){
      a[i] = sc.nextInt();
      if(a[i] == 0){
        zerCount++;
      }
      if(a[i] == 1){
        oneCount++;
      }
      if(a[i] == 2){
        twoCount++;
      }
      if(a[i] == 3){
        threeCount++;
      }
      if(a[i] == 4){
        fourCount++;
      }
      if(a[i] == 5){
        fiveCount++;
      }
      if(a[i] == 6){
        sixCount++;
      }
      if(a[i] == 7){
        sevenCount++;
      }
      if(a[i] == 8){
        eightCount++;
      }
      if(a[i] == 9){
        nineCount++;
      }
    }
    System.out.println("Zero has been entered "+zerCount);
    System.out.println("One has been entered "+oneCount);
    System.out.println("Two has been entered "+twoCount);
    System.out.println("Three has been entered "+threeCount);
    System.out.println("Four has been entered "+fourCount);
    System.out.println("Five has been entered "+fiveCount);
    System.out.println("Six has been entered "+sixCount);
    System.out.println("Seven has been entered "+sevenCount);
    System.out.println("Eight has been entered "+eightCount);
    System.out.println("Nine has been entered "+nineCount);
  }
}
                         