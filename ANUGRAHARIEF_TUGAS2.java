
package praktikum_gui_arief;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class ANUGRAHARIEF_TUGAS2 extends javax.swing.JFrame {

    public ANUGRAHARIEF_TUGAS2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combobox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nilaix = new javax.swing.JTextField();
        nilaia = new javax.swing.JTextField();
        nilain = new javax.swing.JTextField();
        syaratsoal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fungsisoal = new javax.swing.JTextField();
        nilaifx = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JENIS FUNGSI SOAL", "Soal 1", "Soal 2", "Soal 3" }));
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });

        jLabel1.setText("FUNGSI SOAL");

        jLabel2.setText("INPUT NILAI");

        jLabel3.setText("nilai x");

        jLabel4.setText("nilai a");

        jLabel5.setText("nilai n");

        nilaix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nilaix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaixActionPerformed(evt);
            }
        });

        nilaia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nilaia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilaiaActionPerformed(evt);
            }
        });

        nilain.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nilain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nilainActionPerformed(evt);
            }
        });

        syaratsoal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        syaratsoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox(evt);
            }
        });

        jLabel6.setText("SYARAT SOAL");

        jLabel7.setText("nilai f(x)");

        fungsisoal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nilaifx.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nilaifx.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButton2.setText("HITUNG");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("RESET");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Asus\\Downloads\\math.jpg")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 212, Short.MAX_VALUE)
                        .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nilain))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nilaix)
                                    .addComponent(nilaia)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel6)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(syaratsoal, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fungsisoal, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nilaifx, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fungsisoal, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(syaratsoal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nilaifx, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nilaix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nilaia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nilain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
switch(combobox.getSelectedIndex()){
    case 1:
        nilaix.setText(null);
        nilaia.setText(null);
        nilain.setText(null);
        nilaifx.setText(null);
        fungsisoal.setText(" f(x) = sin(2x) ");
        syaratsoal.setText("x , a = bilangan real & " + " n = bilangan bulat");
        break;
    case 2:
        nilaix.setText(null);
        nilaia.setText(null);
        nilain.setText(null);
        nilaifx.setText(null);
        fungsisoal.setText(" ln(-x) ");
        syaratsoal.setText(" a <0, n bilangan bulat positif, x <0 ");
        break;
    case 3:
        nilaix.setText(null);
        nilaia.setText(null);
        nilain.setText(null);
        nilaifx.setText(null);
        fungsisoal.setText(" f(x) = x/(1-x) ");
        syaratsoal.setText(" a bil real, n bil bulat positif, -1 < x < 1 ");
        break;
    default:
        nilaix.setText(null);
        nilaia.setText(null);
        nilain.setText(null);
        nilaifx.setText(null);
        fungsisoal.setText(null);
        syaratsoal.setText(null);
        break;
        
        
}
    }//GEN-LAST:event_comboboxActionPerformed

    private void nilaixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaixActionPerformed

    }//GEN-LAST:event_nilaixActionPerformed

    private void nilaiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilaiaActionPerformed
 
    }//GEN-LAST:event_nilaiaActionPerformed

    private void nilainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nilainActionPerformed

    }//GEN-LAST:event_nilainActionPerformed

    private void combobox(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox

    }//GEN-LAST:event_combobox

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double x = Double.parseDouble(nilaix.getText());
        double a = Double.parseDouble(nilaia.getText());
        double n = Double.parseDouble(nilain.getText());
        switch(combobox.getSelectedIndex()){
            case 1:
                nilaifx.setText(String.valueOf(hitungsoal2(x,a,n)));
                break;
            case 2:
                 if(a<0 && x<0){
                nilaifx.setText(String.valueOf(hitungsoal4(x,a,n)));
                 }else{
                    JOptionPane.showMessageDialog(null, "Nilai yang dimasukkan salah\n"+"Nilai a dan x harus kurang dari 0");
                 }
                break;
            case 3:
                if(a!=1 && (x>-1 && x<1)){
                nilaifx.setText(String.valueOf(hitungsoal5(x,a,n)));
                }else{
                JOptionPane.showMessageDialog(null, "Input yang dimasukkan salah\n"+"Nilai a tidak boleh 1 dan nilai x harus lebih dari -1 & kurang dari 1");
                }
                break;
            default:
                nilaix.setText(null);
        nilaia.setText(null);
        nilain.setText(null);
        nilaifx.setText(null);
        fungsisoal.setText(null);
        syaratsoal.setText(null);
                break;
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       nilaix.setText(null);
        nilaia.setText(null);
        nilain.setText(null);
        nilaifx.setText(null);
        fungsisoal.setText(null);
        syaratsoal.setText(null);
              
      
    }//GEN-LAST:event_jButton3ActionPerformed
 public static double hitungsoal2(double x,double a, double n){
     double es = 0.5 * Math.pow(10, 2-n);
     double[] ia;
        ia = new double[100001];
     ia [0]= Math.sin(Math.toRadians(2*a));
     double[] ib;
        ib = new double[100001];
     ib [0] = Math.cos(Math.toRadians(2*a));
     double temporary = 0;
     for(int i=1; i<100001;i++){
         ia[i]= ia[i-1] + ((Math.pow(2,i) * Math.pow(-1, i-1)* Math.pow(x-a,i))/(faktorial(i)));
         if(i%2==0){
          ia[i] = ia[i]*  ia[0];
         }else{
          ia[i] = ia[i]* ib[0]; 
         }
        double ea = ((ia[i]-ia[i-1])/ia[i])*100;
       if(Math.abs(ea)<es){
                temporary += ia[i];
                System.out.println(i);
                break;
     }}
     double temporary1 = Math.floor(temporary*100000)/100000;
     return temporary1;
 }
  public static int faktorial(int angka){
     int fak = 1;
     for(int i = 1;i <= angka;i++){
         fak = i*fak;
     }
     return fak;
     
 }
     
 public static double hitungsoal5(double x,double a, double n){
     double es = 0.5 * Math.pow(10, 2-n);
     double[] ia;
     ia = new double[100001];
     ia[0] = a/(1-a);
     double temporary = 0;
     for(int i = 1; i <100001; i++){
         ia[i]= ia[i-1]+ deret(x, a, i);
         double ea = ((ia[i]-ia[i-1])/ia[i])*100;
          if(Math.abs(ea)<es){
                temporary += ia[i];
                System.out.println(i);
                break;
     }
     }
     double temporary12 = Math.floor(temporary*100000)/100000;
     return temporary12;
     }
 public static double deret(double x, double a, int suku) {
        double hasil = 1;
        for(int i=1; i<=suku; i++){
            hasil *=(x-a)/(1-a); 
        }
        return hasil;
    }
  
 public static double hitungsoal4(double x,double a, double n){
       double[] f = new double[100001];
        f[0] = Math.log(-a);
        double temporary=0;
        double es = 0.5 * Math.pow(10, 2-n);
        for(int i=1; i<=100000; i++){
            f[i]=f[i-1] + (Math.pow(-1,i+1)*Math.pow(x-a, i))/(i*Math.pow(a,i));
            double ea = ((f[i]-f[i-1])/f[i])*100;
            if(Math.abs(ea)<es){
                temporary += f[i];
                System.out.println(i);
                break;
            }
        }
        double temporaryl3 = Math.floor(temporary*100000)/100000;
        return temporaryl3;
    }

 
  
   
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
            java.util.logging.Logger.getLogger(ANUGRAHARIEF_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ANUGRAHARIEF_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ANUGRAHARIEF_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ANUGRAHARIEF_TUGAS2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ANUGRAHARIEF_TUGAS2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combobox;
    private javax.swing.JTextField fungsisoal;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nilaia;
    private javax.swing.JTextField nilaifx;
    private javax.swing.JTextField nilain;
    private javax.swing.JTextField nilaix;
    private javax.swing.JTextField syaratsoal;
    // End of variables declaration//GEN-END:variables
}
