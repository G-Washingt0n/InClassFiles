package pkgclass.pkg3;
import java.util.Scanner;

public class Class3 {

    public static void main(String[] args) {
        
        String text1="hello";
        String text2="hello";
        String text3= new String("hello");
String text4="";
String text5="";
Scanner b = new Scanner(System.in);
text4=b.nextLine();
text5 = b.nextLine();
        int a1=1;
        int a2=1;
        Integer a3=1;
        Integer a4=new Integer(1);
        
        if(text1.equals(text3)){
        System.out.println("TRUE");
        }
        else{
        System.out.println("False");}
        
        
    }
    
}
