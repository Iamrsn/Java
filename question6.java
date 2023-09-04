import java.util.*;
public class question6 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int n=sc.nextInt();
    int rev=0;
    while(n>0){
    int last = n%10;
    rev=(rev*10)+last;
    n=n/10;
    }
    System.out.println(rev);
   } 
}
