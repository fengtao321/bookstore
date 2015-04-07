//Tao Feng
//7603033
//
//Jason Lin
//7560837

package org.mypackage.bookstore;
import java.sql.*;
import java.util.*;

//This class serves as the connection between the library and the database of information it holds
public class DBConnection {

        //instance varables
        private  String DBUrl = "jdbc:mysql://localhost/mylibrary"; //database address
        private  String userName = "root";
        private String password = "root";
        private Connection myConnection;
        private Statement stmt;

    /** Creates a new instance of MyDBConnection with an empty constructor and no parameters required*/
        public DBConnection()
        {

        }

    //creates a new instance of the class that requires the url, username and password
    public DBConnection(String DBUrl, String userName, String passsword )
    {
    this.DBUrl=DBUrl;
    this.userName=userName;
    this.password = passsword;
    }

    //this tests to see if a connection can be established with the database
    //of information that is stored in in MySql
    public void init(){

            stmt = null;

       try{

        Class.forName("com.mysql.jdbc.Driver");
        myConnection=DriverManager.getConnection(DBUrl,userName,password);
        stmt=myConnection.createStatement();
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.println("Failed to get connection");
        }
       return;
    }

    //returns the connection status
    public Connection getMyConnection(){
        return myConnection;
    }

    //returns the statement
    public Statement getMyStatement(){
        return stmt;
    }

    /*search certain item to check if it exists in database, return true, if it is, otherwise, false */

     public boolean searchCertainItem(String itemname, String tableName)
    {
        String selectStr;
        ResultSet rs;
        try{

           selectStr="SELECT "+itemname+" FROM "+tableName;
           rs = stmt.executeQuery(selectStr);

           while (rs.next())
           {
            return true;
           }
        }catch(Exception e){
            System.out.println("Error occurred in searchLogin");
        }

        return false;

    }

        //variation of the above method searchCertainItem with an extra parameter columnName
          public boolean searchCertainItem(String itemname, String tableName, String columnName)
    {
        String selectStr;
        ResultSet rs;
        try{

           selectStr="SELECT "+itemname+" FROM "+tableName+" WHERE "+ columnName+" = "+quotate(itemname);
           rs = stmt.executeQuery(selectStr);

           while (rs.next())
           {
            return true;
           }
        }catch(Exception e){
            System.out.println("Error occurred in searchLogin");
        }

        return false;

    }

        //returns all the information in a certain table
          public ResultSet getAll(String tableName)
          {

        String selectStr;
        ResultSet rs=null;

        try{

           selectStr="SELECT * FROM "+tableName;
           rs = stmt.executeQuery(selectStr);





        }catch(Exception e){
            System.out.println("Error occurred in searchLogin");
        }

              return rs;
          }

        //gets the information stored in a certain row
          public ResultSet getCertainRow(String itemname, String tableName, String columnName)
          {

        String selectStr;
        ResultSet rs=null;
        String itemn="%"+itemname+"%";

        try{

           selectStr="SELECT * FROM "+tableName+" WHERE "+ columnName+" LIKE "+quotate(itemn);
           rs = stmt.executeQuery(selectStr);





        }catch(Exception e){
            System.out.println("Error occurred in searchLogin");
        }

              return rs;
          }


        //gets the information stored in a certain column of the table
           public String getCertainColumn(ResultSet rs, String columnName) throws SQLException
          {
              String result="";
              while (rs.next())
            {

              String temp = rs.getString(columnName);
              result+="<p>"+temp+"</p>";
            }
              return result;
          }

            //delete an entire row of information from the table based on the parameters itemname, tableName, columnName
            public void deleteCertainRow(String itemname, String tableName, String columnName) throws SQLException
            {

                String deletetStr="DELETE FROM "+tableName+" WHERE "+columnName+" = "+quotate(itemname);
                stmt.executeUpdate(deletetStr);
                return;

            }

            //same method as above with extra parameters that split the item and columns into 2 separate variables
            public void deleteCertainRow(String itemname1,String itemname2, String tableName, String columnName1,String columnName2) throws SQLException
            {

                String deletetStr = "DELETE FROM "+tableName+" WHERE "+columnName1+" = "+quotate(itemname1)+"AND "+columnName2+" = "+quotate(itemname2);
                 stmt.executeUpdate(deletetStr);
                return;

            }

            //adds a new row of information about a book to the table
            public void addCertainRow(String bookname, String ISBN, String author, String description,
                    String quantity, String publisher, String category)
            {
                String insertStr;
              try{

            insertStr="INSERT IGNORE INTO material (bookname, ISBN, author, description, quantity, publisher, category) VALUES("
                    +quotate(bookname)+","
                    +quotate(ISBN)+","
                    +quotate(author)+","
                    +quotate(publisher)+","
                    +quotate(quantity)+","
                    +quotate(publisher)+","
                    +quotate(category)
                    +")";

            stmt.executeUpdate(insertStr);

        } catch(Exception e){
            System.out.println("Error occurred in inserting data");
        }
              return;
            }

    //adds a new row of information about a user to the table
      public void addCertainRow(String username, String pin, String information, String role, String hold)
            {
                String insertStr;
              try{

            insertStr="INSERT IGNORE INTO user (username, pin, information, role, hold) VALUES("
                    +quotate(username)+","
                    +quotate(pin)+","
                    +quotate(information)+","
                    +quotate(role)+","
                    +quotate(hold)
                    +")";

            stmt.executeUpdate(insertStr);

        } catch(Exception e){
            System.out.println("Error occurred in inserting data");
        }
              return;
            }

    //adds a new row of information to the table about the books that users have checked out
      public void addCertainRow(String username, String num, String ISBN)
            {
                String insertStr;
                int tempt= (int) (Math.random()*500);
                String random=Integer.toString(tempt);
              try{

            insertStr="INSERT IGNORE INTO borrowlist (username, num, random, ISBN) VALUES("
                    +quotate(username)+","
                    +quotate(num)+","
                    +quotate(random)+","
                    +quotate(ISBN)
                    +")";

            stmt.executeUpdate(insertStr);

        } catch(Exception e){
            System.out.println("Error occurred in inserting data");
        }
              return;
            }

        //sets a new item in the table
        //this refers to either a new book or a new user, and has to be placed at a new specific, unoccupied location in the table
           public void setCertainItem(String title, String tableName,
                   String columnName,String newItemnname) throws SQLException
           {
           ResultSet rs;
           String update="UPDATE "+tableName+" SET "+columnName+" = "+newItemnname+"WHERE title="+title;
           
            stmt.executeUpdate("UPDATE "+tableName+" SET "+columnName+" = "+newItemnname+" WHERE title="+title);
           }







    //closes the database
     public void close(java.sql.Statement stmt){

        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        return;
        }
    }

    //destroys the connection between the user and the database
  public void destroy(){

    if(myConnection !=null){

         try{
               myConnection.close();
            }
            catch(Exception e){
            System.out.println("failed to destroy");
            }


    }
    return;
  }

    //displays the content of the information being accessed
    public String quotate(String content){

        return "'"+content+"'";
    }
}
