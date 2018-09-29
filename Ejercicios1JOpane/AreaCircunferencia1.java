import javax.swing.JOptionPane;

public class AreaCircunferencia1 {


public static void main(String[] args) {
double Circuferencia = Double.parseDouble(JOptionPane.showInputDialog(null,"ingrese el radio de la circunferencia: " ,"calcula el area de una circunferencia",1));



double Resultado = 3.1416 * (Circuferencia * Circuferencia);
JOptionPane.showMessageDialog(null, "El area de la Circunferencia : " + Resultado, "Resultado de la Area", 2);


}

}
