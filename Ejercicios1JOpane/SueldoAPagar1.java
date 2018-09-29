import javax.swing.JOptionPane;

public class SueldoAPagar1 {

public static void main(String[] args) { /////no se :v


  double horasTotal, HorasPag, SueldoS;



    horasTotal = Double.parseDouble(JOptionPane.showInputDialog(null,"Cantidad de Horas Trabajadas = "," pago semanal de un trabajador por hora :",1));


    HorasPag = Double.parseDouble(JOptionPane.showInputDialog(null,"ingresa pago por hora ="));
    //horasssss
    SueldoS = horasTotal*HorasPag;
    JOptionPane.showMessageDialog(null,"El sueldo semanal es de: $" + SueldoS);
    
 }
}
