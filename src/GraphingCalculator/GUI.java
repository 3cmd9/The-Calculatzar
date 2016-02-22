/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphingCalculator;

import java.awt.*;

/**
 *
 * @author 067011981
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (jTextField1.getText().equals("")){      //If there's nothing in the text fields,
            jTextField1.setText("0");               //set them to 0
        }
        if (jTextField2.getText().equals("")){
            jTextField2.setText("0");
        }
        if (jTextField3.getText().equals("")){
            jTextField3.setText("0");
        }
        if (jTextField4.getText().equals("")){
            jTextField4.setText("0");
        }
        if (jTextField5.getText().equals("")){
            jTextField5.setText("0");
        }
        if (jTextField6.getText().equals("")){
            jTextField6.setText("0");
        }
        if (jTextField7.getText().equals("")){
            jTextField7.setText("0");
        }
        if (jTextField8.getText().equals("")){
            jTextField8.setText("0");
        }
        if (jTextField9.getText().equals("")){
            jTextField9.setText("0");
        }
        if (jTextField10.getText().equals("")){
            jTextField10.setText("0");
        }
        int z = -10;
        int a = 10;
        Graphics g = jPanel1.getGraphics();
        g.drawLine(260, 520, 260, 0);       //Draw axis
        g.drawLine(0, 260, 520 , 260);      //
        for (int i = 0; i < 520; i = i + 26){
            g.drawLine (i, 255 , i ,265);   //Draw ticks
            g.drawLine (255, i , 265, i);   //
            g.drawString(String.valueOf(z),i-4,275);    //Draw numbers
            g.drawString(String.valueOf(a),265,i+6);    //
            z++;
            a--;
        }
        double x = -100;
        double y;
        double coef5 = (Double.valueOf(jTextField1.getText()));     //Get coefficients
        double coef4 = (Double.valueOf(jTextField2.getText()));     //
        double coef3 = (Double.valueOf(jTextField3.getText()));     //
        double coef2 = (Double.valueOf(jTextField4.getText()));     //
        double coef1 = (Double.valueOf(jTextField5.getText()));     //
        double coef0 = (Double.valueOf(jTextField6.getText()));     //
        double coefPowx = (Double.valueOf(jTextField7.getText()));  //
        double coefSin = (Double.valueOf(jTextField8.getText()));   //
        double coefCos = (Double.valueOf(jTextField9.getText()));   //
        double coefTan = (Double.valueOf(jTextField10.getText()));  //
        do {
            y = (coefSin*Math.sin(x)) + (coefCos*Math.cos(x)) + (coefTan*Math.tan(x)) + (coef5*Math.pow(x,5)) +(coef4*Math.pow(x,4)) + (coef3*Math.pow(x,3)) + (coef2*Math.pow(x, 2)) + (coef1*x) + coef0;     //Equation for y
            if (!jTextField7.getText().equals("0")){
                if(coefPowx > 0){
                    y = y + Math.pow(coefPowx,x);
                }
                else if(coefPowx < 0){
                    y = y + -(Math.pow(-coefPowx,x));
                }
            }
            x = x + 0.001;
            g.setColor(Color.black);
            double drawx = (x+10)*26;
            double drawy = (-y+10)*26;
            g.fillRect((int)drawx, (int)drawy, 2, 2);        //Draw dot on coordinate
        }while (x <= 100);
    }//GEN-LAST:event_jButton1MouseClicked
    
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jPanel1.removeAll();        //Reset the jFrame
        jPanel1.updateUI();         //
        jTextField1.setText("0");   //Set all text fields to 0
        jTextField2.setText("0");   //
        jTextField3.setText("0");   //
        jTextField4.setText("0");   //
        jTextField5.setText("0");   //
        jTextField6.setText("0");   //
        jTextField7.setText("0");   //
        jTextField8.setText("0");   //
        jTextField9.setText("0");   //
        jTextField10.setText("0");  //
    }//GEN-LAST:event_jButton2MouseClicked
    
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
