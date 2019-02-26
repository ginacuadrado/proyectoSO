/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.ViewController;
import Models.Restaurant;
import javax.swing.JLabel;

public class InitialView extends javax.swing.JFrame {

    public static Restaurant res = new Restaurant();
    
    public InitialView() {
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

        jLabel39 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        TimeLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        ACooks = new javax.swing.JLabel();
        AppetFire1 = new javax.swing.JButton();
        AppetHire = new javax.swing.JButton();
        MainHire = new javax.swing.JButton();
        MainFire = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        DessertHire = new javax.swing.JButton();
        DessertFire = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        WaiterHire = new javax.swing.JButton();
        WaiterFire = new javax.swing.JButton();
        numberACooks = new javax.swing.JLabel();
        numberMCooks = new javax.swing.JLabel();
        numberDCooks = new javax.swing.JLabel();
        numberWaiters = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        numberADishes = new javax.swing.JLabel();
        numberMDishes = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        numberDDishes = new javax.swing.JLabel();
        numberOrders = new javax.swing.JLabel();
        dayHours = new javax.swing.JLabel();
        hourScale = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        chiefStatus = new javax.swing.JLabel();
        managerStatus = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("MetroPizza");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(900, 900, 900, 900));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusCycleRoot(false);
        setIconImages(null);
        setLocation(new java.awt.Point(250, 250));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel39.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel39.setText("Current Status:");
        getContentPane().add(jLabel39);
        jLabel39.setBounds(830, 410, 120, 30);

