import java.util.Scanner;

public class Ejercicio1{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("ingrese el primer numero");
    int A = datos.nextInt();
    System.out.println("ingrese el segundo numero");
    int B = datos.nextInt();



    if (A>B)
    System.out.println("\n" + A + " Es mayor que: " + B);
    else
    System.out.println("\n" + B + " Es mayor que: " + A);

  }
}
