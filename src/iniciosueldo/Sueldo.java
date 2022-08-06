
package iniciosueldo;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Sueldo {
        String nombre;
    int horas;
    double sueldo,Sueldo;
    
    void leerDatos(){
        nombre=JOptionPane.showInputDialog("Nombre del trabajador");
        horas=Integer.parseInt(JOptionPane.showInputDialog("Teclea las horas laboradas a la semana"));
        sueldo=Double.parseDouble(JOptionPane.showInputDialog("Teclea el sueldo por hora del trabajador"));
    }
    String mostrar(){
        String aux; 
        aux="Nombre del trabajador: "+nombre+"\nHoras laboradas: "+horas+"\nSueldo por hora: "+sueldo+"\nSueldo a percibir: "+Sueldo;
        return (aux);
    }
    void asignaSueldo(){
        if (horas<=40){
            Sueldo= sueldo*horas;
        }
        else{
            if (horas>40 && horas<50){
                Sueldo= (sueldo*40)+(sueldo*1.5)*(horas-40);
            }
            else {
                if (horas>=50){
                    Sueldo= (sueldo*40)+((sueldo*1.5)*(horas-40))+((sueldo*2)*(horas-50));
                }
            }
        }
    }
}
