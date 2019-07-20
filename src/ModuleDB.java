
import java.sql.*;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Felix
 */
public class ModuleDB {
    public static int idUser;
    public static String username;
    public static String nama;
    public static String password;
    public static Connection connectDB(){
        String path="jdbc:sqlite:E://projek RPL/StudentMoneyManager/student_money_manager.db";
        Connection con=null;
        try{
            con=DriverManager.getConnection(path);
        }
        catch(SQLException e){
            showMessageDialog(null,"Koneksi ke database gagal!","Error",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}
