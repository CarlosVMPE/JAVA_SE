/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regisproapp.imagen;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author OPERADOR
 */
public class Imagen7  extends javax.swing.JPanel{
    
    
    public Imagen7(){
    
    initComponents();
    this.setSize(1015,675);
    }

   public void paintComponent(Graphics g){
    
       Dimension tam = getSize(); 
       
       ImageIcon Imagen7= new ImageIcon(new ImageIcon(getClass().getResource("17ad638.jpg")).getImage());
       
       g.drawImage(Imagen7.getImage(), 0, 0, tam.width,tam.height,null);
       
       setOpaque(false);
       super.paintComponent(g);
    
    }

    private void initComponents() {
     
    } 
    
    
}
