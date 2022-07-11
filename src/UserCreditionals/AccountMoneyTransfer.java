package UserCreditionals;

import java.sql.*;

public class AccountMoneyTransfer
{
     String MobileNumber ; // Mobile Number of the User to add Amount in to his Account
     String CardNumber ;// ur's CardNumber to cut amount from ur Card
     String Amount ; // The Amount that ur are going to transferr
     String MyBalance ;
     AccountMoneyTransfer(String MobileNumber,String CardNumber,String Amount,String MyBalance)
     {
          this.MobileNumber = MobileNumber ;
          this.CardNumber = CardNumber ;
          this.Amount = Amount ;
          this.MyBalance = MyBalance ;
     }
     /**
      This Function will Cut the Amount in our Bank of the CardNumber we
      with draw from .
      */
     public void CutAmount()
     {
         try
         {
            String Table = HomeForm.MobileNumber+"_cardbalance" ;
            String transactions = HomeForm.MobileNumber+"_transactions" ;
            Class.forName(DataBaseDetails.driver) ;
            Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
            Statement st = con.createStatement() ;
            int Myamount = Integer.parseInt(MyBalance) ;
            int cutOffAmount = Myamount - Integer.parseInt(Amount) ;
            st.executeUpdate("Update "+Table+" set Balance="+String.valueOf(cutOffAmount)+" where CardNumber="+CardNumber) ;
            st.executeUpdate("insert into "+transactions+" values ('"+MobileNumber+"'"+","+"'"+"----"+"'"+","+"'"+Amount+"'"+","+"'"+"----'"+","+"'----'"+","+CardNumber+")") ;
           st.close();
           con.close();
         }
         catch (SQLException sql)
         {
         } catch (ClassNotFoundException e) {
              e.printStackTrace();
         }
     }
     /**
      This Function will add the Amount in to the User's Wallet
      */
     public void AddWallet()
     {
          try
          {
               String transactions = MobileNumber+"_transactions" ;
               Class.forName(DataBaseDetails.driver) ;
               Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               Statement st = con.createStatement() ;
               ResultSet rs = st.executeQuery("select * from e_bankingcreditionals where MOBILENUMBER="+MobileNumber) ;
               String WalletAmount = "" ;
               if(rs.next())
               {
                WalletAmount = rs.getString("wallet") ;
               }
               Integer walletamount = Integer.parseInt(WalletAmount) ;
               int TotalWallet = walletamount + Integer.parseInt(Amount) ;
               st.executeUpdate("update e_bankingcreditionals set  wallet="+String.valueOf(TotalWallet)+" where MOBILENUMBER="+MobileNumber) ;
               st.executeUpdate("insert into "+transactions+" values ('"+"----"+"'"+","+"'"+HomeForm.MobileNumber+"'"+","+"'"+"----"+"'"+","+"'"+Amount+"'"+","+"'Wallet'"+","+"'----')") ;
               st.close();
               con.close();
          }
          catch (SQLException sql)
          {
               sql.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }
     /**
      This Function will add the With drawed Amount from the bank
      and directly adds to the User's Bank
      */
     public void AddAmount()
     {

          try
          {
               String table = MobileNumber+"_cardbalance" ;
               String transactions = MobileNumber+"_transactions" ;
               Class.forName(DataBaseDetails.driver) ;
               Connection con = DriverManager.getConnection(DataBaseDetails.url,DataBaseDetails.un,DataBaseDetails.pwd) ;
               Statement st = con.createStatement() ;
               ResultSet rs = st.executeQuery("select * from "+table) ;
               if(rs.next())
               {
                    String balance = rs.getString("Balance") ;
                    String AccountNumber = rs.getString("CardNumber") ;
                    int Balance = Integer.parseInt(balance) ;
                    int Total = Balance + Integer.parseInt(Amount) ;
                    st.executeUpdate("update "+table+" set Balance="+String.valueOf(Total)+" where CardNumber="+AccountNumber) ;
                    st.executeUpdate("insert into "+transactions+" values ('"+"----"+"'"+","+"'"+HomeForm.MobileNumber+"'"+","+"'"+"----"+"'"+","+"'"+Amount+"'"+","+"'"+AccountNumber+"'"+","+"'----')") ;
               }
               /**
                Here , we are getting two conditions if the user didn't have any bank account
                registered with e_banking then automatically it will add to the Wallet...
                */
               else
               {
                    AddWallet();
               }
          }
          catch (SQLException sql)
          {
               sql.printStackTrace();
          } catch (ClassNotFoundException e) {
               e.printStackTrace();
          }
     }
}
