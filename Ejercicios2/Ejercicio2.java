import java.util.Scanner;

public class Ejercicio2{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("ingrese el un numero");
    int NUM = datos.nextInt();



    if (NUM > 0)
    System.out.println("\n Este numero es positivo");
    else
    System.out.println("\n este numero es negativo");

  }
}
