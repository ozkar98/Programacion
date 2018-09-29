import javax.swing.JOptionPane;
public class ForLoop{
  public static void main(String[] args) {
    //For ( inicializar var, condicin, incremento){}
    //accion1
    //accion2
    int tabla;
do{
tabla = Integer.parseInt(JOptionPane.showInputDialog("Que Tabla quieres"));
String salida = "";
    for(int i = 0; i <9; i++){
      salida += tabla + "X" + (i + 1) + "="+ (i + 1)* tabla + "\n";
    }
    JOptionPane.showMessageDialog(null, salida);
  } while (tabla != 0); {

  }
}
}
