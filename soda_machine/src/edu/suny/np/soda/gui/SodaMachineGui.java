package edu.suny.np.soda.gui;
import java.awt.Component;

import edu.suny.np.oop.soda.*;

import javax.swing.Box;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 
/**
 *
 * @author Frederico Castro
 */
public class SodaMachineGui extends javax.swing.JFrame {
	
	protected static SodaMachine mSodaMachine;
	
    /**
     * Creates new form SodaMachineGui
     */
    public SodaMachineGui() {
        initComponents();
        mSodaMachine = new SodaMachine();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        title = new javax.swing.JLabel();
        coinReturn = new javax.swing.JPanel();
        nickleButton = new javax.swing.JButton();
        dimeButton = new javax.swing.JButton();
        quarterButton = new javax.swing.JButton();
        total = new javax.swing.JLabel();
        totalOutput = new javax.swing.JTextField();
        totalOutput.setEditable(false);
        coinReturnButton = new javax.swing.JButton();
        sodaSelection = new javax.swing.JPanel();
        s0 = new javax.swing.JButton();
        s2 = new javax.swing.JButton();
        s3 = new javax.swing.JButton();
        sodaSelectionOutput = new javax.swing.JTextField();
        sodaSelectionOutput.setEditable(false);
        s1 = new javax.swing.JButton();
        s4 = new javax.swing.JButton();
        sodaDelivery = new javax.swing.JPanel();
        selectionOutput = new javax.swing.JTextField();
        selectionOutput.setEditable(false);
        selection = new javax.swing.JLabel();
        change = new javax.swing.JLabel();
        changeOutput = new javax.swing.JTextField();
        changeOutput.setEditable(false);
        adminModeSelection = new javax.swing.JPanel();
        enterAdminModeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        title.setText("Soda Machine");

        coinReturn.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coin Return", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        nickleButton.setText("5");
        nickleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nickleButtonActionPerformed(evt);
            }
        });

        dimeButton.setText("10");
        dimeButton.addActionListener(new java.awt.event.ActionListener() {
        	
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dimeButtonActionPerformed(evt);
            }
        });
        quarterButton.setText("25");
        quarterButton.addActionListener(new java.awt.event.ActionListener() {
        	
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quarterButtonActionPerformed(evt);
            }
        });

        total.setText("Total");

        coinReturnButton.setText("Coin Return");
        coinReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coinReturnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coinReturnLayout = new javax.swing.GroupLayout(coinReturn);
        coinReturn.setLayout(coinReturnLayout);
        coinReturnLayout.setHorizontalGroup(
            coinReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coinReturnLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nickleButton)
                .addGap(8, 8, 8)
                .addComponent(dimeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quarterButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(coinReturnLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(total)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coinReturnButton))
        );
        coinReturnLayout.setVerticalGroup(
            coinReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coinReturnLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(coinReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nickleButton)
                    .addComponent(dimeButton)
                    .addComponent(quarterButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(coinReturnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(total)
                    .addComponent(totalOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coinReturnButton))
                .addGap(12, 12, 12))
        );

        sodaSelection.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soda Selection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        s0.setText("Cola");
        s0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s0ActionPerformed(evt);
            }
        });

        s2.setText("Sprite");

        s3.setText("Ginger Ale");

        sodaSelectionOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sodaSelectionOutputActionPerformed(evt);
            }
        });

        s1.setText("Orange");
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });

        s4.setText("Diet Cola");

        javax.swing.GroupLayout sodaSelectionLayout = new javax.swing.GroupLayout(sodaSelection);
        sodaSelection.setLayout(sodaSelectionLayout);
        sodaSelectionLayout.setHorizontalGroup(
            sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sodaSelectionLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(s0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sodaSelectionOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        sodaSelectionLayout.setVerticalGroup(
            sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sodaSelectionLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(s0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(s3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s4)
                    .addComponent(sodaSelectionOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        sodaDelivery.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soda Delivery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        selectionOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionOutputActionPerformed(evt);
            }
        });

        selection.setText("Selection");

        change.setText("Change");
        changeOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sodaDeliveryLayout = new javax.swing.GroupLayout(sodaDelivery);
        sodaDelivery.setLayout(sodaDeliveryLayout);
        sodaDeliveryLayout.setHorizontalGroup(
            sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sodaDeliveryLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(selection)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(selectionOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(change)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        sodaDeliveryLayout.setVerticalGroup(
            sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sodaDeliveryLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(changeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(change))
                    .addGroup(sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectionOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selection)))
                .addGap(12, 12, 12))
        );

        adminModeSelection.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Mode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        enterAdminModeButton.setText("Enter");
        enterAdminModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterAdminModeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminModeSelectionLayout = new javax.swing.GroupLayout(adminModeSelection);
        adminModeSelectionLayout.setHorizontalGroup(
        	adminModeSelectionLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(adminModeSelectionLayout.createSequentialGroup()
        			.addGap(139)
        			.addComponent(enterAdminModeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(159))
        );
        adminModeSelectionLayout.setVerticalGroup(
        	adminModeSelectionLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(Alignment.LEADING, adminModeSelectionLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(enterAdminModeButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGap(22))
        );
        adminModeSelection.setLayout(adminModeSelectionLayout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(adminModeSelection, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap())
        				.addGroup(layout.createParallelGroup(Alignment.LEADING)
        					.addGroup(layout.createSequentialGroup()
        						.addGroup(layout.createParallelGroup(Alignment.LEADING)
        							.addComponent(coinReturn, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        							.addComponent(sodaSelection, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        							.addComponent(sodaDelivery, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        						.addContainerGap())
        					.addGroup(layout.createSequentialGroup()
        						.addComponent(title)
        						.addGap(152)))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(title)
        			.addGap(18, 18, Short.MAX_VALUE)
        			.addComponent(coinReturn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(23)
        			.addComponent(sodaSelection, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(23)
        			.addComponent(sodaDelivery, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(23)
        			.addComponent(adminModeSelection, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)
        			.addGap(11))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void nickleButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	mSodaMachine.accumulateChange("5");
    }                                            

    private void dimeButtonActionPerformed(java.awt.event.ActionEvent evt) { 
    	mSodaMachine.accumulateChange("10");
    } 
    
    private void quarterButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	mSodaMachine.accumulateChange("25");
    }                                         

    private void coinReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        int amountEntered = mSodaMachine.cancelPurchase();
        resetTotalDisplay();
        selectionOutput.setText("Purchase cancelled");
        changeOutput.setText(Integer.toString(amountEntered));
    }                                                

    private void s0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        processSelection();
    }                                  

    private void sodaSelectionOutputActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void selectionOutputActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void changeOutputActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void enterAdminModeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    	Admin dialog = new Admin(new javax.swing.JFrame(), true, mSodaMachine);
        dialog.setVisible(true);
    }  
    
    
    private void resetTotalDisplay(){
    	totalOutput.setText("");
    }
    
    private void resetSodaDeliveryDisplay(){
    	selectionOutput.setText("");
    	changeOutput.setText("");
    }
    
    private void processSelection(){
    	
    }
    


           
                                

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
            java.util.logging.Logger.getLogger(SodaMachineGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SodaMachineGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SodaMachineGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SodaMachineGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SodaMachineGui().setVisible(true);
                
                // When the coins are inserted, update the text area totalOutput
                ChangeListener listener = new
                   ChangeListener()
                   {
                      public void stateChanged(ChangeEvent event)
                      {
                     	totalOutput.setText(mSodaMachine.getAmountEntered());
                      }
                   };
                   mSodaMachine.addChangeListener(listener);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel adminModeSelection;
    private javax.swing.JLabel change;
    private javax.swing.JTextField changeOutput;
    private javax.swing.JPanel coinReturn;
    private javax.swing.JButton coinReturnButton;
    private javax.swing.JButton dimeButton;
    private javax.swing.JButton enterAdminModeButton;
    private javax.swing.JButton nickleButton;
    private javax.swing.JButton quarterButton;
    private javax.swing.JButton s0;
    private javax.swing.JButton s1;
    private javax.swing.JButton s2;
    private javax.swing.JButton s3;
    private javax.swing.JButton s4;
    private javax.swing.JLabel selection;
    private javax.swing.JTextField selectionOutput;
    private javax.swing.JPanel sodaDelivery;
    private javax.swing.JPanel sodaSelection;
    private javax.swing.JTextField sodaSelectionOutput;
    private javax.swing.JLabel title;
    private javax.swing.JLabel total;
    private static javax.swing.JTextField totalOutput;
    // End of variables declaration                   
}
