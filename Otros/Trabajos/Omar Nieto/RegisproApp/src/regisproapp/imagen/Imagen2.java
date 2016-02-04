
package regisproapp.imagen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Imagen2 extends javax.swing.JPanel {
    
    public Imagen2(){
    
    initComponents();
    this.setSize(1100,733);
    }

    @Override
    public void paintComponent(Graphics g){
    
       Dimension tam = getSize(); 
       
       ImageIcon Imagen2= new ImageIcon(new ImageIcon(getClass().getResource("hay-que-mantener-el-interes-de-los-alumnos.jpg")).getImage());
       
       g.drawImage(Imagen2.getImage(), 0, 0, tam.width,tam.height,null);
       
       setOpaque(false);
       super.paintComponent(g);
    
    }

    private void initComponents() {
     
    }
   
    }