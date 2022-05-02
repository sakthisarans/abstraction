import java.util.Scanner;
public class Main {
    
    public static void main( String[] args ) {
        //find square and cube of number using abstract class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a operation square or cube");
        String str=sc.nextLine();
        System.out.println("enter a input");
        int a=sc.nextInt();
        Run r=new Run1();
        switch ( str ) {
            case "cube" , "CUBE" -> r.cube( a );
            case "square" , "SQUARE" -> r.square( a );
            default -> System.out.println( "error" );
        }
    }
}