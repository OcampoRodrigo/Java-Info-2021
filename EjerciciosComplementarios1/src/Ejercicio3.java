import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int n;
        int num;

        System.out.println("Ingrese un numero entero: ");

        num = scan.nextInt();
        scan.close();


        for (i=1 ; i<=num ; i++){
            for (n=1 ; n<=i ;n++){
            System.out.print(n);
        }
        System.out.println(" ");
        }
            
        
    }
    
}
