package al.jamil.suvo.insouciant.money;

import java.util.Date;

/**
 *
 * @author Suvo
 */
public class ListView extends javax.swing.JFrame {

    /**
     * Creates new form ListView
     */
    public ListView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        name = new javax.swing.JLabel();
        allTime = new javax.swing.JRadioButton();
        thisMouth = new javax.swing.JRadioButton();
        manual = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        TimeStart = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        TimeEnd = new javax.swing.JComboBox();
        allType = new javax.swing.JRadioButton();
        pending = new javax.swing.JRadioButton();
        cleared = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableList = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setText("List Name");

        allTime.setText("All time");
        allTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allTimeActionPerformed(evt);
            }
        });

        thisMouth.setText("This Month");
        thisMouth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thisMouthActionPerformed(evt);
            }
        });

        manual.setText("Menual Selection");
        manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manualActionPerformed(evt);
            }
        });

        jLabel2.setText("From");

        TimeStart.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TimeStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeStartActionPerformed(evt);
            }
        });

        jLabel3.setText("to");

        TimeEnd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        TimeEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeEndActionPerformed(evt);
            }
        });

        allType.setText("All");
        allType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allTypeActionPerformed(evt);
            }
        });

        pending.setText("Pending");
        pending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingActionPerformed(evt);
            }
        });

        cleared.setText("Cleared");
        cleared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearedActionPerformed(evt);
            }
        });

        TableList.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4","Title 5"
            }
        ));
        jScrollPane1.setViewportView(TableList);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel4.setText("insouciant");
        this.setTitle("Information Access");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(allTime)
                                .addGap(26, 26, 26)
                                .addComponent(thisMouth)
                                .addGap(18, 18, 18)
                                .addComponent(manual)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(allType)
                                .addGap(18, 18, 18)
                                .addComponent(pending)
                                .addGap(18, 18, 18)
                                .addComponent(cleared)))
                        .addGap(18, 18, 18)
                        .addComponent(TimeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(back))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(name))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(back)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allTime)
                    .addComponent(thisMouth)
                    .addComponent(manual)
                    .addComponent(jLabel2)
                    .addComponent(TimeStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(TimeEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(allType)
                    .addComponent(pending)
                    .addComponent(cleared))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void allTypeActionPerformed(java.awt.event.ActionEvent evt) {                                              
        pending.setSelected(false);
        cleared.setSelected(false);
        dataType=1;
        switch(dType){
    	case 1:
    		this.setTableOne();break;
    	case 2:
    		this.setTableTwo();break;
    	case 3:
    		this.setTableThree();break;
    	case 4:
    		this.setTableFour();break;
    	}
    }                                             

    private void pendingActionPerformed(java.awt.event.ActionEvent evt) {                                              
        allType.setSelected(false);
        cleared.setSelected(false);
        dataType=2;
        switch(dType){
    	case 1:
    		this.setTableOne();break;
    	case 2:
    		this.setTableTwo();break;
    	case 3:
    		this.setTableThree();break;
    	case 4:
    		this.setTableFour();break;
    	}
    }                                             

    private void clearedActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	 pending.setSelected(false);
    	 allType.setSelected(false);
    	 dataType=3;
    	 switch(dType){
     	case 1:
     		this.setTableOne();break;
     	case 2:
     		this.setTableTwo();break;
     	case 3:
     		this.setTableThree();break;
     	case 4:
     		this.setTableFour();break;
     	}
    }                                             

    private void allTimeActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	allTime.setSelected(true);
    	thisMouth.setSelected(false);
    	jLabel2.setVisible(false);
    	jLabel3.setVisible(false);
    	manual.setSelected(false);
    	TimeStart.setVisible(false);
    	TimeEnd.setVisible(false);
    	timeType=1;
    	switch(dType){
    	case 1:
    		this.setTableOne();break;
    	case 2:
    		this.setTableTwo();break;
    	case 3:
    		this.setTableThree();break;
    	case 4:
    		this.setTableFour();break;
    	}
    }                                             

    private void thisMouthActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	allTime.setSelected(false);
    	thisMouth.setSelected(true);
    	jLabel2.setVisible(false);
    	jLabel3.setVisible(false);
    	manual.setSelected(false);
    	TimeStart.setVisible(false);
    	TimeEnd.setVisible(false);
    	timeType=2;
    	switch(dType){
    	case 1:
    		this.setTableOne();break;
    	case 2:
    		this.setTableTwo();break;
    	case 3:
    		this.setTableThree();break;
    	case 4:
    		this.setTableFour();break;
    	}
    }                                             

    private void manualActionPerformed(java.awt.event.ActionEvent evt) { 
    	allTime.setSelected(false);
    	thisMouth.setSelected(false);
    	jLabel2.setVisible(true);
    	jLabel3.setVisible(true);
    	TimeStart.setVisible(true);
    	TimeEnd.setVisible(true);
    	switch(dType){
    	case 1:
    		this.setTableOne();break;
    	case 2:
    		this.setTableTwo();break;
    	case 3:
    		this.setTableThree();break;
    	case 4:
    		this.setTableFour();break;
    	}
    }                                           

    private void TimeStartActionPerformed(java.awt.event.ActionEvent evt) {                                           
        timeType=3;
        switch(dType){
    	case 1:
    		this.setTableOne();break;
    	case 2:
    		this.setTableTwo();break;
    	case 3:
    		this.setTableThree();break;
    	case 4:
    		this.setTableFour();break;
    	}
    }                                          

    private void TimeEndActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	 timeType=3;
    	 switch(dType){
     	case 1:
     		this.setTableOne();break;
     	case 2:
     		this.setTableTwo();break;
     	case 3:
     		this.setTableThree();break;
     	case 4:
     		this.setTableFour();break;
     	}
    }                                          

    private void backActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	MainClass.mainMenu.setEnabled(true);
    	MainClass.mainMenu.setUp();
    	this.setVisible(false);
    }                                        

    /**
     * @param args the command line arguments
     */
    public void setUp(int t){
    	dType=t;
    	allTime.setSelected(false);
    	thisMouth.setSelected(true);
    	jLabel2.setVisible(false);
    	jLabel3.setVisible(false);
    	manual.setSelected(false);
    	TimeStart.setVisible(false);
    	Object []obj=new Object[MainClass.months.size()];
    	for (int i=0;i<MainClass.months.size();i++){
    		obj[i]=MainClass.months.get(i);
    	}
    	
    	TimeEnd.setModel(new javax.swing.DefaultComboBoxModel(obj));
    	TimeStart.setModel(new javax.swing.DefaultComboBoxModel(obj));
    	TimeEnd.setVisible(false);
    	timeType=2;
    	if (dType==1 || dType==2){
    		allType.setVisible(false);
        	pending.setVisible(false);
        	cleared.setVisible(false);
    	}
    	else{
    		allType.setVisible(true);
        	pending.setVisible(true);
        	cleared.setVisible(true);
    	}
    	allType.setSelected(true);
    	pending.setSelected(false);
    	cleared.setSelected(false);
    	dataType=1;
    	System.out.println(dType);
    	switch(dType){
    	
    	case 1:
    		this.setTableOne();break;
    	case 2:
    		this.setTableTwo();break;
    	case 3:
    		this.setTableThree();break;
    	case 4:
    		this.setTableFour();break;
    	}
    }
    private void setTableOne(){
    	name.setText("Source of Money");
    	System.out.println("a");
    	String []title={"Date","Source","Amount"};
    	Object [][]obj=new Object[1000][1000];
    	int c=0;
    	for (AddData data:MainClass.addData){
    		if (timeType!=1){
    			Date d=new Date();
    			String t=MainClass.MonthName[d.getMonth()]+" "+String.valueOf(d.getYear()+1900);
    			String []m1=data.date.split(",");
            	String []m2=data.date.split(" ");
            	String mon=m2[0]+" "+m1[1];
            	if (timeType==2 && !mon.equals(t)) continue;
            	if (timeType==3){
            		int i=MainClass.months.indexOf(TimeStart.getSelectedItem());
            		int k=MainClass.months.indexOf(TimeEnd.getSelectedItem());
            		boolean flag=false;
            		for (int j=i;j<=k;j++){
            			if (mon.equals(MainClass.months.get(j))) flag=true;
            		}
            		if (!flag) continue;
            	}
    		}
    		obj[c][0]=data.date;
    		obj[c][1]=data.source;
    		obj[c++][2]=data.amount;
    	}
    	Object [][]finalObj=new Object[c][3];
    	for (int i=0;i<c;i++){
    		for (int j=0;j<3;j++){
    			finalObj[i][j]=obj[i][j];
    		}
    	}
    	TableList.setModel(new javax.swing.table.DefaultTableModel(finalObj,title));
    }
    private void setTableTwo(){
    	name.setText("Conume list");
    	String []title={"Date","Source","Amount"};
    	Object [][]obj=new Object[1000][1000];
    	int c=0;
    	for (ConsumeData data:MainClass.consumeData){
    		if (timeType!=1){
    			Date d=new Date();
    			String t=MainClass.MonthName[d.getMonth()]+" "+String.valueOf(d.getYear()+1900);
    			String []m1=data.date.split(",");
            	String []m2=data.date.split(" ");
            	String mon=m2[0]+" "+m1[1];
            	if (timeType==2 && !mon.equals(t)) continue;
            	if (timeType==3){
            		int i=MainClass.months.indexOf(TimeStart.getSelectedItem());
            		int k=MainClass.months.indexOf(TimeEnd.getSelectedItem());
            		boolean flag=false;
            		for (int j=i;j<=k;j++){
            			if (mon.equals(MainClass.months.get(j))) flag=true;
            		}
            		if (!flag) continue;
            	}
    		}
    		obj[c][0]=data.date;
    		obj[c][1]=data.source;
    		obj[c++][2]=data.amount;
    	}
    	TableList.setModel(new javax.swing.table.DefaultTableModel(obj,title));
    }
    private void setTableThree(){
    	name.setText("Loan List");
    	if (dataType==2) name.setText("Pending Loan List");
    	if (dataType==3) name.setText("Cleared Loan List");
    	String []title={"Date","Person & Reason","Amount","Cleared","Status"};
    	Object [][]obj=new Object[1000][1000];
    	int c=0;
    	for (TakenLoanData data:MainClass.takenLoanData){
    		if (timeType!=1){
    			Date d=new Date();
    			String t=MainClass.MonthName[d.getMonth()]+" "+String.valueOf(d.getYear()+1900);
    			String []m1=data.date.split(",");
            	String []m2=data.date.split(" ");
            	String mon=m2[0]+" "+m1[1];
            	if (timeType==2 && !mon.equals(t)) continue;
            	if (timeType==3){
            		int i=MainClass.months.indexOf(TimeStart.getSelectedItem());
            		int k=MainClass.months.indexOf(TimeEnd.getSelectedItem());
            		boolean flag=false;
            		for (int j=i;j<=k;j++){
            			if (mon.equals(MainClass.months.get(j))) flag=true;
            		}
            		if (!flag) continue;
            	}
    		}
    		if (dataType==2 && !data.status.equals("pending")) continue;
    		if (dataType==3 && !data.status.equals("cleared")) continue;
    		obj[c][0]=data.date;
    		obj[c][1]=data.person;
    		obj[c][2]=data.amount;
    		obj[c][3]=data.cleared;
    		obj[c++][4]=data.status;
    	}
    	TableList.setModel(new javax.swing.table.DefaultTableModel(obj,title));
    }
    private void setTableFour(){
     	name.setText("Loans You have given");
    	if (dataType==2) name.setText("Pending Loans You have given");
    	if (dataType==3) name.setText("Cleared Loans You have given");
    	String []title={"Date","Person & Reason","Amount","Cleared","Status"};
    	Object [][]obj=new Object[1000][1000];
    	int c=0;
    	for (GivenLoanData data:MainClass.givenLoanData){
    		if (timeType!=1){
    			Date d=new Date();
    			String t=MainClass.MonthName[d.getMonth()]+" "+String.valueOf(d.getYear()+1900);
    			String []m1=data.date.split(",");
            	String []m2=data.date.split(" ");
            	String mon=m2[0]+" "+m1[1];
            	if (timeType==2 && !mon.equals(t)) continue;
            	if (timeType==3){
            		int i=MainClass.months.indexOf(TimeStart.getSelectedItem());
            		int k=MainClass.months.indexOf(TimeEnd.getSelectedItem());
            		boolean flag=false;
            		for (int j=i;j<=k;j++){
            			if (mon.equals(MainClass.months.get(j))) flag=true;
            		}
            		if (!flag) continue;
            	}
    		}
    		if (dataType==2 && !data.status.equals("pending")) continue;
    		if (dataType==3 && !data.status.equals("cleared")) continue;
    		obj[c][0]=data.date;
    		obj[c][1]=data.person;
    		obj[c][2]=data.amount;
    		obj[c][3]=data.cleared;
    		obj[c++][4]=data.status;
    	}
    	TableList.setModel(new javax.swing.table.DefaultTableModel(obj,title));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton back;
    private javax.swing.JComboBox TimeStart;
    private javax.swing.JComboBox TimeEnd;
    private javax.swing.JLabel name;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton allTime;
    private javax.swing.JRadioButton thisMouth;
    private javax.swing.JRadioButton manual;
    private javax.swing.JRadioButton allType;
    private javax.swing.JRadioButton pending;
    private javax.swing.JRadioButton cleared;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable TableList;
    private int dType;
    int timeType;
    int dataType;
    // End of variables declaration                   
}

