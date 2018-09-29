import java.util.Scanner;

public class Ejercicio4{
  public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);

    System.out.println("Ingrese el precio de su traje");
    int CT = datos.nextInt();

    double DE, PF;

    if (CT > 2500)
    PF = CT + (CT * 0.15);
    else
    PF = CT + (CT * 0.08);
    DE = PF - CT;
    System.out.println("\n Usted va a pagar " + PF );
    System.out.println("\n Su descuento es de " + DE );

  }
}
