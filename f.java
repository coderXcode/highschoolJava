/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * f.java
 *
 * Created on Aug 19, 2002, 10:36:03 PM
 */

/**
 *
 * @author g1.test1
 */
import java.applet.*;
import java.awt.*;
public class f extends java.applet.Applet {
public void paint(Graphics g)
    {
       g.setColor(Color.orange);
    g.fillRect(0, 0, 100, 40);
    g.setColor(Color.white);
    g.fillRect(0, 40, 100, 40);
    g.setColor(Color.green);
    g.fillRect(0, 80, 100, 40);
    g.setColor(Color.blue);
    g.drawOval(30,40 , 40, 40);
    g.drawLine(50, 40,60 ,60 );
   setBackground(Color.red);
   int arr1[]={110,120,140,120,110};
   int arr2[]={10,30,40,50,70};
   g.drawPolyline(arr2, arr1, 4);//should be equal to the number of points
   }
    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /** This method is called from within the init() method to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.BorderLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
