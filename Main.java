import java.util.*;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1= sc.nextInt();
        System.out.println("Enter Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Third number: ");
        int num3 = sc.nextInt();
        int result= num1+num2;
        int result2= num1-num2;
        int result3= num1*num2;
        int result4= num1/num2;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        if(num1>num2 && num1>num3){
            int result5=num1;
        }
        if(num2>num1 && num2>num3){
            int result5=num2;
        }
        if(num3>num1 && num3>num2){
            int result5=num3;
        }
        System.out.println(result5);
        if(num1<num2 && num1<num3){
            int result6=num1;
        }
        if(num2<num1 && num2<num3){
            int result6=num2;
        }
        if(num3<num1 && num3<num2){
            int result6=num3;
        }
        System.out.println(result6);
    }
}
