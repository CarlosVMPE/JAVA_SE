
package regisproapp.imagen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Imagen6 extends javax.swing.JPanel{
    
    public Imagen6(){
    
    initComponents();
    this.setSize(1024,831);
    }

   public void paintComponent(Graphics g){
    
       Dimension tam = getSize(); 
       
       ImageIcon Imagen6= new ImageIcon(new ImageIcon(getClass().getResource("1430428750Servicios-de-limpieza.jpg")).getImage());
       
       g.drawImage(Imagen6.getImage(), 0, 0, tam.width,tam.height,null);
       
       setOpaque(false);
       super.paintComponent(g);
    
    }

    private void initComponents() {
     
    } 
}
