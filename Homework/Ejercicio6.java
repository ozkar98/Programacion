import java.util.Scanner;
public class Ejercicio6{
  public static void main(String[] args) {
    double SS;
      Scanner datos = new Scanner(System.in);
      System.out.println("Este programa calcula el sueldo de acuerdo al precio por hora");
      //ingresar los datos
      System.out.println("Ingrese las cantidad de horas laboradas");
      double HT = datos.nextDouble();
      System.out.println("Ingrese el pago por hora laborada");
      double PH = datos.nextDouble();

      SS = HT * PH;
      //mostrar el resultado
      System.out.println("El sueldo total es de: " + SS);
  }
}
