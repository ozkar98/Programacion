import java.util.Scanner;

public class PuebloDesconocido{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    double NC, AC;
    System.out.println("ingresa el numero dr tarjeta");
    int TT = datos.nextInt();
    System.out.println("ingrese su limite de credito");
    double LA = datos.nextDouble();

    if (TT == 1)
    NC = LA + (LA * 0.25);
    else if (TT == 2)
    NC = LA + (LA * .35);
    else if (TT == 3)
    NC = LA + (LA * .40);
    else NC = LA + (LA * .50);

    AC = NC - LA;
    System.out.println("SU NUEVO LIMITE DE CREDITO ES " + NC);
    System.out.println(" \n AL AUMENTO EN SU TARJETA ES " + AC);


  }
}
