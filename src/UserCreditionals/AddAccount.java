package UserCreditionals;

import javax.swing.*;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class AddAccount extends javax.swing.JFrame {

     /**
      * Creates new form AddAccount
      */
     public AddAccount() {
          initComponents();
     }

     /**
      * This method is called from within the constructor to initialize the form.
      * WARNING: Do NOT modify this code. The content of this method is always
      * regenerated by the Form Editor.
      */
     @SuppressWarnings("unchecked")

     private void initComponents() {

          jScrollPane1 = new javax.swing.JScrollPane();
          jSpinner1 = new javax.swing.JSpinner();
          jLabel1 = new javax.swing.JLabel();
          jButton1 = new javax.swing.JButton();
          BankName = new javax.swing.JComboBox<>();
          jLabel2 = new javax.swing.JLabel();
          Card = new javax.swing.JFormattedTextField();
          jLabel3 = new javax.swing.JLabel();
          cvv = new javax.swing.JFormattedTextField();
          jLabel4 = new javax.swing.JLabel();
          pin = new javax.swing.JPasswordField();
          jLabel5 = new javax.swing.JLabel();
          AddAccount = new javax.swing.JButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
          jLabel1.setText("Add Account");

          jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow_back_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
               }
          });

          BankName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "State Bank of India", "Punjab National Bank", "Axis Bank", "Andhra Bank", "Union Bank", "Jambu and Kashmir Bank", "United bank", "Bank of Baroda", "Mahindra Bank", "Yes Bank" }));

          jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
          jLabel2.setText("Select Bank");

          jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
          jLabel3.setText("Card Number");

          jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
          jLabel4.setText("CVV");

          jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
          jLabel5.setText("Set Pin");

          AddAccount.setText("Add");
          AddAccount.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AddAccountActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(22, 22, 22)
                                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGap(35, 35, 35)
                                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(48, 48, 48))
                                                                      .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                          .addGroup(layout.createSequentialGroup()
                                                                                                    .addGap(314, 314, 314)
                                                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                              .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                          .addGroup(layout.createSequentialGroup()
                                                                                                    .addGap(363, 363, 363)
                                                                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGap(36, 36, 36)))
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                      .addComponent(Card)
                                                                      .addComponent(BankName, 0, 200, Short.MAX_VALUE)
                                                                      .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addContainerGap(473, Short.MAX_VALUE))
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(AddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(465, 465, 465))
          );
          layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(128, 128, 128)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(13, 13, 13)
                                                            .addComponent(BankName)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                  .addComponent(Card)
                                                  .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(pin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addComponent(AddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(207, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>

     private void AddAccountActionPerformed(java.awt.event.ActionEvent evt) {
          String CardNumber = Card.getText();
          String Cvv = cvv.getText() ;
          String Pin = pin.getText() ;
          if(CardNumber.length()==16)
          {
               RegExAddAccount rg = new RegExAddAccount(CardNumber,Pin,Cvv) ;
               if(rg.CardNumberCheck())
               {
                    if(rg.CvvCheck())
                    {
                         if(rg.PinCheck())
                         {

                              InsertInDataBase db = new InsertInDataBase(CardNumber,Pin,Cvv, (String) BankName.getSelectedItem()) ;
                              if(db.SearchingCardNumber())
                              {
                                   JOptionPane.showMessageDialog(this,"Already Exists");
                              }
                              else
                              {
                                   //  System.out.println(BankName.getSelectedItem()+" , "+BankName.getName());
                                   db.InsertingIntoDB();
                                   System.out.println("Succefully Added");
                                   JOptionPane.showMessageDialog(this, "Succesfully Added");
                                   HomeForm hf = new HomeForm();
                                   hf.setVisible(true);
                                   this.dispose();
                              }
                         }
                         else
                         {
                              JOptionPane.showMessageDialog(this,"Pin Should be 6 Digits");
                         }
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(this,"invalid Cvv Number");
                    }
               }
               else
               {
                    JOptionPane.showMessageDialog(this,"invalid Card Details");
               }
          }
          else
          {
               JOptionPane.showMessageDialog(this,"Incorrect Card Number");
          }
     }



     private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
          HomeForm hf = new HomeForm() ;
          hf.setVisible(true);
          this.dispose();
     }

     /**
      * @param args the command line arguments
      */


     // Variables declaration - do not modify
     private javax.swing.JButton AddAccount;
     private javax.swing.JComboBox<String> BankName;
     private javax.swing.JFormattedTextField Card;
     private javax.swing.JFormattedTextField cvv;
     private javax.swing.JButton jButton1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JSpinner jSpinner1;
     private javax.swing.JPasswordField pin;
     // End of variables declaration
}

class RegExAddAccount
{
     String CardNumber ;
     String Pin ;
     String Cvv ;
     RegExAddAccount(String CardNumber,String Pin,String Cvv)
     {
          this.CardNumber = CardNumber ;
          this.Pin = Pin ;
          this.Cvv = Cvv ;
     }
     RegExAddAccount(String CardNumber,String Pin)
     {
          this.CardNumber = CardNumber ;
          this.Pin = Pin ;
     }
     public Boolean CardNumberCheck()
     {
          Pattern p = Pattern.compile("[0-9]{16}") ;
          Matcher m = p.matcher(CardNumber) ;
          return m.matches() ;
     }
     public Boolean CvvCheck()
     {
          Pattern p = Pattern.compile("[0-9]{3}") ;
          Matcher m = p.matcher(Cvv) ;
          return m.matches() ;
     }
     public  Boolean PinCheck()
     {
          Pattern p = Pattern.compile("[0-9]{6}") ;
          Matcher m = p.matcher(Pin) ;
          return m.matches() ;
     }
}
class  InsertInDataBase
{
     String CardNumber ;
     String Pin ;
     String Cvv ;
     String Bank ;
     InsertInDataBase(String CardNumber,String Pin,String Cvv,String Bank)
     {
          this.CardNumber = CardNumber ;
          this.Pin = Pin ;
          this.Cvv = Cvv ;
          this.Bank = Bank ;
     }
     InsertInDataBase(String CardNumber,String Pin)
     {
          this.CardNumber = CardNumber ;
          this.Pin = Pin ;
     }
     public void InsertingIntoDB()
     {
          try
          {
               String tableName = HomeForm.MobileNumber+"_AddAccount" ;
               String table = HomeForm.MobileNumber+"_cardBalance" ;
               int i = Integer.parseInt(Pin) ;
               int Balance = i*10 ;
               Class.forName(DataBaseDetails.driver) ;
              Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               Statement st = con.createStatement() ;
               st.executeUpdate("insert into "+tableName+" values("+"'"+Bank+"'"+","+"'"+CardNumber+"'"+","+"'"+Cvv+"'"+","+"'"+Pin+"')");
               st.executeUpdate("insert into "+table+" values("+"'"+CardNumber+"'"+","+"'"+Pin+"'"+","+"'"+Balance+"'"+")");

               st.close();
               con.close();

          }
          catch (SQLException sql)
          {
               System.out.println(sql);
               sql.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }
     public boolean SearchingCardNumber()
     {
          String table = HomeForm.MobileNumber+"_cardBalance" ;
          try
          {
               Class.forName(DataBaseDetails.driver) ;
               Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               String query = "Select * from  "+table+" where CardNumber=? and Pin=?" ;
               PreparedStatement st = con.prepareStatement(query) ;
               st.setString(1,CardNumber);
               st.setString(2,Pin);
               ResultSet rs = st.executeQuery() ;
               if (rs.next())
               {
                    return true ;
               }
               st.close();
               con.close();

          }
          catch (SQLException sql)
          {
               System.out.println(sql);
               sql.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
          return false;
     }
     public String BalanceCheck()
     {
          String Balance = "" ;
          String table = HomeForm.MobileNumber+"_cardBalance" ;
          try
          {

               Class.forName(DataBaseDetails.driver) ;
               Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               String query = "Select * from  "+table+" where CardNumber=?" ;
               PreparedStatement st = con.prepareStatement(query) ;
               System.out.println("The  Balance  is "+Balance);
               st.setString(1,CardNumber);
               System.out.println("The  Balance  is "+Balance);
               ResultSet rs = st.executeQuery() ;
               System.out.println("The  Balance  is "+Balance);
                if(rs.next())
                {
                     Balance = rs.getString(3) ;
                     System.out.println("The  Balance  is "+Balance);
                }
               st.close();
               con.close();

          }
          catch (SQLException sql)
          {
               System.out.println(sql);
               sql.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
          return Balance;
     }
}
