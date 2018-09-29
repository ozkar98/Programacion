import javax.swing.JOptionPane;
public class Problema23a{
 public static void main(String[] args) {

   int x = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de lapices"));
   double amount;

  if (x >= 1000){
    amount = (x * .85);
    JOptionPane.showMessageDialog(null,"Tienes que pagar: "  + amount);

  }
  else{
    amount = (x * .90);
    JOptionPane.showMessageDialog(null, "Tienes que pagar:" + amount);

  }
}
}
