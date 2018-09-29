import javax.swing.JOptionPane;
public class Problema211a{
  public static void main(String[] args) {


    double NC;
    double AC;


    int TT = Integer.parseInt(JOptionPane.showInputDialog("Ingres su tipo de tarjeta de credito"));


    double LA = Double.parseDouble(JOptionPane.showInputDialog("¿Cual es su limite de credito actual?"));

    if (TT == 1){
      AC = LA * .25;
      NC = AC + LA;
    }
    else if (TT == 2){
      AC = LA * .35;
      NC = AC + LA;
    }
    else if (TT == 3){
      AC = LA * .40;
      NC = AC + LA;
    }
    else {
      AC = LA * .50;
      NC = AC + LA;
    }
    JOptionPane.showInputDialog(null,"su credito anterior era de : $" + LA);
    JOptionPane.showInputDialog(null,"El aumento en el crédito fue: $" + AC);
    JOptionPane.showInputDialog(null,"Su nuevo límite de crédito es: $" + NC);
    
  }
}
