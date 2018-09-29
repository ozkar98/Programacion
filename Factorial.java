import javax.swing.JOptionpane;
public class Factorial{
  public static void main(String[] args) {
//el integer es para convertir y numro para el limite del factorial//
    int value = integer.parseInt(JOptionPane.showInputDialog (null, "Enter a in value"));
//numero factorial
    int fact = 1;
    // Sentinela
    int i= 1;

    while(i<= value){
      fact = fact * i;
      i++;
    }
    JOptionPane.showMessageDialog(null, "el factoriial de"+ value + "es"+ fact, "Calcular", JOptionpane.WARNING_MESSAGE);
  }
}
