/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receptionist;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AddPatient extends javax.swing.JFrame {

    /**
     * Creates new form AddPatient
     */
    public int id=0;
    
    public AddPatient() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1Patientname = new javax.swing.JTextField();
        jTextField1Gender = new javax.swing.JTextField();
        jTextField1Age = new javax.swing.JTextField();
        jLabel4Ward = new javax.swing.JLabel();
        jTextField1Depertment = new javax.swing.JTextField();
        jLabel4Guardianname = new javax.swing.JLabel();
        jTextField1Guardianname = new javax.swing.JTextField();
        jLabel4Contacno = new javax.swing.JLabel();
        jTextField1Contacno = new javax.swing.JTextField();
        jButton1Addmit = new javax.swing.JButton();
        jLabel4Address = new javax.swing.JLabel();
        jTextField1Address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField1Seat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("Gender :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 27));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("Age :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 40, 27));

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Patient's Name :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 27));

        jTextField1Patientname.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1Patientname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1PatientnameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Patientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, 27));

        jTextField1Gender.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1GenderActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 90, 27));

        jTextField1Age.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1AgeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Age, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 64, 20));

        jLabel4Ward.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4Ward.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4Ward.setText("Depertment :");
        getContentPane().add(jLabel4Ward, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 100, 27));

        jTextField1Depertment.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1Depertment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1DepertmentActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Depertment, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 140, 27));

        jLabel4Guardianname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4Guardianname.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4Guardianname.setText("Guardian's Name :");
        getContentPane().add(jLabel4Guardianname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 22));

        jTextField1Guardianname.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1Guardianname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1GuardiannameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Guardianname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 262, 190, 30));

        jLabel4Contacno.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4Contacno.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4Contacno.setText("Contac no.:");
        getContentPane().add(jLabel4Contacno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, -1));

        jTextField1Contacno.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1Contacno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ContacnoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Contacno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 163, 30));

        jButton1Addmit.setBackground(new java.awt.Color(255, 153, 255));
        jButton1Addmit.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton1Addmit.setForeground(new java.awt.Color(255, 51, 51));
        jButton1Addmit.setText("Admit");
        jButton1Addmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AddmitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Addmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 120, 50));

        jLabel4Address.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4Address.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4Address.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4Address.setText("Address :");
        getContentPane().add(jLabel4Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 80, -1));

        jTextField1Address.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1AddressActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 259, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Seat- No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 70, -1));

        jTextField1Seat.setBackground(new java.awt.Color(153, 153, 255));
        jTextField1Seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1SeatActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1Seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 82, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 51));
        jLabel5.setText("       Fill the Form");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 360, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 51));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 90, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\apo.jpg")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 600, 460));

        setSize(new java.awt.Dimension(756, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1AddressActionPerformed

    private void jTextField1PatientnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1PatientnameActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1PatientnameActionPerformed

    private void jTextField1GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1GenderActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1GenderActionPerformed

    private void jTextField1AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1AgeActionPerformed

    private void jTextField1DepertmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1DepertmentActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1DepertmentActionPerformed

    private void jTextField1GuardiannameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1GuardiannameActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1GuardiannameActionPerformed

    private void jTextField1ContacnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ContacnoActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ContacnoActionPerformed

    private void jButton1AddmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AddmitActionPerformed
        // TODO add your handling code here:
        //id++;
        String Seat=jTextField1Seat.getText();
        String PatientName = jTextField1Patientname.getText();
        String Gender = jTextField1Gender.getText();
        String Age = jTextField1Age.getText();
        String Depertment = jTextField1Depertment.getText();
        String GuardianName=jTextField1Guardianname.getText();
        String Contac_no=jTextField1Contacno.getText();
        String Address=jTextField1Address.getText();
        //String Id=String.parseString(id);
       // int Id=id;
        File file = new File ("output.txt");

        try {
            
            FileOutputStream f = new FileOutputStream(file,true);
            PrintWriter writer = new PrintWriter (f);
            writer .append(Seat+" "+PatientName+" "+Gender+" "+Age+" "+Depertment+" "+GuardianName+" "+Contac_no+" "+Address+"\r\n");
            writer.close();
            f.close();
            new RJFrame().setVisible(true);
            this.dispose();
            
           // String InputName = (String) .getText();
        } 
        catch (Exception ex) {
            System.out.println(ex+"\n");
        }
        
   
    }//GEN-LAST:event_jButton1AddmitActionPerformed

    private void jTextField1SeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1SeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1SeatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new RJFrame().setVisible(true);
        this.dispose();        
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1Addmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4Address;
    private javax.swing.JLabel jLabel4Contacno;
    private javax.swing.JLabel jLabel4Guardianname;
    private javax.swing.JLabel jLabel4Ward;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1Address;
    private javax.swing.JTextField jTextField1Age;
    private javax.swing.JTextField jTextField1Contacno;
    private javax.swing.JTextField jTextField1Depertment;
    private javax.swing.JTextField jTextField1Gender;
    private javax.swing.JTextField jTextField1Guardianname;
    private javax.swing.JTextField jTextField1Patientname;
    private javax.swing.JTextField jTextField1Seat;
    // End of variables declaration//GEN-END:variables
}
