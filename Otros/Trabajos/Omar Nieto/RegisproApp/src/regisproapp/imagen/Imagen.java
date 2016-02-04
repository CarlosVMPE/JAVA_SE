
package regisproapp.imagen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class Imagen extends javax.swing.JPanel {
    
    public Imagen(){
    
    initComponents();
    this.setSize(900,600);
    }

    @Override
    public void paintComponent(Graphics g){
    
       Dimension tam = getSize(); 
       
       ImageIcon Imagen= new ImageIcon(new ImageIcon(getClass().getResource("1-estagiario-recebendo-orientacoes.jpg")).getImage());
       
       g.drawImage(Imagen.getImage(), 0, 0, tam.width,tam.height,null);
       
       setOpaque(false);
       super.paintComponent(g);
    
    }

    private void initComponents() {
     
    }
   
    }
    

