import java.util.Scanner;

public class Ejercicio5{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("Ingrese el primer numero");
    int A = datos.nextInt();
    System.out.println("Ingrese el segundo numero");
    int B = datos.nextInt();
    System.out.println("Ingrese el tercer numero");
    int C = datos.nextInt();


    if (A>B && A>C)
    System.out.println(" \n El numero mayor es " + A );
    else if(B>A && B>C)
    System.out.println(" \n El numero mayor es " + B );
    else
    System.out.println("\n El numero mayor es " + C );

  }
}
