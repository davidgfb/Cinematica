package cinemática;

//<editor-fold defaultstate="collapsed" desc="imports">
import java.awt.Color;
import static java.lang.Math.round;
import javax.swing.JFrame;
//</editor-fold>

/**
 * @author David
 * JFrame F distancia D y tiempo T de frenado F
 */
public class FDTF extends JFrame {

    //<editor-fold defaultstate="collapsed" desc="constuctor">
    public FDTF() {
        initComponents();
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="metodos">
    void calculaDatos() {
        try{
            double μ = Double.parseDouble(cTμ.getText()), g = Double.parseDouble(cTgr.getText()), 
                   v0 = Double.parseDouble(cTv0.getText()), tf = devuelveTf(v0,μ,g), xf = devuelveXf(v0,μ,g);
            chequeaDatos(v0,μ,g,tf,xf);
        } catch(NumberFormatException e) {
            
        }
        
    }
    
    double tfAnterior = 0;
    void prueba() {
        double v0=28, μ = 0.4, g = 9.8, tf = devuelveTf(v0,μ,g), xf = devuelveXf(v0,μ,g); //100km/h
        chequeaDatos(v0,μ,g,tf,xf);
        System.out.println("cambia datos prueba");
    }
    
    boolean advertenciaDatoNulo = true;
    void chequeaDatos(double v0, double μ, double g, double tf, double xf) {
        advertenciaDatoNulo = tf==0 || advertenciaDatoNulo==false;
        System.out.println(advertenciaDatoNulo+"="+tf);
        
        if (tf!=tfAnterior) {
            muestraDatos(v0,μ,g,tf,xf); 
            tfAnterior=tf;
        } else {
            System.out.println("E: No variaron los datos; el resultado ya fue calculado");
        }
    }
    
    void muestraDatos(double v0, double μ, double g, double tf, double xf) {               
        eTf.setText("tf = "+tf+" s");
        eXf.setText("xf = "+xf+" m");
        cTv0.setText(Double.toString(v0));
        cTμ.setText(Double.toString(μ));
        cTgr.setText(Double.toString(g));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cTμ = new javax.swing.JTextField();
        eXf = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cTv0 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cTgr = new javax.swing.JTextField();
        bPrueba = new javax.swing.JButton();
        bCalcula = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eTf = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("m/s");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("μ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 262, -1, -1));

        cTμ.setText("0");
        cTμ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTμActionPerformed(evt);
            }
        });
        getContentPane().add(cTμ, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 266, 77, -1));

        eXf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eXf.setText("<html>\n\nx = 0 m  <br>\n\n<html>");
        getContentPane().add(eXf, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 463, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("v0");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 262, -1, -1));

        cTv0.setText("0");
        cTv0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTv0ActionPerformed(evt);
            }
        });
        getContentPane().add(cTv0, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 266, 77, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("g");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(651, 262, -1, -1));

        cTgr.setText("0");
        cTgr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cTgrActionPerformed(evt);
            }
        });
        getContentPane().add(cTgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(679, 266, 77, -1));

        bPrueba.setText("Prueba");
        bPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPruebaActionPerformed(evt);
            }
        });
        getContentPane().add(bPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 265, -1, -1));

        bCalcula.setText("Calcula");
        bCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalculaActionPerformed(evt);
            }
        });
        getContentPane().add(bCalcula, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 379, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Al menos uno de los datos es 0");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 540, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("<html>  \n\nF=m*a\t<br> \nF=Fr\t<br> \na=μ*g  \t<br> \nx=v0*t+1/2*a*t^2\t<br> \nx=v0*t+1/2*μ*g*t^2\t<br> \nt=(-b+-sqrt(b^2-4*a*c))/2*a \t<br> \ntf=v0/(μ*g)\n\n<html> ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 78, -1, -1));

        eTf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eTf.setText("<html>\n\ntf = 0 s  <br>\n \t   \n\n<html>");
        getContentPane().add(eTf, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 463, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("<html>  \n\nvf^2=v0^2+2*a*x\t<br> \nxf=vo^2/(2*μ*g)\n\n\n<html> ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 78, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cTμActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTμActionPerformed
    }//GEN-LAST:event_cTμActionPerformed

    private void cTv0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTv0ActionPerformed
    }//GEN-LAST:event_cTv0ActionPerformed

    private void cTgrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cTgrActionPerformed
    }//GEN-LAST:event_cTgrActionPerformed

    private void bPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPruebaActionPerformed
        prueba();
    }//GEN-LAST:event_bPruebaActionPerformed

    private void bCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalculaActionPerformed
        calculaDatos();
    }//GEN-LAST:event_bCalculaActionPerformed
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="vars">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcula;
    private javax.swing.JButton bPrueba;
    private javax.swing.JTextField cTgr;
    private javax.swing.JTextField cTv0;
    private javax.swing.JTextField cTμ;
    private javax.swing.JLabel eTf;
    private javax.swing.JLabel eXf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="funciones">
    double devuelveTf(double v0, double μ, double g) {
        double tF = v0/(μ*g);
        return round(100*tF)/100d; 
    }
    
    double devuelveXf(double v0, double μ, double g) {
        double xF = v0*v0/(2*μ*g);
        return round(100*xF)/100d; 
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="main">
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        FDTF v = new FDTF();
        v.getContentPane().setBackground(Color.white);
        v.setResizable(false);
        v.setVisible(true);
    }
//</editor-fold>
}
