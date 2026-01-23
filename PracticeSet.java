
import java.util.Scanner;

class customExe extends Exception{
    customExe(String msg){
        super(msg);
    }
}

public class PracticeSet {
    static void check() throws customExe{
        System.out.println("Enter the maximum attempt : ");
        Scanner sc=new Scanner(System.in);
        int maxi=sc.nextInt();
        int[] arr={1,2,3};
        int attempt=0;
        while(attempt<maxi){
            try {
                int ind=sc.nextInt();
                System.out.println("Arrays Index are : "+arr[ind]);
                break;
            } catch (Exception e){
                attempt++;
                System.out.println("Invalid Index try again !!");
            }
        }
        if(attempt==maxi){
            throw new customExe("User tried "+maxi+" times and wrong");
        }
    }
    public static void main(String[] args){
        try{
            check();
            System.out.println("Enter Index is Correct !!");
        }
        catch(customExe e){
            System.out.println("Error Occured : "+e.getMessage());
        }
    }
}
