package UserCreditionals;
// 9256762192
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
/**
 *
 * @author phani
 */
public class RegisterForm extends javax.swing.JFrame {

     /**
      * Creates new form RegisterForm
      */
     public RegisterForm()
     {
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

          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          Email = new javax.swing.JTextField();
          jLabel3 = new javax.swing.JLabel();
          Mobile = new javax.swing.JTextField();
          ChoosePassword = new javax.swing.JPasswordField();
          ConfirmPassWord = new javax.swing.JPasswordField();
          jLabel4 = new javax.swing.JLabel();
          jLabel5 = new javax.swing.JLabel();
          SignUp = new javax.swing.JButton();
          Back = new javax.swing.JToggleButton();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
          jLabel1.setText("Welcome To Sign Up");

          jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
          jLabel2.setText("EMail");

          jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
          jLabel3.setText("Mobile");

          jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
          jLabel4.setText("Choose Password");

          jLabel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 18)); // NOI18N
          jLabel5.setText("Confirm PassWord");

          SignUp.setText("Sign Up");
          SignUp.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SignUpActionPerformed(evt);
               }
          });

          Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow_back_FILL0_wght400_GRAD0_opsz48.png"))); // NOI18N
          Back.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    BackActionPerformed(evt);
               }
          });

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                      .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                      .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                      .addComponent(ConfirmPassWord, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                                                      .addComponent(ChoosePassword)
                                                                      .addComponent(Email)
                                                                      .addComponent(Mobile))
                                                            .addGap(382, 382, 382))
                                                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(402, 402, 402))))
                              .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(380, 380, 380)
                                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                  .addGroup(layout.createSequentialGroup()
                                                            .addGap(16, 16, 16)
                                                            .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(365, Short.MAX_VALUE))
          );
          layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                              .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel1)
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(Mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(ChoosePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                  .addComponent(ConfirmPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                  .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addComponent(SignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(149, Short.MAX_VALUE))
          );

          pack();
     }// </editor-fold>

     private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {
          String Email_ = Email.getText() ;
          String MobileNumber = Mobile.getText() ;
          String _PassWord = ChoosePassword.getText() ;
          String PassWord_ = ConfirmPassWord.getText() ;
          if(_PassWord.equals(PassWord_))
          {
               if(_PassWord.length()>=6)
               {
                    RegExCheck rc = new RegExCheck(Email_, MobileNumber) ;
                    if(rc.EmailCheck() && rc.MobileNumberCheck())
                    {
                         CheckingDetails cd = new CheckingDetails(MobileNumber,Email_,_PassWord) ;
                         // we will pass this email and the Mobile Number to the database checking class there
                         // these details will be checked it details are already registerd we will say them they
                         // already registered
                         if(cd.DataBaseMobileChecker() || cd.DataBaseEmailChecker())
                         {
                              JOptionPane.showMessageDialog(this, "Email or Mobile Number is Already Registered");
                         }
                         else
                         {
                            cd.RegistereDetails();
                            HomeForm hf = new HomeForm(MobileNumber) ;
                            hf.setVisible(true);
                            this.dispose();
                         }
                    }
                    else
                    {
                         JOptionPane.showMessageDialog(this, "Email or Mobile Number is Incorrect");
                    }
               }
               else
               {
                    JOptionPane.showMessageDialog(this, "PassWord must be atleast 6 charectors");
               }
          }
          else
          {
               JOptionPane.showMessageDialog(this, "PassWord Doesn't matching");
          }
     }

     private void BackActionPerformed(java.awt.event.ActionEvent evt) {
          LoginForm l = new LoginForm();
          l.setVisible(true);
          this.dispose();
     }

     /**
      * @param args the command line arguments
      */

     // Variables declaration - do not modify
     private javax.swing.JToggleButton Back;
     private javax.swing.JPasswordField ChoosePassword;
     private javax.swing.JPasswordField ConfirmPassWord;
     private javax.swing.JTextField Email;
     private javax.swing.JTextField Mobile;
     private javax.swing.JButton SignUp;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     // End of variables declaration
}
class RegExCheck extends MobileChecks
{
     String Email ;
     String MobileNumber ;
     RegExCheck(String Email,String MobileNumber)
     {
          super(MobileNumber);
          this.Email = Email ;
          this.MobileNumber = MobileNumber ;
     }
     RegExCheck(String Email)
     {
          super(null) ;
          this.Email = Email ;
     }
     public boolean EmailCheck()
     {
          Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
          Matcher m = p.matcher(Email) ;
          return m.matches() ;
     }
}
/*
This is used to check whether the given details or in the database or not
*/
class CheckingDetails extends DetailsCheck {
     String MobileNumber;
     String Email;
     String PassWord;

