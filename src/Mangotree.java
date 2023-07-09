import java.util.Scanner;

public class Mangotree {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int r=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
           if(n<=r ){
               System.out.println("true");
           }
           else if((n-1)%10==0){
               System.out.println("true");
           } else if (n%10==0) {
               System.out.println("true");
           }
           else{
               System.out.println("false");
           }

    }
    }


