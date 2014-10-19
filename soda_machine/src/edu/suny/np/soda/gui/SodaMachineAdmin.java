package edu.suny.np.soda.gui;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.GridBagLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
 
/**
 *
 * @author Frederico Castro
 */
public class SodaMachineAdmin extends javax.swing.JFrame {

    /**
     * Creates new form SodaMachineGui
     */
    public SodaMachineAdmin() {
        initComponents();
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
        coinEntry = new javax.swing.JPanel();
        sodaSelection = new javax.swing.JPanel();
        sodaDelivery = new javax.swing.JPanel();
        adminModeSelection = new javax.swing.JPanel();
        quitAdminModeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        title.setText("Admin Mode");

        coinEntry.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Coin Entry", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14)));

        sodaSelection.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soda Selection", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14)));

        javax.swing.GroupLayout sodaSelectionLayout = new javax.swing.GroupLayout(sodaSelection);
        sodaSelectionLayout.setHorizontalGroup(
        	sodaSelectionLayout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 377, Short.MAX_VALUE)
        );
        sodaSelectionLayout.setVerticalGroup(
        	sodaSelectionLayout.createParallelGroup(Alignment.TRAILING)
        		.addGap(0, 194, Short.MAX_VALUE)
        );
        sodaSelection.setLayout(sodaSelectionLayout);

        sodaDelivery.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Soda Delivery", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14)));

        javax.swing.GroupLayout sodaDeliveryLayout = new javax.swing.GroupLayout(sodaDelivery);
        sodaDeliveryLayout.setHorizontalGroup(
        	sodaDeliveryLayout.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 377, Short.MAX_VALUE)
        );
        sodaDeliveryLayout.setVerticalGroup(
        	sodaDeliveryLayout.createParallelGroup(Alignment.TRAILING)
        		.addGap(0, 52, Short.MAX_VALUE)
        );
        sodaDelivery.setLayout(sodaDeliveryLayout);

        adminModeSelection.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin Mode", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

        quitAdminModeButton.setText("Quit");
        quitAdminModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitAdminModeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminModeSelectionLayout = new javax.swing.GroupLayout(adminModeSelection);
        adminModeSelection.setLayout(adminModeSelectionLayout);
        adminModeSelectionLayout.setHorizontalGroup(
            adminModeSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminModeSelectionLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(quitAdminModeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        adminModeSelectionLayout.setVerticalGroup(
            adminModeSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminModeSelectionLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(quitAdminModeButton)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(title)
        					.addGap(152))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(coinEntry, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        						.addComponent(sodaSelection, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(sodaDelivery, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(adminModeSelection, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
        					.addContainerGap())))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(title)
        			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        			.addComponent(coinEntry, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(sodaSelection, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(23)
        			.addComponent(sodaDelivery, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(23)
        			.addComponent(adminModeSelection, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        coinEntry.setLayout(null);
        
        lblNickel = new JLabel("Nickel");
        lblNickel.setBounds(23, 48, 40, 16);
        coinEntry.add(lblNickel);
        
        textField = new JTextField();
        textField.setBounds(66, 42, 45, 28);
        coinEntry.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(189, 42, 45, 28);
        coinEntry.add(textField_1);
        
        lblDime = new JLabel("Dime");
        lblDime.setBounds(146, 48, 40, 16);
        coinEntry.add(lblDime);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(319, 42, 45, 28);
        coinEntry.add(textField_2);
        
        lblQuarter = new JLabel("Quarter");
        lblQuarter.setBounds(269, 48, 47, 16);
        coinEntry.add(lblQuarter);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void quitAdminModeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(SodaMachineAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SodaMachineAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SodaMachineAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SodaMachineAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SodaMachineAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel adminModeSelection;
    private javax.swing.JPanel coinEntry;
    private javax.swing.JButton quitAdminModeButton;
    private javax.swing.JPanel sodaDelivery;
    private javax.swing.JPanel sodaSelection;
    private javax.swing.JLabel title;
    private JLabel lblNickel;
    private JTextField textField;
    private JTextField textField_1;
    private JLabel lblDime;
    private JTextField textField_2;
    private JLabel lblQuarter;
}
