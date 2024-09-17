import java.util.Scanner;

public class MayorDeDosNumeros {

    public static void main(String[] args) {
        int numero1,numero2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona el numero1: ");
        numero1 = sc.nextInt();
        System.out.println("Proporciona el numero2: ");
        numero2 = sc.nextInt();

        if(numero1 > numero2)
            System.out.println("El numero mayor es: \n"+numero1);
        else
            System.out.println("El numero mayor es: \n"+numero2);
    }
}
