import java.util.*;
public class function3 {
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a is the " +a);
        System.out.println("b is the " +b);
    }
    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a,b);
    }
}

//swap fn