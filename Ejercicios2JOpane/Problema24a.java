import javax.swing.JOptionPane;
public class Problema24a{
 public static void main(String[] args) {

   int CT = Integer.parseInt(JOptionPane.showInputDialog("ingresa precio del traje"));
   double DE;
   double PF;

  if (CT > 2500){
    DE = CT * .15;
    PF = CT - DE;
    JOptionPane.showMessageDialog(null,"Total a pagar es :" + PF);
    JOptionPane.showMessageDialog(null, "el descuento es :" + DE);

  }
  else{
    DE = CT * .08;
    PF = CT - DE;
    JOptionPane.showMessageDialog(null,"Total a pagar es;" + PF);
  JOptionPane.showMessageDialog(null,"El Descuento es:" + DE);

  }
}
}
