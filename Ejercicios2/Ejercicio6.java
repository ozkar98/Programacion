import java.util.Scanner;

public class Ejercicio6{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("Ingrese el numero de personas para el banquete");
    int NP = datos.nextInt();
    double TOT;

    if (NP < 200)
    TOT = NP * 95;
    else if (NP < 300)
    TOT = NP * 85;
    else
    TOT = NP * 75;

    System.out.println("\n Usted va a pagar " + TOT + " pesos por el banquete");

  }
}
