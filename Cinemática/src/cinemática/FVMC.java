package cinemática;

//<editor-fold defaultstate="collapsed" desc="imports">
import java.awt.Color;
import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import javax.swing.JFrame;
//</editor-fold>

/**
 * @author David
 * JFrame F velocidad maxima VM de una curva V 
 */
public class FVMC extends JFrame {

    //<editor-fold defaultstate="collapsed" desc="constructor">
    public FVMC() {
        initComponents();
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="metodos">
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cTμ = new javax.swing.JTextField();
        eV = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cTr = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cTgr = new javax.swing.JTextField();
        bPrueba = new javax.swing.JButton();
        bCalcula = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("<html>  \n\nFc=Fr\t<br> \nv^2/r=μ*g\t<br> \nv=sqrt(μ*g*r)  \n\n<html> ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 113, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("μ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 279, -1, -1));

        cTμ.setText("0");
        cTμ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTμActionPerformed(evt);
            }
        });
        getContentPane().add(cTμ, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 283, 77, -1));

        eV.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eV.setText("<html>\n\nvMax = 0 m/s  <br>\n= 0 km/h \t   <br>\n\n<html>");
        getContentPane().add(eV, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 412, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("r");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(619, 279, -1, -1));

        cTr.setText("0");
        cTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTrActionPerformed(evt);
            }
        });
        getContentPane().add(cTr, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 283, 77, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("g");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 279, -1, -1));

        cTgr.setText("0");
        cTgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTgrActionPerformed(evt);
            }
        });
        getContentPane().add(cTgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(433, 283, 77, -1));

        bPrueba.setText("Prueba");
        bPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPruebaActionPerformed(evt);
            }
        });
        getContentPane().add(bPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 282, -1, -1));

        bCalcula.setText("Calcula");
        bCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalculaActionPerformed(evt);
            }
        });
        getContentPane().add(bCalcula, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 341, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Al menos uno de los datos es 0");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(362, 504, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cTμActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTμActionPerformed
    }//GEN-LAST:event_cTμActionPerformed

    private void cTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTrActionPerformed
    }//GEN-LAST:event_cTrActionPerformed

    private void cTgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTgrActionPerformed
    }//GEN-LAST:event_cTgrActionPerformed

    private void bPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPruebaActionPerformed
        prueba();
    }//GEN-LAST:event_bPruebaActionPerformed

    private void bCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalculaActionPerformed
        calcula();
    }//GEN-LAST:event_bCalculaActionPerformed

    void calcula() {
        try {
            double μ = Double.parseDouble(cTμ.getText()), g = Double.parseDouble(cTgr.getText()), 
                   r = Double.parseDouble(cTr.getText()), resMS = devuelveV(μ,g,r);
            chequeaDatos(μ,g,r,resMS);
        } catch(NumberFormatException e) {
            
        }
    }
    
    double resMSAnt = 0;
    void prueba() {
        double μ = 0.4, g = 9.8, r = 10, resMS = devuelveV(μ,g,r);
        chequeaDatos(μ,g,r,resMS);
    }
    
    boolean advertenciaDatoNulo = true;
    void chequeaDatos(double μ, double g, double r, double resMS) {
        advertenciaDatoNulo = resMS==0 || advertenciaDatoNulo==false;
        System.out.println(advertenciaDatoNulo+"="+resMS);
        
        if (resMS!=resMSAnt) {
            muestraV(μ,g,r,resMS);             
            resMSAnt=resMS;
        } else {
            System.out.println("E: No variaron los datos; el resultado ya fue calculado");
        }
    }
    
    void muestraV(double μ, double g, double r, double resMS) {
        eV.setText("<html>vMax = "+resMS+" m/s<br> = "+3.6*resMS+" km/h"+"\n<html>");
        cTμ.setText(Double.toString(μ));
        cTgr.setText(Double.toString(g));
        cTr.setText(Double.toString(r));
    }
//</editor-fold>      
    
    //<editor-fold defaultstate="collapsed" desc="vars">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcula;
    private javax.swing.JButton bPrueba;
    private javax.swing.JTextField cTgr;
    private javax.swing.JTextField cTr;
    private javax.swing.JTextField cTμ;
    private javax.swing.JLabel eV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="funciones">
    double devuelveV(double μ, double g, double r) {
        return round(100*sqrt(μ*g*r))/100d; //100.0
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="main">
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FVMC v = new FVMC();
        v.getContentPane().setBackground(Color.white);
        v.setResizable(false);
        v.setVisible(true);
    }
//</editor-fold>
}
