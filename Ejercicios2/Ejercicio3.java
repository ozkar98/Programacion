import java.util.Scanner;

public class Ejercicio3{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("ingrese el numero de lapices que va a comprar");
    int X = datos.nextInt();

    double PAG;


    if (X > 1000)
    PAG = X * .85;
    else
    PAG = X * .90;

    System.out.println("\n Usted va a pagar " + PAG );

  }
}
