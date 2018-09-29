import java.util.Scanner;

public class Ejercicio7{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("Ingrese el precio incial de la uva");
    int P = datos.nextInt();
    System.out.println("Ingrese los kilos de produccion");
    int K = datos.nextInt();
    System.out.println("Ingrese el tipo de uva");
    int TI = datos.nextInt();
    System.out.println("Ingrese el tamaño de la uva");
    int TA = datos.nextInt();

    double GA, a, b;

    if (TI == a && TA == 1)
    GA = P + (P * .20);
    else if (TI == a && TA == 2)
    GA = P + (P * .30);
    else if (TI == b && TA == 1)
    GA = P - (P * .30);
    else if (TI == b && TA == 2)
    GA = P - (P * .50);

    System.out.println("\n Usted va a ganar " + GA + " pesos por su produccion de uva");

  }
}
