/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carparts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import static java.lang.Integer.parseInt;
import java.rmi.Naming;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Toozigba
 */
public class PartsClient extends javax.swing.JFrame {

    /**
     * Creates new form PartsClient
     */
    public PartsClient() {
        initComponents();
    }
    static int flag =0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ActionSelect = new javax.swing.JComboBox<>();
        formBg = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ItemName = new javax.swing.JTextField();
        SubmitUpdate = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        ItemPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        Mail = new javax.swing.JButton();
        generateReport = new javax.swing.JButton();
        timerIcon = new javax.swing.JLabel();
        DisplayWindow = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        MailArea = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        sendMail = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(14, 178, 154));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(96, 125, 139));
        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carparts/Images/icons8-maintenance-96.png"))); // NOI18N
        jLabel1.setText("Meng's Car Parts System");

        ActionSelect.setBackground(new java.awt.Color(0, 153, 153));
        ActionSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Action", "Get a Price", "View All Prices", "Change Price", "Delete Part", "Generate Profit Report" }));
        ActionSelect.setBorder(null);
        ActionSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionSelectActionPerformed(evt);
            }
        });

        formBg.setBackground(new java.awt.Color(96, 125, 139));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter Item Name");

        ItemName.setText("Enter Name");

        SubmitUpdate.setText("Submit");
        SubmitUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitUpdateActionPerformed(evt);
            }
        });

        priceLabel.setForeground(new java.awt.Color(255, 255, 255));
        priceLabel.setText("New Item Price");

        ItemPrice.setText("Enter New Price");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carparts/Images/icons8-steampunk-48.png"))); // NOI18N
        jLabel4.setText("Request Form");

        javax.swing.GroupLayout formBgLayout = new javax.swing.GroupLayout(formBg);
        formBg.setLayout(formBgLayout);
        formBgLayout.setHorizontalGroup(
            formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBgLayout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(formBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SubmitUpdate)
                    .addGroup(formBgLayout.createSequentialGroup()
                        .addGroup(formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ItemName, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                            .addComponent(ItemPrice))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
        );
        formBgLayout.setVerticalGroup(
            formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBgLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(formBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formBgLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(priceLabel))
                    .addGroup(formBgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(SubmitUpdate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(ActionSelect, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(formBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActionSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(221, 240, 194));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Mail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carparts/Images/icons8-paper-plane-48.png"))); // NOI18N
        Mail.setBorder(null);
        Mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MailActionPerformed(evt);
            }
        });

        generateReport.setBackground(new java.awt.Color(255, 255, 255));
        generateReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carparts/Images/icons8-us-dollar-48.png"))); // NOI18N
        generateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportActionPerformed(evt);
            }
        });

        timerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carparts/Images/icons8-time-48.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(timerIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Mail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(timerIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, Short.MAX_VALUE)
        );

        DisplayWindow.setBackground(new java.awt.Color(255, 255, 255));
        DisplayWindow.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        display.setColumns(20);
        display.setRows(5);
        jScrollPane1.setViewportView(display);

        javax.swing.GroupLayout DisplayWindowLayout = new javax.swing.GroupLayout(DisplayWindow);
        DisplayWindow.setLayout(DisplayWindowLayout);
        DisplayWindowLayout.setHorizontalGroup(
            DisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DisplayWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addContainerGap())
        );
        DisplayWindowLayout.setVerticalGroup(
            DisplayWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DisplayWindowLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addContainerGap())
        );

        MailArea.setBackground(new java.awt.Color(221, 240, 194));
        MailArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email Address");

        emailAddress.setText("Enter Email Address");

        sendMail.setText("Submit");
        sendMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MailAreaLayout = new javax.swing.GroupLayout(MailArea);
        MailArea.setLayout(MailAreaLayout);
        MailAreaLayout.setHorizontalGroup(
            MailAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MailAreaLayout.createSequentialGroup()
                .addGroup(MailAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MailAreaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(emailAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MailAreaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendMail)))
                .addContainerGap())
        );
        MailAreaLayout.setVerticalGroup(
            MailAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MailAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MailAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(sendMail))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MailArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DisplayWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DisplayWindow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MailArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActionSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionSelectActionPerformed
    String select=ActionSelect.getSelectedItem().toString();
    if(select.equals("View All Prices")){
        PartsClient.MailArea.setVisible(false);
        PartsClient.formBg.setVisible(false);
        display.setText("");
        try {
            long start = System.currentTimeMillis();
            String result=viewAllPartsPrices();
            display.setText(result);
           
            long time = System.currentTimeMillis() - start;
        
            String timeTaken= Float.toString((time));
            timerIcon.setText(timeTaken+" mil");
             LogWriter("View all prices",result,timeTaken);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    if(select.equals("Get a Price")){
        PartsClient.MailArea.setVisible(false);
       display.setText("");
       PartsClient.formBg.setVisible(true);
       priceLabel.setVisible(false);
       ItemPrice.setVisible(false);
       flag=1;
       
    }
    
    if(select.equals("Change Price")){
        PartsClient.MailArea.setVisible(false);
        display.setText("");
       PartsClient.formBg.setVisible(true);
       priceLabel.setVisible(true);
       ItemPrice.setVisible(true); 
       flag=2;
    }
    
    if(select.equals("Delete Part")){
        PartsClient.MailArea.setVisible(false);
        display.setText("");
       PartsClient.formBg.setVisible(true);
       priceLabel.setVisible(false);
       ItemPrice.setVisible(false); 
       flag=3;
    }
    
     if(select.equals("Generate Profit Report")){
         PartsClient.MailArea.setVisible(false);
        PartsClient.formBg.setVisible(false);
         long start = System.currentTimeMillis();
      
        
        display.setText("");
        try {
            String genReport=generateReport();
            display.setText(genReport);
            long time = System.currentTimeMillis() - start;
        
            String timeTaken= Float.toString((time));
            timerIcon.setText(timeTaken+" mil");
            LogWriter("Generate Profit Report",genReport,timeTaken); 
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
     
    
   
    System.out.print(ActionSelect.getSelectedItem().toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_ActionSelectActionPerformed

    private void SubmitUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitUpdateActionPerformed
       
//        int x=(int) Double.valueOf(ItemName.getText().trim()).doubleValue();
//        int y= (int) Double.valueOf(ItemPrice.getText().trim()).doubleValue();
//        this.add(x,y);        // TODO add your handling code here:
PartsClient.MailArea.setVisible(false);
    
    if(flag==1){
        long start = System.currentTimeMillis();
    try {
        String getPrice=getPrice(ItemName.getText().trim());
        display.setText(getPrice);
         long time = System.currentTimeMillis() - start;
        String timeTaken= Float.toString((time));
        timerIcon.setText(timeTaken+" mil");
        LogWriter("Get price of item",getPrice,timeTaken); 
    } catch (FileNotFoundException ex) {
        Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedEncodingException ex) {
        Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }
    
    if(flag==2){
        long start = System.currentTimeMillis();
    try {
        String changePrice=changePrice(ItemName.getText().trim(),Integer.valueOf(ItemPrice.getText().trim()));
        display.setText(changePrice);
        long time = System.currentTimeMillis() - start;
        String timeTaken= Float.toString((time));
        timerIcon.setText(timeTaken+" mil");
        LogWriter("Change price of item",changePrice,timeTaken);  
    } catch (FileNotFoundException ex) {
        Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedEncodingException ex) {
        Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }
    
    if(flag==3){
        long start = System.currentTimeMillis();
    try {
        String delPart=deletePart(ItemName.getText().trim());
        display.setText(delPart);
        long time = System.currentTimeMillis() - start;
        String timeTaken= Float.toString((time));
        timerIcon.setText(timeTaken+" mil");
        LogWriter("Delete part",delPart,timeTaken); 
    } catch (FileNotFoundException ex) {
        Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
    } catch (UnsupportedEncodingException ex) {
        Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }
    
   // viewAllPartsPrices();
    }//GEN-LAST:event_SubmitUpdateActionPerformed

    private void MailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MailActionPerformed
        // TODO add your handling code here:
        PartsClient.MailArea.setVisible(true);
    }//GEN-LAST:event_MailActionPerformed

    private void generateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportActionPerformed
        PartsClient.MailArea.setVisible(false);
        long start = System.currentTimeMillis();
      
        
        display.setText("");
        try { 
            display.setText(generateReport());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PartsClient.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        long time = System.currentTimeMillis() - start;
        
        String timeTaken= Float.toString((time));
        timerIcon.setText(timeTaken+" mil");
                

        
        // TODO add your handling code here:
    }//GEN-LAST:event_generateReportActionPerformed

    private void sendMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMailActionPerformed
        // TODO add your handling code here:
        
        display.setText("");
        long start = System.currentTimeMillis();
        display.setText(sendMail(emailAddress.getText().trim())); 
        long time = System.currentTimeMillis() - start;
        String timeTaken= Float.toString((time));
        timerIcon.setText(timeTaken+" mil");
        
    }//GEN-LAST:event_sendMailActionPerformed

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
            java.util.logging.Logger.getLogger(PartsClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartsClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartsClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartsClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartsClient().setVisible(true);
              PartsClient.formBg.setVisible(false);
              PartsClient.MailArea.setVisible(false);
            }
        });
        
        
        
        
    }
    
    public void add(double num1, double num2){
        try {
  	  String addServerURL = "rmi://" + "127.0.0.1" + "/CarPartsServer";
  	  CarPartsInterface CarPartsInterface = (CarPartsInterface)Naming.lookup(addServerURL);
  	  System.out.println("The first number is " + num1);
  	  double d1 = Double.valueOf(num1).doubleValue();
  	  System.out.println("The second number is " + num2);
  	  double d2 = Double.valueOf(num2).doubleValue();
  	  System.out.println("The sum is: " + CarPartsInterface.add(d1,d2));
          
          viewAllPartsPricesInterface viewAllPartsPricesInterface = (viewAllPartsPricesInterface) Naming.lookup(addServerURL);
  	  
  	  System.out.println(viewAllPartsPricesInterface.viewAllPartsPrices());
  	  
  	}
  	catch (Exception e)  {
  	System.out.println("Exception: " + e);
  	}	 

    }
    
    public String viewAllPartsPrices() throws FileNotFoundException, UnsupportedEncodingException{
        String result="";
        
        try {
  	  String addServerURL = "rmi://" + "127.0.0.1" + "/CarPartsServer";
  	  viewAllPartsPricesInterface viewAllPartsPricesInterface = (viewAllPartsPricesInterface) Naming.lookup(addServerURL);
  	  
  	   result =viewAllPartsPricesInterface.viewAllPartsPrices();
           
  	  
  	}
  	catch (Exception e)  {
  	System.out.println("Exception: " + e);
  	}
        
      return result;  
    }
    
     public String getPrice(String ItemName) throws FileNotFoundException, UnsupportedEncodingException{
        String result="";
        
        try {
  	  String addServerURL = "rmi://" + "127.0.0.1" + "/CarPartsServer";
  	  getPriceInterface getPriceInterface = (getPriceInterface) Naming.lookup(addServerURL);
  	  
  	   result =getPriceInterface.getPrice(ItemName);
          
  	}
  	catch (Exception e)  {
  	System.out.println("Exception: " + e);
  	}
        
      return result;  
    }
     
     public String changePrice(String ItemName, int NewPrice) throws FileNotFoundException, UnsupportedEncodingException{
        String result="";
        
        try {
  	  String addServerURL = "rmi://" + "127.0.0.1" + "/CarPartsServer";
  	  changePrice changePrice = (changePrice) Naming.lookup(addServerURL);
  	  
  	   result =changePrice.changePrice(ItemName, NewPrice);
           
  	}
  	catch (Exception e)  {
  	System.out.println("Exception: " + e);
  	}
         
      return result;  
    }
     
      public String deletePart(String ItemName) throws FileNotFoundException, UnsupportedEncodingException{
        String result="";
        
        try {
  	  String addServerURL = "rmi://" + "127.0.0.1" + "/CarPartsServer";
  	  deletePart deletePart = (deletePart) Naming.lookup(addServerURL);
  	  
  	   result =deletePart.deletePart(ItemName);
           
  	}
  	catch (Exception e)  {
  	System.out.println("Exception: " + e);
  	}
        
      return result;  
    }
      
        public String generateReport() throws FileNotFoundException, UnsupportedEncodingException{
        String result="";
        
        try {
  	  String addServerURL = "rmi://" + "127.0.0.1" + "/CarPartsServer";
  	  generateReport generateReport = (generateReport) Naming.lookup(addServerURL);
  	  
  	   result =generateReport.generateReport();
  	  
  	}
  	catch (Exception e)  {
  	System.out.println("Exception: " + e);
  	}
       
      return result;  
    }
        
        
         public String sendMail(String EmailAddress){
        String result="";
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Boolean b = EmailAddress.matches(EMAIL_REGEX);

        if(b){
                        try {
                          String addServerURL = "rmi://" + "127.0.0.1" + "/CarPartsServer";
                          sendMail sendMail = (sendMail) Naming.lookup(addServerURL);

                           result =sendMail.sendMail(EmailAddress);

                        }
                        catch (Exception e)  {
                        System.out.println("Exception: " + e);
                        }
                        }
        
        else result="Enter a valid email address";
      return result;  
    }
         public void LogWriter(String action,String entry,String time) throws FileNotFoundException, UnsupportedEncodingException{
             PrintWriter writer = new PrintWriter(new FileOutputStream(new File("Output.out"),true));
             DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
             LocalDateTime now = LocalDateTime.now();
             writer.println(dtf.format(now)+"\n"+"Action: "+action+"\n"+"Event "+entry+"\n"+"Performance: "+time+"\n\n");
             
             writer.close();
         }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ActionSelect;
    private javax.swing.JPanel DisplayWindow;
    private static javax.swing.JTextField ItemName;
    private static javax.swing.JTextField ItemPrice;
    private javax.swing.JButton Mail;
    private static javax.swing.JPanel MailArea;
    private javax.swing.JButton SubmitUpdate;
    private javax.swing.JTextArea display;
    private static javax.swing.JTextField emailAddress;
    private static javax.swing.JPanel formBg;
    private javax.swing.JButton generateReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton sendMail;
    private static javax.swing.JLabel timerIcon;
    // End of variables declaration//GEN-END:variables
}