     CheckingDetails(String MobileNumber, String Email, String PassWord) {
          super(MobileNumber, PassWord);

          this.MobileNumber = MobileNumber;
          this.Email = Email;
          this.PassWord = PassWord;
     }
     CheckingDetails(String Email)
     {
          super(null,null);
          this.Email = Email ;
     }
     /**
      * this function will takes the email and the MobileNumber and checks whether the details are
      * registered or not if the email or the mobile number any of them are registered this function
      * will not register them in to the database and this function will return false  so if this
      * function returns the false we have to show that the email or mobile number is already
      * registered in the jDailog box.
      */
     public void RegistereDetails()
     {
          try
          {
               Class.forName(DataBaseDetails.driver);
               Connection con = DriverManager.getConnection(DataBaseDetails.url, DataBaseDetails.un, DataBaseDetails.pwd);
               Statement st = con.createStatement() ;
               st.executeUpdate("insert into E_BANKINGcREDITIONALS values("+"'"+Email+"'"+","+"'"+MobileNumber+""+"'"+","+"'"+PassWord+"'"+","+"'"+0+"'"+")");
               st.executeUpdate("create table "+MobileNumber+"_AddAccount(Bank varchar(100),CardNumber varchar(100),Cvv varchar(100),Pin varchar(100))") ;
               st.executeUpdate("create table "+MobileNumber+"_cardBalance(CardNumber varchar(100),Pin varchar(100),Balance varchar(100))") ;
               st.executeUpdate("create table "+MobileNumber+"_Transactions(SendedTo varchar(100),ReceviedFrom varchar(100), SendedAmount varchar(100),RecievedAmount varchar(100),CreditedTo varchar(100),Debitedfrom varchar(100))") ;
               st.close();
               con.close();
          } catch (NullPointerException ne) {

               ne.printStackTrace();
          } catch (SQLException sqe) {
               sqe.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }

     }

     public boolean DataBaseMobileChecker() {
          /**
           *  this function will checks the whether the given mobile Number
           *  is present in the database are not . if it is present in the
           *  database then it will return true or else it will return false
           */
          try {
               Class.forName(DataBaseDetails.driver);
               Connection con = DriverManager.getConnection(DataBaseDetails.url, DataBaseDetails.un, DataBaseDetails.pwd);
               PreparedStatement stmt = con.prepareStatement("select * from E_BANKINGcREDITIONALS where" +
                         " MOBILENUMBER=?");
               stmt.setString(1, MobileNumber);
               ResultSet rs = stmt.executeQuery();
               if (rs.next()) {
                    System.out.println("hii");
                    stmt.close();
                    con.close();
                    return true;
               }
               else
               {
                    stmt.close();
                    con.close();
                    return false;
               }
          } catch (NullPointerException ne) {
               ne.printStackTrace();
          } catch (SQLException sqe) {
               sqe.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
          return false;

     }
     public boolean DataBaseEmailChecker() {
          /**
           * this function will checks the Email whether the given Email is exists in the
           * database or not if it doesn't exist it will return false .
           */

          try {
               Class.forName(DataBaseDetails.driver);
               Connection con = DriverManager.getConnection(DataBaseDetails.url, DataBaseDetails.un, DataBaseDetails.pwd);
               PreparedStatement stmt = con.prepareStatement("select * from E_BANKINGcREDITIONALS where" +
                         " EMAIL=?");
               stmt.setString(1, Email);
               ResultSet rs = stmt.executeQuery();
               if (rs.next()) {
                    System.out.println("hii");
                    stmt.close();
                    con.close();
                    return true;
               } else {
                    stmt.close();
                    con.close();
                    return false;
               }

          } catch (NullPointerException ne) {
               ne.printStackTrace();
          } catch (SQLException sqe) {
               sqe.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
          return false;
     }
     public void UpdatePassword(String pwd)
     {

     }
}
