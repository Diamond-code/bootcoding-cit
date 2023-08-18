import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int x = sc.nextInt();
        System.out.println("Enter second number:");
        int y = sc.nextInt();
        if(x==y){
            System.out.println("number are same!");
        }else{
            System.out.println("numbers are different");
        }
    }
}
