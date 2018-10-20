import javax.swing.*;
public class CourseImpl {
	public static void main(String[] args) {

int opc = 0;
Course curso1 = null;
    do{
         opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú"
        + "\n1: Crear un curso"
        + "\n2: Agregar un estudiante"
        + "\n3: Eliminar un estudiante"
        + "\n4: Mostrar numero de estudiantes"
        + "\n5: Mostrar numero de estudiantes "));


        switch(opc){
          case 1:

					curso1 = new Course(JOptionPane.showInputDialog(null,"Escribe aqui el nombre del curso"));
          break;
          case 2:

					curso1.addStudent(JOptionPane.showInputDialog(null,"Escribe aqui el nombre del alumno"));
          break;


          case 3:

					curso1.dropStudent(JOptionPane.showInputDialog(null,"Escribe aqui el nomnre del alumno a eliminar"));
          break;
          case 4:

					String[] studentsIngles = curso1.getStudents();
					JOptionPane.showMessageDialog(null,"\n Estudiantes en el curso " + curso1.getCourseName() + ":");
					JOptionPane.showMessageDialog(null,studentsIngles);
          break;
          case 5:

					JOptionPane.showMessageDialog(null,"Numero de estudiantes en: " + curso1.getCourseName() + ": " + curso1.getNumberOfStudents());
					studentsIngles = curso1.getStudents();
          break;
          default:
					JOptionPane.showMessageDialog(null,"Solo debes escoger un numero de 1-5");
          break;
        }
			}while (opc <= 5);


		}
}
