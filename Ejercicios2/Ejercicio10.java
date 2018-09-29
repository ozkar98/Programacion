import java.util.Scanner;

public class Ejercicio10{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    int CC, TOT;

    System.out.println("Ingrese el numero de consulta:");
    int NC = datos.nextInt();
/*
    if (NC < 3)
    TOT = NC * 200;
    else if (NC < 5)
    TOT = 600 + NC * 150;
    else if (NC < 8)
    TOT = 900 + NC * 100;
    else
    TOT = 1200 + NC * 50;
*/
    if (NC < 3)
    CC = 200;
    TOT = NC * CC;
    else if (NC < 5)
    CC = 150;
    TOT = 600 + NC * CC;
    else if (NC < 8)
    CC = 100;
    TOT = 900 + NC *CC;
    else
    CC = 50;
    TOT = 1200 + NC * CC;

    System.out.println("\n El costo de la cita será" + CC);
    System.out.println("\n El pago total del tratamiento será " + TOT );

  }
}
