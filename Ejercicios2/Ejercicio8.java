import java.util.Scanner;

public class Ejercicio8{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    double PA, TOT;
    System.out.println("Ingrese el numero de alumnos que asistiran al viaje:");
    int NA = datos.nextInt();

    if (NA > 100)
    TOT = NA * 65;
    else if (NA >= 50 && NA <= 99)
    TOT = NA * 70;
    else if (NA >= 30 && NA <=49)
    TOT = NA * 95;
    else
    TOT = 4000;
      PA = TOT / NA;


    System.out.println("\n El Total a pagar por el viaje es de " + TOT);
    System.out.println("\n El pago por alumno es " + PA );

  }
}
