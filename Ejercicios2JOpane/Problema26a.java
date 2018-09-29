import javax.swing.JOptionPane;
public class Problema26a{
 public static void main(String[] args) {

   int NP = Integer.parseInt(JOptionPane.showInputDialog("numero de personas"));
   double TOT;

  if (NP > 200 && NP <=300){
    TOT = NP * 85;
    JOptionPane.showMessageDialog(null,"pago total es : $" + TOT);

  }
  else if (NP > 300) {
    TOT = NP * 75;
    JOptionPane.showMessageDialog(null,"pago total es: $" + TOT);

  } else {
    TOT = NP * 95;
    JOptionPane.showMessageDialog(null,"el pago total es:$ " + TOT);

  }
}
}