        Close.setForeground(new java.awt.Color(255, 51, 51));
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ExitIcon.png"))); // NOI18N
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close);
        Close.setBounds(950, 10, 40, 40);

        TimeLabel.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        TimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeLabel.setText("TIME TO CLOSE:");
        getContentPane().add(TimeLabel);
        TimeLabel.setBounds(80, 40, 370, 60);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Logo.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 10, 450, 170);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 90, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PizzaIcon.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 250, 50, 230);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RedWineBackground.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, -20, 1100, 210);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AppetizerIcon.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 190, 60, 160);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DessertIcon.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 430, 50, 80);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WaiterIcon.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(530, 220, 130, 90);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WaiterChiefIcon.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(770, 340, 50, 210);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ManagerIcon.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(510, 320, 50, 240);

        jLabel25.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel25.setText("Number of Appetizer Cooks: ");
        getContentPane().add(jLabel25);
        jLabel25.setBounds(80, 240, 230, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RedWineBackground.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(490, 160, 10, 420);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RedWineBackground.png"))); // NOI18N
        jLabel18.setMaximumSize(new java.awt.Dimension(628, 200));
        jLabel18.setMinimumSize(new java.awt.Dimension(628, 200));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 410, 440, 10);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RedWineBackground.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(750, 340, 10, 170);
        getContentPane().add(ACooks);
        ACooks.setBounds(540, 396, 50, 30);

        AppetFire1.setBackground(new java.awt.Color(255, 204, 0));
        AppetFire1.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        AppetFire1.setForeground(new java.awt.Color(255, 255, 255));
        AppetFire1.setText("FIRE");
        AppetFire1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppetFire1ActionPerformed(evt);
            }
        });
        getContentPane().add(AppetFire1);
        AppetFire1.setBounds(370, 270, 90, 30);

        AppetHire.setBackground(new java.awt.Color(255, 204, 0));
        AppetHire.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        AppetHire.setForeground(new java.awt.Color(255, 255, 255));
        AppetHire.setText("HIRE");
        AppetHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AppetHireActionPerformed(evt);
            }
        });
        getContentPane().add(AppetHire);
        AppetHire.setBounds(370, 230, 90, 30);

        MainHire.setBackground(new java.awt.Color(255, 204, 0));
        MainHire.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        MainHire.setForeground(new java.awt.Color(255, 255, 255));
        MainHire.setText("HIRE");
        MainHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainHireActionPerformed(evt);
            }
        });
        getContentPane().add(MainHire);
        MainHire.setBounds(370, 330, 90, 30);

        MainFire.setBackground(new java.awt.Color(255, 204, 0));
        MainFire.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        MainFire.setForeground(new java.awt.Color(255, 255, 255));
        MainFire.setText("FIRE");
        MainFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainFireActionPerformed(evt);
            }
        });
        getContentPane().add(MainFire);
        MainFire.setBounds(370, 370, 90, 30);

        jLabel41.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel41.setText("Number of Dessert Cooks: ");
        getContentPane().add(jLabel41);
        jLabel41.setBounds(80, 440, 210, 30);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RedWineBackground.png"))); // NOI18N
        jLabel19.setMaximumSize(new java.awt.Dimension(628, 200));
        jLabel19.setMinimumSize(new java.awt.Dimension(628, 200));
        getContentPane().add(jLabel19);
        jLabel19.setBounds(530, 340, 440, 10);

        jLabel42.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel42.setText("Number of Available Desserts:");
        getContentPane().add(jLabel42);
        jLabel42.setBounds(80, 470, 340, 30);

        DessertHire.setBackground(new java.awt.Color(255, 204, 0));
        DessertHire.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        DessertHire.setForeground(new java.awt.Color(255, 255, 255));
        DessertHire.setText("HIRE");
        DessertHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DessertHireActionPerformed(evt);
            }
        });
        getContentPane().add(DessertHire);
        DessertHire.setBounds(370, 430, 90, 30);

        DessertFire.setBackground(new java.awt.Color(255, 204, 0));
        DessertFire.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        DessertFire.setForeground(new java.awt.Color(255, 255, 255));
        DessertFire.setText("FIRE");
        DessertFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DessertFireActionPerformed(evt);
            }
        });
        getContentPane().add(DessertFire);
        DessertFire.setBounds(370, 470, 90, 30);

        jLabel34.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel34.setText("Number of Waiters: ");
        getContentPane().add(jLabel34);
        jLabel34.setBounds(590, 240, 160, 30);

        jLabel43.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel43.setText("Number of Taken Orders:");
        getContentPane().add(jLabel43);
        jLabel43.setBounds(590, 270, 230, 30);

        jLabel37.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel37.setText("CHIEF WAITER");
        getContentPane().add(jLabel37);
        jLabel37.setBounds(800, 350, 150, 60);

        jLabel45.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel45.setText("Current Status:");
        getContentPane().add(jLabel45);
        jLabel45.setBounds(570, 410, 120, 30);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RedWineBackground.png"))); // NOI18N
        jLabel23.setMaximumSize(new java.awt.Dimension(628, 200));
        jLabel23.setMinimumSize(new java.awt.Dimension(628, 200));
        getContentPane().add(jLabel23);
        jLabel23.setBounds(20, 310, 440, 10);

        jLabel44.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel44.setText("MANAGER");
        getContentPane().add(jLabel44);
        jLabel44.setBounds(580, 350, 110, 60);

        WaiterHire.setBackground(new java.awt.Color(255, 204, 0));
        WaiterHire.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        WaiterHire.setForeground(new java.awt.Color(255, 255, 255));
        WaiterHire.setText("HIRE");
        WaiterHire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaiterHireActionPerformed(evt);
            }
        });
        getContentPane().add(WaiterHire);
        WaiterHire.setBounds(880, 230, 90, 30);

        WaiterFire.setBackground(new java.awt.Color(255, 204, 0));
        WaiterFire.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        WaiterFire.setForeground(new java.awt.Color(255, 255, 255));
        WaiterFire.setText("FIRE");
        WaiterFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaiterFireActionPerformed(evt);
            }
        });
        getContentPane().add(WaiterFire);
        WaiterFire.setBounds(880, 270, 90, 30);

        numberACooks.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        numberACooks.setForeground(new java.awt.Color(255, 0, 51));
        numberACooks.setText("5454");
        getContentPane().add(numberACooks);
        numberACooks.setBounds(310, 240, 50, 30);

        numberMCooks.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        numberMCooks.setForeground(new java.awt.Color(255, 0, 51));
        numberMCooks.setText("254");
        getContentPane().add(numberMCooks);
        numberMCooks.setBounds(270, 340, 80, 30);

        numberDCooks.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        numberDCooks.setForeground(new java.awt.Color(255, 0, 0));
        numberDCooks.setText("25");
        getContentPane().add(numberDCooks);
        numberDCooks.setBounds(290, 440, 70, 30);

        numberWaiters.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        numberWaiters.setForeground(new java.awt.Color(255, 0, 0));
        numberWaiters.setText("5454");
        getContentPane().add(numberWaiters);
        numberWaiters.setBounds(750, 236, 70, 30);

        jLabel35.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel35.setText("WAITERS");
        getContentPane().add(jLabel35);
        jLabel35.setBounds(670, 190, 270, 60);

        jLabel38.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel38.setText("WAITERS");
        getContentPane().add(jLabel38);
        jLabel38.setBounds(670, 190, 270, 60);

        jLabel30.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel30.setText("Number of Main Cooks: ");
        getContentPane().add(jLabel30);
        jLabel30.setBounds(80, 340, 190, 30);

        jLabel29.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel29.setText("COOKS");
        getContentPane().add(jLabel29);
        jLabel29.setBounds(200, 190, 270, 60);

        jLabel33.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel33.setText("Number of Available Appetizers:");
        getContentPane().add(jLabel33);
        jLabel33.setBounds(80, 270, 340, 30);

        numberADishes.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        numberADishes.setForeground(new java.awt.Color(255, 0, 51));
        numberADishes.setText("20");
        getContentPane().add(numberADishes);
        numberADishes.setBounds(340, 270, 19, 30);

        numberMDishes.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        numberMDishes.setForeground(new java.awt.Color(255, 0, 51));
        numberMDishes.setText("30");
        getContentPane().add(numberMDishes);
        numberMDishes.setBounds(350, 370, 40, 30);

        jLabel40.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel40.setText("Number of Main Available Dishes:");
        getContentPane().add(jLabel40);
        jLabel40.setBounds(80, 370, 340, 30);

        numberDDishes.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        numberDDishes.setForeground(new java.awt.Color(255, 0, 51));
        numberDDishes.setText("10");
        getContentPane().add(numberDDishes);
        numberDDishes.setBounds(320, 470, 40, 30);

        numberOrders.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        numberOrders.setForeground(new java.awt.Color(255, 0, 51));
        numberOrders.setText("99999999");
        getContentPane().add(numberOrders);
        numberOrders.setBounds(790, 270, 80, 30);

        dayHours.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        dayHours.setForeground(new java.awt.Color(255, 255, 255));
        dayHours.setText("Time");
        getContentPane().add(dayHours);
        dayHours.setBounds(100, 90, 110, 30);

        hourScale.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        hourScale.setForeground(new java.awt.Color(255, 255, 255));
        hourScale.setText("Hour scale");
        getContentPane().add(hourScale);
        hourScale.setBounds(40, 130, 210, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RedWineBackground.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(-90, -100, 690, 300);

        chiefStatus.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        chiefStatus.setText("Status");
        getContentPane().add(chiefStatus);
        chiefStatus.setBounds(830, 440, 170, 30);

        managerStatus.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        managerStatus.setText("Status");
        getContentPane().add(managerStatus);
        managerStatus.setBounds(570, 440, 170, 30);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/WhiteBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(-120, 190, 1120, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AppetFire1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppetFire1ActionPerformed
        
        this.res.fireACook(1);
        
    }//GEN-LAST:event_AppetFire1ActionPerformed

    private void AppetHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AppetHireActionPerformed
        this.res.hireACook(1);
    }//GEN-LAST:event_AppetHireActionPerformed

    private void MainHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainHireActionPerformed
        this.res.hireMCook(1);
    }//GEN-LAST:event_MainHireActionPerformed

    private void MainFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainFireActionPerformed
        this.res.fireMCook(1);
    }//GEN-LAST:event_MainFireActionPerformed

    private void DessertHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DessertHireActionPerformed
        this.res.hireDCook(1);
   
    }//GEN-LAST:event_DessertHireActionPerformed

    private void DessertFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DessertFireActionPerformed
        this.res.fireDCook(1);
    }//GEN-LAST:event_DessertFireActionPerformed

    private void WaiterHireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaiterHireActionPerformed
        this.res.hireWaiter(1);
    }//GEN-LAST:event_WaiterHireActionPerformed

    private void WaiterFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaiterFireActionPerformed
        this.res.fireWaiter(1);
    }//GEN-LAST:event_WaiterFireActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
         int n=0;
        System.exit(n);

    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(InitialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitialView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InitialView v= new InitialView();
                        v.setVisible(true);
                
                
            }
        });
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ACooks;
    private javax.swing.JButton AppetFire1;
    private javax.swing.JButton AppetHire;
    private javax.swing.JButton Close;
    private javax.swing.JButton DessertFire;
    private javax.swing.JButton DessertHire;
    private javax.swing.JButton MainFire;
    private javax.swing.JButton MainHire;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JButton WaiterFire;
    private javax.swing.JButton WaiterHire;
    private javax.swing.JLabel chiefStatus;
    private javax.swing.JLabel dayHours;
    private javax.swing.JLabel hourScale;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel managerStatus;
    private javax.swing.JLabel numberACooks;
    private javax.swing.JLabel numberADishes;
    private javax.swing.JLabel numberDCooks;
    private javax.swing.JLabel numberDDishes;
    private javax.swing.JLabel numberMCooks;
    private javax.swing.JLabel numberMDishes;
    private javax.swing.JLabel numberOrders;
    private javax.swing.JLabel numberWaiters;
    // End of variables declaration//GEN-END:variables

    public JLabel getNumberACooks() {
        return numberACooks;
    }
    
    public void setNumberACooks(JLabel numberACooks) {
        this.numberACooks = numberACooks;
    }

    public JLabel getNumberDCooks() {
        return numberDCooks;
    }

    public void setNumberDCooks(JLabel numberDCooks) {
        this.numberDCooks = numberDCooks;
    }

    public JLabel getNumberMCooks() {
        return numberMCooks;
    }

    public void setNumberMCooks(JLabel numberMCooks) {
        this.numberMCooks = numberMCooks;
    }

    public JLabel getNumberWaiters() {
        return numberWaiters;
    }

    public void setNumberWaiters(JLabel numberWaiters) {
        this.numberWaiters = numberWaiters;
    }

    public JLabel getNumberADishes() {
        return numberADishes;
    }

    public JLabel getNumberDDishes() {
        return numberDDishes;
    }

    public JLabel getNumberMDishes() {
        return numberMDishes;
    }

    public JLabel getNumberOrders() {
        return numberOrders;
    }

    public JLabel getHourScale() {
        return hourScale;
    }

    public JLabel getDayHours() {
        return dayHours;
    }

    public JLabel getChiefStatus() {
        return chiefStatus;
    }

    public JLabel getManagerStatus() {
        return managerStatus;
    }
}
