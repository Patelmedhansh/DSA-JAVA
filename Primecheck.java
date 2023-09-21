import java.util.Scanner;
public class Primecheck {
public static void main(String[] args) {
   System.out.println("Enter your number ");
   Scanner num= new Scanner(System.in);
   int count =0,i;
   int a = num.nextInt();
   for (i=1;i<=a;i++){
       if (a%i==0)
           count++;
    }
   if (count==2){
       System.out.println("The number is prime ");
   }
       else {
           System.out.println("The number is non prime ");
   }
 }
}
