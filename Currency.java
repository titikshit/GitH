import java.util.Scanner;
public class Currency{
public static void main(String[ ] args){
System.out.print("Enter INR value: ");
Scanner sc = new Scanner(System.in);
float n = sc.nextFloat();
float z = n*1/83;
System.out.println("USD value = " + z);
sc.close();
}
}
