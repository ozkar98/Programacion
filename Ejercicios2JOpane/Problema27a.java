import javax.swing.JOptionPane;
public class Problema27a{
 public static void main(String[] args) {
    Double sprice;
   int k = Integer.parseInt(JOptionPane.showInputDialog("ingresa kilos"));

   String type = JOptionPane.showInputDialog("ingresa tipo de uva a o b");
   //System.out.println(type);

  if (type.equalsIgnoreCase ("a")){

    int size = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tamaño 1 o 2"));
    if (size == 1){
      sprice = k * .20;
      JOptionPane.showMessageDialog(null,"ganancia obtenida: $" + sprice);

    } else if (size == 2) {
      sprice = k * .30;
      JOptionPane.showMessageDialog(null,"Ganancia obtenida: $" + sprice );

    }
  } else if (type.equalsIgnoreCase ("b")) {

    int size = Integer.parseInt(JOptionPane.showInputDialog("ingresa tamaño 1 o 2"));
    if (size == 1){
      sprice = k * .30;
      JOptionPane.showMessageDialog(null,"ganancia obtenida:$" + sprice);

    } else if (size == 2) {
      sprice = k * .50;
      JOptionPane.showMessageDialog(null,"Ganancia obtenida:$" + sprice);

    }

  }
}
}
