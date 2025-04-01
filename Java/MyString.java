import java.util.Scanner;
public class MyString {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       // System.out.println("Enter your first name:");
        String FirstName = sc.nextLine();
       // System.out.println("Enter your last name:");
        String LastName = sc.nextLine();
       // String FullName = FirstName +" " +LastName;
     //   System.out.println("Your  full name is:" +FullName);
      //  for (int i=0; i<FullName.length(); i++){
      ///      System.out.println(FullName.charAt(i));   
      //  }


     if(FirstName.equals(LastName)){
        //    System.out.println("Both names are equal");
    //  }else{
        //    System.out.println("Both names are not equal");
    //  }

    if(new String("Navneet")== new String("Navneet")){
        System.out.println("Both names are equal");
    }else{
        System.out.println("Both names are not equal");
    }
        
    }

    
}
}
