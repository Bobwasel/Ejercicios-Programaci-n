import javax.swing.JOptionPane;

public class BreakContinue {
    public static void main (String[] args) {
    
        while(true){
            String menu = JOptionPane.showInputDialog(null, "Escribe Patatas para salir");
            if(menu.equals("Patatas")){
                System.out.println(menu);
                break;
            } else {
                System.out.println("No hay patatas");
                continue;
            }
           // System.out.println("Si esto se ejecuta, está mal!");
           // Pero no se puede compilar ya que esta línea nunca será ejecutada.
        }
    }
}