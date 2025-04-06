import java.util.Scanner;
public class funmeth{
    public void funmethod(String FirstName,String LastName){
        System.out.println("Is this is your first name : " +FirstName);
        System.out.println("Is this is your last name : " +LastName);
        System.out.println("Then Your full name is : " +FirstName +" " +LastName);
        return;
    }
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter your FirstName:");
    String FirstName = sc.nextLine();
System.out.println("Enter your LastName:");
    String LastName = sc.nextLine();

    funmeth obj = new funmeth();
    obj.funmethod(FirstName,LastName);
   


}
}