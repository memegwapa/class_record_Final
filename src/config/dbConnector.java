
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class dbConnector {
//dbConnector code
public Connection connect;
public dbConnector(){
     
       try{
                connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/class_record", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
        }



//Function to retrieve data
        public ResultSet getData(String sql) throws SQLException{
            java.sql.Statement stmt = connect.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            return rst;
        }
        



//Function to save data

public int insertData(String sql){
    int result;
try{
PreparedStatement pst = connect.prepareStatement(sql);
 pst.executeUpdate();
System.out.println("Inserted Successfully!");
pst.close();
result=1;

}catch(SQLException ex){
System.out.println("Connection Error: "+ex);
result=0;
}
return result;
}



//Function to update data
public void updateData(String sql){
try{
PreparedStatement pst = connect.prepareStatement(sql);
int rowsUpdated = pst.executeUpdate();
if(rowsUpdated > 0){
JOptionPane.showMessageDialog(null, "Data Updated Successfully!");
}else{
System.out.println("Data Update Failed!");
}
pst.close();
}catch(SQLException ex){
System.out.println("Connection Error: "+ex);
}
}



// Function to delete data from the database
public void deleteData(int id, String table) {
    try {
        String deleteQuery = "";
        switch (table) {
            case "tbl_grades":
                deleteQuery = "DELETE FROM tbl_grades WHERE g_id = ?";
                break;
            case "tbl_studentlists":
                deleteQuery = "DELETE FROM tbl_studentlists WHERE s_id = ?";
                break;
            case "tbl_subject":
                deleteQuery = "DELETE FROM tbl_subjects WHERE c_id = ?";
                break;
            default:
                System.out.println("Invalid table name for deletion.");
                return;
        }

        PreparedStatement pst = connect.prepareStatement(deleteQuery);
        pst.setInt(1, id);

        int rowsDeleted = pst.executeUpdate();

        if (rowsDeleted > 0) {
            JOptionPane.showMessageDialog(null, "Deleted Successfully!");
        } else {
            System.out.println("Deletion Failed!");
        }

        pst.close();
    } catch (SQLException ex) {
        System.out.println("Connection Error: " + ex.getMessage());
    }
}






 // Function to check the existence of a record
    public boolean checkExistence(String query) {
        boolean exists = false;
        try {
            PreparedStatement pst = connect.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                exists = rs.getInt(1) > 0;
            }
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            System.out.println("Connection Error: " + ex);
        }
        return exists;
    }

    // Add a method to check if s_id and c_id exist in the database
public boolean checkExistence(String table, String column, String value) {
    try {
        String query = "SELECT COUNT(*) FROM " + table + " WHERE " + column + " = ?";
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setString(1, value);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0; // Return true if the value exists in the table
        }
    } catch (SQLException ex) {
        System.out.println("Connection Error: " + ex);
    }
    return false; // Return false if an error occurs or the value does not exist
}

  private void displaySearchResults(ResultSet resultSet) {
    try {
        // Example: Displaying search results in a JOptionPane message dialog
        StringBuilder message = new StringBuilder("Search Results:\n");
        while (resultSet.next()) {
            // Assuming you want to display data from the 'name' column
            String name = resultSet.getString("name");
            message.append(name).append("\n");
        }
        JOptionPane.showMessageDialog(null, message.toString());
    } catch (SQLException ex) {
        System.out.println("Error displaying search results: " + ex.getMessage());
    }
}

public ResultSet searchData(String table, String searchTerm) {
    ResultSet resultSet = null;
    try {
        // Construct the SQL query to search for data in the specified table based on a valid column
        // Replace 'valid_column_name' with the actual column name you want to search in
        String sql = "SELECT * FROM " + table + "tbl_grades ?";
        
        // Create a PreparedStatement object to execute the query
        PreparedStatement pst = connect.prepareStatement(sql);
        
        // Set the parameter value for the search term
        pst.setString(1, "%" + searchTerm + "%");
        
        // Execute the query and retrieve the results
        resultSet = pst.executeQuery();
    } catch (SQLException ex) {
        System.out.println("Error searching data: " + ex.getMessage());
    }
    return resultSet;
}
  public int countRows(String table) {
        int rowCount = 0;
        try {
            String sql = "SELECT COUNT(*) AS row_count FROM " + table;
            PreparedStatement pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                rowCount = rs.getInt("row_count");
            }
            rs.close();
            pst.close();
        } catch (SQLException ex) {
            System.out.println("Error counting rows: " + ex.getMessage());
        }
        return rowCount;
    }
 public String getUserType(int userId) {
        try {
            // Assuming you have a connection object named 'connection'
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT u_type FROM tbl_user WHERE u_id = " + userId);

            if (rs.next()) {
                return rs.getString("u_type");
            } else {
                return null; // User not found
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null; // Error occurred
        }
    }
 public class DatabaseHandler {
    
    // Assuming connect is your database connection object
    private Connection connect;

    // Constructor to initialize the connection
    public DatabaseHandler() {
        // Initialize the database connection
        connect = initializeDatabaseConnection();
    }

    // Method to initialize database connection
    private Connection initializeDatabaseConnection() {
        Connection connection = null;
        // Your code to initialize the database connection
        return connection;
    }
 }
 public void retrieveSubject(int courseId) {
    try {
        String query = "SELECT * FROM tbl_subjects WHERE c_id = ?";
        PreparedStatement pst = connect.prepareStatement(query);
        pst.setInt(1, courseId);
        ResultSet rs = pst.executeQuery();

        // Check if any subjects are found with the given c_id
        if (rs.next()) {
            // Loop through the result set to display all matching subjects
            do {
                int sId = rs.getInt("s_id");
                int uId = rs.getInt("u_id");
                String sName = rs.getString("s_name");
                String sTeacher = rs.getString("s_Teacher");
                String sSchedule = rs.getString("s_schedule");

                System.out.println("Subject ID: " + sId);
                System.out.println("Unit ID: " + uId);
                System.out.println("Subject Name: " + sName);
                System.out.println("Teacher: " + sTeacher);
                System.out.println("Schedule: " + sSchedule);
                System.out.println("-------------------------");
            } while (rs.next());
        } else {
            System.out.println("No subjects found for the entered c_id.");
        }

        rs.close();
        pst.close();
    } catch (SQLException ex) {
        System.out.println("Error retrieving subjects: " + ex.getMessage());
    }
}
  

}

