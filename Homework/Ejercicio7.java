import  java.util.Scanner;
public class Ejercicio7{
  public static void main(String[] args) {
    double PG;
      Scanner datos = new Scanner(System.in);
      System.out.println("Este programa expresa la cantidad de tela, de metros a pulgadas*");
      //ingresar los valores
      System.out.println("Cantidad de metros que necesita");
      double CM = datos.nextDouble();

      PG = CM / 0.0254;
      // Mostrar la medida de la tela en pulgadas
      System.out.println("la tela que necesita es : " + PG + "pulgadas");
  }
}
