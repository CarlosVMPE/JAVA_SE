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
public class Imagen8 extends javax.swing.JPanel  {
    
    
    public Imagen8(){
    
    initComponents();
    this.setSize(1260,720);
    }

   public void paintComponent(Graphics g){
    
       Dimension tam = getSize(); 
       
       ImageIcon Imagen8= new ImageIcon(new ImageIcon(getClass().getResource("Workers3.jpg")).getImage());
       
       g.drawImage(Imagen8.getImage(), 0, 0, tam.width,tam.height,null);
       
       setOpaque(false);
       super.paintComponent(g);
    
    }

    private void initComponents() {
     
    } 
    
    
    
}
