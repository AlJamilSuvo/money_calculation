package al.jamil.suvo.insouciant.money;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suvo
 */
public class QuickInfo extends javax.swing.JFrame {

    /**
     * Creates new form Quick
     */
    public QuickInfo() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
                          
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        partial = new javax.swing.JRadioButton();
        full = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        item = new javax.swing.JComboBox();
        type = new javax.swing.JComboBox();
        amount = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        done = new javax.swing.JRadioButton();
        eventCancel = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Quick Add Info");

        jLabel4.setText("Amount");

        partial.setText("Partial");
        partial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partialActionPerformed(evt);
            }
        });

        full.setText("Full");
        full.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullActionPerformed(evt);
            }
        });

        jLabel2.setText("Type");

        jLabel3.setText("Item");

        item.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemActionPerformed(evt);
            }
        });

        type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Returened Borrowed Money", "Getting Back Loan", "Future Money Source", "Future consume Source" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });

        amount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        done.setText("Done");
        done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneActionPerformed(evt);
            }
        });

        eventCancel.setText("Cancelled");
        eventCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventCancelActionPerformed(evt);
            }
        });

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save)
                        .addGap(73, 73, 73)
                        .addComponent(cancel))
                    .addComponent(jLabel1)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(full)
                        .addGap(18, 18, 18)
                        .addComponent(partial))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(done)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eventCancel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eventCancel)
                    .addComponent(done))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(full)
                    .addComponent(partial)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save)
                    .addComponent(cancel))
                .addContainerGap())
        );

        jLabel5.setText("insouciant");
        this.setTitle("Quick Information Addition");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 362, Short.MAX_VALUE)
                        .addComponent(jLabel5))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {
    	double fu=0,cl=0;
    	int a=type.getSelectedIndex();
    	if (a==0){
    		String []str=new String[1000];
	       	 int k=0;
	       	 for (int i=0;i<MainClass.takenLoanData.size();i++){
	       		 if(MainClass.takenLoanData.get(i).status.equals("pending")){
	       			str[k]=String.valueOf(MainClass.takenLoanData.get(i).amount)+" from "+MainClass.takenLoanData.get(i).person+" on "+MainClass.takenLoanData.get(i).date;
	       			if (MainClass.takenLoanData.get(i).cleared>0) str[k]+=" cleared "+String.valueOf(MainClass.takenLoanData.get(i).cleared);
	       			indexNo[k++]=i;
	       		 }
	       	 }
	       	 Object []obj=new Object[k];
	       	 for (int i=0;i<k;i++){
	       		 obj[i]=str[i];
	       	 }
	       	 item.setModel(new javax.swing.DefaultComboBoxModel(obj));
	       	 if (k>=1){
	       		 full.setSelected(true);
	           	 partial.setSelected(false);
	           	 full.setEnabled(true);
	           	 partial.setEnabled(true);
	           	 fu=MainClass.takenLoanData.get(indexNo[0]).amount;
	           	 cl=MainClass.takenLoanData.get(indexNo[0]).cleared;
	           	 amount.setText(String.valueOf(fu-cl));
	           	 amount.setEditable(false);
	           	save.setEnabled(true);
	       	 }
	       	 else{
	       		 full.setSelected(false);
	           	 partial.setSelected(false);
	           	 full.setEnabled(false);
	           	 partial.setEnabled(false);
	           	 amount.setText("");
	           	 amount.setEditable(false);
	           	save.setEnabled(false);
	       	 }
    	}
    	else{
    		String []str=new String[1000];
	       	 int k=0;
	       	 for (int i=0;i<MainClass.givenLoanData.size();i++){
	       		 if(MainClass.givenLoanData.get(i).status.equals("pending")){
	       			str[k]=String.valueOf(MainClass.givenLoanData.get(i).amount)+" to "+MainClass.givenLoanData.get(i).person+" on "+MainClass.givenLoanData.get(i).date;
	       			if (MainClass.givenLoanData.get(i).cleared>0) str[k]+=" cleared "+String.valueOf(MainClass.givenLoanData.get(i).cleared);
	       			indexNo[k++]=i;
	       		 }
	       	 }
	       	 Object []obj=new Object[k];
	       	 for (int i=0;i<k;i++){
	       		 obj[i]=str[i];
	       	 }
	       	 item.setModel(new javax.swing.DefaultComboBoxModel(obj));
	       	 if (k>=1){
	       		 full.setSelected(true);
	           	 partial.setSelected(false);
	           	 full.setEnabled(true);
	           	 partial.setEnabled(true);
	           	 fu=MainClass.givenLoanData.get(indexNo[0]).amount;
	           	 cl=MainClass.givenLoanData.get(indexNo[0]).cleared;
	           	 amount.setText(String.valueOf(fu-cl));
	           	 amount.setEditable(false);
	           	 save.setEnabled(true);
	       	 }
	       	 else{
	       		 full.setSelected(false);
	           	 partial.setSelected(false);
	           	 full.setEnabled(false);
	           	 partial.setEnabled(false);
	           	 amount.setText("");
	           	 amount.setEditable(false);
	           	 save.setEnabled(false);
	       	 }
    	}
    	jLabel6.setText("Full Loan "+String.valueOf(fu));
    	if (cl>0) jLabel6.setText("Full Loan "+String.valueOf(fu)+" cleared "+String.valueOf(cl));
    }                                          

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void itemActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	int a=type.getSelectedIndex();
    	double fu=0,cl=0;
    	int b=item.getSelectedIndex();
    	if (a==0){
    	  	 fu=MainClass.takenLoanData.get(indexNo[b]).amount;
           	 cl=MainClass.takenLoanData.get(indexNo[b]).cleared;
    		amount.setText(String.valueOf(fu-cl));
    		
    	}else{
    		fu=MainClass.givenLoanData.get(indexNo[b]).amount;
          	 cl=MainClass.givenLoanData.get(indexNo[b]).cleared;
    		amount.setText(String.valueOf(fu-cl));
    	}
    	jLabel6.setText("Full Loan "+String.valueOf(fu));
    	if (cl>0) jLabel6.setText("Full Loan "+String.valueOf(fu)+" cleared "+String.valueOf(cl));
    	full.setSelected(true);
    	partial.setSelected(false);
    	amount.setEditable(false);
    	
    }                                          

    private void fullActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	int a=type.getSelectedIndex();
    	double fu=0,cl=0;
    	int b=item.getSelectedIndex();
    	if (a==0){
    		fu=MainClass.takenLoanData.get(indexNo[b]).amount;
          	 cl=MainClass.takenLoanData.get(indexNo[b]).cleared;
    		amount.setText(String.valueOf(fu-cl));
    	}else{
    		fu=MainClass.givenLoanData.get(indexNo[b]).amount;
         	 cl=MainClass.givenLoanData.get(indexNo[b]).cleared;
    		amount.setText(String.valueOf(fu-cl));
    	}
    	jLabel6.setText("Full Loan "+String.valueOf(fu));
    	if (cl>0) jLabel6.setText("Full Loan "+String.valueOf(fu)+" cleared "+String.valueOf(cl));
    	full.setSelected(true);
    	partial.setSelected(false);
    	amount.setEditable(false);
    	
        
    }                                             

    private void partialActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	full.setSelected(false);
    	amount.setEditable(true);
    }                                             

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	int a=type.getSelectedIndex();
    	double fu,cl;
    	double am;
    	int b=item.getSelectedIndex();
    	if (a==0){
    		if(full.isSelected()){
    			am=MainClass.takenLoanData.get(indexNo[b]).amount-MainClass.takenLoanData.get(indexNo[b]).cleared;
    			MainClass.takenLoanData.get(indexNo[b]).cleared=MainClass.takenLoanData.get(indexNo[b]).amount;
    			MainClass.takenLoanData.get(indexNo[b]).status="cleared";
    			
    		}
    		else{
    			
    			try{
    				am=Double.parseDouble(amount.getText());
    			}catch (Exception e){
    				JOptionPane.showMessageDialog(this, "Error Value of amount and Failed to perse", "Error",JOptionPane.ERROR_MESSAGE);
    				return;
    			}
    			if (am>MainClass.takenLoanData.get(indexNo[b]).amount-MainClass.takenLoanData.get(indexNo[b]).cleared){
    				JOptionPane.showMessageDialog(this, "Your Given Amount is larger than hightest value "+String.valueOf(MainClass.takenLoanData.get(indexNo[b]).amount-MainClass.takenLoanData.get(indexNo[b]).cleared), "Error",JOptionPane.ERROR_MESSAGE);
    				return;
    			}
    			MainClass.takenLoanData.get(indexNo[b]).cleared+=am;
    		}
    		MainClass.amount-=am;
			MainClass.loan-=am;
			DataSave.balanceSave();
			DataSave.TakenLoanInfoSave();
    	}
    	else{
    		if(full.isSelected()){
    			am=MainClass.givenLoanData.get(indexNo[b]).amount-MainClass.givenLoanData.get(indexNo[b]).cleared;
    			MainClass.givenLoanData.get(indexNo[b]).cleared=MainClass.givenLoanData.get(indexNo[b]).amount;
    			MainClass.givenLoanData.get(indexNo[b]).status="cleared";
    		}
    		else{
    			
    			try{
    				am=Double.parseDouble(amount.getText());
    			}catch (Exception e){
    				JOptionPane.showMessageDialog(this, "Error Value of amount and Failed to perse", "Error",JOptionPane.ERROR_MESSAGE);
    				return;
    			}
    			if (am>MainClass.givenLoanData.get(indexNo[b]).amount){
    				JOptionPane.showMessageDialog(this, "Your Given Amount is larger than hightest value "+String.valueOf(MainClass.givenLoanData.get(indexNo[b]).amount-MainClass.givenLoanData.get(indexNo[b]).cleared), "Error",JOptionPane.ERROR_MESSAGE);
    				return;
    			}
    			MainClass.givenLoanData.get(indexNo[b]).cleared+=am;
    		}
    		MainClass.amount+=am;
			MainClass.donate-=am;
			DataSave.balanceSave();
			DataSave.GivenLoanInfoSave();
    	}
    	MainClass.mainMenu.setUp();
    	MainClass.mainMenu.setEnabled(true);
    	this.setVisible(false);
    }                                        

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {                                         
        MainClass.mainMenu.setUp();
        MainClass.mainMenu.setEnabled(true);
        this.setVisible(false);
    }                                        

    private void doneActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void eventCancelActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                            
    public void setUp(){
    	 type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Returning Back Loan", "Getting Back Loan"}));
    	 String []str=new String[1000];
       	 int k=0;
       	 double fu=0,cl=0;
       	 for (int i=0;i<MainClass.takenLoanData.size();i++){
       		 if(MainClass.takenLoanData.get(i).status.equals("pending")){
       			str[k]=String.valueOf(MainClass.takenLoanData.get(i).amount)+" from "+MainClass.takenLoanData.get(i).person+" on "+MainClass.takenLoanData.get(i).date;
       			if (MainClass.takenLoanData.get(i).cleared>0) str[k]+=" cleared "+String.valueOf(MainClass.takenLoanData.get(i).cleared);
       			indexNo[k++]=i;
       		 }
       	 }
       	 Object []obj=new Object[k];
       	 for (int i=0;i<k;i++){
       		 obj[i]=str[i];
       	 }
       	 item.setModel(new javax.swing.DefaultComboBoxModel(obj));
       	 if (k>=1){
       		 full.setSelected(true);
           	 partial.setSelected(false);
           	 full.setEnabled(true);
           	 partial.setEnabled(true);
           	 fu=MainClass.takenLoanData.get(indexNo[0]).amount;
           	 cl=MainClass.takenLoanData.get(indexNo[0]).cleared;
           	 amount.setText(String.valueOf(fu-cl));
           	 amount.setEditable(false);
           	save.setEnabled(true);
       	 }
    	 done.setVisible(false);
    	 eventCancel.setVisible(false);
    	 jLabel6.setText("Full Loan "+String.valueOf(fu));
     	if (cl>0) jLabel6.setText("Full Loan "+String.valueOf(fu)+" cleared "+String.valueOf(cl));
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton save;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox type;
    private javax.swing.JComboBox item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton full;
    private javax.swing.JRadioButton partial;
    private javax.swing.JRadioButton done;
    private javax.swing.JRadioButton eventCancel;
    private javax.swing.JTextField amount;
    int []indexNo=new int[1000];
    // End of variables declaration                   
}

