
package regisproapp.imagen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Imagen4 extends javax.swing.JPanel{
    
   public Imagen4(){
    
    initComponents();
    this.setSize(1024,768);
    }

   public void paintComponent(Graphics g){
    
       Dimension tam = getSize(); 
       
       ImageIcon Imagen4= new ImageIcon(new ImageIcon(getClass().getResource("5-Universidad-de-Los-Andes-Colombia.jpg")).getImage());
       
       g.drawImage(Imagen4.getImage(), 0, 0, tam.width,tam.height,null);
       
       setOpaque(false);
       super.paintComponent(g);
    
    }

    private void initComponents() {
     
    } 
    
    
}
