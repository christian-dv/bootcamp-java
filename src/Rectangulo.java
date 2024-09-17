import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        int alto,ancho, area,perimetro;

        Scanner sc = new Scanner(System.in);

        System.out.println("Proporciona el alto: ");
        alto = sc.nextInt();
        System.out.println("Proporciona el ancho: ");
        ancho = sc.nextInt();

        area = alto * ancho;
        perimetro = (alto+ancho)*2;

        System.out.println("Area: "+area);
        System.out.println("Perimetro: "+perimetro);
    }
}
