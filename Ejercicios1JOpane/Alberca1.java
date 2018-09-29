import javax.swing.JOptionPane;

public class Alberca1 {
public static void main(String[] args) {

    double Altura, Largo, Ancho, CostoC, Volumen, TotalP;
    int a = JOptionPane.showConfirmDialog(null," pago por llenado de alberca:");
    Altura = Double.parseDouble(JOptionPane.showInputDialog(null,"altura de la alberca = "));
    JOptionPane.showMessageDialog(null,"tu altura es= "+Altura);
    JOptionPane.showMessageDialog(null,a);
 }
}
