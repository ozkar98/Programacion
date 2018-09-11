import java.util.Scanner;
public class Ejercicio8{
  public static void main(String[] args) {
    double V, PAG;
      Scanner datos = new Scanner(System.in);
      System.out.println("Este programa calcula el agua que cabe en una alberca y el pago que hara por ella");
      //ingresar las medidad de la alberca
      System.out.println("Ingrese la altura de la alberca");
      double A = datos.nextDouble();
      System.out.println("Ingrese el largo de la alberca");
      double L = datos.nextDouble();
      System.out.println("Ingrese el ancho de la alberca");
      double N = datos.nextDouble();
      //ingresar el costo del agua por metro cubico
      System.out.println("Ingrese el costo del metro cubico");
      double CM = datos.nextDouble();

      V = (L*A) * N;
      PAG = V * CM;
      //mostrar el los resultados
      System.out.println("Total de metros cubicos de agua: " + V);
      System.out.println("Pago de agua: " + PAG);

  }
}
