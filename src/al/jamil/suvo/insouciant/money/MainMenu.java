package al.jamil.suvo.insouciant.money;

import javax.swing.JOptionPane;


/**
 *
 * @author Suvo
 */
public class MainMenu extends javax.swing.JFrame{

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        addingList = new javax.swing.JButton();
        consumingList = new javax.swing.JButton();
        borrowList = new javax.swing.JButton();
        loanList = new javax.swing.JButton();
        currentMoney = new javax.swing.JLabel();
        borrowedAmount = new javax.swing.JLabel();
        donateAmount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        quickInfoBt = new javax.swing.JButton();
        addMoney = new javax.swing.JButton();
        consumeMoney = new javax.swing.JButton();
        takeLoan = new javax.swing.JButton();
        giveLoan = new javax.swing.JButton();
        futureConsume = new javax.swing.JButton();
        futureAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        changePassword = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addingList.setText("View Adding List");
        addingList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addingListActionPerformed(evt);
            }
        });

        consumingList.setText("View Consuming List");
        consumingList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consumingListActionPerformed(evt);
            }
        });

        borrowList.setText("View Borrowing List");
        borrowList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrowListActionPerformed(evt);
            }
        });

        loanList.setText("View Given Loan List");
        loanList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanListActionPerformed(evt);
            }
        });

        currentMoney.setFont(new java.awt.Font("Calibri", 0, 30)); // NOI18N
        currentMoney.setText("Current Money : 0.0");

        borrowedAmount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        borrowedAmount.setText("You have to return back 0.0 BDT");

        donateAmount.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        donateAmount.setText("You may get 0.0 BDT ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addingList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(consumingList, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addComponent(borrowList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loanList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(currentMoney)
                    .addComponent(borrowedAmount)
                    .addComponent(donateAmount))
                .addGap(0, 91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(consumingList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addingList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrowList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loanList)
                .addGap(50, 50, 50)
                .addComponent(currentMoney)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(borrowedAmount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(donateAmount)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel1.setText("Money Calculation & Saving");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 102, 255));
        jLabel2.setText("insouciant ");

        quickInfoBt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        quickInfoBt.setText("Quick Info Add");
        quickInfoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quickInfoBtActionPerformed(evt);
            }
        });

        addMoney.setText("Add Money");
        addMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMoneyActionPerformed(evt);
            }
        });

        consumeMoney.setText("Consume Money");
        consumeMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consumeMoneyActionPerformed(evt);
            }
        });

        takeLoan.setText("Borrow Money");
        takeLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                takeLoanActionPerformed(evt);
            }
        });

        giveLoan.setText("Give Loan");
        giveLoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveLoanActionPerformed(evt);
            }
        });

        futureConsume.setText("Plan Future Consume ");

        futureAdd.setText("Plan Future Money Source");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("insouciant");

        jMenu2.setText("About Us");

        about.setText("About Software");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu2.add(about);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Setting");

        changePassword.setText("Change Password");
        jMenu3.add(changePassword);
        changePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordActionPerformed(evt);
            }
        });

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Exit");

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);
        this.setTitle("Main Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(quickInfoBt)
                                .addComponent(futureAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(futureConsume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addMoney, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(consumeMoney, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(giveLoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(takeLoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(quickInfoBt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(addMoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consumeMoney)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(takeLoan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(giveLoan)
                        .addGap(79, 79, 79)
                        .addComponent(futureConsume)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(futureAdd))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void quickInfoBtActionPerformed(java.awt.event.ActionEvent evt) {                                         
        this.setEnabled(false);
        MainClass.quickInfo.setUp();
        MainClass.quickInfo.setVisible(true);
       
    }                                        

    private void addMoneyActionPerformed(java.awt.event.ActionEvent evt) {
    	this.setEnabled(false);
        MainClass.addInfo.setUp(1);
        MainClass.addInfo.makeVisible();
    }                                        

    private void consumeMoneyActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	this.setEnabled(false);
        MainClass.addInfo.setUp(2);
        MainClass.addInfo.makeVisible();
    }                                        

    private void takeLoanActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	this.setEnabled(false);
        MainClass.addInfo.setUp(3);
        MainClass.addInfo.makeVisible();
    }                                        

    private void giveLoanActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	this.setEnabled(false);
        MainClass.addInfo.setUp(4);
        MainClass.addInfo.makeVisible();
    }                                        

    private void consumingListActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	this.setEnabled(false);
        MainClass.listView.setUp(2);
        MainClass.listView.setVisible(true);
    }                                        

    private void addingListActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	this.setEnabled(false);
        MainClass.listView.setUp(1);
        MainClass.listView.setVisible(true);
    }                                        

    private void borrowListActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	this.setEnabled(false);
        MainClass.listView.setUp(3);
        MainClass.listView.setVisible(true);
    }                                         

    private void loanListActionPerformed(java.awt.event.ActionEvent evt) {                                          
    	this.setEnabled(false);
        MainClass.listView.setUp(4);
        MainClass.listView.setVisible(true);
    }                                         

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {                                           
        MainClass.about.setVisible(true);
        this.setEnabled(false);
    }                                          

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                           
    	JOptionPane.showMessageDialog(this,
				"Are You Sure to Exit", "Confirm Exit",
				JOptionPane.OK_OPTION);
    	System.exit(0);
    }
    private void changePasswordActionPerformed(java.awt.event.ActionEvent evt) {                                           
        MainClass.passwordChange.setUp(2);
        MainClass.passwordChange.setVisible(true);
        this.setEnabled(false);
    } 
    public void setUp(){
    	MainClass.passwordChange.flag=false;
    	currentMoney.setText("Current Money "+String.valueOf(MainClass.amount));
    	if (MainClass.loan!=0) {
    		borrowedAmount.setText("You have to return back "+String.valueOf(MainClass.loan));
    		borrowedAmount.setVisible(true);
    	}
    	else borrowedAmount.setVisible(false);
    	if (MainClass.donate!=0) {
    		donateAmount.setText("You may get "+String.valueOf(MainClass.donate));
    		donateAmount.setVisible(true);
    	}
    	else donateAmount.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify                     
    private javax.swing.JButton quickInfoBt;
    private javax.swing.JButton borrowList;
    private javax.swing.JButton loanList;
    private javax.swing.JButton addMoney;
    private javax.swing.JButton consumeMoney;
    private javax.swing.JButton takeLoan;
    private javax.swing.JButton giveLoan;
    private javax.swing.JButton futureConsume;
    private javax.swing.JButton futureAdd;
    private javax.swing.JButton addingList;
    private javax.swing.JButton consumingList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel currentMoney;
    private javax.swing.JLabel borrowedAmount;
    private javax.swing.JLabel donateAmount;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem changePassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFrame jFrm;
    // End of variables declaration                   
}

