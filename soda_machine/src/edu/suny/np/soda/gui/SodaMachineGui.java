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
	 * Creates new SodaMachineGui
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
		s1 = new javax.swing.JButton();
		s2 = new javax.swing.JButton();
		s3 = new javax.swing.JButton();
		s4 = new javax.swing.JButton();
		sodaSelectionOutput0 = new javax.swing.JTextField();
        sodaSelectionOutput1 = new javax.swing.JTextField();
        sodaSelectionOutput2 = new javax.swing.JTextField();
        sodaSelectionOutput3 = new javax.swing.JTextField();
        sodaSelectionOutput4 = new javax.swing.JTextField();
        sodaSelectionOutput0.setEditable(false);
        sodaSelectionOutput1.setEditable(false);
        sodaSelectionOutput2.setEditable(false);
        sodaSelectionOutput3.setEditable(false);
        sodaSelectionOutput4.setEditable(false);
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

		coinReturn.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
			"Coin Return",
			javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
			javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

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
		


		javax.swing.GroupLayout coinReturnLayout = new javax.swing.GroupLayout(
			coinReturn);
		coinReturn.setLayout(coinReturnLayout);
		coinReturnLayout
		.setHorizontalGroup(coinReturnLayout
			.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(
				coinReturnLayout
				.createSequentialGroup()
				.addGap(12, 12, 12)
				.addComponent(nickleButton)
				.addGap(8, 8, 8)
				.addComponent(dimeButton)
				.addPreferredGap(
					javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(quarterButton)
				.addGap(0, 0, Short.MAX_VALUE))
			.addGroup(
				coinReturnLayout
				.createSequentialGroup()
				.addGap(18, 18, 18)
				.addComponent(total)
				.addPreferredGap(
					javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(
					totalOutput,
					javax.swing.GroupLayout.PREFERRED_SIZE,
					83,
					javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(
					javax.swing.LayoutStyle.ComponentPlacement.RELATED,
					javax.swing.GroupLayout.DEFAULT_SIZE,
					Short.MAX_VALUE)
				.addComponent(coinReturnButton)));
		coinReturnLayout
		.setVerticalGroup(coinReturnLayout
			.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(
				coinReturnLayout
				.createSequentialGroup()
				.addContainerGap(12, Short.MAX_VALUE)
				.addGroup(
					coinReturnLayout
					.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING)
					.addComponent(
						nickleButton)
					.addComponent(
						dimeButton)
					.addComponent(
						quarterButton))
				.addPreferredGap(
					javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(
					coinReturnLayout
					.createParallelGroup(
						javax.swing.GroupLayout.Alignment.CENTER)
					.addComponent(total)
					.addComponent(
						totalOutput,
						javax.swing.GroupLayout.PREFERRED_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.PREFERRED_SIZE)
					.addComponent(
						coinReturnButton))
				.addGap(12, 12, 12)));

		sodaSelection.setBorder(javax.swing.BorderFactory.createTitledBorder(
			null, "Soda Selection",
			javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
			javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

		s0.setText("Cola");
		s0.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s0ActionPerformed(evt);
			}
		});
		
		s1.setText("Orange");
		s1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s1ActionPerformed(evt);
			}
		});

		s2.setText("Sprite");
		s2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s2ActionPerformed(evt);
			}
		});

		s3.setText("Ginger Ale");
		s3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s3ActionPerformed(evt);
			}
		});
		
		s4.setText("Diet Cola");
		s4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				s4ActionPerformed(evt);
			}
		});
		
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
	                .addGroup(sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(sodaSelectionOutput4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(sodaSelectionOutput3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(sodaSelectionOutput2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(sodaSelectionOutput1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(sodaSelectionOutput0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap())
	        );
		sodaSelectionLayout.setVerticalGroup(
	            sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sodaSelectionLayout.createSequentialGroup()
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(s0)
	                    .addComponent(sodaSelectionOutput0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(s1)
	                    .addComponent(sodaSelectionOutput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(s2)
	                    .addComponent(sodaSelectionOutput2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(s3)
	                    .addComponent(sodaSelectionOutput3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(sodaSelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(s4)
	                    .addComponent(sodaSelectionOutput4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(12,12,12))
	        );

sodaDelivery.setBorder(javax.swing.BorderFactory.createTitledBorder(
	null, "Soda Delivery",
	javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
	javax.swing.border.TitledBorder.DEFAULT_POSITION,
				new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

selection.setText("Selection");

change.setText("Change");

javax.swing.GroupLayout sodaDeliveryLayout = new javax.swing.GroupLayout(sodaDelivery);
sodaDelivery.setLayout(sodaDeliveryLayout);
sodaDeliveryLayout.setHorizontalGroup(
    sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(sodaDeliveryLayout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addGroup(sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(selection, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(change, javax.swing.GroupLayout.Alignment.TRAILING))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(changeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(selectionOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);
sodaDeliveryLayout.setVerticalGroup(
    sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(sodaDeliveryLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(selectionOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(selection))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(sodaDeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(changeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(change))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
);

adminModeSelection.setBorder(javax.swing.BorderFactory
	.createTitledBorder(null, "Admin Mode",
		javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
		javax.swing.border.TitledBorder.DEFAULT_POSITION,
						new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N

enterAdminModeButton.setText("Enter");
enterAdminModeButton
.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent evt) {
		enterAdminModeButtonActionPerformed(evt);
	}
});

javax.swing.GroupLayout adminModeSelectionLayout = new javax.swing.GroupLayout(
	adminModeSelection);
adminModeSelectionLayout.setHorizontalGroup(adminModeSelectionLayout
	.createParallelGroup(Alignment.LEADING).addGroup(
		adminModeSelectionLayout
		.createSequentialGroup()
		.addGap(139)
		.addComponent(enterAdminModeButton,
			GroupLayout.DEFAULT_SIZE,
			GroupLayout.DEFAULT_SIZE,
			Short.MAX_VALUE).addGap(159)));
adminModeSelectionLayout.setVerticalGroup(adminModeSelectionLayout
	.createParallelGroup(Alignment.TRAILING).addGroup(
		Alignment.LEADING,
		adminModeSelectionLayout
		.createSequentialGroup()
		.addContainerGap()
		.addComponent(enterAdminModeButton,
			GroupLayout.DEFAULT_SIZE,
			GroupLayout.DEFAULT_SIZE,
			Short.MAX_VALUE).addGap(22)));
adminModeSelection.setLayout(adminModeSelectionLayout);

javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
	getContentPane());
layout.setHorizontalGroup(layout
	.createParallelGroup(Alignment.LEADING)
	.addGroup(
		layout.createSequentialGroup()
		.addContainerGap()
		.addGroup(
			layout.createParallelGroup(
				Alignment.LEADING)
			.addGroup(
				layout.createSequentialGroup()
				.addComponent(
					adminModeSelection,
					GroupLayout.PREFERRED_SIZE,
					386,
					GroupLayout.PREFERRED_SIZE)
				.addContainerGap())
			.addGroup(
				layout.createParallelGroup(
					Alignment.LEADING)
				.addGroup(
					layout.createSequentialGroup()
					.addGroup(
						layout.createParallelGroup(
							Alignment.LEADING)
						.addComponent(
							coinReturn,
							GroupLayout.DEFAULT_SIZE,
							389,
							Short.MAX_VALUE)
						.addComponent(
							sodaSelection,
							GroupLayout.DEFAULT_SIZE,
							389,
							Short.MAX_VALUE)
						.addComponent(
							sodaDelivery,
							GroupLayout.DEFAULT_SIZE,
							GroupLayout.DEFAULT_SIZE,
							Short.MAX_VALUE))
					.addContainerGap())
				.addGroup(
					layout.createSequentialGroup()
					.addComponent(
						title)
					.addGap(152))))));
layout.setVerticalGroup(layout.createParallelGroup(Alignment.TRAILING)
	.addGroup(
		layout.createSequentialGroup()
		.addContainerGap()
		.addComponent(title)
		.addGap(18, 18, Short.MAX_VALUE)
		.addComponent(coinReturn,
			GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE,
			GroupLayout.PREFERRED_SIZE)
		.addGap(23)
		.addComponent(sodaSelection,
			GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE,
			GroupLayout.PREFERRED_SIZE)
		.addGap(23)
		.addComponent(sodaDelivery,
			GroupLayout.PREFERRED_SIZE,
			GroupLayout.DEFAULT_SIZE,
			GroupLayout.PREFERRED_SIZE)
		.addGap(23)
		.addComponent(adminModeSelection,
			GroupLayout.PREFERRED_SIZE, 83,
			GroupLayout.PREFERRED_SIZE).addGap(11)));
getContentPane().setLayout(layout);

pack();
	}// </editor-fold>

	private void nickleButtonActionPerformed(java.awt.event.ActionEvent evt) {
		insertCoin("nickel");
	}

	private void dimeButtonActionPerformed(java.awt.event.ActionEvent evt) {
		insertCoin("dime");
	}

	private void quarterButtonActionPerformed(java.awt.event.ActionEvent evt) {
		insertCoin("quarter");
	}
	
	private void insertCoin(String coin){
		if (!mSodaMachine.hasPurchaseStarted()) {
			selectionOutput.setText("");
			changeOutput.setText("");
		}
		mSodaMachine.accumulateChange(coin);
	}

	private void coinReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {
		mSodaMachine.cancelPurchase();
		totalOutput.setText("");
	}

	private void s0ActionPerformed(java.awt.event.ActionEvent evt) {
		processSelection("s0");
	}
	
	private void s1ActionPerformed(java.awt.event.ActionEvent evt) {
		processSelection("s1");
	}
	
	private void s2ActionPerformed(java.awt.event.ActionEvent evt) {
		processSelection("s2");
	}
	
	private void s3ActionPerformed(java.awt.event.ActionEvent evt) {
		processSelection("s3");
	}
	
	private void s4ActionPerformed(java.awt.event.ActionEvent evt) {
		processSelection("s4");
	}

	private void enterAdminModeButtonActionPerformed(
		java.awt.event.ActionEvent evt) {
		Admin dialog = new Admin(new javax.swing.JFrame(), true, mSodaMachine);
		dialog.setVisible(true);
	}
	
	private static void processSelection(String soda){
		mSodaMachine.saveSelection(soda);
		String output = mSodaMachine.processSelection();
		selectionOutput.setText(output);
	}
	
	private static void fillSodaSelectionOutputs(){
		int[] inventoryQIS = new int[5];
		int[] inventoryPrices = new int[5];
		inventoryQIS=mSodaMachine.getInventoryQIS();
		inventoryPrices=mSodaMachine.getInventoryPrices();
		
		if(inventoryQIS[0] == 0){
			sodaSelectionOutput0.setText("Out of Stock");
		}else{
			sodaSelectionOutput0.setText("U$ 0." + Integer.toString(inventoryPrices[0]) + " / " + Integer.toString(inventoryQIS[0]) + " item(s) available");
		}
		if(inventoryQIS[1] == 0){
			sodaSelectionOutput1.setText("Out of Stock");
		}else{
			sodaSelectionOutput1.setText("U$ 0." + Integer.toString(inventoryPrices[1]) + " / " + Integer.toString(inventoryQIS[1]) + " item(s) available");
		}
		if(inventoryQIS[2] == 0){
			sodaSelectionOutput2.setText("Out of Stock");
		}else{
			sodaSelectionOutput2.setText("U$ 0." + Integer.toString(inventoryPrices[2]) + " / " + Integer.toString(inventoryQIS[2]) + " item(s) available");
		}
		if(inventoryQIS[3] == 0){
			sodaSelectionOutput3.setText("Out of Stock");
		}else{
			sodaSelectionOutput3.setText("U$ 0." + Integer.toString(inventoryPrices[3]) + " / " + Integer.toString(inventoryQIS[3]) + " item(s) available");
		}
		if(inventoryQIS[4] == 0){
			sodaSelectionOutput4.setText("Out of Stock");
		}else{
			sodaSelectionOutput4.setText("U$ 0." + Integer.toString(inventoryPrices[4]) + " / " + Integer.toString(inventoryQIS[4]) + " item(s) available");
		}
		
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
				.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(SodaMachineGui.class.getName())
			.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(SodaMachineGui.class.getName())
			.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(SodaMachineGui.class.getName())
			.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(SodaMachineGui.class.getName())
			.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SodaMachineGui().setVisible(true);
				fillSodaSelectionOutputs();
				// When the mechanism changes, update the display
				ChangeListener listener = new ChangeListener() {
					public void stateChanged(ChangeEvent event) {
						totalOutput.setText(mSodaMachine.getAmountEntered());
						fillSodaSelectionOutputs();
						changeOutput.setText(mSodaMachine.getChange());
						
						
					}
				};
				mSodaMachine.addChangeListenerChangeMechanism(listener);
				mSodaMachine.addChangeListenerInventory(listener);
				
				
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JPanel adminModeSelection;
	private static javax.swing.JLabel change;
	private static javax.swing.JTextField changeOutput;
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
	private static javax.swing.JTextField selectionOutput;
	private javax.swing.JPanel sodaDelivery;
	private javax.swing.JPanel sodaSelection;
	private static javax.swing.JTextField sodaSelectionOutput0;
	private static javax.swing.JTextField sodaSelectionOutput1;
	private static javax.swing.JTextField sodaSelectionOutput2;
	private static javax.swing.JTextField sodaSelectionOutput3;
	private static javax.swing.JTextField sodaSelectionOutput4;

	private javax.swing.JLabel title;
	private javax.swing.JLabel total;
	private static javax.swing.JTextField totalOutput;
	// End of variables declaration
}
