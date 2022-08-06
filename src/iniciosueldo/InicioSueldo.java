
package iniciosueldo;
import javax.swing.JOptionPane;
/**
 *
 * @author Carolina EM
 */
public class InicioSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sueldo a=new Sueldo();
        a.leerDatos();
        a.mostrar();
        a.asignaSueldo();
        JOptionPane.showMessageDialog(null,a.mostrar());
        System.exit(0);

    }
    
}