import java.util.*;
public class function11 {
    public static void bintodec(int binnum){
       int pow=0;
       int decnum=0;
       while(binnum>0){
       int lastdigit=binnum%10;
        decnum=decnum+ (lastdigit *(int)Math.pow(2,pow));
        pow++;
        binnum=binnum/10;
       }
       System.out.println("the decimal number is "+ decnum);
    }
    public static void main(String[] args) {
       bintodec(101);
    }
}

//binary to decimal conversion;