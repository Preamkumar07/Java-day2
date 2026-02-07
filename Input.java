import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter English Marks:");
        int a=ob.nextInt();
        System.out.println("Enter Maths Marks:");
        int b=ob.nextInt();
        System.out.println("Enter Physics Marks:");
        int c=ob.nextInt();
        int sum=a+b+c;
        double avg=sum/3;
        System.out.println("The sum of three subjects:"+sum);
        System.out.println("The Average of the Marks:"+avg);
    }
}
