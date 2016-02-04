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
public class Imagen5 extends javax.swing.JPanel{
    
    public Imagen5(){
    
    initComponents();
    this.setSize(1024,768);
    }

   public void paintComponent(Graphics g){
    
       Dimension tam = getSize(); 
       
       ImageIcon Imagen5= new ImageIcon(new ImageIcon(getClass().getResource("5-Universidad-de-Los-Andes-Colombia.jpg")).getImage());
       
       g.drawImage(Imagen5.getImage(), 0, 0, tam.width,tam.height,null);
       
       setOpaque(false);
       super.paintComponent(g);
    
    }

    private void initComponents() {
     
    } 
    
    
}
