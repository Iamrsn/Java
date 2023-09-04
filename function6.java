import java.util.*;
public class function6 {
    public static int factorial(int n){
       int f=1;
       for(int i=1;i<=n;i++){
        f=f*i;
       }
       return f;
    }
    public static int binomial(int n,int r){
     int n_fact=factorial(n);
     int r_fact=factorial(r);
     int nmr_fact=factorial(n-r);
     int binmcoeff=n_fact/(r_fact*nmr_fact);
     return binmcoeff;
    }
    public static void main(String[] args) {
       System.out.println(binomial(5, 2));
    }
}

//factorial fn