/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internetcafemanagementsystem;
import java.awt.CardLayout;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.Connection;
import net.proteanit.sql.DbUtils;
import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author Gee
 */

public class main extends javax.swing.JFrame {
    Connection c = Conection.getConnection();

    
    Login login;

    /**
     * Creates new form main
     */
    int hour,min ,sec,tranferhour,tranfermin,tranfersec,customernumber;
    int hour2,min2,sec2;
    int hour3,min3,sec3;
    int hour4,min4,sec4;
    int hour5,min5,sec5;
    int hour6,min6,sec6;
    int hour7,min7,sec7;
    int hour8,min8,sec8;
    int hour9,min9,sec9;
    int hour10,min10,sec10;
    int hour11,min11,sec11;
    int hour12,min12,sec12;
    int hour13,min13,sec13;
    int hour14,min14,sec14;
    int hour15,min15,sec15;
    int hour16,min16,sec16;
    int hour17,min17,sec17;
    int hour18,min18,sec18;
    int hour19,min19,sec19;
    int hour20,min20,sec20;
    int hour21,min21,sec21;
    int hour22,min22,sec22;
    int hour23,min23,sec23;
    int hour24,min24,sec24;
    int hour25,min25,sec25;
    int hour26,min26,sec26;
    int hour27,min27,sec27;
    int hour28,min28,sec28;
    int hour29,min29,sec29;
    int hour30,min30,sec30;
    int stophour,stopmin,stopsec;
    int stophour2,stopmin2,stopsec2;
    int stophour3,stopmin3,stopsec3;
    int stophour4,stopmin4,stopsec4;
    int stophour5,stopmin5,stopsec5;
    int stophour6,stopmin6,stopsec6;
    int stophour7,stopmin7,stopsec7;
    int stophour8,stopmin8,stopsec8;
    int stophour9,stopmin9,stopsec9;
    int stophour10,stopmin10,stopsec10;
    int stophour11,stopmin11,stopsec11;
    int stophour12,stopmin12,stopsec12;
    int stophour13,stopmin13,stopsec13;
    int stophour14,stopmin14,stopsec14;
    int stophour15,stopmin15,stopsec15;
    int stophour16,stopmin16,stopsec16;
    int stophour17,stopmin17,stopsec17;
    int stophour18,stopmin18,stopsec18;
    int stophour19,stopmin19,stopsec19;
    int stophour20,stopmin20,stopsec20;
    int stophour21,stopmin21,stopsec21;
    int stophour22,stopmin22,stopsec22;
    int stophour23,stopmin23,stopsec23;
    int stophour24,stopmin24,stopsec24;
    int stophour25,stopmin25,stopsec25;
    int stophour26,stopmin26,stopsec26;
    int stophour27,stopmin27,stopsec27;
    int stophour28,stopmin28,stopsec28;
    int stophour29,stopmin29,stopsec29;
    int stophour30,stopmin30,stopsec30;
//    \\Users\\Gee\\Documents\\NetBeansProjects\\InternetCafeManagementSystem\\src
    Icon using = new ImageIcon("C:\\icon\\usecomputer.png");
    Icon repair = new ImageIcon("C:\\icon\\gear.png");
    Icon available = new ImageIcon("C:\\icon\\computer.png");
    Icon broken = new ImageIcon("C:\\icon\\broken.png");
    Icon stopimage = new ImageIcon("C:\\icon\\stop.png");
    Icon date = new ImageIcon("C:\\icon\\calendar.png");
    Icon idcard = new ImageIcon("C:\\icon\\id-card.png");
    Icon profit = new ImageIcon("C:\\icon\\profit.png");
    Icon name = new ImageIcon("C:\\icon\\name.png");
    Icon phone1 = new ImageIcon("C:\\icon\\telephone.png");
    Icon email1 = new ImageIcon("C:\\icon\\gmail.png");
    Icon address1 = new ImageIcon("C:\\icon\\address.png");
    Icon user1 = new ImageIcon("C:\\icon\\user.png");
    Icon password1 = new ImageIcon("C:\\icon\\password.png");
    Icon staff = new ImageIcon("C:\\icon\\staff.png");
    Icon order = new ImageIcon("C:\\icon\\order.png");
    Icon h = new ImageIcon("C:\\icon\\clock.png");
    Icon m = new ImageIcon("C:\\icon\\coin.png");
    Icon monitor = new ImageIcon("C:\\icon\\monitor.png");
    Icon com = new ImageIcon("C:\\icon\\c.png");
    Icon cpu = new ImageIcon("C:\\icon\\cpu.png");
    Icon mouse = new ImageIcon("C:\\icon\\mouse.png");
    Icon gc = new ImageIcon("C:\\icon\\gc.png");
    Icon passwordadmin = new ImageIcon("C:\\icon\\pss.png");
    Icon useradmin = new ImageIcon("C:\\useradmin.png");
    Icon manid = new ImageIcon("C:\\icon\\man.png");
    Icon age = new ImageIcon("C:\\icon\\age.png");
    Icon gender1 = new ImageIcon("C:\\icon\\sex.png");
    String stopname;
    Timer timer,timer2,timer3,timer4,timer5,timer6,timer7,timer8,timer9,timer10,timer11,timer12,timer13,timer14,timer15,
            timer16,timer17,timer18,timer19,timer20,timer21,timer22,timer23,timer24,timer25,timer26,timer27,timer28,timer29,timer30;
    boolean ifStop = false;
    boolean ifStop2 = false;
    boolean ifStop3 = false;
    boolean ifStop4 = false;
    boolean ifStop5 = false;
    boolean ifStop6 = false;
    boolean ifStop7 = false;
    boolean ifStop8 = false;
    boolean ifStop9 = false;
    boolean ifStop10 = false;
    boolean ifStop11 = false;
    boolean ifStop12 = false;
    boolean ifStop13 = false;
    boolean ifStop14 = false;
    boolean ifStop15 = false;
    boolean ifStop16 = false;
    boolean ifStop17 = false;
    boolean ifStop18 = false;
    boolean ifStop19 = false;
    boolean ifStop20 = false;
    boolean ifStop21 = false;
    boolean ifStop22 = false;
    boolean ifStop23 = false;
    boolean ifStop24 = false;
    boolean ifStop25 = false;
    boolean ifStop26 = false;
    boolean ifStop27 = false;
    boolean ifStop28 = false;
    boolean ifStop29 = false;
    boolean ifStop30 = false;
    boolean ifTranfer = false;
    public main() {
        initComponents();
        c1 = (CardLayout) Jmain.getLayout();
        nameadmin.setText(Name);
        nameadmin1.setText(Name);
        nameadmin2.setText(Name);
        nameadmin3.setText(Name);
        nameadmin4.setText(Name);
        nameadmin5.setText(Name);
        nameadmin6.setText(Name);
        nameadmin7.setText(Name);
        nameadmin8.setText(Name);
        

    }
    public static String Name;

        public void statusComputer1(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 1";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status1.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }
                public void statusComputer2(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 2";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status2.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }
            public void statusComputer3(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 3";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status3.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }
            public void statusComputer4(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 4";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status4.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }
             public void statusComputer5(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 5";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status5.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }
            public void statusComputer6(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 6";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status6.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
            }
            public void statusComputer7(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 7";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status7.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }
            public void statusComputer8(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 8";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status8.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }
            public void statusComputer9(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 9";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status9.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }
                public void statusComputer10(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 10";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status10.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }
                public void statusComputer11(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 11";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status11.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer12(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 12";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status12.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer13(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 13";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status13.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer14(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 14";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status14.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer15(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 15";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status15.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer16(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 16";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status16.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer17(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 17";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status17.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer18(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 18";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status18.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer19(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 19";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status19.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer20(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 20";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status20.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer21(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 21";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status21.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer22(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 22";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status22.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer23(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 23";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status23.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer24(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 24";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status24.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer25(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 25";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status25.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer26(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 26";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status26.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer27(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 27";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status27.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer28(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 28";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status28.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer29(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 29";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status29.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }   public void statusComputer30(){
             try{
               String sql = "SELECT Status FROM computers WHERE ComputerID = 30";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("Status");
                status30.setText(""+rs.getString("Status"));
                }catch (Exception e) {e.printStackTrace();}
        }                                
                
        public void Updatecomputer1(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 1";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status1.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer2(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 2";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status2.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer3(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 3";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status3.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer4(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 4";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status4.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer5(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 5";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status5.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer6(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 6";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status6.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer7(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 7";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status7.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer8(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 8";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status8.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer9(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 9";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status9.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
           public void Updatecomputer10(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 10";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status10.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer11(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 11";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status11.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer12(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 12";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status12.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer13(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 13";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status13.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }   public void Updatecomputer14(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 14";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status14.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }   public void Updatecomputer15(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 15";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status15.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }   public void Updatecomputer16(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 16";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status16.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer17(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 17";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status17.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer18(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 18";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status18.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer19(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 19";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status19.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer20(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 20";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status20.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer21(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 21";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status21.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer22(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 22";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status22.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer23(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 23";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status23.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer24(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 24";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status24.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer25(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 25";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status25.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer26(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 26";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status26.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer27(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 27";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status27.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer28(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 28";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status28.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer29(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 29";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status29.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
            public void Updatecomputer30(){
            try{
            String sql = "UPDATE `computers` SET `Status`= ? WHERE ComputerID = 30";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, status30.getText());
            stmt.execute();             
           }catch (Exception e) {e.printStackTrace();}
        }
        public void calCulate(){
            price = Double.parseDouble(Jtprice.getText());
            getmoney = Double.parseDouble(Jtgetmoney.getText());
            change = getmoney - price;
            if(getmoney < price){
             JOptionPane.showMessageDialog(null, "จำนวณเงินไม่เพียงพอ","ERROR",JOptionPane.ERROR_MESSAGE);
             JOptionPane.showMessageDialog(null, "กรุณารับจำนวณเงินใหม่","Info",JOptionPane.INFORMATION_MESSAGE);}
        }
            public void showTable2(){
        try{
              
                String sql = "SELECT MAX(CustomerID) AS CustomerID FROM customers LIMIT 1";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("CustomerID");
                customernumber = Integer.parseInt(rs.getString("CustomerID"));
                
           }catch(Exception e){e.printStackTrace();}
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Jmain = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        nameadmin = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        JRegister = new javax.swing.JPanel();
        สมัครสมาชิก = new javax.swing.JLabel();
        LName = new javax.swing.JLabel();
        Llastname = new javax.swing.JLabel();
        Ltel = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Aaddress = new javax.swing.JTextArea();
        tname = new javax.swing.JTextField();
        tlastname = new javax.swing.JTextField();
        ttel = new javax.swing.JTextField();
        temail = new javax.swing.JTextField();
        Bregister = new javax.swing.JButton();
        lusernam = new javax.swing.JLabel();
        lpassword = new javax.swing.JLabel();
        tusername = new javax.swing.JTextField();
        tpassword = new javax.swing.JTextField();
        lcustomerid = new javax.swing.JLabel();
        tcustomerID = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nameadmin6 = new javax.swing.JLabel();
        jLabel149 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        Llastname1 = new javax.swing.JLabel();
        tage = new javax.swing.JTextField();
        Ltel1 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        regisID = new javax.swing.JPanel();
        lcustomerid1 = new javax.swing.JLabel();
        tcustomerID1 = new javax.swing.JTextField();
        lusernam1 = new javax.swing.JLabel();
        tusername1 = new javax.swing.JTextField();
        lpassword1 = new javax.swing.JLabel();
        tpassword1 = new javax.swing.JTextField();
        สมัครสมาชิก1 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        Bregister1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtfindname = new javax.swing.JTextField();
        findname = new javax.swing.JButton();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        nameadmin5 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        JRpayment = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Jluserid = new javax.swing.JLabel();
        Jtusername = new javax.swing.JTextField();
        Jtuserid = new javax.swing.JTextField();
        JtcustomerId = new javax.swing.JTextField();
        Jluser = new javax.swing.JLabel();
        jlcustomerid = new javax.swing.JLabel();
        Jlhour = new javax.swing.JLabel();
        Jlprice = new javax.swing.JLabel();
        Jtprice = new javax.swing.JTextField();
        Jlgetmoney = new javax.swing.JLabel();
        Jtgetmoney = new javax.swing.JTextField();
        Jlchange = new javax.swing.JLabel();
        Jtchange = new javax.swing.JTextField();
        jbox1 = new javax.swing.JComboBox<>();
        jbpayment = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jbclear = new javax.swing.JButton();
        Jlusername = new javax.swing.JLabel();
        Jtfind = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtreceipt = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        Jbfind = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtlastname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jjong = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        nameadmin1 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        JReservations = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        photo1 = new javax.swing.JLabel();
        photo2 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        nextpage2 = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();
        cusernam1 = new javax.swing.JLabel();
        lhour1 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        lmin1 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        lsec1 = new javax.swing.JLabel();
        jbstart1 = new javax.swing.JButton();
        Stop1 = new javax.swing.JButton();
        transfer1 = new javax.swing.JButton();
        clear1 = new javax.swing.JButton();
        lhour2 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        lmin2 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lsec2 = new javax.swing.JLabel();
        Stop2 = new javax.swing.JButton();
        jbstart2 = new javax.swing.JButton();
        transfer2 = new javax.swing.JButton();
        status2 = new javax.swing.JLabel();
        cusernam2 = new javax.swing.JLabel();
        clear2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        photo3 = new javax.swing.JLabel();
        lhour3 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        lmin3 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        lsec3 = new javax.swing.JLabel();
        Stop3 = new javax.swing.JButton();
        jbstart3 = new javax.swing.JButton();
        transfer3 = new javax.swing.JButton();
        clear3 = new javax.swing.JButton();
        cusernam3 = new javax.swing.JLabel();
        status3 = new javax.swing.JLabel();
        photo4 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jbstart4 = new javax.swing.JButton();
        Stop4 = new javax.swing.JButton();
        lhour4 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        lmin4 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        lsec4 = new javax.swing.JLabel();
        transfer4 = new javax.swing.JButton();
        clear4 = new javax.swing.JButton();
        cusernam4 = new javax.swing.JLabel();
        status4 = new javax.swing.JLabel();
        photo5 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lhour5 = new javax.swing.JLabel();
        jbstart5 = new javax.swing.JButton();
        Stop5 = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        lmin5 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        lsec5 = new javax.swing.JLabel();
        transfer5 = new javax.swing.JButton();
        clear5 = new javax.swing.JButton();
        cusernam5 = new javax.swing.JLabel();
        status5 = new javax.swing.JLabel();
        photo6 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lhour6 = new javax.swing.JLabel();
        jbstart6 = new javax.swing.JButton();
        Stop6 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        lmin6 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lsec6 = new javax.swing.JLabel();
        transfer6 = new javax.swing.JButton();
        clear6 = new javax.swing.JButton();
        cusernam6 = new javax.swing.JLabel();
        status6 = new javax.swing.JLabel();
        photo7 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        lhour7 = new javax.swing.JLabel();
        jbstart7 = new javax.swing.JButton();
        Stop7 = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        lmin7 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        lsec7 = new javax.swing.JLabel();
        transfer7 = new javax.swing.JButton();
        clear7 = new javax.swing.JButton();
        cusernam7 = new javax.swing.JLabel();
        status7 = new javax.swing.JLabel();
        photo8 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        lhour8 = new javax.swing.JLabel();
        jbstart8 = new javax.swing.JButton();
        Stop8 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        lmin8 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        lsec8 = new javax.swing.JLabel();
        transfer8 = new javax.swing.JButton();
        clear8 = new javax.swing.JButton();
        cusernam8 = new javax.swing.JLabel();
        status8 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        photo9 = new javax.swing.JLabel();
        lhour9 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        lmin9 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        lsec9 = new javax.swing.JLabel();
        Stop9 = new javax.swing.JButton();
        jbstart9 = new javax.swing.JButton();
        transfer9 = new javax.swing.JButton();
        clear9 = new javax.swing.JButton();
        cusernam9 = new javax.swing.JLabel();
        status9 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        photo10 = new javax.swing.JLabel();
        lhour10 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        lmin10 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        lsec10 = new javax.swing.JLabel();
        Stop10 = new javax.swing.JButton();
        jbstart10 = new javax.swing.JButton();
        transfer10 = new javax.swing.JButton();
        clear10 = new javax.swing.JButton();
        cusernam10 = new javax.swing.JLabel();
        status10 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        photo11 = new javax.swing.JLabel();
        lhour11 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        lmin11 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        lsec11 = new javax.swing.JLabel();
        Stop11 = new javax.swing.JButton();
        jbstart11 = new javax.swing.JButton();
        transfer11 = new javax.swing.JButton();
        clear11 = new javax.swing.JButton();
        cusernam11 = new javax.swing.JLabel();
        status11 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        photo12 = new javax.swing.JLabel();
        lhour12 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        lmin12 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        lsec12 = new javax.swing.JLabel();
        Stop12 = new javax.swing.JButton();
        jbstart12 = new javax.swing.JButton();
        transfer12 = new javax.swing.JButton();
        clear12 = new javax.swing.JButton();
        cusernam12 = new javax.swing.JLabel();
        status12 = new javax.swing.JLabel();
        iconstop1 = new javax.swing.JLabel();
        iconstop2 = new javax.swing.JLabel();
        iconstop3 = new javax.swing.JLabel();
        iconstop4 = new javax.swing.JLabel();
        iconstop5 = new javax.swing.JLabel();
        iconstop6 = new javax.swing.JLabel();
        iconstop7 = new javax.swing.JLabel();
        iconstop8 = new javax.swing.JLabel();
        iconstop9 = new javax.swing.JLabel();
        iconstop10 = new javax.swing.JLabel();
        iconstop11 = new javax.swing.JLabel();
        iconstop12 = new javax.swing.JLabel();
        nameadmin2 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        timepage1 = new javax.swing.JButton();
        jLabel154 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        computerpage2 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        iconstop13 = new javax.swing.JLabel();
        photo13 = new javax.swing.JLabel();
        lhour13 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        lmin13 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        lsec13 = new javax.swing.JLabel();
        Stop13 = new javax.swing.JButton();
        jbstart13 = new javax.swing.JButton();
        transfer13 = new javax.swing.JButton();
        clear13 = new javax.swing.JButton();
        cusernam13 = new javax.swing.JLabel();
        status13 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        photo14 = new javax.swing.JLabel();
        iconstop14 = new javax.swing.JLabel();
        lmin14 = new javax.swing.JLabel();
        lhour14 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jbstart14 = new javax.swing.JButton();
        Stop14 = new javax.swing.JButton();
        jLabel74 = new javax.swing.JLabel();
        lsec14 = new javax.swing.JLabel();
        transfer14 = new javax.swing.JButton();
        clear14 = new javax.swing.JButton();
        cusernam14 = new javax.swing.JLabel();
        status14 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        iconstop15 = new javax.swing.JLabel();
        photo15 = new javax.swing.JLabel();
        lhour15 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        lmin15 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        lsec15 = new javax.swing.JLabel();
        jbstart15 = new javax.swing.JButton();
        Stop15 = new javax.swing.JButton();
        transfer15 = new javax.swing.JButton();
        clear15 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jbstart16 = new javax.swing.JButton();
        Stop16 = new javax.swing.JButton();
        lhour16 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        lmin16 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        lsec16 = new javax.swing.JLabel();
        clear16 = new javax.swing.JButton();
        transfer16 = new javax.swing.JButton();
        photo16 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        iconstop16 = new javax.swing.JLabel();
        status16 = new javax.swing.JLabel();
        cusernam16 = new javax.swing.JLabel();
        iconstop17 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        photo17 = new javax.swing.JLabel();
        lmin17 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        lhour17 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        lsec17 = new javax.swing.JLabel();
        Stop17 = new javax.swing.JButton();
        jbstart17 = new javax.swing.JButton();
        transfer17 = new javax.swing.JButton();
        clear17 = new javax.swing.JButton();
        cusernam17 = new javax.swing.JLabel();
        status17 = new javax.swing.JLabel();
        status15 = new javax.swing.JLabel();
        cusernam15 = new javax.swing.JLabel();
        photo18 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        iconstop18 = new javax.swing.JLabel();
        lhour18 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        lmin18 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        lsec18 = new javax.swing.JLabel();
        jbstart18 = new javax.swing.JButton();
        Stop18 = new javax.swing.JButton();
        transfer18 = new javax.swing.JButton();
        clear18 = new javax.swing.JButton();
        cusernam18 = new javax.swing.JLabel();
        status18 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        photo19 = new javax.swing.JLabel();
        iconstop19 = new javax.swing.JLabel();
        lhour19 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        lmin19 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        lsec19 = new javax.swing.JLabel();
        jbstart19 = new javax.swing.JButton();
        Stop19 = new javax.swing.JButton();
        transfer19 = new javax.swing.JButton();
        clear19 = new javax.swing.JButton();
        cusernam19 = new javax.swing.JLabel();
        status19 = new javax.swing.JLabel();
        jbstart20 = new javax.swing.JButton();
        Stop20 = new javax.swing.JButton();
        lhour20 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        lmin20 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        lsec20 = new javax.swing.JLabel();
        transfer20 = new javax.swing.JButton();
        clear20 = new javax.swing.JButton();
        cusernam20 = new javax.swing.JLabel();
        status20 = new javax.swing.JLabel();
        photo20 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        iconstop20 = new javax.swing.JLabel();
        jbstart21 = new javax.swing.JButton();
        Stop21 = new javax.swing.JButton();
        transfer21 = new javax.swing.JButton();
        clear21 = new javax.swing.JButton();
        lsec21 = new javax.swing.JLabel();
        lmin21 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        lhour21 = new javax.swing.JLabel();
        photo21 = new javax.swing.JLabel();
        iconstop21 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        status21 = new javax.swing.JLabel();
        cusernam21 = new javax.swing.JLabel();
        jbstart22 = new javax.swing.JButton();
        Stop22 = new javax.swing.JButton();
        transfer22 = new javax.swing.JButton();
        clear22 = new javax.swing.JButton();
        lsec22 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        lmin22 = new javax.swing.JLabel();
        lhour22 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        photo22 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        iconstop22 = new javax.swing.JLabel();
        status22 = new javax.swing.JLabel();
        cusernam22 = new javax.swing.JLabel();
        jbstart23 = new javax.swing.JButton();
        Stop23 = new javax.swing.JButton();
        transfer23 = new javax.swing.JButton();
        clear23 = new javax.swing.JButton();
        lsec23 = new javax.swing.JLabel();
        lmin23 = new javax.swing.JLabel();
        lhour23 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        photo23 = new javax.swing.JLabel();
        iconstop23 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        status23 = new javax.swing.JLabel();
        cusernam23 = new javax.swing.JLabel();
        jbstart24 = new javax.swing.JButton();
        Stop24 = new javax.swing.JButton();
        transfer24 = new javax.swing.JButton();
        clear24 = new javax.swing.JButton();
        lsec24 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        lmin24 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        lhour24 = new javax.swing.JLabel();
        photo24 = new javax.swing.JLabel();
        iconstop24 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        status24 = new javax.swing.JLabel();
        cusernam24 = new javax.swing.JLabel();
        backpage1 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        nextpage3 = new javax.swing.JLabel();
        nameadmin7 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        timepage2 = new javax.swing.JButton();
        jLabel153 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        computerpage3 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        iconstop25 = new javax.swing.JLabel();
        photo25 = new javax.swing.JLabel();
        lhour25 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        lmin25 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        lsec25 = new javax.swing.JLabel();
        Stop25 = new javax.swing.JButton();
        jbstart25 = new javax.swing.JButton();
        transfer25 = new javax.swing.JButton();
        clear25 = new javax.swing.JButton();
        cusernam25 = new javax.swing.JLabel();
        status25 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        photo26 = new javax.swing.JLabel();
        iconstop26 = new javax.swing.JLabel();
        lmin26 = new javax.swing.JLabel();
        lhour26 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jbstart26 = new javax.swing.JButton();
        Stop26 = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        lsec26 = new javax.swing.JLabel();
        transfer26 = new javax.swing.JButton();
        clear26 = new javax.swing.JButton();
        cusernam26 = new javax.swing.JLabel();
        status26 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        iconstop27 = new javax.swing.JLabel();
        photo27 = new javax.swing.JLabel();
        lhour27 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        lmin27 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        lsec27 = new javax.swing.JLabel();
        jbstart27 = new javax.swing.JButton();
        Stop27 = new javax.swing.JButton();
        transfer27 = new javax.swing.JButton();
        clear27 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jbstart28 = new javax.swing.JButton();
        Stop28 = new javax.swing.JButton();
        lhour28 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        lmin28 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        lsec28 = new javax.swing.JLabel();
        clear28 = new javax.swing.JButton();
        transfer28 = new javax.swing.JButton();
        photo28 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        iconstop28 = new javax.swing.JLabel();
        status28 = new javax.swing.JLabel();
        cusernam28 = new javax.swing.JLabel();
        iconstop29 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        photo29 = new javax.swing.JLabel();
        lmin29 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        lhour29 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        lsec29 = new javax.swing.JLabel();
        Stop29 = new javax.swing.JButton();
        jbstart29 = new javax.swing.JButton();
        transfer29 = new javax.swing.JButton();
        clear29 = new javax.swing.JButton();
        cusernam29 = new javax.swing.JLabel();
        status29 = new javax.swing.JLabel();
        status27 = new javax.swing.JLabel();
        cusernam27 = new javax.swing.JLabel();
        photo30 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        iconstop30 = new javax.swing.JLabel();
        lhour30 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        lmin30 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        lsec30 = new javax.swing.JLabel();
        jbstart30 = new javax.swing.JButton();
        Stop30 = new javax.swing.JButton();
        transfer30 = new javax.swing.JButton();
        clear30 = new javax.swing.JButton();
        cusernam30 = new javax.swing.JLabel();
        status30 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        backpage3 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        nameadmin4 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        timepage3 = new javax.swing.JButton();
        jLabel143 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        dataadmin = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        textname = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        excel = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        iconphoto = new javax.swing.JLabel();
        findname1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        nameadmin3 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        deleteupdate = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        excel1 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        update1 = new javax.swing.JTextField();
        update2 = new javax.swing.JTextField();
        update3 = new javax.swing.JTextField();
        update4 = new javax.swing.JTextField();
        update5 = new javax.swing.JTextField();
        update6 = new javax.swing.JTextField();
        update7 = new javax.swing.JTextField();
        update8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        update9 = new javax.swing.JTextArea();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t3 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        p8 = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        updatedata = new javax.swing.JButton();
        deletedata = new javax.swing.JButton();
        nameadmin8 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        p10 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        update10 = new javax.swing.JTextField();
        t11 = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        update11 = new javax.swing.JTextField();
        t12 = new javax.swing.JLabel();
        jsex = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Main = new javax.swing.JMenu();
        Register = new javax.swing.JMenu();
        newregister = new javax.swing.JMenu();
        registerID = new javax.swing.JMenu();
        registpayment = new javax.swing.JMenu();
        Reservations = new javax.swing.JMenu();
        Admin = new javax.swing.JMenu();
        dataanalysis = new javax.swing.JMenu();
        selectupdatedelete = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        exit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("main");
        setUndecorated(true);
        setResizable(false);

        Jmain.setLayout(new java.awt.CardLayout());

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(null);

        nameadmin.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        nameadmin.setForeground(new java.awt.Color(0, 255, 0));
        nameadmin.setText(".");
        nameadmin.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameadminAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel5.add(nameadmin);
        nameadmin.setBounds(137, 719, 80, 28);

        jLabel152.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setText("Admin :");
        jPanel5.add(jLabel152);
        jLabel152.setBounds(27, 719, 94, 28);

        jLabel155.setFont(new java.awt.Font("TH SarabunIT๙", 3, 36)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel155.setText("ยินดีต้อนรับสู่ NET' CAFE'");
        jPanel5.add(jLabel155);
        jLabel155.setBounds(372, 39, 354, 80);

        jLabel156.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel156.setText("DEVELOP BY GUS");
        jPanel5.add(jLabel156);
        jLabel156.setBounds(790, 60, 160, 40);

        jLabel157.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel157.setText("ลูกค้าที่ไม่เป็นสมาชิก");
        jPanel5.add(jLabel157);
        jLabel157.setBounds(630, 170, 315, 40);

        jLabel159.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel159.setText("ค่าบริการต่อชั่วโมง 15 บาท");
        jPanel5.add(jLabel159);
        jLabel159.setBounds(680, 230, 220, 30);

        jLabel165.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cat.gif"))); // NOI18N
        jPanel5.add(jLabel165);
        jLabel165.setBounds(270, 20, 130, 120);

        jLabel163.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/giphy.gif"))); // NOI18N
        jPanel5.add(jLabel163);
        jLabel163.setBounds(0, 450, 150, 270);

        jLabel166.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setText("ส่วนลดค่าบริการต่อชั่วโมง  10    บาท\n\n      \n\n");
        jPanel5.add(jLabel166);
        jLabel166.setBounds(100, 230, 290, 30);

        jLabel161.setBackground(new java.awt.Color(255, 255, 255));
        jLabel161.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel161.setText("โปรโมชั่นสำหรับลูกค้าที่เป็นสมาชิก");
        jPanel5.add(jLabel161);
        jLabel161.setBounds(80, 170, 315, 40);

        jLabel162.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel162.setText("Database : Mysql");
        jPanel5.add(jLabel162);
        jLabel162.setBounds(720, 780, 160, 40);

        jLabel164.setBackground(new java.awt.Color(255, 255, 255));
        jLabel164.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel164.setText("NET' CAFE' VERSION 1.0");
        jPanel5.add(jLabel164);
        jLabel164.setBounds(720, 660, 220, 40);

        jLabel172.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel172.setText("Developed : Java language");
        jPanel5.add(jLabel172);
        jLabel172.setBounds(720, 740, 250, 40);

        jLabel173.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel173.setForeground(new java.awt.Color(255, 255, 255));
        jLabel173.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel173.setText("Programs : NetBeans IDE version 8.2");
        jPanel5.add(jLabel173);
        jLabel173.setBounds(720, 700, 340, 40);

        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gus2.jpg"))); // NOI18N
        jPanel5.add(jLabel160);
        jLabel160.setBounds(960, 0, 150, 150);

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mysql.png"))); // NOI18N
        jPanel5.add(jLabel174);
        jLabel174.setBounds(890, 780, 32, 40);

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/netbeans_94416.png"))); // NOI18N
        jPanel5.add(jLabel175);
        jLabel175.setBounds(1070, 700, 32, 40);

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/java.png"))); // NOI18N
        jPanel5.add(jLabel176);
        jLabel176.setBounds(980, 740, 32, 40);

        Jmain.add(jPanel5, "card11");

        JRegister.setBackground(new java.awt.Color(255, 204, 204));

        สมัครสมาชิก.setFont(new java.awt.Font("TH SarabunIT๙", 1, 36)); // NOI18N
        สมัครสมาชิก.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        สมัครสมาชิก.setText("สมัครสมาชิก");

        LName.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        LName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LName.setText("ชื่อ");

        Llastname.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Llastname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Llastname.setText("นามสกุล");

        Ltel.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Ltel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ltel.setText("เบอร์โทร");

        email.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        email.setText("อีเมล");

        address.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setText("ที่อยู่");

        Aaddress.setColumns(20);
        Aaddress.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Aaddress.setRows(5);
        jScrollPane1.setViewportView(Aaddress);

        tname.setFont(new java.awt.Font("TH SarabunIT๙", 0, 24)); // NOI18N

        tlastname.setFont(new java.awt.Font("TH SarabunIT๙", 0, 24)); // NOI18N

        ttel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        temail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Bregister.setBackground(new java.awt.Color(153, 255, 102));
        Bregister.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Bregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/membership2.png"))); // NOI18N
        Bregister.setText("ลงทะเบียน");
        Bregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BregisterActionPerformed(evt);
            }
        });

        lusernam.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        lusernam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lusernam.setText("Username");

        lpassword.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        lpassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpassword.setText("Password");

        tusername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        tpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lcustomerid.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        lcustomerid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcustomerid.setText("รหัสลูกค้า");

        tcustomerID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcustomerID.setEnabled(false);

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N

        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name.png"))); // NOI18N

        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name.png"))); // NOI18N

        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/telephone.png"))); // NOI18N

        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail.png"))); // NOI18N

        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/address.png"))); // NOI18N

        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password.png"))); // NOI18N

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account.png"))); // NOI18N

        nameadmin6.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        nameadmin6.setForeground(new java.awt.Color(0, 255, 0));
        nameadmin6.setText(".");
        nameadmin6.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameadmin6AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel149.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel149.setText("Admin :");

        jLabel195.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/age.png"))); // NOI18N

        Llastname1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Llastname1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Llastname1.setText("อายุ");

        tage.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Ltel1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Ltel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ltel1.setText("เพศ");

        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/sex.png"))); // NOI18N

        gender.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ชาย", "หญิง" }));

        javax.swing.GroupLayout JRegisterLayout = new javax.swing.GroupLayout(JRegister);
        JRegister.setLayout(JRegisterLayout);
        JRegisterLayout.setHorizontalGroup(
            JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JRegisterLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel149)
                .addGap(16, 16, 16)
                .addComponent(nameadmin6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JRegisterLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JRegisterLayout.createSequentialGroup()
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel129)
                            .addComponent(jLabel130))
                        .addGap(274, 274, 274)
                        .addComponent(สมัครสมาชิก, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JRegisterLayout.createSequentialGroup()
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(JRegisterLayout.createSequentialGroup()
                                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Llastname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tlastname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JRegisterLayout.createSequentialGroup()
                                    .addComponent(jLabel131)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Ltel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(ttel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(JRegisterLayout.createSequentialGroup()
                                    .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel195)
                                        .addComponent(jLabel196))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Llastname1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Ltel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(tage, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel135)
                            .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel127, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JRegisterLayout.createSequentialGroup()
                                .addComponent(lpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JRegisterLayout.createSequentialGroup()
                                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lcustomerid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lusernam, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tusername)
                                    .addComponent(tcustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JRegisterLayout.createSequentialGroup()
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel132)
                            .addComponent(jLabel133))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(231, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JRegisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bregister)
                .addGap(464, 464, 464))
        );
        JRegisterLayout.setVerticalGroup(
            JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(สมัครสมาชิก)
                    .addComponent(jLabel15))
                .addGap(32, 32, 32)
                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JRegisterLayout.createSequentialGroup()
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel128, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JRegisterLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lcustomerid)))
                        .addGap(8, 8, 8)
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lusernam)
                            .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(tusername))
                        .addGap(18, 18, 18)
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JRegisterLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JRegisterLayout.createSequentialGroup()
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JRegisterLayout.createSequentialGroup()
                                .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JRegisterLayout.createSequentialGroup()
                                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LName)
                                    .addComponent(tname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)))
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Llastname)
                                .addComponent(tlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Llastname1)
                                .addComponent(tage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Ltel1)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Ltel)
                        .addComponent(ttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel131, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(email)
                        .addComponent(temail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address)
                    .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Bregister)
                .addGap(6, 6, 6)
                .addGroup(JRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel149)
                    .addComponent(nameadmin6))
                .addGap(74, 74, 74))
        );

        Jmain.add(JRegister, "card2");
        JRegister.getAccessibleContext().setAccessibleName("");

        regisID.setBackground(new java.awt.Color(255, 204, 204));

        lcustomerid1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        lcustomerid1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcustomerid1.setText("รหัสลูกค้า");

        tcustomerID1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tcustomerID1.setEnabled(false);

        lusernam1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        lusernam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lusernam1.setText("Username");

        tusername1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lpassword1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        lpassword1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lpassword1.setText("Password");

        tpassword1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        สมัครสมาชิก1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 36)); // NOI18N
        สมัครสมาชิก1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        สมัครสมาชิก1.setText("สมัครID");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable3);

        Bregister1.setBackground(new java.awt.Color(153, 255, 102));
        Bregister1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Bregister1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/membership2.png"))); // NOI18N
        Bregister1.setText("ลงทะเบียน");
        Bregister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bregister1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ชื่อ");

        jtfindname.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N

        findname.setBackground(new java.awt.Color(102, 255, 255));
        findname.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        findname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        findname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findnameActionPerformed(evt);
            }
        });

        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel136.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name.png"))); // NOI18N

        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N

        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N

        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/password.png"))); // NOI18N

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/account.png"))); // NOI18N

        nameadmin5.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        nameadmin5.setForeground(new java.awt.Color(0, 255, 0));
        nameadmin5.setText(".");
        nameadmin5.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameadmin5AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel148.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel148.setText("Admin :");

        javax.swing.GroupLayout regisIDLayout = new javax.swing.GroupLayout(regisID);
        regisID.setLayout(regisIDLayout);
        regisIDLayout.setHorizontalGroup(
            regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regisIDLayout.createSequentialGroup()
                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regisIDLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(regisIDLayout.createSequentialGroup()
                                .addComponent(jLabel141)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(regisIDLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(regisIDLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(สมัครสมาชิก1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34))
                                    .addGroup(regisIDLayout.createSequentialGroup()
                                        .addComponent(jLabel136)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jtfindname, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addGap(8, 8, 8)
                                .addComponent(findname))
                            .addGroup(regisIDLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(regisIDLayout.createSequentialGroup()
                                        .addComponent(jLabel138)
                                        .addGap(18, 18, 18)
                                        .addComponent(lusernam1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regisIDLayout.createSequentialGroup()
                                            .addComponent(jLabel140)
                                            .addGap(18, 18, 18)
                                            .addComponent(lpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regisIDLayout.createSequentialGroup()
                                            .addComponent(jLabel137)
                                            .addGap(18, 18, 18)
                                            .addComponent(lcustomerid1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tcustomerID1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(regisIDLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel148)
                        .addGap(16, 16, 16)
                        .addComponent(nameadmin5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(regisIDLayout.createSequentialGroup()
                        .addGap(446, 446, 446)
                        .addComponent(Bregister1)))
                .addContainerGap(335, Short.MAX_VALUE))
        );
        regisIDLayout.setVerticalGroup(
            regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regisIDLayout.createSequentialGroup()
                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regisIDLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(สมัครสมาชิก1))
                    .addGroup(regisIDLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel14)))
                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regisIDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regisIDLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(regisIDLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(findname, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfindname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(15, 15, 15)))
                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lcustomerid1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tcustomerID1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel137, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(regisIDLayout.createSequentialGroup()
                        .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lusernam1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tusername1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, regisIDLayout.createSequentialGroup()
                        .addComponent(jLabel138)
                        .addGap(20, 20, 20)))
                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel140, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lpassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(Bregister1)
                .addGap(41, 41, 41)
                .addGroup(regisIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel148)
                    .addComponent(nameadmin5))
                .addGap(71, 71, 71))
        );

        Jmain.add(regisID, "card5");

        JRpayment.setBackground(new java.awt.Color(102, 153, 255));
        JRpayment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        JRpayment.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        JRpayment.add(jScrollPane3);
        jScrollPane3.setBounds(110, 190, 442, 102);

        Jluserid.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Jluserid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jluserid.setText("UserID");
        JRpayment.add(Jluserid);
        Jluserid.setBounds(110, 350, 77, 30);

        Jtusername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Jtusername.setEnabled(false);
        JRpayment.add(Jtusername);
        Jtusername.setBounds(200, 300, 180, 33);

        Jtuserid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Jtuserid.setEnabled(false);
        JRpayment.add(Jtuserid);
        Jtuserid.setBounds(200, 340, 141, 35);

        JtcustomerId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JtcustomerId.setEnabled(false);
        JtcustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JtcustomerIdActionPerformed(evt);
            }
        });
        JRpayment.add(JtcustomerId);
        JtcustomerId.setBounds(200, 390, 141, 35);

        Jluser.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Jluser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jluser.setText("Username");
        JRpayment.add(Jluser);
        Jluser.setBounds(110, 300, 77, 30);

        jlcustomerid.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jlcustomerid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlcustomerid.setText("รหัสลูกค้า");
        JRpayment.add(jlcustomerid);
        jlcustomerid.setBounds(110, 390, 77, 35);

        Jlhour.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Jlhour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlhour.setText("ชั่วโมง");
        JRpayment.add(Jlhour);
        Jlhour.setBounds(110, 440, 77, 35);

        Jlprice.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Jlprice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlprice.setText("ราคา");
        JRpayment.add(Jlprice);
        Jlprice.setBounds(110, 490, 77, 30);

        Jtprice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Jtprice.setEnabled(false);
        JRpayment.add(Jtprice);
        Jtprice.setBounds(200, 490, 141, 35);

        Jlgetmoney.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Jlgetmoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlgetmoney.setText("รับเงิน");
        JRpayment.add(Jlgetmoney);
        Jlgetmoney.setBounds(110, 540, 77, 35);

        Jtgetmoney.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        JRpayment.add(Jtgetmoney);
        Jtgetmoney.setBounds(200, 540, 141, 35);

        Jlchange.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Jlchange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlchange.setText("เงินทอน");
        JRpayment.add(Jlchange);
        Jlchange.setBounds(110, 590, 77, 35);

        Jtchange.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Jtchange.setEnabled(false);
        JRpayment.add(Jtchange);
        Jtchange.setBounds(200, 590, 141, 38);

        jbox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jbox1.setEnabled(false);
        jbox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbox1ActionPerformed(evt);
            }
        });
        JRpayment.add(jbox1);
        jbox1.setBounds(200, 440, 141, 35);

        jbpayment.setBackground(new java.awt.Color(102, 255, 102));
        jbpayment.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jbpayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hand.png"))); // NOI18N
        jbpayment.setText("ชำระเงิน");
        jbpayment.setEnabled(false);
        jbpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbpaymentActionPerformed(evt);
            }
        });
        JRpayment.add(jbpayment);
        jbpayment.setBounds(300, 660, 130, 41);

        jLabel9.setFont(new java.awt.Font("TH SarabunIT๙", 1, 36)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Payment");
        JRpayment.add(jLabel9);
        jLabel9.setBounds(541, 25, 101, 34);

        jbclear.setBackground(new java.awt.Color(153, 255, 255));
        jbclear.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jbclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broom.png"))); // NOI18N
        jbclear.setText("ล้าง");
        jbclear.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbclearActionPerformed(evt);
            }
        });
        JRpayment.add(jbclear);
        jbclear.setBounds(450, 660, 100, 41);

        Jlusername.setBackground(new java.awt.Color(51, 102, 0));
        Jlusername.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Jlusername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlusername.setText("ค้นหา Username");
        JRpayment.add(Jlusername);
        Jlusername.setBounds(100, 140, 130, 41);

        Jtfind.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Jtfind.setEnabled(false);
        JRpayment.add(Jtfind);
        Jtfind.setBounds(240, 140, 160, 41);

        jtreceipt.setColumns(20);
        jtreceipt.setFont(new java.awt.Font("Angsana New", 1, 24)); // NOI18N
        jtreceipt.setRows(5);
        jtreceipt.setEnabled(false);
        jScrollPane4.setViewportView(jtreceipt);

        JRpayment.add(jScrollPane4);
        jScrollPane4.setBounds(653, 141, 348, 460);

        jLabel11.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ใบเสร็จ");
        JRpayment.add(jLabel11);
        jLabel11.setBounds(776, 98, 100, 30);

        Jbfind.setBackground(new java.awt.Color(51, 153, 255));
        Jbfind.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        Jbfind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        Jbfind.setEnabled(false);
        Jbfind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbfindActionPerformed(evt);
            }
        });
        JRpayment.add(Jbfind);
        Jbfind.setBounds(420, 140, 65, 41);

        jLabel1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ชื่อ");
        JRpayment.add(jLabel1);
        jLabel1.setBounds(400, 350, 75, 34);

        jtname.setFont(new java.awt.Font("TH SarabunIT๙", 0, 24)); // NOI18N
        jtname.setEnabled(false);
        jtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnameActionPerformed(evt);
            }
        });
        JRpayment.add(jtname);
        jtname.setBounds(480, 350, 155, 34);

        jLabel2.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("นามสกุล");
        JRpayment.add(jLabel2);
        jLabel2.setBounds(400, 400, 57, 28);

        jtlastname.setFont(new java.awt.Font("TH SarabunIT๙", 0, 24)); // NOI18N
        jtlastname.setEnabled(false);
        JRpayment.add(jtlastname);
        jtlastname.setBounds(480, 400, 155, 34);

        jLabel3.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("บาท");
        JRpayment.add(jLabel3);
        jLabel3.setBounds(360, 490, 53, 35);

        jLabel4.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("บาท");
        JRpayment.add(jLabel4);
        jLabel4.setBounds(360, 540, 53, 34);

        jLabel5.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("บาท");
        JRpayment.add(jLabel5);
        jLabel5.setBounds(360, 590, 53, 38);

        jRadioButton1.setBackground(new java.awt.Color(0, 153, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jRadioButton1.setText("เป็นสมาชิก");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        JRpayment.add(jRadioButton1);
        jRadioButton1.setBounds(100, 100, 101, 37);

        jRadioButton2.setBackground(new java.awt.Color(255, 0, 0));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jRadioButton2.setText("ไม่ใช่สมาชิก");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        JRpayment.add(jRadioButton2);
        jRadioButton2.setBounds(240, 100, 107, 37);

        jjong.setBackground(new java.awt.Color(51, 51, 51));
        jjong.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jjong.setForeground(new java.awt.Color(255, 255, 255));
        jjong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/online-booking.png"))); // NOI18N
        jjong.setText("เลือกคอม");
        jjong.setToolTipText("");
        jjong.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jjong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jjongActionPerformed(evt);
            }
        });
        JRpayment.add(jjong);
        jjong.setBounds(570, 660, 140, 41);

        jLabel19.setBackground(new java.awt.Color(255, 204, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/membership (1).png"))); // NOI18N
        jLabel19.setEnabled(false);
        JRpayment.add(jLabel19);
        jLabel19.setBounds(270, 50, 60, 30);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/membership (1).png"))); // NOI18N
        jLabel20.setEnabled(false);
        JRpayment.add(jLabel20);
        jLabel20.setBounds(120, 50, 60, 30);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/no-stopping.png"))); // NOI18N
        jLabel22.setEnabled(false);
        JRpayment.add(jLabel22);
        jLabel22.setBounds(260, 30, 80, 70);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bill.png"))); // NOI18N
        jLabel21.setEnabled(false);
        JRpayment.add(jLabel21);
        jLabel21.setBounds(730, 60, 64, 80);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        jLabel23.setEnabled(false);
        JRpayment.add(jLabel23);
        jLabel23.setBounds(60, 210, 32, 40);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name.png"))); // NOI18N
        jLabel24.setEnabled(false);
        JRpayment.add(jLabel24);
        jLabel24.setBounds(360, 390, 32, 50);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jLabel25.setEnabled(false);
        JRpayment.add(jLabel25);
        jLabel25.setBounds(60, 290, 32, 40);

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/staff.png"))); // NOI18N
        jLabel26.setEnabled(false);
        JRpayment.add(jLabel26);
        jLabel26.setBounds(60, 340, 32, 50);

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N
        jLabel27.setEnabled(false);
        JRpayment.add(jLabel27);
        jLabel27.setBounds(60, 380, 32, 50);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        jLabel28.setEnabled(false);
        JRpayment.add(jLabel28);
        jLabel28.setBounds(60, 430, 32, 50);

        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/coin.png"))); // NOI18N
        jLabel121.setEnabled(false);
        JRpayment.add(jLabel121);
        jLabel121.setBounds(60, 480, 32, 50);

        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/receive.png"))); // NOI18N
        jLabel122.setEnabled(false);
        JRpayment.add(jLabel122);
        jLabel122.setBounds(60, 530, 32, 50);

        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/money.png"))); // NOI18N
        jLabel123.setEnabled(false);
        JRpayment.add(jLabel123);
        jLabel123.setBounds(60, 580, 32, 50);

        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name.png"))); // NOI18N
        jLabel124.setEnabled(false);
        JRpayment.add(jLabel124);
        jLabel124.setBounds(360, 340, 32, 50);

        jLabel125.setBackground(new java.awt.Color(255, 255, 255));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/blockchain.png"))); // NOI18N
        JRpayment.add(jLabel125);
        jLabel125.setBounds(460, 10, 80, 70);

        jLabel126.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        jLabel126.setEnabled(false);
        JRpayment.add(jLabel126);
        jLabel126.setBounds(60, 140, 32, 40);

        jLabel144.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel144.setText("Admin :");
        JRpayment.add(jLabel144);
        jLabel144.setBounds(20, 730, 94, 28);

        nameadmin1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        nameadmin1.setForeground(new java.awt.Color(0, 255, 0));
        nameadmin1.setText(".");
        nameadmin1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameadmin1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JRpayment.add(nameadmin1);
        nameadmin1.setBounds(130, 730, 80, 28);

        print.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/printer.png"))); // NOI18N
        print.setText("พิมพ์ใบเสร็จ");
        print.setToolTipText("");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        JRpayment.add(print);
        print.setBounds(740, 620, 190, 70);

        Jmain.add(JRpayment, "card3");

        JReservations.setBackground(new java.awt.Color(204, 204, 255));
        JReservations.setLayout(null);

        jLabel7.setFont(new java.awt.Font("TH SarabunIT๙", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("เลือกคอมพิวเตอร์");
        JReservations.add(jLabel7);
        jLabel7.setBounds(414, 13, 171, 42);

        photo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo1);
        photo1.setBounds(70, 106, 64, 64);

        photo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo2);
        photo2.setBounds(328, 106, 64, 64);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("1");
        JReservations.add(jLabel29);
        jLabel29.setBounds(54, 91, 9, 17);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setText("2");
        JReservations.add(jLabel30);
        jLabel30.setBounds(312, 91, 9, 17);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("1");
        JReservations.add(jLabel41);
        jLabel41.setBounds(490, 700, 36, 37);

        nextpage2.setBackground(new java.awt.Color(255, 255, 255));
        nextpage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow (1).png"))); // NOI18N
        nextpage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextpage2MouseClicked(evt);
            }
        });
        JReservations.add(nextpage2);
        nextpage2.setBounds(540, 700, 64, 37);

        status1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status1);
        status1.setBounds(141, 106, 80, 25);

        cusernam1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam1);
        cusernam1.setBounds(141, 146, 80, 24);

        lhour1.setText("00");
        JReservations.add(lhour1);
        lhour1.setBounds(54, 177, 14, 31);

        jLabel45.setText(":");
        JReservations.add(jLabel45);
        jLabel45.setBounds(75, 184, 5, 16);

        lmin1.setText("00");
        JReservations.add(lmin1);
        lmin1.setBounds(87, 177, 14, 31);

        jLabel47.setText(":");
        JReservations.add(jLabel47);
        jLabel47.setBounds(108, 184, 5, 16);

        lsec1.setText("00");
        JReservations.add(lsec1);
        lsec1.setBounds(120, 177, 14, 31);

        jbstart1.setBackground(new java.awt.Color(255, 255, 255));
        jbstart1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart1ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart1);
        jbstart1.setBounds(12, 215, 60, 33);

        Stop1.setBackground(new java.awt.Color(255, 102, 0));
        Stop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop1.setEnabled(false);
        Stop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop1ActionPerformed(evt);
            }
        });
        JReservations.add(Stop1);
        Stop1.setBounds(79, 215, 60, 33);

        transfer1.setBackground(new java.awt.Color(102, 255, 102));
        transfer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer1.setEnabled(false);
        transfer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer1ActionPerformed(evt);
            }
        });
        JReservations.add(transfer1);
        transfer1.setBounds(146, 215, 57, 33);

        clear1.setBackground(new java.awt.Color(51, 255, 255));
        clear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear1ActionPerformed(evt);
            }
        });
        JReservations.add(clear1);
        clear1.setBounds(146, 180, 57, 33);

        lhour2.setText("00");
        JReservations.add(lhour2);
        lhour2.setBounds(312, 177, 14, 31);

        jLabel46.setText(":");
        JReservations.add(jLabel46);
        jLabel46.setBounds(333, 184, 5, 16);

        lmin2.setText("00");
        JReservations.add(lmin2);
        lmin2.setBounds(345, 177, 14, 31);

        jLabel48.setText(":");
        JReservations.add(jLabel48);
        jLabel48.setBounds(366, 184, 5, 16);

        lsec2.setText("00");
        JReservations.add(lsec2);
        lsec2.setBounds(378, 177, 14, 31);

        Stop2.setBackground(new java.awt.Color(255, 102, 0));
        Stop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop2.setEnabled(false);
        Stop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop2ActionPerformed(evt);
            }
        });
        JReservations.add(Stop2);
        Stop2.setBounds(338, 215, 60, 33);

        jbstart2.setBackground(new java.awt.Color(255, 255, 255));
        jbstart2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart2ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart2);
        jbstart2.setBounds(271, 215, 60, 33);

        transfer2.setBackground(new java.awt.Color(102, 255, 102));
        transfer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer2.setEnabled(false);
        transfer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer2ActionPerformed(evt);
            }
        });
        JReservations.add(transfer2);
        transfer2.setBounds(405, 215, 60, 33);

        status2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status2);
        status2.setBounds(411, 106, 80, 25);

        cusernam2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam2);
        cusernam2.setBounds(411, 146, 80, 24);

        clear2.setBackground(new java.awt.Color(51, 255, 255));
        clear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear2ActionPerformed(evt);
            }
        });
        JReservations.add(clear2);
        clear2.setBounds(407, 178, 60, 33);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("3");
        JReservations.add(jLabel31);
        jLabel31.setBounds(576, 91, 9, 17);

        photo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo3);
        photo3.setBounds(592, 106, 64, 64);

        lhour3.setText("00");
        JReservations.add(lhour3);
        lhour3.setBounds(576, 181, 14, 31);

        jLabel49.setText(":");
        JReservations.add(jLabel49);
        jLabel49.setBounds(597, 188, 5, 16);

        lmin3.setText("00");
        JReservations.add(lmin3);
        lmin3.setBounds(609, 181, 14, 31);

        jLabel50.setText(":");
        JReservations.add(jLabel50);
        jLabel50.setBounds(630, 188, 5, 16);

        lsec3.setText("00");
        JReservations.add(lsec3);
        lsec3.setBounds(642, 181, 14, 31);

        Stop3.setBackground(new java.awt.Color(255, 102, 0));
        Stop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop3.setEnabled(false);
        Stop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop3ActionPerformed(evt);
            }
        });
        JReservations.add(Stop3);
        Stop3.setBounds(602, 215, 60, 33);

        jbstart3.setBackground(new java.awt.Color(255, 255, 255));
        jbstart3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart3ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart3);
        jbstart3.setBounds(535, 215, 60, 33);

        transfer3.setBackground(new java.awt.Color(102, 255, 102));
        transfer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer3.setToolTipText("");
        transfer3.setEnabled(false);
        transfer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer3ActionPerformed(evt);
            }
        });
        JReservations.add(transfer3);
        transfer3.setBounds(669, 215, 60, 33);

        clear3.setBackground(new java.awt.Color(51, 255, 255));
        clear3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear3ActionPerformed(evt);
            }
        });
        JReservations.add(clear3);
        clear3.setBounds(670, 180, 57, 33);

        cusernam3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam3);
        cusernam3.setBounds(675, 146, 80, 24);

        status3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status3);
        status3.setBounds(675, 106, 80, 25);

        photo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo4);
        photo4.setBounds(862, 106, 64, 64);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("4");
        JReservations.add(jLabel34);
        jLabel34.setBounds(846, 91, 9, 17);

        jbstart4.setBackground(new java.awt.Color(255, 255, 255));
        jbstart4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart4ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart4);
        jbstart4.setBounds(805, 215, 60, 33);

        Stop4.setBackground(new java.awt.Color(255, 102, 0));
        Stop4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop4.setEnabled(false);
        Stop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop4ActionPerformed(evt);
            }
        });
        JReservations.add(Stop4);
        Stop4.setBounds(872, 215, 60, 33);

        lhour4.setText("00");
        JReservations.add(lhour4);
        lhour4.setBounds(846, 181, 14, 31);

        jLabel51.setText(":");
        JReservations.add(jLabel51);
        jLabel51.setBounds(867, 188, 5, 16);

        lmin4.setText("00");
        JReservations.add(lmin4);
        lmin4.setBounds(879, 181, 14, 31);

        jLabel52.setText(":");
        JReservations.add(jLabel52);
        jLabel52.setBounds(900, 188, 5, 16);

        lsec4.setText("00");
        JReservations.add(lsec4);
        lsec4.setBounds(912, 181, 14, 31);

        transfer4.setBackground(new java.awt.Color(102, 255, 102));
        transfer4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer4.setEnabled(false);
        transfer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer4ActionPerformed(evt);
            }
        });
        JReservations.add(transfer4);
        transfer4.setBounds(939, 215, 57, 33);

        clear4.setBackground(new java.awt.Color(51, 255, 255));
        clear4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear4ActionPerformed(evt);
            }
        });
        JReservations.add(clear4);
        clear4.setBounds(940, 180, 57, 33);

        cusernam4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam4);
        cusernam4.setBounds(945, 146, 80, 24);

        status4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status4);
        status4.setBounds(945, 106, 80, 25);

        photo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo5);
        photo5.setBounds(69, 298, 64, 64);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setText("5");
        JReservations.add(jLabel36);
        jLabel36.setBounds(53, 287, 9, 17);

        lhour5.setText("00");
        JReservations.add(lhour5);
        lhour5.setBounds(53, 378, 14, 31);

        jbstart5.setBackground(new java.awt.Color(255, 255, 255));
        jbstart5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart5ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart5);
        jbstart5.setBounds(12, 418, 60, 33);

        Stop5.setBackground(new java.awt.Color(255, 102, 0));
        Stop5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop5.setEnabled(false);
        Stop5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop5ActionPerformed(evt);
            }
        });
        JReservations.add(Stop5);
        Stop5.setBounds(79, 418, 60, 33);

        jLabel53.setText(":");
        JReservations.add(jLabel53);
        jLabel53.setBounds(74, 385, 5, 16);

        lmin5.setText("00");
        JReservations.add(lmin5);
        lmin5.setBounds(86, 378, 14, 31);

        jLabel54.setText(":");
        JReservations.add(jLabel54);
        jLabel54.setBounds(107, 385, 5, 16);

        lsec5.setText("00");
        JReservations.add(lsec5);
        lsec5.setBounds(119, 378, 14, 31);

        transfer5.setBackground(new java.awt.Color(102, 255, 102));
        transfer5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer5.setEnabled(false);
        transfer5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer5ActionPerformed(evt);
            }
        });
        JReservations.add(transfer5);
        transfer5.setBounds(146, 418, 60, 33);

        clear5.setBackground(new java.awt.Color(51, 255, 255));
        clear5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear5ActionPerformed(evt);
            }
        });
        JReservations.add(clear5);
        clear5.setBounds(150, 380, 57, 33);

        cusernam5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam5);
        cusernam5.setBounds(152, 338, 80, 24);

        status5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status5);
        status5.setBounds(152, 298, 80, 25);

        photo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo6);
        photo6.setBounds(328, 298, 64, 64);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setText("6");
        JReservations.add(jLabel38);
        jLabel38.setBounds(312, 287, 9, 17);

        lhour6.setText("00");
        JReservations.add(lhour6);
        lhour6.setBounds(312, 378, 14, 31);

        jbstart6.setBackground(new java.awt.Color(255, 255, 255));
        jbstart6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart6ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart6);
        jbstart6.setBounds(271, 418, 60, 33);

        Stop6.setBackground(new java.awt.Color(255, 102, 0));
        Stop6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop6.setEnabled(false);
        Stop6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop6ActionPerformed(evt);
            }
        });
        JReservations.add(Stop6);
        Stop6.setBounds(338, 418, 60, 33);

        jLabel55.setText(":");
        JReservations.add(jLabel55);
        jLabel55.setBounds(333, 385, 5, 16);

        lmin6.setText("00");
        JReservations.add(lmin6);
        lmin6.setBounds(345, 378, 14, 31);

        jLabel56.setText(":");
        JReservations.add(jLabel56);
        jLabel56.setBounds(366, 385, 5, 16);

        lsec6.setText("00");
        JReservations.add(lsec6);
        lsec6.setBounds(378, 378, 14, 31);

        transfer6.setBackground(new java.awt.Color(102, 255, 102));
        transfer6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer6.setEnabled(false);
        transfer6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer6ActionPerformed(evt);
            }
        });
        JReservations.add(transfer6);
        transfer6.setBounds(405, 418, 60, 33);

        clear6.setBackground(new java.awt.Color(51, 255, 255));
        clear6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear6ActionPerformed(evt);
            }
        });
        JReservations.add(clear6);
        clear6.setBounds(410, 381, 57, 33);

        cusernam6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam6);
        cusernam6.setBounds(411, 338, 80, 24);

        status6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status6);
        status6.setBounds(411, 298, 80, 25);

        photo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo7);
        photo7.setBounds(592, 298, 64, 64);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("7");
        JReservations.add(jLabel40);
        jLabel40.setBounds(576, 287, 9, 17);

        lhour7.setText("00");
        JReservations.add(lhour7);
        lhour7.setBounds(580, 380, 14, 31);

        jbstart7.setBackground(new java.awt.Color(255, 255, 255));
        jbstart7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart7ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart7);
        jbstart7.setBounds(535, 418, 60, 33);

        Stop7.setBackground(new java.awt.Color(255, 102, 0));
        Stop7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop7.setEnabled(false);
        Stop7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop7ActionPerformed(evt);
            }
        });
        JReservations.add(Stop7);
        Stop7.setBounds(602, 418, 60, 33);

        jLabel57.setText(":");
        JReservations.add(jLabel57);
        jLabel57.setBounds(600, 380, 10, 30);

        lmin7.setText("00");
        JReservations.add(lmin7);
        lmin7.setBounds(610, 380, 14, 31);

        jLabel58.setText(":");
        JReservations.add(jLabel58);
        jLabel58.setBounds(630, 380, 10, 30);

        lsec7.setText("00");
        JReservations.add(lsec7);
        lsec7.setBounds(640, 380, 14, 31);

        transfer7.setBackground(new java.awt.Color(102, 255, 102));
        transfer7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer7.setEnabled(false);
        transfer7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer7ActionPerformed(evt);
            }
        });
        JReservations.add(transfer7);
        transfer7.setBounds(669, 418, 60, 33);

        clear7.setBackground(new java.awt.Color(51, 255, 255));
        clear7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear7ActionPerformed(evt);
            }
        });
        JReservations.add(clear7);
        clear7.setBounds(669, 383, 57, 33);

        cusernam7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam7);
        cusernam7.setBounds(675, 338, 80, 24);

        status7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status7);
        status7.setBounds(675, 298, 80, 25);

        photo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo8);
        photo8.setBounds(862, 298, 64, 64);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel44.setText("8");
        JReservations.add(jLabel44);
        jLabel44.setBounds(846, 287, 9, 17);

        lhour8.setText("00");
        JReservations.add(lhour8);
        lhour8.setBounds(846, 380, 14, 31);

        jbstart8.setBackground(new java.awt.Color(255, 255, 255));
        jbstart8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart8ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart8);
        jbstart8.setBounds(805, 418, 60, 33);

        Stop8.setBackground(new java.awt.Color(255, 102, 0));
        Stop8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop8.setEnabled(false);
        Stop8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop8ActionPerformed(evt);
            }
        });
        JReservations.add(Stop8);
        Stop8.setBounds(872, 418, 60, 33);

        jLabel59.setText(":");
        JReservations.add(jLabel59);
        jLabel59.setBounds(867, 387, 5, 16);

        lmin8.setText("00");
        JReservations.add(lmin8);
        lmin8.setBounds(879, 380, 14, 31);

        jLabel60.setText(":");
        JReservations.add(jLabel60);
        jLabel60.setBounds(900, 387, 5, 16);

        lsec8.setText("00");
        JReservations.add(lsec8);
        lsec8.setBounds(912, 380, 14, 31);

        transfer8.setBackground(new java.awt.Color(102, 255, 102));
        transfer8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer8.setEnabled(false);
        transfer8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer8ActionPerformed(evt);
            }
        });
        JReservations.add(transfer8);
        transfer8.setBounds(939, 418, 60, 33);

        clear8.setBackground(new java.awt.Color(51, 255, 255));
        clear8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear8ActionPerformed(evt);
            }
        });
        JReservations.add(clear8);
        clear8.setBounds(938, 383, 57, 33);

        cusernam8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam8);
        cusernam8.setBounds(945, 338, 80, 24);

        status8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status8);
        status8.setBounds(945, 298, 80, 25);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setText("9");
        JReservations.add(jLabel61);
        jLabel61.setBounds(53, 504, 9, 17);

        photo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo9);
        photo9.setBounds(69, 515, 64, 64);

        lhour9.setText("00");
        JReservations.add(lhour9);
        lhour9.setBounds(53, 595, 14, 31);

        jLabel63.setText(":");
        JReservations.add(jLabel63);
        jLabel63.setBounds(74, 602, 5, 16);

        lmin9.setText("00");
        JReservations.add(lmin9);
        lmin9.setBounds(86, 595, 14, 31);

        jLabel64.setText(":");
        JReservations.add(jLabel64);
        jLabel64.setBounds(107, 602, 5, 16);

        lsec9.setText("00");
        JReservations.add(lsec9);
        lsec9.setBounds(119, 595, 14, 31);

        Stop9.setBackground(new java.awt.Color(255, 102, 0));
        Stop9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop9.setEnabled(false);
        Stop9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop9ActionPerformed(evt);
            }
        });
        JReservations.add(Stop9);
        Stop9.setBounds(79, 636, 60, 33);

        jbstart9.setBackground(new java.awt.Color(255, 255, 255));
        jbstart9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart9ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart9);
        jbstart9.setBounds(12, 636, 60, 33);

        transfer9.setBackground(new java.awt.Color(102, 255, 102));
        transfer9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer9.setEnabled(false);
        transfer9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer9ActionPerformed(evt);
            }
        });
        JReservations.add(transfer9);
        transfer9.setBounds(146, 636, 60, 33);

        clear9.setBackground(new java.awt.Color(51, 255, 255));
        clear9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear9ActionPerformed(evt);
            }
        });
        JReservations.add(clear9);
        clear9.setBounds(145, 598, 57, 33);

        cusernam9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam9);
        cusernam9.setBounds(152, 555, 80, 24);

        status9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status9);
        status9.setBounds(152, 515, 80, 25);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("10");
        JReservations.add(jLabel65);
        jLabel65.setBounds(303, 504, 18, 17);

        photo10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo10);
        photo10.setBounds(328, 515, 64, 64);

        lhour10.setText("00");
        JReservations.add(lhour10);
        lhour10.setBounds(312, 597, 14, 31);

        jLabel67.setText(":");
        JReservations.add(jLabel67);
        jLabel67.setBounds(333, 604, 5, 16);

        lmin10.setText("00");
        JReservations.add(lmin10);
        lmin10.setBounds(345, 597, 14, 31);

        jLabel68.setText(":");
        JReservations.add(jLabel68);
        jLabel68.setBounds(366, 604, 5, 16);

        lsec10.setText("00");
        JReservations.add(lsec10);
        lsec10.setBounds(378, 597, 14, 31);

        Stop10.setBackground(new java.awt.Color(255, 102, 0));
        Stop10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop10.setEnabled(false);
        Stop10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop10ActionPerformed(evt);
            }
        });
        JReservations.add(Stop10);
        Stop10.setBounds(338, 636, 60, 33);

        jbstart10.setBackground(new java.awt.Color(255, 255, 255));
        jbstart10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart10ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart10);
        jbstart10.setBounds(271, 636, 60, 33);

        transfer10.setBackground(new java.awt.Color(102, 255, 102));
        transfer10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer10.setEnabled(false);
        transfer10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer10ActionPerformed(evt);
            }
        });
        JReservations.add(transfer10);
        transfer10.setBounds(405, 636, 60, 33);

        clear10.setBackground(new java.awt.Color(51, 255, 255));
        clear10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear10ActionPerformed(evt);
            }
        });
        JReservations.add(clear10);
        clear10.setBounds(410, 600, 57, 33);

        cusernam10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam10);
        cusernam10.setBounds(411, 555, 80, 24);

        status10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status10);
        status10.setBounds(411, 515, 80, 25);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel69.setText("11");
        JReservations.add(jLabel69);
        jLabel69.setBounds(566, 504, 18, 17);

        photo11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo11);
        photo11.setBounds(591, 515, 64, 64);

        lhour11.setText("00");
        JReservations.add(lhour11);
        lhour11.setBounds(566, 597, 14, 31);

        jLabel71.setText(":");
        JReservations.add(jLabel71);
        jLabel71.setBounds(587, 604, 5, 16);

        lmin11.setText("00");
        JReservations.add(lmin11);
        lmin11.setBounds(599, 597, 14, 31);

        jLabel72.setText(":");
        JReservations.add(jLabel72);
        jLabel72.setBounds(620, 604, 5, 16);

        lsec11.setText("00");
        JReservations.add(lsec11);
        lsec11.setBounds(632, 597, 14, 31);

        Stop11.setBackground(new java.awt.Color(255, 102, 0));
        Stop11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop11.setEnabled(false);
        Stop11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop11ActionPerformed(evt);
            }
        });
        JReservations.add(Stop11);
        Stop11.setBounds(601, 636, 60, 33);

        jbstart11.setBackground(new java.awt.Color(255, 255, 255));
        jbstart11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart11ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart11);
        jbstart11.setBounds(534, 636, 60, 33);

        transfer11.setBackground(new java.awt.Color(102, 255, 102));
        transfer11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer11.setEnabled(false);
        transfer11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer11ActionPerformed(evt);
            }
        });
        JReservations.add(transfer11);
        transfer11.setBounds(668, 636, 60, 33);

        clear11.setBackground(new java.awt.Color(51, 255, 255));
        clear11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear11ActionPerformed(evt);
            }
        });
        JReservations.add(clear11);
        clear11.setBounds(670, 600, 57, 33);

        cusernam11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam11);
        cusernam11.setBounds(674, 555, 80, 24);

        status11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status11);
        status11.setBounds(674, 515, 80, 25);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setText("12");
        JReservations.add(jLabel73);
        jLabel73.setBounds(843, 504, 18, 17);

        photo12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        JReservations.add(photo12);
        photo12.setBounds(868, 515, 64, 64);

        lhour12.setText("00");
        JReservations.add(lhour12);
        lhour12.setBounds(850, 600, 14, 31);

        jLabel75.setText(":");
        JReservations.add(jLabel75);
        jLabel75.setBounds(870, 600, 5, 30);

        lmin12.setText("00");
        JReservations.add(lmin12);
        lmin12.setBounds(880, 600, 14, 31);

        jLabel76.setText(":");
        JReservations.add(jLabel76);
        jLabel76.setBounds(900, 600, 5, 30);

        lsec12.setText("00");
        JReservations.add(lsec12);
        lsec12.setBounds(910, 600, 14, 31);

        Stop12.setBackground(new java.awt.Color(255, 102, 0));
        Stop12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop12.setEnabled(false);
        Stop12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop12ActionPerformed(evt);
            }
        });
        JReservations.add(Stop12);
        Stop12.setBounds(878, 636, 60, 33);

        jbstart12.setBackground(new java.awt.Color(255, 255, 255));
        jbstart12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart12ActionPerformed(evt);
            }
        });
        JReservations.add(jbstart12);
        jbstart12.setBounds(811, 636, 60, 33);

        transfer12.setBackground(new java.awt.Color(102, 255, 102));
        transfer12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer12.setEnabled(false);
        transfer12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer12ActionPerformed(evt);
            }
        });
        JReservations.add(transfer12);
        transfer12.setBounds(945, 636, 60, 33);

        clear12.setBackground(new java.awt.Color(51, 255, 255));
        clear12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear12ActionPerformed(evt);
            }
        });
        JReservations.add(clear12);
        clear12.setBounds(950, 600, 57, 33);

        cusernam12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(cusernam12);
        cusernam12.setBounds(940, 560, 80, 24);

        status12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JReservations.add(status12);
        status12.setBounds(951, 515, 80, 25);

        iconstop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop1.setEnabled(false);
        JReservations.add(iconstop1);
        iconstop1.setBounds(90, 70, 24, 30);

        iconstop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop2.setEnabled(false);
        JReservations.add(iconstop2);
        iconstop2.setBounds(350, 70, 24, 30);

        iconstop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop3.setEnabled(false);
        JReservations.add(iconstop3);
        iconstop3.setBounds(610, 70, 24, 30);

        iconstop4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop4.setEnabled(false);
        JReservations.add(iconstop4);
        iconstop4.setBounds(880, 70, 24, 30);

        iconstop5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop5.setEnabled(false);
        JReservations.add(iconstop5);
        iconstop5.setBounds(90, 260, 24, 30);

        iconstop6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop6.setEnabled(false);
        JReservations.add(iconstop6);
        iconstop6.setBounds(350, 260, 24, 30);

        iconstop7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop7.setEnabled(false);
        JReservations.add(iconstop7);
        iconstop7.setBounds(610, 260, 24, 30);

        iconstop8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop8.setEnabled(false);
        JReservations.add(iconstop8);
        iconstop8.setBounds(880, 260, 24, 30);

        iconstop9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop9.setEnabled(false);
        JReservations.add(iconstop9);
        iconstop9.setBounds(90, 480, 24, 30);

        iconstop10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop10.setEnabled(false);
        JReservations.add(iconstop10);
        iconstop10.setBounds(350, 480, 24, 30);

        iconstop11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop11.setEnabled(false);
        JReservations.add(iconstop11);
        iconstop11.setBounds(610, 480, 24, 30);

        iconstop12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop12.setEnabled(false);
        JReservations.add(iconstop12);
        iconstop12.setBounds(890, 480, 24, 30);

        nameadmin2.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        nameadmin2.setForeground(new java.awt.Color(0, 255, 0));
        nameadmin2.setText(".");
        nameadmin2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameadmin2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        JReservations.add(nameadmin2);
        nameadmin2.setBounds(130, 730, 80, 28);

        jLabel145.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel145.setText("Admin :");
        JReservations.add(jLabel145);
        jLabel145.setBounds(20, 730, 94, 28);

        timepage1.setBackground(new java.awt.Color(255, 204, 255));
        timepage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        timepage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timepage1ActionPerformed(evt);
            }
        });
        JReservations.add(timepage1);
        timepage1.setBounds(20, 680, 65, 40);

        jLabel154.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel154.setText("เติมเวลา");
        JReservations.add(jLabel154);
        jLabel154.setBounds(90, 690, 60, 20);

        jLabel158.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gaming.png"))); // NOI18N
        JReservations.add(jLabel158);
        jLabel158.setBounds(590, 20, 30, 32);

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gaming.png"))); // NOI18N
        JReservations.add(jLabel167);
        jLabel167.setBounds(380, 20, 30, 32);

        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        JReservations.add(jLabel177);
        jLabel177.setBounds(990, 780, 24, 30);

        jLabel178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        JReservations.add(jLabel178);
        jLabel178.setBounds(990, 720, 24, 30);

        jLabel179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        JReservations.add(jLabel179);
        jLabel179.setBounds(990, 750, 24, 30);

        jLabel180.setFont(new java.awt.Font("TH SarabunIT๙", 1, 18)); // NOI18N
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("Tranfer");
        JReservations.add(jLabel180);
        jLabel180.setBounds(1030, 780, 43, 21);

        jLabel181.setFont(new java.awt.Font("TH SarabunIT๙", 1, 18)); // NOI18N
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setText("Start");
        JReservations.add(jLabel181);
        jLabel181.setBounds(1030, 720, 28, 21);

        jLabel182.setFont(new java.awt.Font("TH SarabunIT๙", 1, 18)); // NOI18N
        jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel182.setText("Stop");
        JReservations.add(jLabel182);
        jLabel182.setBounds(1030, 750, 28, 21);

        Jmain.add(JReservations, "card6");

        computerpage2.setBackground(new java.awt.Color(204, 204, 255));
        computerpage2.setLayout(null);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("13");
        computerpage2.add(jLabel32);
        jLabel32.setBounds(54, 91, 20, 17);

        iconstop13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop13.setEnabled(false);
        computerpage2.add(iconstop13);
        iconstop13.setBounds(90, 70, 24, 30);

        photo13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo13);
        photo13.setBounds(70, 106, 64, 64);

        lhour13.setText("00");
        computerpage2.add(lhour13);
        lhour13.setBounds(54, 177, 14, 31);

        jLabel62.setText(":");
        computerpage2.add(jLabel62);
        jLabel62.setBounds(75, 184, 5, 16);

        lmin13.setText("00");
        computerpage2.add(lmin13);
        lmin13.setBounds(87, 177, 14, 31);

        jLabel66.setText(":");
        computerpage2.add(jLabel66);
        jLabel66.setBounds(108, 184, 5, 16);

        lsec13.setText("00");
        computerpage2.add(lsec13);
        lsec13.setBounds(120, 177, 14, 31);

        Stop13.setBackground(new java.awt.Color(255, 102, 0));
        Stop13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop13.setEnabled(false);
        Stop13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop13ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop13);
        Stop13.setBounds(79, 215, 60, 33);

        jbstart13.setBackground(new java.awt.Color(255, 255, 255));
        jbstart13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart13ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart13);
        jbstart13.setBounds(12, 215, 60, 33);

        transfer13.setBackground(new java.awt.Color(102, 255, 102));
        transfer13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer13.setEnabled(false);
        transfer13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer13ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer13);
        transfer13.setBounds(146, 215, 57, 33);

        clear13.setBackground(new java.awt.Color(51, 255, 255));
        clear13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear13ActionPerformed(evt);
            }
        });
        computerpage2.add(clear13);
        clear13.setBounds(146, 180, 57, 33);

        cusernam13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam13);
        cusernam13.setBounds(141, 146, 80, 24);

        status13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status13);
        status13.setBounds(141, 106, 80, 25);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel33.setText("14");
        computerpage2.add(jLabel33);
        jLabel33.setBounds(312, 91, 20, 17);

        photo14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo14);
        photo14.setBounds(328, 106, 64, 64);

        iconstop14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop14.setEnabled(false);
        computerpage2.add(iconstop14);
        iconstop14.setBounds(350, 70, 24, 30);

        lmin14.setText("00");
        computerpage2.add(lmin14);
        lmin14.setBounds(345, 177, 14, 31);

        lhour14.setText("00");
        computerpage2.add(lhour14);
        lhour14.setBounds(312, 177, 14, 31);

        jLabel70.setText(":");
        computerpage2.add(jLabel70);
        jLabel70.setBounds(333, 184, 5, 16);

        jbstart14.setBackground(new java.awt.Color(255, 255, 255));
        jbstart14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart14ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart14);
        jbstart14.setBounds(271, 215, 60, 33);

        Stop14.setBackground(new java.awt.Color(255, 102, 0));
        Stop14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop14.setEnabled(false);
        Stop14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop14ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop14);
        Stop14.setBounds(338, 215, 60, 33);

        jLabel74.setText(":");
        computerpage2.add(jLabel74);
        jLabel74.setBounds(366, 184, 5, 16);

        lsec14.setText("00");
        computerpage2.add(lsec14);
        lsec14.setBounds(378, 177, 14, 31);

        transfer14.setBackground(new java.awt.Color(102, 255, 102));
        transfer14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer14.setEnabled(false);
        transfer14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer14ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer14);
        transfer14.setBounds(405, 215, 60, 33);

        clear14.setBackground(new java.awt.Color(51, 255, 255));
        clear14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear14ActionPerformed(evt);
            }
        });
        computerpage2.add(clear14);
        clear14.setBounds(410, 178, 57, 33);

        cusernam14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam14);
        cusernam14.setBounds(411, 146, 80, 24);

        status14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status14);
        status14.setBounds(411, 106, 80, 25);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setText("15");
        computerpage2.add(jLabel35);
        jLabel35.setBounds(576, 91, 20, 17);

        iconstop15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop15.setEnabled(false);
        computerpage2.add(iconstop15);
        iconstop15.setBounds(610, 70, 24, 30);

        photo15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo15);
        photo15.setBounds(592, 106, 64, 64);

        lhour15.setText("00");
        computerpage2.add(lhour15);
        lhour15.setBounds(576, 181, 14, 31);

        jLabel77.setText(":");
        computerpage2.add(jLabel77);
        jLabel77.setBounds(597, 188, 5, 16);

        lmin15.setText("00");
        computerpage2.add(lmin15);
        lmin15.setBounds(609, 181, 14, 31);

        jLabel78.setText(":");
        computerpage2.add(jLabel78);
        jLabel78.setBounds(630, 188, 5, 16);

        lsec15.setText("00");
        computerpage2.add(lsec15);
        lsec15.setBounds(642, 181, 14, 31);

        jbstart15.setBackground(new java.awt.Color(255, 255, 255));
        jbstart15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart15ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart15);
        jbstart15.setBounds(535, 215, 60, 33);

        Stop15.setBackground(new java.awt.Color(255, 102, 0));
        Stop15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop15.setEnabled(false);
        Stop15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop15ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop15);
        Stop15.setBounds(602, 215, 60, 33);

        transfer15.setBackground(new java.awt.Color(102, 255, 102));
        transfer15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer15.setEnabled(false);
        transfer15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer15ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer15);
        transfer15.setBounds(669, 215, 60, 33);

        clear15.setBackground(new java.awt.Color(51, 255, 255));
        clear15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear15.setToolTipText("");
        clear15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear15ActionPerformed(evt);
            }
        });
        computerpage2.add(clear15);
        clear15.setBounds(670, 180, 60, 30);

        jLabel8.setFont(new java.awt.Font("TH SarabunIT๙", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("เลือกคอมพิวเตอร์");
        computerpage2.add(jLabel8);
        jLabel8.setBounds(414, 13, 171, 42);

        jbstart16.setBackground(new java.awt.Color(255, 255, 255));
        jbstart16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart16ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart16);
        jbstart16.setBounds(805, 215, 60, 33);

        Stop16.setBackground(new java.awt.Color(255, 102, 0));
        Stop16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop16.setEnabled(false);
        Stop16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop16ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop16);
        Stop16.setBounds(872, 215, 60, 33);

        lhour16.setText("00");
        computerpage2.add(lhour16);
        lhour16.setBounds(846, 181, 14, 31);

        jLabel79.setText(":");
        computerpage2.add(jLabel79);
        jLabel79.setBounds(867, 188, 5, 16);

        lmin16.setText("00");
        computerpage2.add(lmin16);
        lmin16.setBounds(879, 181, 14, 31);

        jLabel80.setText(":");
        computerpage2.add(jLabel80);
        jLabel80.setBounds(900, 188, 5, 16);

        lsec16.setText("00");
        computerpage2.add(lsec16);
        lsec16.setBounds(912, 181, 14, 31);

        clear16.setBackground(new java.awt.Color(51, 255, 255));
        clear16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear16ActionPerformed(evt);
            }
        });
        computerpage2.add(clear16);
        clear16.setBounds(940, 180, 57, 33);

        transfer16.setBackground(new java.awt.Color(102, 255, 102));
        transfer16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer16.setEnabled(false);
        transfer16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer16ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer16);
        transfer16.setBounds(939, 215, 57, 33);

        photo16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo16);
        photo16.setBounds(862, 106, 64, 64);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setText("16");
        computerpage2.add(jLabel37);
        jLabel37.setBounds(846, 91, 20, 17);

        iconstop16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop16.setEnabled(false);
        computerpage2.add(iconstop16);
        iconstop16.setBounds(880, 70, 24, 30);

        status16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status16);
        status16.setBounds(945, 106, 80, 25);

        cusernam16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam16);
        cusernam16.setBounds(945, 146, 80, 24);

        iconstop17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop17.setEnabled(false);
        computerpage2.add(iconstop17);
        iconstop17.setBounds(90, 260, 24, 30);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText("17");
        computerpage2.add(jLabel39);
        jLabel39.setBounds(53, 287, 20, 17);

        photo17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo17);
        photo17.setBounds(69, 298, 64, 64);

        lmin17.setText("00");
        computerpage2.add(lmin17);
        lmin17.setBounds(86, 378, 14, 31);

        jLabel81.setText(":");
        computerpage2.add(jLabel81);
        jLabel81.setBounds(74, 385, 5, 16);

        lhour17.setText("00");
        computerpage2.add(lhour17);
        lhour17.setBounds(53, 378, 14, 31);

        jLabel82.setText(":");
        computerpage2.add(jLabel82);
        jLabel82.setBounds(107, 385, 5, 16);

        lsec17.setText("00");
        computerpage2.add(lsec17);
        lsec17.setBounds(119, 378, 14, 31);

        Stop17.setBackground(new java.awt.Color(255, 102, 0));
        Stop17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop17.setEnabled(false);
        Stop17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop17ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop17);
        Stop17.setBounds(79, 418, 60, 33);

        jbstart17.setBackground(new java.awt.Color(255, 255, 255));
        jbstart17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart17ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart17);
        jbstart17.setBounds(12, 418, 60, 33);

        transfer17.setBackground(new java.awt.Color(102, 255, 102));
        transfer17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer17.setEnabled(false);
        transfer17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer17ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer17);
        transfer17.setBounds(150, 420, 60, 33);

        clear17.setBackground(new java.awt.Color(51, 255, 255));
        clear17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear17ActionPerformed(evt);
            }
        });
        computerpage2.add(clear17);
        clear17.setBounds(150, 380, 57, 33);

        cusernam17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam17);
        cusernam17.setBounds(152, 338, 80, 24);

        status17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status17);
        status17.setBounds(152, 298, 80, 25);

        status15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status15);
        status15.setBounds(675, 106, 80, 25);

        cusernam15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam15);
        cusernam15.setBounds(675, 146, 80, 24);

        photo18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo18);
        photo18.setBounds(328, 298, 64, 64);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("18");
        computerpage2.add(jLabel42);
        jLabel42.setBounds(312, 287, 20, 17);

        iconstop18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop18.setEnabled(false);
        computerpage2.add(iconstop18);
        iconstop18.setBounds(350, 260, 24, 30);

        lhour18.setText("00");
        computerpage2.add(lhour18);
        lhour18.setBounds(312, 378, 14, 31);

        jLabel83.setText(":");
        computerpage2.add(jLabel83);
        jLabel83.setBounds(333, 385, 5, 16);

        lmin18.setText("00");
        computerpage2.add(lmin18);
        lmin18.setBounds(345, 378, 14, 31);

        jLabel84.setText(":");
        computerpage2.add(jLabel84);
        jLabel84.setBounds(366, 385, 5, 16);

        lsec18.setText("00");
        computerpage2.add(lsec18);
        lsec18.setBounds(378, 378, 14, 31);

        jbstart18.setBackground(new java.awt.Color(255, 255, 255));
        jbstart18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart18ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart18);
        jbstart18.setBounds(271, 418, 60, 33);

        Stop18.setBackground(new java.awt.Color(255, 102, 0));
        Stop18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop18.setEnabled(false);
        Stop18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop18ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop18);
        Stop18.setBounds(338, 418, 60, 33);

        transfer18.setBackground(new java.awt.Color(102, 255, 102));
        transfer18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer18.setEnabled(false);
        transfer18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer18ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer18);
        transfer18.setBounds(405, 418, 60, 33);

        clear18.setBackground(new java.awt.Color(51, 255, 255));
        clear18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear18ActionPerformed(evt);
            }
        });
        computerpage2.add(clear18);
        clear18.setBounds(410, 380, 57, 33);

        cusernam18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam18);
        cusernam18.setBounds(411, 338, 80, 24);

        status18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status18);
        status18.setBounds(411, 298, 80, 25);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("19");
        computerpage2.add(jLabel43);
        jLabel43.setBounds(576, 287, 20, 17);

        photo19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo19);
        photo19.setBounds(592, 298, 64, 64);

        iconstop19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop19.setEnabled(false);
        computerpage2.add(iconstop19);
        iconstop19.setBounds(610, 260, 24, 30);

        lhour19.setText("00");
        computerpage2.add(lhour19);
        lhour19.setBounds(580, 380, 14, 31);

        jLabel85.setText(":");
        computerpage2.add(jLabel85);
        jLabel85.setBounds(600, 380, 10, 30);

        lmin19.setText("00");
        computerpage2.add(lmin19);
        lmin19.setBounds(610, 380, 14, 31);

        jLabel86.setText(":");
        computerpage2.add(jLabel86);
        jLabel86.setBounds(630, 380, 10, 30);

        lsec19.setText("00");
        computerpage2.add(lsec19);
        lsec19.setBounds(640, 380, 14, 31);

        jbstart19.setBackground(new java.awt.Color(255, 255, 255));
        jbstart19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart19ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart19);
        jbstart19.setBounds(535, 418, 60, 33);

        Stop19.setBackground(new java.awt.Color(255, 102, 0));
        Stop19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop19.setEnabled(false);
        Stop19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop19ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop19);
        Stop19.setBounds(602, 418, 60, 33);

        transfer19.setBackground(new java.awt.Color(102, 255, 102));
        transfer19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer19.setEnabled(false);
        transfer19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer19ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer19);
        transfer19.setBounds(669, 418, 57, 33);

        clear19.setBackground(new java.awt.Color(51, 255, 255));
        clear19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear19ActionPerformed(evt);
            }
        });
        computerpage2.add(clear19);
        clear19.setBounds(669, 383, 57, 33);

        cusernam19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam19);
        cusernam19.setBounds(675, 338, 80, 24);

        status19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status19);
        status19.setBounds(675, 298, 80, 25);

        jbstart20.setBackground(new java.awt.Color(255, 255, 255));
        jbstart20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart20ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart20);
        jbstart20.setBounds(805, 418, 60, 33);

        Stop20.setBackground(new java.awt.Color(255, 102, 0));
        Stop20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop20.setEnabled(false);
        Stop20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop20ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop20);
        Stop20.setBounds(872, 418, 60, 33);

        lhour20.setText("00");
        computerpage2.add(lhour20);
        lhour20.setBounds(846, 380, 14, 31);

        jLabel87.setText(":");
        computerpage2.add(jLabel87);
        jLabel87.setBounds(867, 387, 5, 16);

        lmin20.setText("00");
        computerpage2.add(lmin20);
        lmin20.setBounds(879, 380, 14, 31);

        jLabel88.setText(":");
        computerpage2.add(jLabel88);
        jLabel88.setBounds(900, 387, 5, 16);

        lsec20.setText("00");
        computerpage2.add(lsec20);
        lsec20.setBounds(912, 380, 14, 31);

        transfer20.setBackground(new java.awt.Color(102, 255, 102));
        transfer20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer20.setEnabled(false);
        transfer20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer20ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer20);
        transfer20.setBounds(939, 418, 57, 33);

        clear20.setBackground(new java.awt.Color(51, 255, 255));
        clear20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear20ActionPerformed(evt);
            }
        });
        computerpage2.add(clear20);
        clear20.setBounds(938, 383, 57, 33);

        cusernam20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam20);
        cusernam20.setBounds(945, 338, 80, 24);

        status20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status20);
        status20.setBounds(945, 298, 80, 25);

        photo20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo20);
        photo20.setBounds(862, 298, 64, 64);

        jLabel89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel89.setText("20");
        computerpage2.add(jLabel89);
        jLabel89.setBounds(846, 287, 20, 17);

        iconstop20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop20.setEnabled(false);
        computerpage2.add(iconstop20);
        iconstop20.setBounds(880, 260, 24, 30);

        jbstart21.setBackground(new java.awt.Color(255, 255, 255));
        jbstart21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart21ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart21);
        jbstart21.setBounds(12, 636, 60, 33);

        Stop21.setBackground(new java.awt.Color(255, 102, 0));
        Stop21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop21.setEnabled(false);
        Stop21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop21ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop21);
        Stop21.setBounds(79, 636, 60, 33);

        transfer21.setBackground(new java.awt.Color(102, 255, 102));
        transfer21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer21.setEnabled(false);
        transfer21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer21ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer21);
        transfer21.setBounds(146, 636, 60, 33);

        clear21.setBackground(new java.awt.Color(51, 255, 255));
        clear21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear21ActionPerformed(evt);
            }
        });
        computerpage2.add(clear21);
        clear21.setBounds(145, 598, 57, 33);

        lsec21.setText("00");
        computerpage2.add(lsec21);
        lsec21.setBounds(119, 595, 14, 31);

        lmin21.setText("00");
        computerpage2.add(lmin21);
        lmin21.setBounds(86, 595, 14, 31);

        jLabel90.setText(":");
        computerpage2.add(jLabel90);
        jLabel90.setBounds(107, 602, 5, 16);

        jLabel91.setText(":");
        computerpage2.add(jLabel91);
        jLabel91.setBounds(74, 602, 5, 16);

        lhour21.setText("00");
        computerpage2.add(lhour21);
        lhour21.setBounds(53, 595, 14, 31);

        photo21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo21);
        photo21.setBounds(69, 515, 64, 64);

        iconstop21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop21.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop21.setEnabled(false);
        computerpage2.add(iconstop21);
        iconstop21.setBounds(90, 480, 24, 30);

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel92.setText("21");
        computerpage2.add(jLabel92);
        jLabel92.setBounds(53, 504, 20, 17);

        status21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status21);
        status21.setBounds(152, 515, 80, 25);

        cusernam21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam21);
        cusernam21.setBounds(152, 555, 80, 24);

        jbstart22.setBackground(new java.awt.Color(255, 255, 255));
        jbstart22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart22ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart22);
        jbstart22.setBounds(271, 636, 60, 33);

        Stop22.setBackground(new java.awt.Color(255, 102, 0));
        Stop22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop22.setEnabled(false);
        Stop22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop22ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop22);
        Stop22.setBounds(338, 636, 60, 33);

        transfer22.setBackground(new java.awt.Color(102, 255, 102));
        transfer22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer22.setEnabled(false);
        transfer22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer22ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer22);
        transfer22.setBounds(405, 636, 60, 33);

        clear22.setBackground(new java.awt.Color(51, 255, 255));
        clear22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear22ActionPerformed(evt);
            }
        });
        computerpage2.add(clear22);
        clear22.setBounds(410, 600, 57, 33);

        lsec22.setText("00");
        computerpage2.add(lsec22);
        lsec22.setBounds(378, 597, 14, 31);

        jLabel93.setText(":");
        computerpage2.add(jLabel93);
        jLabel93.setBounds(366, 604, 5, 16);

        lmin22.setText("00");
        computerpage2.add(lmin22);
        lmin22.setBounds(345, 597, 14, 31);

        lhour22.setText("00");
        computerpage2.add(lhour22);
        lhour22.setBounds(312, 597, 14, 31);

        jLabel94.setText(":");
        computerpage2.add(jLabel94);
        jLabel94.setBounds(333, 604, 5, 16);

        photo22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo22);
        photo22.setBounds(328, 515, 64, 64);

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel95.setText("22");
        computerpage2.add(jLabel95);
        jLabel95.setBounds(303, 504, 18, 17);

        iconstop22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop22.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop22.setEnabled(false);
        computerpage2.add(iconstop22);
        iconstop22.setBounds(350, 480, 24, 30);

        status22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status22);
        status22.setBounds(411, 515, 80, 25);

        cusernam22.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam22);
        cusernam22.setBounds(411, 555, 80, 24);

        jbstart23.setBackground(new java.awt.Color(255, 255, 255));
        jbstart23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart23ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart23);
        jbstart23.setBounds(534, 636, 60, 33);

        Stop23.setBackground(new java.awt.Color(255, 102, 0));
        Stop23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop23.setEnabled(false);
        Stop23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop23ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop23);
        Stop23.setBounds(601, 636, 60, 33);

        transfer23.setBackground(new java.awt.Color(102, 255, 102));
        transfer23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer23.setEnabled(false);
        transfer23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer23ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer23);
        transfer23.setBounds(668, 636, 60, 33);

        clear23.setBackground(new java.awt.Color(51, 255, 255));
        clear23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear23ActionPerformed(evt);
            }
        });
        computerpage2.add(clear23);
        clear23.setBounds(670, 600, 57, 33);

        lsec23.setText("00");
        computerpage2.add(lsec23);
        lsec23.setBounds(632, 597, 14, 31);

        lmin23.setText("00");
        computerpage2.add(lmin23);
        lmin23.setBounds(599, 597, 14, 31);

        lhour23.setText("00");
        computerpage2.add(lhour23);
        lhour23.setBounds(566, 597, 14, 31);

        jLabel96.setText(":");
        computerpage2.add(jLabel96);
        jLabel96.setBounds(587, 604, 5, 16);

        jLabel97.setText(":");
        computerpage2.add(jLabel97);
        jLabel97.setBounds(620, 604, 5, 16);

        photo23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo23);
        photo23.setBounds(591, 515, 64, 64);

        iconstop23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop23.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop23.setEnabled(false);
        computerpage2.add(iconstop23);
        iconstop23.setBounds(610, 480, 24, 30);

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel98.setText("23");
        computerpage2.add(jLabel98);
        jLabel98.setBounds(570, 500, 18, 17);

        status23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status23);
        status23.setBounds(674, 515, 80, 25);

        cusernam23.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam23);
        cusernam23.setBounds(674, 555, 80, 24);

        jbstart24.setBackground(new java.awt.Color(255, 255, 255));
        jbstart24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart24ActionPerformed(evt);
            }
        });
        computerpage2.add(jbstart24);
        jbstart24.setBounds(811, 636, 60, 33);

        Stop24.setBackground(new java.awt.Color(255, 102, 0));
        Stop24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop24.setEnabled(false);
        Stop24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop24ActionPerformed(evt);
            }
        });
        computerpage2.add(Stop24);
        Stop24.setBounds(878, 636, 60, 33);

        transfer24.setBackground(new java.awt.Color(102, 255, 102));
        transfer24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer24.setEnabled(false);
        transfer24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer24ActionPerformed(evt);
            }
        });
        computerpage2.add(transfer24);
        transfer24.setBounds(945, 636, 60, 33);

        clear24.setBackground(new java.awt.Color(51, 255, 255));
        clear24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear24ActionPerformed(evt);
            }
        });
        computerpage2.add(clear24);
        clear24.setBounds(950, 600, 57, 33);

        lsec24.setText("00");
        computerpage2.add(lsec24);
        lsec24.setBounds(910, 600, 14, 31);

        jLabel99.setText(":");
        computerpage2.add(jLabel99);
        jLabel99.setBounds(900, 600, 5, 30);

        lmin24.setText("00");
        computerpage2.add(lmin24);
        lmin24.setBounds(880, 600, 14, 31);

        jLabel100.setText(":");
        computerpage2.add(jLabel100);
        jLabel100.setBounds(870, 600, 5, 30);

        lhour24.setText("00");
        computerpage2.add(lhour24);
        lhour24.setBounds(850, 600, 14, 31);

        photo24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage2.add(photo24);
        photo24.setBounds(868, 515, 64, 64);

        iconstop24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop24.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop24.setEnabled(false);
        computerpage2.add(iconstop24);
        iconstop24.setBounds(890, 480, 24, 30);

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel101.setText("24");
        computerpage2.add(jLabel101);
        jLabel101.setBounds(843, 504, 18, 17);

        status24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(status24);
        status24.setBounds(951, 515, 80, 25);

        cusernam24.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage2.add(cusernam24);
        cusernam24.setBounds(940, 560, 80, 24);

        backpage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        backpage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backpage1MouseClicked(evt);
            }
        });
        computerpage2.add(backpage1);
        backpage1.setBounds(410, 700, 64, 37);

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("2");
        computerpage2.add(jLabel102);
        jLabel102.setBounds(490, 700, 36, 37);

        nextpage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/arrow (1).png"))); // NOI18N
        nextpage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextpage3MouseClicked(evt);
            }
        });
        computerpage2.add(nextpage3);
        nextpage3.setBounds(540, 700, 64, 37);

        nameadmin7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        nameadmin7.setForeground(new java.awt.Color(0, 255, 0));
        nameadmin7.setText(".");
        nameadmin7.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameadmin7AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        computerpage2.add(nameadmin7);
        nameadmin7.setBounds(130, 730, 80, 28);

        jLabel150.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel150.setText("Admin :");
        computerpage2.add(jLabel150);
        jLabel150.setBounds(20, 730, 94, 28);

        timepage2.setBackground(new java.awt.Color(255, 204, 255));
        timepage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        timepage2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timepage2ActionPerformed(evt);
            }
        });
        computerpage2.add(timepage2);
        timepage2.setBounds(20, 680, 65, 40);

        jLabel153.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel153.setText("เติมเวลา");
        computerpage2.add(jLabel153);
        jLabel153.setBounds(90, 690, 60, 20);

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gaming.png"))); // NOI18N
        computerpage2.add(jLabel168);
        jLabel168.setBounds(380, 20, 30, 32);

        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gaming.png"))); // NOI18N
        computerpage2.add(jLabel169);
        jLabel169.setBounds(590, 20, 30, 32);

        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel183.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        computerpage2.add(jLabel183);
        jLabel183.setBounds(990, 720, 24, 30);

        jLabel184.setFont(new java.awt.Font("TH SarabunIT๙", 1, 18)); // NOI18N
        jLabel184.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel184.setText("Start");
        computerpage2.add(jLabel184);
        jLabel184.setBounds(1030, 720, 28, 21);

        jLabel185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel185.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        computerpage2.add(jLabel185);
        jLabel185.setBounds(990, 750, 24, 30);

        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel186.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        computerpage2.add(jLabel186);
        jLabel186.setBounds(990, 780, 24, 30);

        jLabel187.setFont(new java.awt.Font("TH SarabunIT๙", 1, 18)); // NOI18N
        jLabel187.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel187.setText("Tranfer");
        computerpage2.add(jLabel187);
        jLabel187.setBounds(1030, 780, 43, 21);

        jLabel188.setFont(new java.awt.Font("TH SarabunIT๙", 1, 18)); // NOI18N
        jLabel188.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel188.setText("Stop");
        computerpage2.add(jLabel188);
        jLabel188.setBounds(1030, 750, 28, 21);

        Jmain.add(computerpage2, "card7");

        computerpage3.setBackground(new java.awt.Color(204, 204, 255));
        computerpage3.setLayout(null);

        jLabel103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel103.setText("25");
        computerpage3.add(jLabel103);
        jLabel103.setBounds(54, 91, 20, 17);

        iconstop25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop25.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop25.setEnabled(false);
        computerpage3.add(iconstop25);
        iconstop25.setBounds(90, 70, 24, 30);

        photo25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage3.add(photo25);
        photo25.setBounds(70, 106, 64, 64);

        lhour25.setText("00");
        computerpage3.add(lhour25);
        lhour25.setBounds(54, 177, 14, 31);

        jLabel104.setText(":");
        computerpage3.add(jLabel104);
        jLabel104.setBounds(75, 184, 5, 16);

        lmin25.setText("00");
        computerpage3.add(lmin25);
        lmin25.setBounds(87, 177, 14, 31);

        jLabel105.setText(":");
        computerpage3.add(jLabel105);
        jLabel105.setBounds(108, 184, 5, 16);

        lsec25.setText("00");
        computerpage3.add(lsec25);
        lsec25.setBounds(120, 177, 14, 31);

        Stop25.setBackground(new java.awt.Color(255, 102, 0));
        Stop25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop25.setEnabled(false);
        Stop25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop25ActionPerformed(evt);
            }
        });
        computerpage3.add(Stop25);
        Stop25.setBounds(79, 215, 60, 33);

        jbstart25.setBackground(new java.awt.Color(255, 255, 255));
        jbstart25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart25ActionPerformed(evt);
            }
        });
        computerpage3.add(jbstart25);
        jbstart25.setBounds(12, 215, 60, 33);

        transfer25.setBackground(new java.awt.Color(102, 255, 102));
        transfer25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer25.setEnabled(false);
        transfer25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer25ActionPerformed(evt);
            }
        });
        computerpage3.add(transfer25);
        transfer25.setBounds(146, 215, 57, 33);

        clear25.setBackground(new java.awt.Color(51, 255, 255));
        clear25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear25.setToolTipText("");
        clear25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear25ActionPerformed(evt);
            }
        });
        computerpage3.add(clear25);
        clear25.setBounds(146, 180, 57, 33);

        cusernam25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(cusernam25);
        cusernam25.setBounds(141, 146, 80, 24);

        status25.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(status25);
        status25.setBounds(141, 106, 80, 25);

        jLabel106.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel106.setText("26");
        computerpage3.add(jLabel106);
        jLabel106.setBounds(312, 91, 20, 17);

        photo26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage3.add(photo26);
        photo26.setBounds(328, 106, 64, 64);

        iconstop26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop26.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop26.setEnabled(false);
        computerpage3.add(iconstop26);
        iconstop26.setBounds(350, 70, 24, 30);

        lmin26.setText("00");
        computerpage3.add(lmin26);
        lmin26.setBounds(345, 177, 14, 31);

        lhour26.setText("00");
        computerpage3.add(lhour26);
        lhour26.setBounds(312, 177, 14, 31);

        jLabel107.setText(":");
        computerpage3.add(jLabel107);
        jLabel107.setBounds(333, 184, 5, 16);

        jbstart26.setBackground(new java.awt.Color(255, 255, 255));
        jbstart26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart26ActionPerformed(evt);
            }
        });
        computerpage3.add(jbstart26);
        jbstart26.setBounds(271, 215, 60, 33);

        Stop26.setBackground(new java.awt.Color(255, 102, 0));
        Stop26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop26.setEnabled(false);
        Stop26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop26ActionPerformed(evt);
            }
        });
        computerpage3.add(Stop26);
        Stop26.setBounds(338, 215, 60, 33);

        jLabel108.setText(":");
        computerpage3.add(jLabel108);
        jLabel108.setBounds(366, 184, 5, 16);

        lsec26.setText("00");
        computerpage3.add(lsec26);
        lsec26.setBounds(378, 177, 14, 31);

        transfer26.setBackground(new java.awt.Color(102, 255, 102));
        transfer26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer26.setEnabled(false);
        transfer26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer26ActionPerformed(evt);
            }
        });
        computerpage3.add(transfer26);
        transfer26.setBounds(405, 215, 60, 33);

        clear26.setBackground(new java.awt.Color(51, 255, 255));
        clear26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear26ActionPerformed(evt);
            }
        });
        computerpage3.add(clear26);
        clear26.setBounds(410, 178, 57, 33);

        cusernam26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(cusernam26);
        cusernam26.setBounds(411, 146, 80, 24);

        status26.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(status26);
        status26.setBounds(411, 106, 80, 25);

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel109.setText("27");
        computerpage3.add(jLabel109);
        jLabel109.setBounds(576, 91, 20, 17);

        iconstop27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop27.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop27.setEnabled(false);
        computerpage3.add(iconstop27);
        iconstop27.setBounds(610, 70, 24, 30);

        photo27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage3.add(photo27);
        photo27.setBounds(592, 106, 64, 64);

        lhour27.setText("00");
        computerpage3.add(lhour27);
        lhour27.setBounds(576, 181, 14, 31);

        jLabel110.setText(":");
        computerpage3.add(jLabel110);
        jLabel110.setBounds(597, 188, 5, 16);

        lmin27.setText("00");
        computerpage3.add(lmin27);
        lmin27.setBounds(609, 181, 14, 31);

        jLabel111.setText(":");
        computerpage3.add(jLabel111);
        jLabel111.setBounds(630, 188, 5, 16);

        lsec27.setText("00");
        computerpage3.add(lsec27);
        lsec27.setBounds(642, 181, 14, 31);

        jbstart27.setBackground(new java.awt.Color(255, 255, 255));
        jbstart27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart27ActionPerformed(evt);
            }
        });
        computerpage3.add(jbstart27);
        jbstart27.setBounds(535, 215, 60, 33);

        Stop27.setBackground(new java.awt.Color(255, 102, 0));
        Stop27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop27.setEnabled(false);
        Stop27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop27ActionPerformed(evt);
            }
        });
        computerpage3.add(Stop27);
        Stop27.setBounds(602, 215, 60, 33);

        transfer27.setBackground(new java.awt.Color(102, 255, 102));
        transfer27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer27.setEnabled(false);
        transfer27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer27ActionPerformed(evt);
            }
        });
        computerpage3.add(transfer27);
        transfer27.setBounds(669, 215, 60, 33);

        clear27.setBackground(new java.awt.Color(51, 255, 255));
        clear27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear27ActionPerformed(evt);
            }
        });
        computerpage3.add(clear27);
        clear27.setBounds(670, 180, 57, 33);

        jLabel10.setFont(new java.awt.Font("TH SarabunIT๙", 1, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("เลือกคอมพิวเตอร์");
        computerpage3.add(jLabel10);
        jLabel10.setBounds(414, 13, 171, 42);

        jbstart28.setBackground(new java.awt.Color(255, 255, 255));
        jbstart28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart28ActionPerformed(evt);
            }
        });
        computerpage3.add(jbstart28);
        jbstart28.setBounds(805, 215, 60, 33);

        Stop28.setBackground(new java.awt.Color(255, 102, 0));
        Stop28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop28.setEnabled(false);
        Stop28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop28ActionPerformed(evt);
            }
        });
        computerpage3.add(Stop28);
        Stop28.setBounds(872, 215, 60, 33);

        lhour28.setText("00");
        computerpage3.add(lhour28);
        lhour28.setBounds(846, 181, 14, 31);

        jLabel112.setText(":");
        computerpage3.add(jLabel112);
        jLabel112.setBounds(867, 188, 5, 16);

        lmin28.setText("00");
        computerpage3.add(lmin28);
        lmin28.setBounds(879, 181, 14, 31);

        jLabel113.setText(":");
        computerpage3.add(jLabel113);
        jLabel113.setBounds(900, 188, 5, 16);

        lsec28.setText("00");
        computerpage3.add(lsec28);
        lsec28.setBounds(912, 181, 14, 31);

        clear28.setBackground(new java.awt.Color(51, 255, 255));
        clear28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear28ActionPerformed(evt);
            }
        });
        computerpage3.add(clear28);
        clear28.setBounds(940, 180, 57, 33);

        transfer28.setBackground(new java.awt.Color(102, 255, 102));
        transfer28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer28.setEnabled(false);
        transfer28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer28ActionPerformed(evt);
            }
        });
        computerpage3.add(transfer28);
        transfer28.setBounds(939, 215, 57, 33);

        photo28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage3.add(photo28);
        photo28.setBounds(862, 106, 64, 64);

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel114.setText("28");
        computerpage3.add(jLabel114);
        jLabel114.setBounds(846, 91, 20, 17);

        iconstop28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop28.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop28.setEnabled(false);
        computerpage3.add(iconstop28);
        iconstop28.setBounds(880, 70, 24, 30);

        status28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(status28);
        status28.setBounds(945, 106, 80, 25);

        cusernam28.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(cusernam28);
        cusernam28.setBounds(945, 146, 80, 24);

        iconstop29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop29.setEnabled(false);
        computerpage3.add(iconstop29);
        iconstop29.setBounds(90, 260, 24, 30);

        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel115.setText("29");
        computerpage3.add(jLabel115);
        jLabel115.setBounds(53, 287, 20, 17);

        photo29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage3.add(photo29);
        photo29.setBounds(69, 298, 64, 64);

        lmin29.setText("00");
        computerpage3.add(lmin29);
        lmin29.setBounds(86, 378, 14, 31);

        jLabel116.setText(":");
        computerpage3.add(jLabel116);
        jLabel116.setBounds(74, 385, 5, 16);

        lhour29.setText("00");
        computerpage3.add(lhour29);
        lhour29.setBounds(53, 378, 14, 31);

        jLabel117.setText(":");
        computerpage3.add(jLabel117);
        jLabel117.setBounds(107, 385, 5, 16);

        lsec29.setText("00");
        computerpage3.add(lsec29);
        lsec29.setBounds(119, 378, 14, 31);

        Stop29.setBackground(new java.awt.Color(255, 102, 0));
        Stop29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop29.setEnabled(false);
        Stop29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop29ActionPerformed(evt);
            }
        });
        computerpage3.add(Stop29);
        Stop29.setBounds(79, 418, 60, 33);

        jbstart29.setBackground(new java.awt.Color(255, 255, 255));
        jbstart29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart29ActionPerformed(evt);
            }
        });
        computerpage3.add(jbstart29);
        jbstart29.setBounds(12, 418, 60, 33);

        transfer29.setBackground(new java.awt.Color(102, 255, 102));
        transfer29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer29.setEnabled(false);
        transfer29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer29ActionPerformed(evt);
            }
        });
        computerpage3.add(transfer29);
        transfer29.setBounds(146, 418, 60, 33);

        clear29.setBackground(new java.awt.Color(51, 255, 255));
        clear29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear29ActionPerformed(evt);
            }
        });
        computerpage3.add(clear29);
        clear29.setBounds(150, 380, 57, 33);

        cusernam29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(cusernam29);
        cusernam29.setBounds(152, 338, 80, 24);

        status29.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(status29);
        status29.setBounds(152, 298, 80, 25);

        status27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(status27);
        status27.setBounds(675, 106, 80, 25);

        cusernam27.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(cusernam27);
        cusernam27.setBounds(675, 146, 80, 24);

        photo30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/computer.png"))); // NOI18N
        computerpage3.add(photo30);
        photo30.setBounds(328, 298, 64, 64);

        jLabel118.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel118.setText("30");
        computerpage3.add(jLabel118);
        jLabel118.setBounds(312, 287, 20, 17);

        iconstop30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/stop.png"))); // NOI18N
        iconstop30.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconstop30.setEnabled(false);
        computerpage3.add(iconstop30);
        iconstop30.setBounds(350, 260, 24, 30);

        lhour30.setText("00");
        computerpage3.add(lhour30);
        lhour30.setBounds(312, 378, 14, 31);

        jLabel119.setText(":");
        computerpage3.add(jLabel119);
        jLabel119.setBounds(333, 385, 5, 16);

        lmin30.setText("00");
        computerpage3.add(lmin30);
        lmin30.setBounds(345, 378, 14, 31);

        jLabel120.setText(":");
        computerpage3.add(jLabel120);
        jLabel120.setBounds(366, 385, 5, 16);

        lsec30.setText("00");
        computerpage3.add(lsec30);
        lsec30.setBounds(378, 378, 14, 31);

        jbstart30.setBackground(new java.awt.Color(255, 255, 255));
        jbstart30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        jbstart30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbstart30ActionPerformed(evt);
            }
        });
        computerpage3.add(jbstart30);
        jbstart30.setBounds(271, 418, 60, 33);

        Stop30.setBackground(new java.awt.Color(255, 102, 0));
        Stop30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        Stop30.setEnabled(false);
        Stop30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stop30ActionPerformed(evt);
            }
        });
        computerpage3.add(Stop30);
        Stop30.setBounds(338, 418, 60, 33);

        transfer30.setBackground(new java.awt.Color(102, 255, 102));
        transfer30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        transfer30.setEnabled(false);
        transfer30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transfer30ActionPerformed(evt);
            }
        });
        computerpage3.add(transfer30);
        transfer30.setBounds(405, 418, 60, 33);

        clear30.setBackground(new java.awt.Color(51, 255, 255));
        clear30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/broommin.png"))); // NOI18N
        clear30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear30ActionPerformed(evt);
            }
        });
        computerpage3.add(clear30);
        clear30.setBounds(410, 381, 57, 33);

        cusernam30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cusernam30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(cusernam30);
        cusernam30.setBounds(411, 338, 80, 24);

        status30.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        status30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        computerpage3.add(status30);
        status30.setBounds(411, 298, 80, 25);

        jLabel134.setText(":");
        computerpage3.add(jLabel134);
        jLabel134.setBounds(620, 604, 5, 16);

        backpage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        backpage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backpage3MouseClicked(evt);
            }
        });
        computerpage3.add(backpage3);
        backpage3.setBounds(410, 700, 64, 37);

        jLabel139.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("3");
        computerpage3.add(jLabel139);
        jLabel139.setBounds(490, 700, 36, 37);

        nameadmin4.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        nameadmin4.setForeground(new java.awt.Color(0, 255, 0));
        nameadmin4.setText(".");
        nameadmin4.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameadmin4AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        computerpage3.add(nameadmin4);
        nameadmin4.setBounds(130, 730, 80, 28);

        jLabel147.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel147.setText("Admin :");
        computerpage3.add(jLabel147);
        jLabel147.setBounds(20, 730, 94, 28);

        timepage3.setBackground(new java.awt.Color(255, 204, 255));
        timepage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clock.png"))); // NOI18N
        timepage3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timepage3ActionPerformed(evt);
            }
        });
        computerpage3.add(timepage3);
        timepage3.setBounds(20, 680, 65, 40);

        jLabel143.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel143.setText("เติมเวลา");
        computerpage3.add(jLabel143);
        jLabel143.setBounds(90, 690, 60, 20);

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gaming.png"))); // NOI18N
        computerpage3.add(jLabel170);
        jLabel170.setBounds(380, 20, 30, 32);

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gaming.png"))); // NOI18N
        computerpage3.add(jLabel171);
        jLabel171.setBounds(590, 20, 30, 32);

        jLabel189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel189.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ap.png"))); // NOI18N
        computerpage3.add(jLabel189);
        jLabel189.setBounds(990, 720, 24, 30);

        jLabel190.setFont(new java.awt.Font("TH SarabunIT๙", 1, 18)); // NOI18N
        jLabel190.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel190.setText("Start");
        computerpage3.add(jLabel190);
        jLabel190.setBounds(1030, 720, 28, 21);

        jLabel191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel191.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/music-and-multimedia.png"))); // NOI18N
        computerpage3.add(jLabel191);
        jLabel191.setBounds(990, 750, 24, 30);

        jLabel192.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel192.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/transfer.png"))); // NOI18N
        computerpage3.add(jLabel192);
        jLabel192.setBounds(990, 780, 24, 30);

        jLabel193.setFont(new java.awt.Font("TH SarabunIT๙", 1, 18)); // NOI18N
        jLabel193.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel193.setText("Tranfer");
        computerpage3.add(jLabel193);
        jLabel193.setBounds(1030, 780, 43, 21);

        jLabel194.setFont(new java.awt.Font("TH SarabunIT๙", 1, 18)); // NOI18N
        jLabel194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel194.setText("Stop");
        computerpage3.add(jLabel194);
        jLabel194.setBounds(1030, 750, 28, 21);

        Jmain.add(computerpage3, "card8");

        dataadmin.setBackground(new java.awt.Color(102, 102, 102));
        dataadmin.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Admin");
        dataadmin.add(jLabel12);
        jLabel12.setBounds(506, 32, 104, 26);

        textname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textname.setForeground(new java.awt.Color(255, 255, 255));
        textname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textname.setEnabled(false);
        dataadmin.add(textname);
        textname.setBounds(260, 186, 187, 41);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.setEnabled(false);
        dataadmin.add(jTextField8);
        jTextField8.setBounds(459, 186, 208, 41);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setFocusTraversalPolicyProvider(true);
        jScrollPane5.setViewportView(jTable2);

        dataadmin.add(jScrollPane5);
        jScrollPane5.setBounds(133, 245, 790, 450);

        excel.setBackground(new java.awt.Color(204, 255, 204));
        excel.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        excel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excel.png"))); // NOI18N
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });
        dataadmin.add(excel);
        excel.setBounds(940, 300, 104, 70);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consult.png"))); // NOI18N
        dataadmin.add(jLabel16);
        jLabel16.setBounds(435, 13, 64, 64);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/data-analytics.png"))); // NOI18N
        dataadmin.add(jLabel17);
        jLabel17.setBounds(60, 250, 64, 64);

        iconphoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconphoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report.png"))); // NOI18N
        dataadmin.add(iconphoto);
        iconphoto.setBounds(210, 186, 32, 39);

        findname1.setBackground(new java.awt.Color(102, 255, 255));
        findname1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        findname1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/find.png"))); // NOI18N
        findname1.setEnabled(false);
        findname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findname1ActionPerformed(evt);
            }
        });
        dataadmin.add(findname1);
        findname1.setBounds(679, 186, 65, 41);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ดูยอดขายทั้งหมด", "ดูยอดขายต่อวัน", "ดูยอดขายต่อเดือน", "ดูยอดขายต่อปี", "ยอดโดยรวมของสมาชิก", "ยอดโดยรวมของไม่เป็นสมาชิก", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        dataadmin.add(jComboBox1);
        jComboBox1.setBounds(399, 118, 345, 40);

        nameadmin3.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        nameadmin3.setForeground(new java.awt.Color(0, 255, 0));
        nameadmin3.setText(".");
        nameadmin3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameadmin3AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        dataadmin.add(nameadmin3);
        nameadmin3.setBounds(130, 730, 80, 28);

        jLabel146.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel146.setText("Admin :");
        dataadmin.add(jLabel146);
        jLabel146.setBounds(20, 730, 94, 28);

        Jmain.add(dataadmin, "card9");

        deleteupdate.setBackground(new java.awt.Color(102, 102, 102));
        deleteupdate.setForeground(new java.awt.Color(255, 255, 255));
        deleteupdate.setLayout(null);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable4.setFocusTraversalPolicyProvider(true);
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable4);

        deleteupdate.add(jScrollPane7);
        jScrollPane7.setBounds(100, 160, 810, 270);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/consult.png"))); // NOI18N
        deleteupdate.add(jLabel18);
        jLabel18.setBounds(435, 13, 64, 64);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Admin");
        deleteupdate.add(jLabel13);
        jLabel13.setBounds(506, 32, 104, 26);

        jLabel142.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/data-analytics.png"))); // NOI18N
        deleteupdate.add(jLabel142);
        jLabel142.setBounds(20, 160, 64, 64);

        excel1.setBackground(new java.awt.Color(204, 255, 204));
        excel1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        excel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/excel.png"))); // NOI18N
        excel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excel1ActionPerformed(evt);
            }
        });
        deleteupdate.add(excel1);
        excel1.setBounds(920, 160, 104, 70);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ตารางข้อมูลCustomers", "ตารางข้อมูลUser", "ตารางข้อมูลOrders", "ตารางข้อมูลComputer", "ตารางข้อมูลCustomers+User", "ตารางข้อมูลAdmin" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        deleteupdate.add(jComboBox2);
        jComboBox2.setBounds(350, 100, 345, 40);

        update1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update1);
        update1.setBounds(260, 470, 180, 30);

        update2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update2);
        update2.setBounds(260, 510, 180, 30);

        update3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update3);
        update3.setBounds(260, 550, 180, 30);

        update4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update4);
        update4.setBounds(260, 590, 180, 30);

        update5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update5);
        update5.setBounds(260, 630, 180, 30);

        update6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update6);
        update6.setBounds(670, 470, 240, 30);

        update7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update7);
        update7.setBounds(670, 530, 240, 30);

        update8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update8);
        update8.setBounds(670, 590, 240, 30);

        update9.setColumns(20);
        update9.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        update9.setRows(5);
        update9.setEnabled(false);
        jScrollPane2.setViewportView(update9);

        deleteupdate.add(jScrollPane2);
        jScrollPane2.setBounds(670, 650, 250, 130);

        t1.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t1);
        t1.setBounds(120, 470, 130, 30);

        t2.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t2);
        t2.setBounds(120, 510, 120, 30);

        t3.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t3);
        t3.setBounds(120, 550, 120, 30);

        t4.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t4);
        t4.setBounds(120, 590, 120, 30);

        t5.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));
        t5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t5);
        t5.setBounds(130, 630, 120, 30);

        t6.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t6.setForeground(new java.awt.Color(255, 255, 255));
        t6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t6);
        t6.setBounds(540, 470, 120, 30);

        t7.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t7.setForeground(new java.awt.Color(255, 255, 255));
        t7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t7);
        t7.setBounds(540, 530, 120, 30);

        t8.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t8.setForeground(new java.awt.Color(255, 255, 255));
        t8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t8);
        t8.setBounds(540, 590, 120, 30);

        t9.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t9.setForeground(new java.awt.Color(255, 255, 255));
        t9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t9);
        t9.setBounds(540, 650, 120, 30);

        p2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name.png"))); // NOI18N
        p2.setEnabled(false);
        deleteupdate.add(p2);
        p2.setBounds(80, 510, 32, 32);

        p3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name.png"))); // NOI18N
        p3.setEnabled(false);
        deleteupdate.add(p3);
        p3.setBounds(80, 550, 32, 32);

        p4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/telephone.png"))); // NOI18N
        p4.setEnabled(false);
        deleteupdate.add(p4);
        p4.setBounds(80, 590, 32, 32);

        p5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail.png"))); // NOI18N
        p5.setEnabled(false);
        deleteupdate.add(p5);
        p5.setBounds(80, 630, 32, 32);

        p6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/typing.png"))); // NOI18N
        p6.setEnabled(false);
        deleteupdate.add(p6);
        p6.setBounds(500, 470, 32, 32);

        p1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id-card.png"))); // NOI18N
        p1.setEnabled(false);
        deleteupdate.add(p1);
        p1.setBounds(80, 470, 32, 32);

        p7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/head.png"))); // NOI18N
        p7.setEnabled(false);
        deleteupdate.add(p7);
        p7.setBounds(500, 530, 32, 32);

        p8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laptop.png"))); // NOI18N
        p8.setEnabled(false);
        deleteupdate.add(p8);
        p8.setBounds(500, 590, 32, 32);

        p9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/address.png"))); // NOI18N
        p9.setEnabled(false);
        deleteupdate.add(p9);
        p9.setBounds(500, 650, 32, 32);

        jComboBox3.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Available", "User", "Repair", "Dilapidated" }));
        jComboBox3.setEnabled(false);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        deleteupdate.add(jComboBox3);
        jComboBox3.setBounds(950, 590, 110, 30);

        updatedata.setBackground(new java.awt.Color(51, 153, 255));
        updatedata.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        updatedata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/system-update.png"))); // NOI18N
        updatedata.setText("Update");
        updatedata.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        updatedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatedataActionPerformed(evt);
            }
        });
        deleteupdate.add(updatedata);
        updatedata.setBounds(920, 260, 160, 70);

        deletedata.setBackground(new java.awt.Color(153, 255, 255));
        deletedata.setFont(new java.awt.Font("TH SarabunIT๙", 1, 24)); // NOI18N
        deletedata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/bin.png"))); // NOI18N
        deletedata.setText("Delete");
        deletedata.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deletedata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedataActionPerformed(evt);
            }
        });
        deleteupdate.add(deletedata);
        deletedata.setBounds(920, 360, 160, 70);

        nameadmin8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        nameadmin8.setForeground(new java.awt.Color(0, 255, 0));
        nameadmin8.setText(".");
        nameadmin8.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                nameadmin8AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        deleteupdate.add(nameadmin8);
        nameadmin8.setBounds(150, 770, 80, 28);

        jLabel151.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 24)); // NOI18N
        jLabel151.setText("Admin :");
        deleteupdate.add(jLabel151);
        jLabel151.setBounds(40, 770, 94, 28);

        p10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/gmail.png"))); // NOI18N
        p10.setEnabled(false);
        deleteupdate.add(p10);
        p10.setBounds(80, 710, 32, 32);

        t10.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t10.setForeground(new java.awt.Color(255, 255, 255));
        t10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t10);
        t10.setBounds(120, 710, 120, 30);

        update10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update10);
        update10.setBounds(260, 710, 90, 30);

        t11.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t11.setForeground(new java.awt.Color(255, 255, 255));
        t11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t11);
        t11.setBounds(120, 670, 120, 30);

        p11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        p11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/telephone.png"))); // NOI18N
        p11.setEnabled(false);
        deleteupdate.add(p11);
        p11.setBounds(80, 670, 32, 32);

        update11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        deleteupdate.add(update11);
        update11.setBounds(260, 670, 180, 30);

        t12.setFont(new java.awt.Font("TH SarabunIT๙", 1, 26)); // NOI18N
        t12.setForeground(new java.awt.Color(255, 255, 255));
        t12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteupdate.add(t12);
        t12.setBounds(120, 670, 120, 30);

        jsex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ชาย", "หญิง" }));
        jsex.setEnabled(false);
        jsex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsexActionPerformed(evt);
            }
        });
        deleteupdate.add(jsex);
        jsex.setBounds(370, 710, 70, 30);

        Jmain.add(deleteupdate, "card10");

        Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/main.png"))); // NOI18N
        Main.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Main.setLabel("Main");
        Main.setPreferredSize(new java.awt.Dimension(75, 35));
        Main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MainMouseClicked(evt);
            }
        });
        jMenuBar1.add(Main);

        Register.setBackground(new java.awt.Color(255, 255, 255));
        Register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/acc.png"))); // NOI18N
        Register.setLabel("Register");
        Register.setPreferredSize(new java.awt.Dimension(96, 24));
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
        });

        newregister.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/24_member_add.png"))); // NOI18N
        newregister.setText("สมัครสมาชิกใหม่");
        newregister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newregisterMouseClicked(evt);
            }
        });
        Register.add(newregister);

        registerID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/id.png"))); // NOI18N
        registerID.setText("สมัครID");
        registerID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerIDMouseClicked(evt);
            }
        });
        Register.add(registerID);

        jMenuBar1.add(Register);

        registpayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/buying.png"))); // NOI18N
        registpayment.setText(" Payment");
        registpayment.setPreferredSize(new java.awt.Dimension(103, 24));
        registpayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registpaymentMouseClicked(evt);
            }
        });
        jMenuBar1.add(registpayment);

        Reservations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/booking.png"))); // NOI18N
        Reservations.setText(" Reservations");
        Reservations.setPreferredSize(new java.awt.Dimension(128, 24));
        Reservations.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReservationsMouseClicked(evt);
            }
        });
        jMenuBar1.add(Reservations);

        Admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/worker.png"))); // NOI18N
        Admin.setText("Admin");
        Admin.setPreferredSize(new java.awt.Dimension(86, 24));

        dataanalysis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/businessmen.png"))); // NOI18N
        dataanalysis.setText("Data analysis");
        dataanalysis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataanalysisMouseClicked(evt);
            }
        });
        Admin.add(dataanalysis);

        selectupdatedelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/folder.png"))); // NOI18N
        selectupdatedelete.setText("Select Update Delete");
        selectupdatedelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectupdatedeleteMouseClicked(evt);
            }
        });
        Admin.add(selectupdatedelete);

        jMenuBar1.add(Admin);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logout.png"))); // NOI18N
        jMenu1.setText("Logout");
        jMenu1.setPreferredSize(new java.awt.Dimension(88, 30));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit.png"))); // NOI18N
        exit.setText("Exit");
        exit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        exit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        exit.setPreferredSize(new java.awt.Dimension(68, 30));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jMenuBar1.add(exit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BregisterActionPerformed
        try{
            String sql = "INSERT INTO customers (CustomerID,Name,LastName,Age,Tel,Gender,Email,Address) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, tcustomerID.getText());
            stmt.setString(2, tname.getText());
            stmt.setString(3, tlastname.getText());
            stmt.setString(4, tage.getText());
            stmt.setString(5, ttel.getText());
            stmt.setString(6, gender.getSelectedItem().toString());
            stmt.setString(7, temail.getText());
            stmt.setString(8, Aaddress.getText());
            stmt.executeUpdate();
            stmt.close();
            String sql1 = "INSERT INTO customersID (CustomerID,User,Password) VALUES (?,?,?)";
            PreparedStatement stmt1 = c.prepareStatement(sql1);
            stmt1.setString(1, tcustomerID.getText());
            stmt1.setString(2, tusername.getText());
            stmt1.setString(3, tpassword.getText());
            stmt1.executeUpdate();
            stmt1.close();
         JOptionPane.showMessageDialog(null, "สมัครสมาชิกสำเร็จ","สมัครสมาชิก",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {e.printStackTrace();
         JOptionPane.showMessageDialog(null,"ลงทะเบียนไม่สำเร็จ",
                "EROR",JOptionPane.ERROR_MESSAGE);}
            showTable2();
            tcustomerID.setText(""+(customernumber+1));
            tname.setText("");
            tlastname.setText("");
            ttel.setText("");
            temail.setText("");
            Aaddress.setText("");
            tusername.setText("");
            tpassword.setText("");
            tage.setText("");
            gender.setSelectedIndex(0);
            
    }//GEN-LAST:event_BregisterActionPerformed

    private void MainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MainMouseClicked
        c1.first(Jmain);
    }//GEN-LAST:event_MainMouseClicked

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked

    }//GEN-LAST:event_RegisterMouseClicked

    private void JbfindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbfindActionPerformed
        try{
            if(Jtfind.getText().equals("")){
                JOptionPane.showMessageDialog(null, "โปรดใส่ Username","ERROR",JOptionPane.ERROR_MESSAGE);}
            else{
                DefaultTableModel dtm = new DefaultTableModel();
                jTable1.setModel(dtm);
                dtm.setColumnCount(5);
                dtm.setRowCount(1);
                String sql = "SELECT UserID,customers.CustomerID as CustomerID,User,Name,Lastname FROM customersid INNER JOIN customers ON customersid.CustomerID = customers.CustomerID WHERE User = ?";
                PreparedStatement stmt = c.prepareStatement(sql);
                stmt.setString(1, Jtfind.getText());
                String[] names = {"UserID","CustomerID","User","Name","Lastname"};
                for (int i = 0; i < names.length; i++) {
                    jTable1.getColumnModel().getColumn(i).setHeaderValue(names[i]);}
                   
                ResultSet rs = stmt.executeQuery();
                int n = 0;
                while(rs.next()){
                    dtm.setValueAt(rs.getString("UserID"), n, 0);
                    dtm.setValueAt(rs.getString("CustomerID"), n, 1);
                    dtm.setValueAt(rs.getString("User"), n, 2);
                    dtm.setValueAt(rs.getString("Name"), n, 3);
                    dtm.setValueAt(rs.getString("Lastname"), n, 4);
                    n++;
                    dtm.setRowCount(n+1);}
            }
        }
        catch(Exception e){e.printStackTrace();}                                     
    }//GEN-LAST:event_JbfindActionPerformed

    private void jbox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbox1ActionPerformed
          if(jRadioButton1.isSelected()){
        if(jbox1.getSelectedIndex() == 0){
            Jtprice.setText("-");  
        }if(jbox1.getSelectedIndex() == 1){
            Jtprice.setText("10.00");
        }if(jbox1.getSelectedIndex() == 2){
            Jtprice.setText("20.00");
        }if(jbox1.getSelectedIndex() == 3){
            Jtprice.setText("30.00");
        }if(jbox1.getSelectedIndex() == 4){
            Jtprice.setText("40.00");
        }if(jbox1.getSelectedIndex() == 5){
            Jtprice.setText("50.00");
        }if(jbox1.getSelectedIndex() == 6){
            Jtprice.setText("60.00");
        }if(jbox1.getSelectedIndex() == 7){
            Jtprice.setText("70.00");
        }if(jbox1.getSelectedIndex() == 8){
            Jtprice.setText("80.00");
        }if(jbox1.getSelectedIndex() == 9){
            Jtprice.setText("90.00");
        }if(jbox1.getSelectedIndex() == 10){
            Jtprice.setText("100.00"); 
           }if(jbox1.getSelectedIndex() == 11){
            Jtprice.setText("110.00");  
        }if(jbox1.getSelectedIndex() == 12){
            Jtprice.setText("120.00");
        }if(jbox1.getSelectedIndex() == 13){
            Jtprice.setText("130.00");
        }if(jbox1.getSelectedIndex() == 14){
            Jtprice.setText("140.00");
        }if(jbox1.getSelectedIndex() == 15){
            Jtprice.setText("150.00");
        }if(jbox1.getSelectedIndex() == 16){
            Jtprice.setText("160.00");
        }if(jbox1.getSelectedIndex() == 17){
            Jtprice.setText("170.00");
        }if(jbox1.getSelectedIndex() == 18){
            Jtprice.setText("180.00");
        }if(jbox1.getSelectedIndex() == 19){
            Jtprice.setText("190.00");
        }if(jbox1.getSelectedIndex() == 20){
            Jtprice.setText("200.00");
        }if(jbox1.getSelectedIndex() == 21){
            Jtprice.setText("210.00"); 
           }if(jbox1.getSelectedIndex() == 22){
            Jtprice.setText("220.00");
        }if(jbox1.getSelectedIndex() == 23){
            Jtprice.setText("230.00");
        }if(jbox1.getSelectedIndex() == 24){
            Jtprice.setText("240.00"); 
           }
          }else if(jRadioButton2.isSelected()){
        if(jbox1.getSelectedIndex() == 0){
            Jtprice.setText("-");  
        }if(jbox1.getSelectedIndex() == 1){
            Jtprice.setText("15.00");
        }if(jbox1.getSelectedIndex() == 2){
            Jtprice.setText("30.00");
        }if(jbox1.getSelectedIndex() == 3){
            Jtprice.setText("45.00");
        }if(jbox1.getSelectedIndex() == 4){
            Jtprice.setText("60.00");
        }if(jbox1.getSelectedIndex() == 5){
            Jtprice.setText("75.00");
        }if(jbox1.getSelectedIndex() == 6){
            Jtprice.setText("90.00");
        }if(jbox1.getSelectedIndex() == 7){
            Jtprice.setText("105.00");
        }if(jbox1.getSelectedIndex() == 8){
            Jtprice.setText("120.00");
        }if(jbox1.getSelectedIndex() == 9){
            Jtprice.setText("135.00");
        }if(jbox1.getSelectedIndex() == 10){
            Jtprice.setText("150.00"); 
           }if(jbox1.getSelectedIndex() == 11){
            Jtprice.setText("165.00");  
        }if(jbox1.getSelectedIndex() == 12){
            Jtprice.setText("180.00");
        }if(jbox1.getSelectedIndex() == 13){
            Jtprice.setText("195.00");
        }if(jbox1.getSelectedIndex() == 14){
            Jtprice.setText("210.00");
        }if(jbox1.getSelectedIndex() == 15){
            Jtprice.setText("225.00");
        }if(jbox1.getSelectedIndex() == 16){
            Jtprice.setText("240.00");
        }if(jbox1.getSelectedIndex() == 17){
            Jtprice.setText("255.00");
        }if(jbox1.getSelectedIndex() == 18){
            Jtprice.setText("270.00");
        }if(jbox1.getSelectedIndex() == 19){
            Jtprice.setText("285.00");
        }if(jbox1.getSelectedIndex() == 20){
            Jtprice.setText("300.00");
        }if(jbox1.getSelectedIndex() == 21){
            Jtprice.setText("315.00"); 
           }if(jbox1.getSelectedIndex() == 22){
            Jtprice.setText("330.00");
        }if(jbox1.getSelectedIndex() == 23){
            Jtprice.setText("345.00");
        }if(jbox1.getSelectedIndex() == 24){
            Jtprice.setText("360.00"); 
           }
          }
    }//GEN-LAST:event_jbox1ActionPerformed

    private void jtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnameActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int row =  jTable1.getSelectedRow();
        
       Jtuserid.setText(model.getValueAt(row, 0).toString());
       Jtusername.setText(model.getValueAt(row, 2).toString());
       JtcustomerId.setText(model.getValueAt(row, 1).toString());
       jtname.setText(model.getValueAt(row, 3).toString());
       jtlastname.setText(model.getValueAt(row, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked
    double price;
    double getmoney;
    double change;
    private void jbpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbpaymentActionPerformed
        if(jRadioButton1.isSelected()){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        DecimalFormat dollars = new DecimalFormat("0.00");
         if(jbox1.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "กรุณาเลือกจำนวณชั่วโมง","ERROR",JOptionPane.ERROR_MESSAGE);
         }else if(Jtgetmoney.getText().equals("")){
            JOptionPane.showMessageDialog(null, "กรุณากรอกจำนวนเงิน","ERROR",JOptionPane.ERROR_MESSAGE); }       
            if(jbox1.getSelectedIndex() == 1){
            calCulate();}
            else if(jbox1.getSelectedIndex() == 2){
            calCulate();    
            } else if(jbox1.getSelectedIndex() == 3){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 4){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 5){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 6){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 7){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 8){
            calCulate();
            }else if(jbox1.getSelectedIndex() == 9){
            calCulate();  
            }else if(jbox1.getSelectedIndex() == 10){
            calCulate();    
            }else if(jbox1.getSelectedIndex() == 11){
            calCulate();}
            else if(jbox1.getSelectedIndex() == 12){
            calCulate();    
            } else if(jbox1.getSelectedIndex() == 13){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 14){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 15){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 16){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 17){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 18){
            calCulate();
            }else if(jbox1.getSelectedIndex() == 19){
            calCulate();  
            }else if(jbox1.getSelectedIndex() == 20){
            calCulate();    
            } else if(jbox1.getSelectedIndex() == 21){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 22){
            calCulate();
            }else if(jbox1.getSelectedIndex() == 23){
            calCulate();  
            }else if(jbox1.getSelectedIndex() == 24){
            calCulate();    
            }
            if(!(Jtgetmoney.getText().equals(""))&&getmoney >= price ){
            Jtchange.setText(String.valueOf(dollars.format(change)));
             JOptionPane.showMessageDialog(null, "ชำระเงินสำเร็จ","INFO",JOptionPane.INFORMATION_MESSAGE);
             jLabel21.setEnabled(true);
             try{         
            String sql = "INSERT INTO orders (UserID,Hour,price) VALUES (?,?,?)";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, Jtuserid.getText());
            stmt.setInt(2, jbox1.getSelectedIndex());
            stmt.setString(3, Jtprice.getText());
            stmt.executeUpdate();           
             } catch (Exception e) {e.printStackTrace();}
           try{
               String sql = "SELECT OrderID FROM orders ORDER BY OrderID DESC LIMIT 1";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("OrderID");
        jtreceipt.append("-------------------------NETCAFE---------------------------\n");
        jtreceipt.append("----------------------------สมาชิก--------------------------------\n");
        jtreceipt.append("--------------------------------------------------------------------\n");
        jtreceipt.append("OrderID : "+ rs.getString("OrderID")+"\n");
        jtreceipt.append("คุณ "+jtname.getText());
        jtreceipt.append(" "+jtlastname.getText()+"\n");
        jtreceipt.append("UserID "+Jtuserid.getText()+" : ");
        jtreceipt.append(" "+Jtusername.getText()+"\n");
        jtreceipt.append("Date : "+formattedDate+"\n");
        jtreceipt.append("--------------------------------------------------------------------\n");
        jtreceipt.append("จำนวณชั่วโมง :");
        jtreceipt.append("\t"+jbox1.getSelectedIndex()+"\t ชม.\n");
        jtreceipt.append("ราคา          :");
        jtreceipt.append("                "+Jtprice.getText()+"\t บาท\n");
        jtreceipt.append("--------------------------------------------------------------------\n");
        jtreceipt.append("รับเงิน        :");
        jtreceipt.append("\t"+dollars.format(getmoney)+"\t บาท\n");
        jtreceipt.append("เงินทอน      :");
        jtreceipt.append("\t"+Jtchange.getText()+"\t บาท\n");
        jtreceipt.append("-------------------------THANKYOU---------------------------\n");
        Jtgetmoney.setText("");
        print.setEnabled(true);
        }catch (Exception e) {e.printStackTrace();}}}
        else if(jRadioButton2.isSelected()){
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        DecimalFormat dollars = new DecimalFormat("0.00");
         if(jbox1.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "กรุณาเลือกจำนวณชั่วโมง","ERROR",JOptionPane.ERROR_MESSAGE);
         }else if(Jtgetmoney.getText().equals("")){
            JOptionPane.showMessageDialog(null, "กรุณากรอกจำนวนเงิน","ERROR",JOptionPane.ERROR_MESSAGE); }       
            if(jbox1.getSelectedIndex() == 1){
            calCulate();}
            else if(jbox1.getSelectedIndex() == 2){
            calCulate();    
            } else if(jbox1.getSelectedIndex() == 3){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 4){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 5){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 6){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 7){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 8){
            calCulate();
            }else if(jbox1.getSelectedIndex() == 9){
            calCulate();  
            }else if(jbox1.getSelectedIndex() == 10){
            calCulate();    
            }else if(jbox1.getSelectedIndex() == 11){
            calCulate();}
            else if(jbox1.getSelectedIndex() == 12){
            calCulate();    
            } else if(jbox1.getSelectedIndex() == 13){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 14){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 15){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 16){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 17){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 18){
            calCulate();
            }else if(jbox1.getSelectedIndex() == 19){
            calCulate();  
            }else if(jbox1.getSelectedIndex() == 20){
            calCulate();    
            } else if(jbox1.getSelectedIndex() == 21){
            calCulate();
            } else if(jbox1.getSelectedIndex() == 22){
            calCulate();
            }else if(jbox1.getSelectedIndex() == 23){
            calCulate();  
            }else if(jbox1.getSelectedIndex() == 24){
            calCulate();    
            }if(!(Jtgetmoney.getText().equals(""))&&getmoney >= price ){
            Jtchange.setText(String.valueOf(dollars.format(change)));
             JOptionPane.showMessageDialog(null, "ชำระเงินสำเร็จ","INFO",JOptionPane.INFORMATION_MESSAGE);
             try{         
            String sql = "INSERT INTO orders (Hour,price) VALUES (?,?)";
            PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setInt(1, jbox1.getSelectedIndex());
            stmt.setString(2, Jtprice.getText());
            stmt.executeUpdate();           
             } catch (Exception e) {e.printStackTrace();}
           try{
               String sql = "SELECT OrderID FROM orders ORDER BY OrderID DESC LIMIT 1";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                rs.next();
                rs.getString("OrderID"); 
            jtreceipt.append("-------------------------NETCAFE---------------------------\n");
            jtreceipt.append("------------------------ไม่เป็นสมาชิก------------------------------\n");
            jtreceipt.append("--------------------------------------------------------------------\n");
            jtreceipt.append("OrderID : "+ rs.getString("OrderID")+"\n");
            jtreceipt.append("Date : "+formattedDate+"\n");
            jtreceipt.append("--------------------------------------------------------------------\n");
            jtreceipt.append("จำนวณชั่วโมง :");
            jtreceipt.append("\t"+jbox1.getSelectedIndex()+"\t ชม.\n");
            jtreceipt.append("ราคา          :");
            jtreceipt.append("                "+Jtprice.getText()+"\t บาท\n");
            jtreceipt.append("--------------------------------------------------------------------\n");
            jtreceipt.append("รับเงิน        :");
            jtreceipt.append("\t"+dollars.format(getmoney)+"\t บาท\n");
            jtreceipt.append("เงินทอน      :");
            jtreceipt.append("\t"+Jtchange.getText()+"\t บาท\n");
            jtreceipt.append("-------------------------THANKYOU---------------------------\n");
            Jtgetmoney.setText("");
        }catch (Exception e) {e.printStackTrace();}}      
        }
    }//GEN-LAST:event_jbpaymentActionPerformed

    
    private void jbclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbclearActionPerformed
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        print.setEnabled(false);
        jtname.setText("");
        jtlastname.setText("");
        Jtfind.setText("");
        JtcustomerId.setText("");
        Jtuserid.setText("");
        Jtusername.setText("");
        jbox1.setSelectedIndex(0);
        Jtprice.setText("");
        Jtgetmoney.setText("");
        Jtchange.setText("");
        jtreceipt.setText("");
        DefaultTableModel dtm = new DefaultTableModel();
        jTable1.setModel(dtm);
        jLabel19.setEnabled(false);
        jLabel22.setEnabled(false);
        jLabel20.setEnabled(false);
        jLabel23.setEnabled(false);
        jLabel24.setEnabled(false);
        jLabel25.setEnabled(false);
        jLabel26.setEnabled(false);
        jLabel27.setEnabled(false);
        jLabel28.setEnabled(false);
        jLabel121.setEnabled(false);
        jLabel122.setEnabled(false);
        jLabel123.setEnabled(false);
        jLabel124.setEnabled(false);
        jLabel126.setEnabled(false);
    }//GEN-LAST:event_jbclearActionPerformed

    private void newregisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newregisterMouseClicked
        c1.show(Jmain, "card2");
        showTable2();
        tcustomerID.setText(""+(customernumber+1));
    }//GEN-LAST:event_newregisterMouseClicked

    private void Bregister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bregister1ActionPerformed
        try{
            String sql1 = "INSERT INTO customersID (CustomerID,User,Password) VALUES (?,?,?)";
            PreparedStatement stmt1 = c.prepareStatement(sql1);
            stmt1.setString(1, tcustomerID1.getText());
            stmt1.setString(2, tusername1.getText());
            stmt1.setString(3, tpassword1.getText());
            stmt1.executeUpdate();
            stmt1.close();
         JOptionPane.showMessageDialog(null, "สมัครสมาชิกสำเร็จ","สมัครสมาชิก",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {e.printStackTrace();
         JOptionPane.showMessageDialog(null,"ลงทะเบียนไม่สำเร็จ",
                "EROR",JOptionPane.ERROR_MESSAGE);}
         tcustomerID1.setText("");
         tusername1.setText("");
         tpassword1.setText("");
         jtfindname.setText("");
         DefaultTableModel dtm = new DefaultTableModel();
        jTable3.setModel(dtm);
    }//GEN-LAST:event_Bregister1ActionPerformed

    private void findnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findnameActionPerformed
       try{
            if(jtfindname.getText().equals("")){
                JOptionPane.showMessageDialog(null, "โปรดใส่ชื่อ","ERROR",JOptionPane.ERROR_MESSAGE);}
            else{
                DefaultTableModel dtm = new DefaultTableModel();
                jTable3.setModel(dtm);
                dtm.setColumnCount(3);
                dtm.setRowCount(1);
                String sql = "SELECT CustomerID,Name,LastName FROM customers  WHERE Name = ?";
                PreparedStatement stmt = c.prepareStatement(sql);
                stmt.setString(1, jtfindname.getText());
                String[] names = {"CustomerID","Name","LastName"};
                for (int i = 0; i < names.length; i++) {
                    jTable3.getColumnModel().getColumn(i).setHeaderValue(names[i]);}
                   
                ResultSet rs = stmt.executeQuery();
                int n = 0;
                while(rs.next()){
                    dtm.setValueAt(rs.getString("CustomerID"), n, 0);
                    dtm.setValueAt(rs.getString("Name"), n, 1);
                    dtm.setValueAt(rs.getString("LastName"), n, 2);
                    n++;
                    dtm.setRowCount(n+1);}
            }
        }
        catch(Exception e){e.printStackTrace();}                                                                
    }//GEN-LAST:event_findnameActionPerformed

    private void registerIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerIDMouseClicked
        c1.show(Jmain, "card5");
    }//GEN-LAST:event_registerIDMouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
         DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
        int row =  jTable3.getSelectedRow();
        tcustomerID1.setText(model.getValueAt(row, 0).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    private void ReservationsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReservationsMouseClicked
        c1.show(Jmain, "card6");
        statusComputer1();
        statusComputer2();
        statusComputer3();
        statusComputer4();
        statusComputer5();
        statusComputer6();
        statusComputer7();
        statusComputer8();
        statusComputer9();
        statusComputer10();
        statusComputer11();
        statusComputer12();
        /*1*/
        if(status1.getText().equals("Available")){
            status1.setForeground(java.awt.Color.GRAY);
            photo1.setIcon(available);
        }
        if(status1.getText().equals("User")){
            photo1.setIcon(using);
            status1.setForeground(java.awt.Color.GREEN);

        }
        if(status1.getText().equals("Repair")){
            status1.setForeground(java.awt.Color.blue);
            photo1.setIcon(repair);
            clear1.setEnabled(false);
        }
        if(status1.getText().equals("Dilapidated")){
            status1.setForeground(java.awt.Color.RED);
            photo1.setIcon(broken);
            clear1.setEnabled(false);
        }
        if(status1.getText().equals("User")&&hour==0&&min==0&&sec==0){
            status1.setText("Available");
            photo1.setIcon(available);
            Updatecomputer1();
        }
        /*2*/
         if(status2.getText().equals("Available")){
            status2.setForeground(java.awt.Color.GRAY);
            photo2.setIcon(available);
        }
        if(status2.getText().equals("User")){
            photo2.setIcon(using);
            status2.setForeground(java.awt.Color.GREEN);

        }
        if(status2.getText().equals("Repair")){
            status2.setForeground(java.awt.Color.blue);
            photo2.setIcon(repair);
            clear2.setEnabled(false);
        }
        if(status2.getText().equals("Dilapidated")){
            status2.setForeground(java.awt.Color.RED);
            photo2.setIcon(broken);
            clear2.setEnabled(false);

        }
        if(status2.getText().equals("User")&&hour2==0&&min2==0&&sec2==0){
            status2.setText("Available");
            photo2.setIcon(available);
            Updatecomputer2();
        }
        /*3*/
        if(status3.getText().equals("Available")){
            status3.setForeground(java.awt.Color.GRAY);
            photo3.setIcon(available);
            
        }
        if(status3.getText().equals("User")){
            photo3.setIcon(using);
            status3.setForeground(java.awt.Color.GREEN);

        }
        if(status3.getText().equals("Repair")){
            status3.setForeground(java.awt.Color.blue);
            photo3.setIcon(repair);
            clear3.setEnabled(false);
        }
        if(status3.getText().equals("Dilapidated")){
            status3.setForeground(java.awt.Color.RED);
            photo3.setIcon(broken);
            clear3.setEnabled(false);

        }
        if(status3.getText().equals("User")&&hour3==0&&min3==0&&sec3==0){
            status3.setText("Available");
            photo3.setIcon(available);
            Updatecomputer3();
        }
        /*4*/
        if(status4.getText().equals("Available")){
            status4.setForeground(java.awt.Color.GRAY);
            photo4.setIcon(available);
        }
        if(status4.getText().equals("User")){
            photo4.setIcon(using);
            status4.setForeground(java.awt.Color.GREEN);

        }
        if(status4.getText().equals("Repair")){
            status4.setForeground(java.awt.Color.blue);
            photo4.setIcon(repair);
            clear4.setEnabled(false);
        }
        if(status4.getText().equals("Dilapidated")){
            status4.setForeground(java.awt.Color.RED);
            photo4.setIcon(broken);
            clear4.setEnabled(false);

        }
        if(status4.getText().equals("User")&&hour4==0&&min4==0&&sec4==0){
            status4.setText("Available");
            photo4.setIcon(available);
            Updatecomputer4();
        }
        /*5*/
      if(status5.getText().equals("Available")){
            status5.setForeground(java.awt.Color.GRAY);
            photo5.setIcon(available);
        }
        if(status5.getText().equals("User")){
            photo5.setIcon(using);
            status5.setForeground(java.awt.Color.GREEN);

        }
        if(status5.getText().equals("Repair")){
            status5.setForeground(java.awt.Color.blue);
            photo5.setIcon(repair);
            clear5.setEnabled(false);
        }
        if(status5.getText().equals("Dilapidated")){
            status5.setForeground(java.awt.Color.RED);
            photo5.setIcon(broken);
            clear5.setEnabled(false);

        }
        if(status5.getText().equals("User")&&hour5==0&&min5==0&&sec5==0){
            status5.setText("Available");
            photo5.setIcon(available);
            Updatecomputer5();
        }
        /*6*/
      if(status6.getText().equals("Available")){
            status6.setForeground(java.awt.Color.GRAY);
            photo6.setIcon(available);
        }
        if(status6.getText().equals("User")){
            photo6.setIcon(using);
            status6.setForeground(java.awt.Color.GREEN);

        }
        if(status6.getText().equals("Repair")){
            status6.setForeground(java.awt.Color.blue);
            photo6.setIcon(repair);
            clear6.setEnabled(false);
        }
        if(status6.getText().equals("Dilapidated")){
            status6.setForeground(java.awt.Color.RED);
            photo6.setIcon(broken);
            clear6.setEnabled(false);
        }
        if(status6.getText().equals("User")&&hour6==0&&min6==0&&sec6==0){
            status6.setText("Available");
            photo6.setIcon(available);
            Updatecomputer6();
        }
        /*7*/
      if(status7.getText().equals("Available")){
            status7.setForeground(java.awt.Color.GRAY);
            photo7.setIcon(available);
        }
        if(status7.getText().equals("User")){
            photo7.setIcon(using);
            status7.setForeground(java.awt.Color.GREEN);

        }
        if(status7.getText().equals("Repair")){
            status7.setForeground(java.awt.Color.blue);
            photo7.setIcon(repair);
            clear7.setEnabled(false);
        }
        if(status7.getText().equals("Dilapidated")){
            status7.setForeground(java.awt.Color.RED);
            photo7.setIcon(broken);
            clear7.setEnabled(false);
        }
        if(status7.getText().equals("User")&&hour7==0&&min7==0&&sec7==0){
            status7.setText("Available");
            photo7.setIcon(available);
            Updatecomputer7();
        }
        /*8*/
        if(status8.getText().equals("Available")){
            status8.setForeground(java.awt.Color.GRAY);
            photo8.setIcon(available);
        }
        if(status8.getText().equals("User")){
            photo8.setIcon(using);
            status8.setForeground(java.awt.Color.GREEN);

        }
        if(status8.getText().equals("Repair")){
            status8.setForeground(java.awt.Color.blue);
            photo8.setIcon(repair);
            clear8.setEnabled(false);
        }
        if(status8.getText().equals("Dilapidated")){
            status8.setForeground(java.awt.Color.RED);
            photo8.setIcon(broken);
            clear8.setEnabled(false);
        }
        if(status8.getText().equals("User")&&hour8==0&&min8==0&&sec8==0){
            status8.setText("Available");
            photo8.setIcon(available);
            Updatecomputer8();
        }
        /*9*/
        if(status9.getText().equals("Available")){
            status9.setForeground(java.awt.Color.GRAY);
            photo9.setIcon(available);
        }
        if(status9.getText().equals("User")){
            photo9.setIcon(using);
            status9.setForeground(java.awt.Color.GREEN);

        }
        if(status9.getText().equals("Repair")){
            status9.setForeground(java.awt.Color.blue);
            photo9.setIcon(repair);
            clear9.setEnabled(false);
        }
        if(status9.getText().equals("Dilapidated")){
            status9.setForeground(java.awt.Color.RED);
            photo9.setIcon(broken);
            clear9.setEnabled(false);
        }
        if(status9.getText().equals("User")&&hour9==0&&min9==0&&sec9==0){
            status9.setText("Available");
            photo9.setIcon(available);
            Updatecomputer9();
        }
        /*10*/
        if(status10.getText().equals("Available")){
            status10.setForeground(java.awt.Color.GRAY);
            photo10.setIcon(available);
        }
        if(status10.getText().equals("User")){
            photo10.setIcon(using);
            status10.setForeground(java.awt.Color.GREEN);

        }
        if(status10.getText().equals("Repair")){
            status10.setForeground(java.awt.Color.blue);
            photo10.setIcon(repair);
            clear10.setEnabled(false);
        }
        if(status10.getText().equals("Dilapidated")){
            status10.setForeground(java.awt.Color.RED);
            photo10.setIcon(broken);
            clear10.setEnabled(false);
        }
        if(status10.getText().equals("User")&&hour10==0&&min10==0&&sec10==0){
            status10.setText("Available");
            photo10.setIcon(available);
            Updatecomputer10();
        }
        /*11*/
        if(status11.getText().equals("Available")){
            status11.setForeground(java.awt.Color.GRAY);
            photo11.setIcon(available);
        }
        if(status11.getText().equals("User")){
            photo11.setIcon(using);
            status11.setForeground(java.awt.Color.GREEN);

        }
        if(status11.getText().equals("Repair")){
            status11.setForeground(java.awt.Color.blue);
            photo11.setIcon(repair);
            clear11.setEnabled(false);
        }
        if(status11.getText().equals("Dilapidated")){
            status11.setForeground(java.awt.Color.RED);
            photo11.setIcon(broken);
            clear11.setEnabled(false);
        }
        if(status11.getText().equals("User")&&hour11==0&&min11==0&&sec11==0){
            status11.setText("Available");
            photo11.setIcon(available);
            Updatecomputer11();
        }
        /*12*/
        if(status12.getText().equals("Available")){
            status12.setForeground(java.awt.Color.GRAY);
            photo12.setIcon(available);
        }
        if(status12.getText().equals("User")){
            photo12.setIcon(using);
            status12.setForeground(java.awt.Color.GREEN);

        }
        if(status12.getText().equals("Repair")){
            status12.setForeground(java.awt.Color.blue);
            photo12.setIcon(repair);
            clear12.setEnabled(false);
        }
        if(status12.getText().equals("Dilapidated")){
            status12.setForeground(java.awt.Color.RED);
            photo12.setIcon(broken);
            clear12.setEnabled(false);
        }
        if(status12.getText().equals("User")&&hour12==0&&min12==0&&sec12==0){
            status12.setText("Available");
            photo12.setIcon(available);
            Updatecomputer12();
        }
        
        
        
    }//GEN-LAST:event_ReservationsMouseClicked

    private void transfer12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer12ActionPerformed
        stopname = cusernam12.getText();
        tranferhour = hour12;
        tranfermin = min12;
        tranfersec = sec12;
        ifTranfer = true;
        timer12.stop();
        lhour12.setText("00");
        lsec12.setText("00");
        lmin12.setText("00");
        cusernam12.setText("");
        status12.setText("Available");
        status12.setForeground(java.awt.Color.GRAY);
        photo12.setIcon(available);
        Updatecomputer12();
        jbstart12.setEnabled(false);
        Stop12.setEnabled(false);
        transfer12.setEnabled(false);
        iconstop12.setEnabled(false);
        clear12.setEnabled(true);
    }//GEN-LAST:event_transfer12ActionPerformed

    private void jbstart12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart12ActionPerformed

        if(status12.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status12.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status12.getText().equals("Available")||status12.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour12.setText("0"+jbox1.getSelectedItem());
            hour12 =Integer.parseInt(lhour12.getText());
            cusernam12.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo12.setIcon(using);
            status12.setText("User");
            status12.setForeground(java.awt.Color.GREEN);
            Updatecomputer12();
            timer12 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour12.setForeground(java.awt.Color.BLACK);
                    lmin12.setForeground(java.awt.Color.BLACK);
                    lsec12.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour12==0&&min12==0&&sec12==0){
                        cusernam12.setText(stopname);
                        hour12 = tranferhour;
                        min12 = tranfermin;
                        sec12 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop12){
                        cusernam12.setText(stopname);
                        hour12 = stophour12;
                        min12 = stopmin12;
                        sec12 = stopsec12;
                        ifStop12 = false;
                    }
                    if(min12==0&&hour12>0){
                        min12=60;
                        hour12--;
                    }
                    if(sec12==0&&min12>0){
                        sec12=60;
                        min12--;
                    }

                    if(hour12==0){
                        if(min12<=15){
                            lhour12.setForeground(java.awt.Color.red);
                            lmin12.setForeground(java.awt.Color.red);
                            lsec12.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour12==0&&min12==0&&sec12==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 12 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status12.setText("Available");
                        photo12.setIcon(available);
                        status12.setForeground(java.awt.Color.GRAY);
                        Updatecomputer12();
                        cusernam12.setText("");
                        hour12=0;min12=0;sec12=0;
                        lhour12.setForeground(java.awt.Color.BLACK);
                        lmin12.setForeground(java.awt.Color.BLACK);
                        lsec12.setForeground(java.awt.Color.BLACK);
                        timer12.stop();
                        jbstart12.setEnabled(true);
                        Stop12.setEnabled(false);
                        transfer12.setEnabled(false);

                    }else{
                        sec12--;
                        lhour12.setText(""+hour12);
                        lsec12.setText(""+sec12);
                        lmin12.setText(""+min12);
                    }

                }
            });
            timer12.start();
            jbstart12.setEnabled(false);
            Stop12.setEnabled(true);
            transfer12.setEnabled(true);
            iconstop12.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart12ActionPerformed

    private void Stop12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop12ActionPerformed
        stopname = cusernam12.getText();
        stophour12 = hour12;
        stopmin12 = min12;
        stopsec12 = sec12;
        ifStop12 = true;
        timer12.stop();
        jbstart12.setEnabled(true);
        Stop12.setEnabled(false);
        transfer12.setEnabled(false);
        iconstop12.setEnabled(true);
    }//GEN-LAST:event_Stop12ActionPerformed

    private void transfer11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer11ActionPerformed
        stopname = cusernam11.getText();
        tranferhour = hour11;
        tranfermin = min11;
        tranfersec = sec11;
        ifTranfer = true;
        timer11.stop();
        lhour11.setText("00");
        lsec11.setText("00");
        lmin11.setText("00");
        cusernam11.setText("");
        status11.setText("Available");
        status11.setForeground(java.awt.Color.GRAY);
        photo11.setIcon(available);
        Updatecomputer11();
        jbstart11.setEnabled(false);
        Stop11.setEnabled(false);
        transfer11.setEnabled(false);
        iconstop11.setEnabled(false);
        clear11.setEnabled(true);
    }//GEN-LAST:event_transfer11ActionPerformed

    private void jbstart11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart11ActionPerformed

        if(status11.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status11.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status11.getText().equals("Available")||status11.getText().equals("User")){
           if(jbox1.getSelectedIndex()!=0){
            lhour11.setText("0"+jbox1.getSelectedItem());
            hour11 =Integer.parseInt(lhour11.getText());
            cusernam11.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo11.setIcon(using);
            status11.setText("User");
            status11.setForeground(java.awt.Color.GREEN);
            Updatecomputer11();
            timer11 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour11.setForeground(java.awt.Color.BLACK);
                    lmin11.setForeground(java.awt.Color.BLACK);
                    lsec11.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour11==0&&min11==0&&sec11==0){
                        cusernam11.setText(stopname);
                        hour11 = tranferhour;
                        min11 = tranfermin;
                        sec11 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop11){
                        cusernam11.setText(stopname);
                        hour11 = stophour11;
                        min11 = stopmin11;
                        sec11 = stopsec11;
                        ifStop11 = false;
                    }
                    if(min11==0&&hour11>0){
                        min11=60;
                        hour11--;
                    }
                    if(sec11==0&&min11>0){
                        sec11=60;
                        min11--;
                    }

                    if(hour11==0){
                        if(min11<=15){
                            lhour11.setForeground(java.awt.Color.red);
                            lmin11.setForeground(java.awt.Color.red);
                            lsec11.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour11==0&&min11==0&&sec11==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 11 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status11.setText("Available");
                        photo11.setIcon(available);
                        status11.setForeground(java.awt.Color.GRAY);
                        Updatecomputer11();
                        cusernam11.setText("");
                        hour11=0;min11=0;sec11=0;
                        lhour11.setForeground(java.awt.Color.BLACK);
                        lmin11.setForeground(java.awt.Color.BLACK);
                        lsec11.setForeground(java.awt.Color.BLACK);
                        timer11.stop();
                        jbstart11.setEnabled(true);
                        Stop11.setEnabled(false);
                        transfer11.setEnabled(false);

                    }else{
                        sec11--;
                        lhour11.setText(""+hour11);
                        lsec11.setText(""+sec11);
                        lmin11.setText(""+min11);
                    }

                }
            });
            timer11.start();
            jbstart11.setEnabled(false);
            Stop11.setEnabled(true);
            transfer11.setEnabled(true);
            iconstop11.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart11ActionPerformed

    private void Stop11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop11ActionPerformed
        stopname = cusernam11.getText();
        stophour11 = hour11;
        stopmin11 = min11;
        stopsec11 = sec11;
        ifStop11 = true;
        timer11.stop();
        jbstart11.setEnabled(true);
        Stop11.setEnabled(false);
        transfer11.setEnabled(false);
        iconstop11.setEnabled(true);
    }//GEN-LAST:event_Stop11ActionPerformed

    private void transfer10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer10ActionPerformed
        stopname = cusernam10.getText();
        tranferhour = hour10;
        tranfermin = min10;
        tranfersec = sec10;
        ifTranfer = true;
        timer10.stop();
        lhour10.setText("00");
        lsec10.setText("00");
        lmin10.setText("00");
        cusernam10.setText("");
        status10.setText("Available");
        status10.setForeground(java.awt.Color.GRAY);
        photo10.setIcon(available);
        Updatecomputer10();
        jbstart10.setEnabled(false);
        Stop10.setEnabled(false);
        transfer10.setEnabled(false);
        iconstop10.setEnabled(false);
        clear10.setEnabled(true);
    }//GEN-LAST:event_transfer10ActionPerformed

    private void jbstart10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart10ActionPerformed

        if(status10.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status10.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status10.getText().equals("Available")||status10.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour10.setText("0"+jbox1.getSelectedItem());
            hour10 =Integer.parseInt(lhour10.getText());
            cusernam10.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo10.setIcon(using);
            status10.setText("User");
            status10.setForeground(java.awt.Color.GREEN);
            Updatecomputer10();
            timer10 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour10.setForeground(java.awt.Color.BLACK);
                    lmin10.setForeground(java.awt.Color.BLACK);
                    lsec10.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour10==0&&min10==0&&sec10==0){
                        cusernam10.setText(stopname);
                        hour10 = tranferhour;
                        min10 = tranfermin;
                        sec10 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop10){
                        cusernam10.setText(stopname);
                        hour10 = stophour10;
                        min10 = stopmin10;
                        sec10 = stopsec10;
                        ifStop10 = false;
                    }
                    if(min10==0&&hour10>0){
                        min10=60;
                        hour10--;
                    }
                    if(sec10==0&&min10>0){
                        sec10=60;
                        min10--;
                    }

                    if(hour10==0){
                        if(min10<=15){
                            lhour10.setForeground(java.awt.Color.red);
                            lmin10.setForeground(java.awt.Color.red);
                            lsec10.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour10==0&&min10==0&&sec10==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 10 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status10.setText("Available");
                        photo10.setIcon(available);
                        status10.setForeground(java.awt.Color.GRAY);
                        Updatecomputer10();
                        cusernam10.setText("");
                        hour10=0;min10=0;sec10=0;
                        lhour10.setForeground(java.awt.Color.BLACK);
                        lmin10.setForeground(java.awt.Color.BLACK);
                        lsec10.setForeground(java.awt.Color.BLACK);
                        timer10.stop();
                        jbstart10.setEnabled(true);
                        Stop10.setEnabled(false);
                        transfer10.setEnabled(false);

                    }else{
                        sec10--;
                        lhour10.setText(""+hour10);
                        lsec10.setText(""+sec10);
                        lmin10.setText(""+min10);
                    }

                }
            });
            timer10.start();
            jbstart10.setEnabled(false);
            Stop10.setEnabled(true);
            transfer10.setEnabled(true);
            iconstop10.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart10ActionPerformed

    private void Stop10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop10ActionPerformed
        stopname = cusernam10.getText();
        stophour10 = hour10;
        stopmin10 = min10;
        stopsec10 = sec10;
        ifStop10 = true;
        timer10.stop();
        jbstart10.setEnabled(true);
        Stop10.setEnabled(false);
        transfer10.setEnabled(false);
        iconstop10.setEnabled(true);
    }//GEN-LAST:event_Stop10ActionPerformed

    private void transfer9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer9ActionPerformed
        stopname = cusernam9.getText();
        tranferhour = hour9;
        tranfermin = min9;
        tranfersec = sec9;
        ifTranfer = true;
        timer9.stop();
        lhour9.setText("00");
        lsec9.setText("00");
        lmin9.setText("00");
        cusernam9.setText("");
        status9.setText("Available");
        status9.setForeground(java.awt.Color.GRAY);
        photo9.setIcon(available);
        Updatecomputer9();
        jbstart9.setEnabled(false);
        Stop9.setEnabled(false);
        transfer9.setEnabled(false);
        iconstop9.setEnabled(false);
        clear9.setEnabled(true);
    }//GEN-LAST:event_transfer9ActionPerformed

    private void jbstart9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart9ActionPerformed

        if(status9.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status9.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status9.getText().equals("Available")||status9.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour9.setText("0"+jbox1.getSelectedItem());
            hour9 =Integer.parseInt(lhour9.getText());
            cusernam9.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo9.setIcon(using);
            status9.setText("User");
            status9.setForeground(java.awt.Color.GREEN);
            Updatecomputer9();
            timer9 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour9.setForeground(java.awt.Color.BLACK);
                    lmin9.setForeground(java.awt.Color.BLACK);
                    lsec9.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour9==0&&min9==0&&sec9==0){
                        cusernam9.setText(stopname);
                        hour9 = tranferhour;
                        min9 = tranfermin;
                        sec9 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop9){
                        cusernam9.setText(stopname);
                        hour9 = stophour9;
                        min9 = stopmin9;
                        sec9 = stopsec9;
                        ifStop9 = false;
                    }
                    if(min9==0&&hour9>0){
                        min9=60;
                        hour9--;
                    }
                    if(sec9==0&&min9>0){
                        sec9=60;
                        min9--;
                    }

                    if(hour9==0){
                        if(min9<=15){
                            lhour9.setForeground(java.awt.Color.red);
                            lmin9.setForeground(java.awt.Color.red);
                            lsec9.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour9==0&&min9==0&&sec9==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 9 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status9.setText("Available");
                        photo9.setIcon(available);
                        status9.setForeground(java.awt.Color.GRAY);
                        Updatecomputer9();
                        cusernam9.setText("");
                        hour9=0;min9=0;sec9=0;
                        lhour9.setForeground(java.awt.Color.BLACK);
                        lmin9.setForeground(java.awt.Color.BLACK);
                        lsec9.setForeground(java.awt.Color.BLACK);
                        timer9.stop();
                        jbstart9.setEnabled(true);
                        Stop9.setEnabled(false);
                        transfer9.setEnabled(false);

                    }else{
                        sec9--;
                        lhour9.setText(""+hour9);
                        lsec9.setText(""+sec9);
                        lmin9.setText(""+min9);
                    }

                }
            });
            timer9.start();
            jbstart9.setEnabled(false);
            Stop9.setEnabled(true);
            transfer9.setEnabled(true);
            iconstop9.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart9ActionPerformed

    private void Stop9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop9ActionPerformed
        stopname = cusernam9.getText();
        stophour9 = hour9;
        stopmin9 = min9;
        stopsec9 = sec9;
        ifStop9 = true;
        timer9.stop();
        jbstart9.setEnabled(true);
        Stop9.setEnabled(false);
        transfer9.setEnabled(false);
        iconstop9.setEnabled(true);
    }//GEN-LAST:event_Stop9ActionPerformed

    private void transfer8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer8ActionPerformed
        stopname = cusernam8.getText();
        tranferhour = hour8;
        tranfermin = min8;
        tranfersec = sec8;
        ifTranfer = true;
        timer8.stop();
        lhour8.setText("00");
        lsec8.setText("00");
        lmin8.setText("00");
        cusernam8.setText("");
        status8.setText("Available");
        status8.setForeground(java.awt.Color.GRAY);
        photo8.setIcon(available);
        Updatecomputer8();
        jbstart8.setEnabled(false);
        Stop8.setEnabled(false);
        transfer8.setEnabled(false);
        iconstop8.setEnabled(false);
        clear8.setEnabled(true);
    }//GEN-LAST:event_transfer8ActionPerformed

    private void Stop8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop8ActionPerformed
        stopname = cusernam8.getText();
        stophour8 = hour8;
        stopmin8 = min8;
        stopsec8 = sec8;
        ifStop8 = true;
        timer8.stop();
        jbstart8.setEnabled(true);
        Stop8.setEnabled(false);
        transfer8.setEnabled(false);
        iconstop8.setEnabled(true);
    }//GEN-LAST:event_Stop8ActionPerformed

    private void jbstart8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart8ActionPerformed

        if(status8.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status8.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status8.getText().equals("Available")||status8.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour8.setText("0"+jbox1.getSelectedItem());
            hour8 =Integer.parseInt(lhour8.getText());
            cusernam8.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo8.setIcon(using);
            status8.setText("User");
            status8.setForeground(java.awt.Color.GREEN);
            Updatecomputer8();
            timer8 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour8.setForeground(java.awt.Color.BLACK);
                    lmin8.setForeground(java.awt.Color.BLACK);
                    lsec8.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour8==0&&min8==0&&sec8==0){
                        cusernam8.setText(stopname);
                        hour8 = tranferhour;
                        min8 = tranfermin;
                        sec8 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop8){
                        cusernam8.setText(stopname);
                        hour8 = stophour8;
                        min8 = stopmin8;
                        sec8 = stopsec8;
                        ifStop8 = false;
                    }
                    if(min8==0&&hour8>0){
                        min8=60;
                        hour8--;
                    }
                    if(sec8==0&&min8>0){
                        sec8=60;
                        min8--;
                    }

                    if(hour8==0){
                        if(min8<=15){
                            lhour8.setForeground(java.awt.Color.red);
                            lmin8.setForeground(java.awt.Color.red);
                            lsec8.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour8==0&&min8==0&&sec8==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 8 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status8.setText("Available");
                        photo8.setIcon(available);
                        status8.setForeground(java.awt.Color.GRAY);
                        Updatecomputer8();
                        cusernam8.setText("");
                        hour8=0;min8=0;sec8=0;
                        lhour8.setForeground(java.awt.Color.BLACK);
                        lmin8.setForeground(java.awt.Color.BLACK);
                        lsec8.setForeground(java.awt.Color.BLACK);
                        timer8.stop();
                        jbstart8.setEnabled(true);
                        Stop8.setEnabled(false);
                        transfer8.setEnabled(false);

                    }else{
                        sec8--;
                        lhour8.setText(""+hour8);
                        lsec8.setText(""+sec8);
                        lmin8.setText(""+min8);
                    }

                }
            });
            timer8.start();
            jbstart8.setEnabled(false);
            Stop8.setEnabled(true);
            transfer8.setEnabled(true);
            iconstop8.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart8ActionPerformed

    private void clear7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear7ActionPerformed
            timer7.stop();
            hour7 =0;
            min7 = 0;
            sec7 = 0;
            stophour7 = 0;
            stopmin7 = 0;
            stopsec7 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status7.setText("Available");
            lhour7.setText("00");
            lsec7.setText("00");
            lmin7.setText("00");
            cusernam7.setText("");
            photo7.setIcon(available);
            status7.setForeground(java.awt.Color.GRAY);
            Updatecomputer7();
            jbstart7.setEnabled(true);
            Stop7.setEnabled(false);
            transfer7.setEnabled(false);
            iconstop7.setEnabled(false);
    }//GEN-LAST:event_clear7ActionPerformed

    private void transfer7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer7ActionPerformed
        stopname = cusernam7.getText();
        tranferhour = hour7;
        tranfermin = min7;
        tranfersec = sec7;
        ifTranfer = true;
        timer7.stop();
        lhour7.setText("00");
        lsec7.setText("00");
        lmin7.setText("00");
        cusernam7.setText("");
        status7.setText("Available");
        status7.setForeground(java.awt.Color.GRAY);
        photo7.setIcon(available);
        Updatecomputer7();
        jbstart7.setEnabled(false);
        Stop7.setEnabled(false);
        transfer7.setEnabled(false);
        iconstop7.setEnabled(false);
        clear7.setEnabled(true);
    }//GEN-LAST:event_transfer7ActionPerformed

    private void Stop7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop7ActionPerformed
        stopname = cusernam7.getText();
        stophour7 = hour7;
        stopmin7 = min7;
        stopsec7 = sec7;
        ifStop7 = true;
        timer7.stop();
        jbstart7.setEnabled(true);
        Stop7.setEnabled(false);
        transfer7.setEnabled(false);
        iconstop7.setEnabled(true);
    }//GEN-LAST:event_Stop7ActionPerformed

    private void jbstart7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart7ActionPerformed

        if(status7.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status7.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status7.getText().equals("Available")||status7.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour7.setText("0"+jbox1.getSelectedItem());
            hour7 =Integer.parseInt(lhour7.getText());
            cusernam7.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo7.setIcon(using);
            status7.setText("User");
            status7.setForeground(java.awt.Color.GREEN);
            Updatecomputer7();
            timer7 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour7.setForeground(java.awt.Color.BLACK);
                    lmin7.setForeground(java.awt.Color.BLACK);
                    lsec7.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour7==0&&min7==0&&sec7==0){
                        cusernam7.setText(stopname);
                        hour7= tranferhour;
                        min7 = tranfermin;
                        sec7 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop7){
                        cusernam7.setText(stopname);
                        hour7 = stophour7;
                        min7 = stopmin7;
                        sec7 = stopsec7;
                        ifStop7 = false;
                    }
                    if(min7==0&&hour7>0){
                        min7=60;
                        hour7--;
                    }
                    if(sec7==0&&min7>0){
                        sec7=60;
                        min7--;
                    }

                    if(hour7==0){
                        if(min7<=15){
                            lhour7.setForeground(java.awt.Color.red);
                            lmin7.setForeground(java.awt.Color.red);
                            lsec7.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour7==0&&min7==0&&sec7==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 7 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status7.setText("Available");
                        photo7.setIcon(available);
                        status7.setForeground(java.awt.Color.GRAY);
                        Updatecomputer7();
                        cusernam7.setText("");
                        hour7=0;min7=0;sec7=0;
                        lhour7.setForeground(java.awt.Color.BLACK);
                        lmin7.setForeground(java.awt.Color.BLACK);
                        lsec7.setForeground(java.awt.Color.BLACK);
                        timer7.stop();
                        jbstart7.setEnabled(true);
                        Stop7.setEnabled(false);
                        transfer7.setEnabled(false);

                    }else{
                        sec7--;
                        lhour7.setText(""+hour7);
                        lsec7.setText(""+sec7);
                        lmin7.setText(""+min7);
                    }

                }
            });
            timer7.start();
            jbstart7.setEnabled(false);
            Stop7.setEnabled(true);
            transfer7.setEnabled(true);
            iconstop7.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart7ActionPerformed

    private void clear6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear6ActionPerformed
            timer6.stop();
            hour6 =0;
            min6 = 0;
            sec6 = 0;
            stophour6 = 0;
            stopmin6 = 0;
            stopsec6 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status6.setText("Available");
            lhour6.setText("00");
            lsec6.setText("00");
            lmin6.setText("00");
            cusernam6.setText("");
            photo6.setIcon(available);
            status6.setForeground(java.awt.Color.GRAY);
            Updatecomputer6();
            jbstart6.setEnabled(true);
            Stop6.setEnabled(false);
            transfer6.setEnabled(false);
            iconstop6.setEnabled(false);
    }//GEN-LAST:event_clear6ActionPerformed

    private void transfer6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer6ActionPerformed
        stopname = cusernam6.getText();
        tranferhour = hour6;
        tranfermin = min6;
        tranfersec = sec6;
        ifTranfer = true;
        timer6.stop();
        lhour6.setText("00");
        lsec6.setText("00");
        lmin6.setText("00");
        cusernam6.setText("");
        status6.setText("Available");
        status6.setForeground(java.awt.Color.GRAY);
        photo6.setIcon(available);
        Updatecomputer6();
        jbstart6.setEnabled(false);
        Stop6.setEnabled(false);
        transfer6.setEnabled(false);
        iconstop6.setEnabled(false);
        clear6.setEnabled(true);
    }//GEN-LAST:event_transfer6ActionPerformed

    private void Stop6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop6ActionPerformed
        stopname = cusernam6.getText();
        stophour6 = hour6;
        stopmin6 = min6;
        stopsec6 = sec6;
        ifStop6 = true;
        timer6.stop();
        jbstart6.setEnabled(true);
        Stop6.setEnabled(false);
        transfer6.setEnabled(false);
        iconstop6.setEnabled(true);
    }//GEN-LAST:event_Stop6ActionPerformed

    private void jbstart6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart6ActionPerformed

        if(status6.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status6.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status6.getText().equals("Available")||status6.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour6.setText("0"+jbox1.getSelectedItem());
            hour6 =Integer.parseInt(lhour6.getText());
            cusernam6.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo6.setIcon(using);
            status6.setText("User");
            status6.setForeground(java.awt.Color.GREEN);
            Updatecomputer6();
            timer6 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour6.setForeground(java.awt.Color.BLACK);
                    lmin6.setForeground(java.awt.Color.BLACK);
                    lsec6.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour6==0&&min6==0&&sec6==0){
                        cusernam6.setText(stopname);
                        hour6= tranferhour;
                        min6 = tranfermin;
                        sec6 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop6){
                        cusernam6.setText(stopname);
                        hour6 = stophour6;
                        min6 = stopmin6;
                        sec6 = stopsec6;
                        ifStop6 = false;
                    }
                    if(min6==0&&hour6>0){
                        min6=60;
                        hour6--;
                    }
                    if(sec6==0&&min6>0){
                        sec6=60;
                        min6--;
                    }

                    if(hour6==0){
                        if(min6<=15){
                            lhour6.setForeground(java.awt.Color.red);
                            lmin6.setForeground(java.awt.Color.red);
                            lsec6.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour6==0&&min6==0&&sec6==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 6 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status6.setText("Available");
                        photo6.setIcon(available);
                        status6.setForeground(java.awt.Color.GRAY);
                        Updatecomputer6();
                        cusernam6.setText("");
                        hour6=0;min6=0;sec6=0;
                        lhour6.setForeground(java.awt.Color.BLACK);
                        lmin6.setForeground(java.awt.Color.BLACK);
                        lsec6.setForeground(java.awt.Color.BLACK);
                        timer6.stop();
                        jbstart6.setEnabled(true);
                        Stop6.setEnabled(false);
                        transfer6.setEnabled(false);

                    }else{
                        sec6--;
                        lhour6.setText(""+hour6);
                        lsec6.setText(""+sec6);
                        lmin6.setText(""+min6);
                    }

                }
            });
            timer6.start();
            jbstart6.setEnabled(false);
            Stop6.setEnabled(true);
            transfer6.setEnabled(true);
            iconstop6.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart6ActionPerformed

    private void transfer5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer5ActionPerformed
        stopname = cusernam5.getText();
        tranferhour = hour5;
        tranfermin = min5;
        tranfersec = sec5;
        ifTranfer = true;
        timer5.stop();
        lhour5.setText("00");
        lsec5.setText("00");
        lmin5.setText("00");
        cusernam5.setText("");
        status5.setText("Available");
        status5.setForeground(java.awt.Color.GRAY);
        photo5.setIcon(available);
        Updatecomputer5();
        jbstart5.setEnabled(false);
        Stop5.setEnabled(false);
        transfer5.setEnabled(false);
        iconstop5.setEnabled(false);
        clear5.setEnabled(true);
    }//GEN-LAST:event_transfer5ActionPerformed

    private void Stop5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop5ActionPerformed
        stopname = cusernam5.getText();
        stophour5 = hour5;
        stopmin5 = min5;
        stopsec5 = sec5;
        ifStop5 = true;
        timer5.stop();
        jbstart5.setEnabled(true);
        Stop5.setEnabled(false);
        transfer5.setEnabled(false);
        iconstop5.setEnabled(true);
    }//GEN-LAST:event_Stop5ActionPerformed

    private void jbstart5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart5ActionPerformed

        if(status5.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status5.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status5.getText().equals("Available")||status5.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour5.setText("0"+jbox1.getSelectedItem());
            hour5 =Integer.parseInt(lhour5.getText());
            cusernam5.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo5.setIcon(using);
            status5.setText("User");
            status5.setForeground(java.awt.Color.GREEN);
            Updatecomputer5();
            timer5 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour5.setForeground(java.awt.Color.BLACK);
                    lmin5.setForeground(java.awt.Color.BLACK);
                    lsec5.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour5==0&&min5==0&&sec5==0){
                        cusernam5.setText(stopname);
                        hour5 = tranferhour;
                        min5 = tranfermin;
                        sec5 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop5){
                        cusernam5.setText(stopname);
                        hour5 = stophour5;
                        min5 = stopmin5;
                        sec5 = stopsec5;
                        ifStop5 = false;
                    }
                    if(min5==0&&hour5>0){
                        min5=60;
                        hour5--;
                    }
                    if(sec5==0&&min5>0){
                        sec5=60;
                        min5--;
                    }

                    if(hour5==0){
                        if(min5<=15){
                            lhour5.setForeground(java.awt.Color.red);
                            lmin5.setForeground(java.awt.Color.red);
                            lsec5.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour5==0&&min5==0&&sec5==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 5 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status5.setText("Available");
                        photo5.setIcon(available);
                        status5.setForeground(java.awt.Color.GRAY);
                        Updatecomputer5();
                        cusernam5.setText("");
                        hour5=0;min5=0;sec5=0;
                        lhour5.setForeground(java.awt.Color.BLACK);
                        lmin5.setForeground(java.awt.Color.BLACK);
                        lsec5.setForeground(java.awt.Color.BLACK);
                        timer5.stop();
                        jbstart5.setEnabled(true);
                        Stop5.setEnabled(false);
                        transfer5.setEnabled(false);

                    }else{
                        sec5--;
                        lhour5.setText(""+hour5);
                        lsec5.setText(""+sec5);
                        lmin5.setText(""+min5);
                    }

                }
            });
            timer5.start();
            jbstart5.setEnabled(false);
            Stop5.setEnabled(true);
            transfer5.setEnabled(true);
            iconstop5.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart5ActionPerformed

    private void clear4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear4ActionPerformed
            timer4.stop();
            hour4 =0;
            min4 = 0;
            sec4 = 0;
            stophour4 = 0;
            stopmin4 = 0;
            stopsec4 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status4.setText("Available");
            lhour4.setText("00");
            lsec4.setText("00");
            lmin4.setText("00");
            cusernam4.setText("");
            photo4.setIcon(available);
            status4.setForeground(java.awt.Color.GRAY);
            Updatecomputer4();
            jbstart4.setEnabled(true);
            Stop4.setEnabled(false);
            transfer4.setEnabled(false);
            iconstop4.setEnabled(false);
    }//GEN-LAST:event_clear4ActionPerformed

    private void transfer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer4ActionPerformed
        stopname = cusernam4.getText();
        tranferhour = hour4;
        tranfermin = min4;
        tranfersec = sec4;
        ifTranfer = true;
        timer4.stop();
        lhour4.setText("00");
        lsec4.setText("00");
        lmin4.setText("00");
        cusernam4.setText("");
        status4.setText("Available");
        status4.setForeground(java.awt.Color.GRAY);
        photo4.setIcon(available);
        Updatecomputer4();
        jbstart4.setEnabled(false);
        Stop4.setEnabled(false);
        transfer4.setEnabled(false);
        iconstop4.setEnabled(false);
        clear4.setEnabled(true);
    }//GEN-LAST:event_transfer4ActionPerformed

    private void Stop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop4ActionPerformed
        stopname = cusernam4.getText();
        stophour4 = hour4;
        stopmin4 = min4;
        stopsec4 = sec4;
        ifStop4 = true;
        timer4.stop();
        jbstart4.setEnabled(true);
        Stop4.setEnabled(false);
        transfer4.setEnabled(false);
        iconstop4.setEnabled(true);
    }//GEN-LAST:event_Stop4ActionPerformed

    private void jbstart4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart4ActionPerformed

        if(status4.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status4.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status4.getText().equals("Available")||status4.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour4.setText("0"+jbox1.getSelectedItem());
            hour4 =Integer.parseInt(lhour4.getText());
            cusernam4.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo4.setIcon(using);
            status4.setText("User");
            status4.setForeground(java.awt.Color.GREEN);
            Updatecomputer4();
            timer4 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour4.setForeground(java.awt.Color.BLACK);
                    lmin4.setForeground(java.awt.Color.BLACK);
                    lsec4.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour4==0&&min4==0&&sec4==0){
                        cusernam4.setText(stopname);
                        hour4 = tranferhour;
                        min4 = tranfermin;
                        sec4 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop4){
                        cusernam4.setText(stopname);
                        hour4 = stophour4;
                        min4= stopmin4;
                        sec4 = stopsec4;
                        ifStop4 = false;
                    }
                    if(min4==0&&hour4>0){
                        min4=60;
                        hour4--;
                    }
                    if(sec4==0&&min4>0){
                        sec4=60;
                        min4--;
                    }

                    if(hour4==0){
                        if(min4<=15){
                            lhour4.setForeground(java.awt.Color.red);
                            lmin4.setForeground(java.awt.Color.red);
                            lsec4.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour4==0&&min4==0&&sec4==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 4 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status4.setText("Available");
                        photo4.setIcon(available);
                        status4.setForeground(java.awt.Color.GRAY);
                        Updatecomputer4();
                        cusernam4.setText("");
                        hour4=0;min4=0;sec4=0;
                        lhour4.setForeground(java.awt.Color.BLACK);
                        lmin4.setForeground(java.awt.Color.BLACK);
                        lsec4.setForeground(java.awt.Color.BLACK);
                        timer4.stop();
                        jbstart4.setEnabled(true);
                        Stop4.setEnabled(false);
                        transfer4.setEnabled(false);

                    }else{
                        sec4--;
                        lhour4.setText(""+hour4);
                        lsec4.setText(""+sec4);
                        lmin4.setText(""+min4);
                    }

                }
            });
            timer4.start();
            jbstart4.setEnabled(false);
            Stop4.setEnabled(true);
            transfer4.setEnabled(true);
            iconstop4.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart4ActionPerformed

    private void transfer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer3ActionPerformed
        stopname = cusernam3.getText();
        tranferhour = hour3;
        tranfermin = min3;
        tranfersec = sec3;
        ifTranfer = true;
        timer3.stop();
        lhour3.setText("00");
        lsec3.setText("00");
        lmin3.setText("00");
        cusernam3.setText("");
        status3.setText("Available");
        status3.setForeground(java.awt.Color.GRAY);
        photo3.setIcon(available);
        Updatecomputer3();
        jbstart3.setEnabled(false);
        Stop3.setEnabled(false);
        transfer3.setEnabled(false);
        iconstop3.setEnabled(false);
        clear3.setEnabled(true);
    }//GEN-LAST:event_transfer3ActionPerformed

    private void jbstart3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart3ActionPerformed

        if(status3.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status3.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status3.getText().equals("Available")||status3.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour3.setText("0"+jbox1.getSelectedItem());
            hour3 =Integer.parseInt(lhour3.getText());
            cusernam3.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo3.setIcon(using);
            status3.setText("User");
            status3.setForeground(java.awt.Color.GREEN);
            Updatecomputer3();
            timer3 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour3.setForeground(java.awt.Color.BLACK);
                    lmin3.setForeground(java.awt.Color.BLACK);
                    lsec3.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour3==0&&min3==0&&sec3==0){
                        cusernam3.setText(stopname);
                        hour3 = tranferhour;
                        min3 = tranfermin;
                        sec3 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop3){
                        cusernam3.setText(stopname);
                        hour3 = stophour3;
                        min3= stopmin3;
                        sec3 = stopsec3;
                        ifStop3 = false;
                    }
                    if(min3==0&&hour3>0){
                        min3=60;
                        hour3--;
                    }
                    if(sec3==0&&min3>0){
                        sec3=60;
                        min3--;
                    }

                    if(hour3==0){
                        if(min3<=15){
                            lhour3.setForeground(java.awt.Color.red);
                            lmin3.setForeground(java.awt.Color.red);
                            lsec3.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour3==0&&min3==0&&sec3==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 3 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status3.setText("Available");
                        photo3.setIcon(available);
                        status3.setForeground(java.awt.Color.GRAY);
                        Updatecomputer3();
                        cusernam3.setText("");
                        hour3=0;min3=0;sec3=0;
                        lhour3.setForeground(java.awt.Color.BLACK);
                        lmin3.setForeground(java.awt.Color.BLACK);
                        lsec3.setForeground(java.awt.Color.BLACK);
                        timer3.stop();
                        jbstart3.setEnabled(true);
                        Stop3.setEnabled(false);
                        transfer3.setEnabled(false);

                    }else{
                        sec3--;
                        lhour3.setText(""+hour3);
                        lsec3.setText(""+sec3);
                        lmin3.setText(""+min3);
                    }

                }
            });
            timer3.start();
            jbstart3.setEnabled(false);
            Stop3.setEnabled(true);
            transfer3.setEnabled(true);
            iconstop3.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart3ActionPerformed

    private void Stop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop3ActionPerformed
        stopname = cusernam3.getText();
        stophour3 = hour3;
        stopmin3 = min3;
        stopsec3 = sec3;
        ifStop3 = true;
        timer3.stop();
        jbstart3.setEnabled(true);
        Stop3.setEnabled(false);
        transfer3.setEnabled(false);
        iconstop3.setEnabled(true);
    }//GEN-LAST:event_Stop3ActionPerformed

    private void clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear2ActionPerformed
            timer2.stop();
            hour2 =0;
            min2 = 0;
            sec2 = 0;
            stophour2 = 0;
            stopmin2 = 0;
            stopsec2 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status2.setText("Available");
            lhour2.setText("00");
            lsec2.setText("00");
            lmin2.setText("00");
            cusernam2.setText("");
            photo2.setIcon(available);
            status2.setForeground(java.awt.Color.GRAY);
            Updatecomputer2();
            jbstart2.setEnabled(true);
            Stop2.setEnabled(false);
            transfer2.setEnabled(false);
            iconstop2.setEnabled(false);
    }//GEN-LAST:event_clear2ActionPerformed

    private void transfer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer2ActionPerformed
        stopname = cusernam2.getText();
        tranferhour = hour2;
        tranfermin = min2;
        tranfersec = sec2;
        ifTranfer = true;
        timer2.stop();
        lhour2.setText("00");
        lsec2.setText("00");
        lmin2.setText("00");
        cusernam2.setText("");
        status2.setText("Available");
        status2.setForeground(java.awt.Color.GRAY);
        photo2.setIcon(available);
        Updatecomputer2();
        jbstart2.setEnabled(false);
        Stop2.setEnabled(false);
        transfer2.setEnabled(false);
        iconstop2.setEnabled(false);
        clear2.setEnabled(true);
    }//GEN-LAST:event_transfer2ActionPerformed

    private void jbstart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart2ActionPerformed

        if(status2.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status2.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status2.getText().equals("Available")||status2.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour2.setText("0"+jbox1.getSelectedItem());
            hour2 =Integer.parseInt(lhour2.getText());
            cusernam2.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo2.setIcon(using);
            status2.setText("User");
            status2.setForeground(java.awt.Color.GREEN);

            Updatecomputer2();
            timer2 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour2.setForeground(java.awt.Color.BLACK);
                    lmin2.setForeground(java.awt.Color.BLACK);
                    lsec2.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour2==0&&min2==0&&sec2==0){
                        cusernam2.setText(stopname);
                        hour2 = tranferhour;
                        min2 = tranfermin;
                        sec2 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop2){
                        cusernam2.setText(stopname);
                        hour2 = stophour2;
                        min2 = stopmin2;
                        sec2 = stopsec2;
                        ifStop2 = false;
                    }
                    if(min2==0&&hour2>0){
                        min2=60;
                        hour2--;
                    }
                    if(sec2==0&&min2>0){
                        sec2=60;
                        min2--;
                    }

                    if(hour2==0){
                        if(min2<=15){
                            lhour2.setForeground(java.awt.Color.red);
                            lmin2.setForeground(java.awt.Color.red);
                            lsec2.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour2==0&&min2==0&&sec2==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 2 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status2.setText("Available");
                        photo2.setIcon(available);
                        status2.setForeground(java.awt.Color.GRAY);
                        Updatecomputer2();
                        cusernam2.setText("");
                        hour2=0;min2=0;sec2=0;
                        lhour2.setForeground(java.awt.Color.BLACK);
                        lmin2.setForeground(java.awt.Color.BLACK);
                        lsec2.setForeground(java.awt.Color.BLACK);
                        timer2.stop();
                        jbstart2.setEnabled(true);
                        Stop2.setEnabled(false);
                        transfer2.setEnabled(false);

                    }else{
                        sec2--;
                        lhour2.setText(""+hour2);
                        lsec2.setText(""+sec2);
                        lmin2.setText(""+min2);
                    }

                }
            });
            timer2.start();
            jbstart2.setEnabled(false);
            Stop2.setEnabled(true);
            transfer2.setEnabled(true);
            iconstop2.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart2ActionPerformed

    private void Stop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop2ActionPerformed
        stopname = cusernam2.getText();
        stophour2 = hour2;
        stopmin2 = min2;
        stopsec2 = sec2;
        ifStop2 = true;
        timer2.stop();
        jbstart2.setEnabled(true);
        Stop2.setEnabled(false);
        transfer2.setEnabled(false);
        iconstop2.setEnabled(true);
    }//GEN-LAST:event_Stop2ActionPerformed

    private void transfer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer1ActionPerformed
        stopname = cusernam1.getText();
        tranferhour = hour;
        tranfermin = min;
        tranfersec = sec;
        ifTranfer = true;
        timer.stop();
        lhour1.setText("00");
        lsec1.setText("00");
        lmin1.setText("00");
        cusernam1.setText("");
        status1.setText("Available");
        status1.setForeground(java.awt.Color.GRAY);
        photo1.setIcon(available);
        Updatecomputer1();
        jbstart1.setEnabled(false);
        Stop1.setEnabled(false);
        transfer1.setEnabled(false);
        iconstop1.setEnabled(false);
        clear1.setEnabled(true);
    }//GEN-LAST:event_transfer1ActionPerformed

    private void Stop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop1ActionPerformed
        stopname = cusernam1.getText();
        stophour = hour;
        stopmin = min;
        stopsec = sec;
        ifStop = true;
        timer.stop();
        jbstart1.setEnabled(true);
        Stop1.setEnabled(false);
        transfer1.setEnabled(false);
        iconstop1.setEnabled(true);
    }//GEN-LAST:event_Stop1ActionPerformed

    private void jbstart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart1ActionPerformed

        if(status1.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status1.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status1.getText().equals("Available")||status1.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour1.setText("0"+jbox1.getSelectedItem());
            hour =Integer.parseInt(lhour1.getText());
            cusernam1.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo1.setIcon(using);
            status1.setText("User");
            status1.setForeground(java.awt.Color.GREEN);

            Updatecomputer1();
            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour1.setForeground(java.awt.Color.BLACK);
                    lmin1.setForeground(java.awt.Color.BLACK);
                    lsec1.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour==0&&min==0&&sec==0){
                        cusernam1.setText(stopname); 
                        hour = tranferhour;
                        min = tranfermin;
                        sec = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop){
                        cusernam1.setText(stopname);
                        hour = stophour;
                        min = stopmin;
                        sec = stopsec;
                        ifStop = false;
                    }
                    if(min==0&&hour>0){
                        min=60;
                        hour--;
                    }
                    if(sec==0&&min>0){
                        sec=60;
                        min--;
                    }

                    if(hour==0){
                        if(min<=15){
                            lhour1.setForeground(java.awt.Color.red);
                            lmin1.setForeground(java.awt.Color.red);
                            lsec1.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour==0&&min==0&&sec==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 1 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status1.setText("Available");
                        photo1.setIcon(available);
                        status1.setForeground(java.awt.Color.GRAY);
                        Updatecomputer1();
                        cusernam1.setText("");
                        hour=0;min=0;sec=0;
                        lhour1.setForeground(java.awt.Color.BLACK);
                        lmin1.setForeground(java.awt.Color.BLACK);
                        lsec1.setForeground(java.awt.Color.BLACK);
                        timer.stop();
                        jbstart1.setEnabled(true);
                        Stop1.setEnabled(false);
                        transfer1.setEnabled(false);

                    }else{
                        sec--;
                        lhour1.setText(""+hour);
                        lsec1.setText(""+sec);
                        lmin1.setText(""+min);
                    }

                }
            });
            timer.start();
            jbstart1.setEnabled(false);
            Stop1.setEnabled(true);
            transfer1.setEnabled(true);
            iconstop1.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart1ActionPerformed

    private void clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear1ActionPerformed
            timer.stop();
            hour =0;
            min = 0;
            sec = 0;
            stophour = 0;
            stopmin = 0;
            stopsec = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status1.setText("Available");
            lhour1.setText("00");
            lsec1.setText("00");
            lmin1.setText("00");
            cusernam1.setText("");
            photo1.setIcon(available);
            status1.setForeground(java.awt.Color.GRAY);
            Updatecomputer1();
            jbstart1.setEnabled(true);
            Stop1.setEnabled(false);
            transfer1.setEnabled(false);
            iconstop1.setEnabled(false);
    }//GEN-LAST:event_clear1ActionPerformed

    private void clear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear3ActionPerformed
            timer3.stop();
            hour3 =0;
            min3 = 0;
            sec3 = 0;
            stophour3 = 0;
            stopmin3 = 0;
            stopsec3 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status3.setText("Available");
            lhour3.setText("00");
            lsec3.setText("00");
            lmin3.setText("00");
            cusernam3.setText("");
            photo3.setIcon(available);
            status3.setForeground(java.awt.Color.GRAY);
            Updatecomputer3();
            jbstart3.setEnabled(true);
            Stop3.setEnabled(false);
            transfer3.setEnabled(false);
            iconstop3.setEnabled(false);
    }//GEN-LAST:event_clear3ActionPerformed

    private void clear5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear5ActionPerformed
            timer5.stop();
            hour5 =0;
            min5 = 0;
            sec5 = 0;
            stophour5 = 0;
            stopmin5 = 0;
            stopsec5 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status5.setText("Available");
            lhour5.setText("00");
            lsec5.setText("00");
            lmin5.setText("00");
            cusernam5.setText("");
            photo5.setIcon(available);
            status5.setForeground(java.awt.Color.GRAY);
            Updatecomputer5();
            jbstart5.setEnabled(true);
            Stop5.setEnabled(false);
            transfer5.setEnabled(false);
            iconstop5.setEnabled(false);
    }//GEN-LAST:event_clear5ActionPerformed

    private void clear8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear8ActionPerformed
            timer8.stop();
            hour8 =0;
            min8 = 0;
            sec8 = 0;
            stophour8 = 0;
            stopmin8 = 0;
            stopsec8 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status8.setText("Available");
            lhour8.setText("00");
            lsec8.setText("00");
            lmin8.setText("00");
            cusernam8.setText("");
            photo8.setIcon(available);
            status8.setForeground(java.awt.Color.GRAY);
            Updatecomputer8();
            jbstart8.setEnabled(true);
            Stop8.setEnabled(false);
            transfer8.setEnabled(false);
            iconstop8.setEnabled(false);
    }//GEN-LAST:event_clear8ActionPerformed

    private void clear9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear9ActionPerformed
            timer9.stop();
            hour9 =0;
            min9= 0;
            sec9 = 0;
            stophour9 = 0;
            stopmin9 = 0;
            stopsec9 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status9.setText("Available");
            lhour9.setText("00");
            lsec9.setText("00");
            lmin9.setText("00");
            cusernam9.setText("");
            photo9.setIcon(available);
            status9.setForeground(java.awt.Color.GRAY);
            Updatecomputer9();
            jbstart9.setEnabled(true);
            Stop9.setEnabled(false);
            transfer9.setEnabled(false);
            iconstop9.setEnabled(false);
    }//GEN-LAST:event_clear9ActionPerformed

    private void clear10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear10ActionPerformed
            timer10.stop();
            hour10 =0;
            min10= 0;
            sec10 = 0;
            stophour10 = 0;
            stopmin10 = 0;
            stopsec10 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status10.setText("Available");
            lhour10.setText("00");
            lsec10.setText("00");
            lmin10.setText("00");
            cusernam10.setText("");
            photo10.setIcon(available);
            status10.setForeground(java.awt.Color.GRAY);
            Updatecomputer10();
            jbstart10.setEnabled(true);
            Stop10.setEnabled(false);
            transfer10.setEnabled(false);
            iconstop10.setEnabled(false);
    }//GEN-LAST:event_clear10ActionPerformed

    private void clear11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear11ActionPerformed
            timer11.stop();
            hour11 =0;
            min11= 0;
            sec11= 0;
            stophour11 = 0;
            stopmin11 = 0;
            stopsec11 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status11.setText("Available");
            lhour11.setText("00");
            lsec11.setText("00");
            lmin11.setText("00");
            cusernam11.setText("");
            photo11.setIcon(available);
            status11.setForeground(java.awt.Color.GRAY);
            Updatecomputer11();
            jbstart11.setEnabled(true);
            Stop11.setEnabled(false);
            transfer11.setEnabled(false);
            iconstop11.setEnabled(false);
    }//GEN-LAST:event_clear11ActionPerformed

    private void clear12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear12ActionPerformed
            timer12.stop();
            hour12 =0;
            min12= 0;
            sec12= 0;
            stophour12 = 0;
            stopmin12 = 0;
            stopsec12 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status12.setText("Available");
            lhour12.setText("00");
            lsec12.setText("00");
            lmin12.setText("00");
            cusernam12.setText("");
            photo12.setIcon(available);
            status12.setForeground(java.awt.Color.GRAY);
            Updatecomputer12();
            jbstart12.setEnabled(true);
            Stop12.setEnabled(false);
            transfer12.setEnabled(false);
            iconstop12.setEnabled(false);
    }//GEN-LAST:event_clear12ActionPerformed

    private void nextpage2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextpage2MouseClicked
     c1.show(Jmain, "card7");
        statusComputer13();
        statusComputer14();
        statusComputer15();
        statusComputer16();
        statusComputer17();
        statusComputer18();
        statusComputer19();
        statusComputer20();
        statusComputer21();
        statusComputer22();
        statusComputer23();
        statusComputer24();
        /*13*/
        if(status13.getText().equals("Available")){
            status13.setForeground(java.awt.Color.GRAY);
            photo13.setIcon(available);
        }
        if(status13.getText().equals("User")){
            photo13.setIcon(using);
            status13.setForeground(java.awt.Color.GREEN);

        }
        if(status13.getText().equals("Repair")){
            status13.setForeground(java.awt.Color.blue);
            photo13.setIcon(repair);
            clear13.setEnabled(false);
        }
        if(status13.getText().equals("Dilapidated")){
            status13.setForeground(java.awt.Color.RED);
            photo13.setIcon(broken);
            clear13.setEnabled(false);

        }
        if(status13.getText().equals("User")&&hour13==0&&min13==0&&sec13==0){
            status13.setText("Available");
            photo13.setIcon(available);
            Updatecomputer13();
        }
        /*14*/
         if(status14.getText().equals("Available")){
            status14.setForeground(java.awt.Color.GRAY);
            photo14.setIcon(available);
        }
        if(status14.getText().equals("User")){
            photo14.setIcon(using);
            status14.setForeground(java.awt.Color.GREEN);

        }
        if(status14.getText().equals("Repair")){
            status14.setForeground(java.awt.Color.blue);
            photo14.setIcon(repair);
            clear14.setEnabled(false);
        }
        if(status14.getText().equals("Dilapidated")){
            status14.setForeground(java.awt.Color.RED);
            photo14.setIcon(broken);
            clear14.setEnabled(false);
        }
        if(status14.getText().equals("User")&&hour14==0&&min14==0&&sec14==0){
            status14.setText("Available");
            photo14.setIcon(available);
            Updatecomputer14();
        }
        /*15*/
        if(status15.getText().equals("Available")){
            status15.setForeground(java.awt.Color.GRAY);
            photo15.setIcon(available);
        }
        if(status15.getText().equals("User")){
            photo15.setIcon(using);
            status15.setForeground(java.awt.Color.GREEN);

        }
        if(status15.getText().equals("Repair")){
            status15.setForeground(java.awt.Color.blue);
            photo15.setIcon(repair);
            clear15.setEnabled(false);
        }
        if(status15.getText().equals("Dilapidated")){
            status15.setForeground(java.awt.Color.RED);
            photo15.setIcon(broken);
            clear15.setEnabled(false);

        }
        if(status15.getText().equals("User")&&hour15==0&&min15==0&&sec15==0){
            status15.setText("Available");
            photo15.setIcon(available);
            Updatecomputer15();
        }
        /*16*/
        if(status16.getText().equals("Available")){
            status16.setForeground(java.awt.Color.GRAY);
            photo16.setIcon(available);
        }
        if(status16.getText().equals("User")){
            photo16.setIcon(using);
            status16.setForeground(java.awt.Color.GREEN);

        }
        if(status16.getText().equals("Repair")){
            status16.setForeground(java.awt.Color.blue);
            photo16.setIcon(repair);
            clear16.setEnabled(false);
        }
        if(status16.getText().equals("Dilapidated")){
            status16.setForeground(java.awt.Color.RED);
            photo16.setIcon(broken);
            clear16.setEnabled(false);
        }
        if(status16.getText().equals("User")&&hour16==0&&min16==0&&sec16==0){
            status16.setText("Available");
            photo16.setIcon(available);
            Updatecomputer16();
        }
        /*17*/
      if(status17.getText().equals("Available")){
            status17.setForeground(java.awt.Color.GRAY);
            photo17.setIcon(available);
        }
        if(status17.getText().equals("User")){
            photo17.setIcon(using);
            status17.setForeground(java.awt.Color.GREEN);

        }
        if(status17.getText().equals("Repair")){
            status17.setForeground(java.awt.Color.blue);
            photo17.setIcon(repair);
            clear17.setEnabled(false);
        }
        if(status17.getText().equals("Dilapidated")){
            status17.setForeground(java.awt.Color.RED);
            photo17.setIcon(broken);
            clear17.setEnabled(false);
        }
        if(status17.getText().equals("User")&&hour17==0&&min17==0&&sec17==0){
            status17.setText("Available");
            photo17.setIcon(available);
            Updatecomputer17();
        }
        /*18*/
        if(status18.getText().equals("Available")){
            status18.setForeground(java.awt.Color.GRAY);
            photo18.setIcon(available);
        }
        if(status18.getText().equals("User")){
            photo18.setIcon(using);
            status18.setForeground(java.awt.Color.GREEN);

        }
        if(status18.getText().equals("Repair")){
            status18.setForeground(java.awt.Color.blue);
            photo18.setIcon(repair);
            clear18.setEnabled(false);
        }
        if(status18.getText().equals("Dilapidated")){
            status18.setForeground(java.awt.Color.RED);
            photo18.setIcon(broken);
            clear18.setEnabled(false);
        }
        if(status18.getText().equals("User")&&hour18==0&&min18==0&&sec18==0){
            status18.setText("Available");
            photo18.setIcon(available);
            Updatecomputer18();
        }
        /*19*/
      if(status19.getText().equals("Available")){
            status19.setForeground(java.awt.Color.GRAY);
            photo19.setIcon(available);
        }
        if(status19.getText().equals("User")){
            photo19.setIcon(using);
            status19.setForeground(java.awt.Color.GREEN);

        }
        if(status19.getText().equals("Repair")){
            status19.setForeground(java.awt.Color.blue);
            photo19.setIcon(repair);
            clear19.setEnabled(false);
        }
        if(status19.getText().equals("Dilapidated")){
            status19.setForeground(java.awt.Color.RED);
            photo19.setIcon(broken);
            clear19.setEnabled(false);
        }
        if(status19.getText().equals("User")&&hour19==0&&min19==0&&sec19==0){
            status19.setText("Available");
            photo19.setIcon(available);
            Updatecomputer19();
        }
        /*20*/
        if(status20.getText().equals("Available")){
            status20.setForeground(java.awt.Color.GRAY);
            photo20.setIcon(available);
        }
        if(status20.getText().equals("User")){
            photo20.setIcon(using);
            status20.setForeground(java.awt.Color.GREEN);

        }
        if(status20.getText().equals("Repair")){
            status20.setForeground(java.awt.Color.blue);
            photo20.setIcon(repair);
            clear20.setEnabled(false);
        }
        if(status20.getText().equals("Dilapidated")){
            status20.setForeground(java.awt.Color.RED);
            photo20.setIcon(broken);
            clear20.setEnabled(false);
        }
        if(status20.getText().equals("User")&&hour20==0&&min20==0&&sec20==0){
            status20.setText("Available");
            photo20.setIcon(available);
            Updatecomputer20();
        }
        /*21*/
        if(status21.getText().equals("Available")){
            status21.setForeground(java.awt.Color.GRAY);
            photo21.setIcon(available);
        }
        if(status21.getText().equals("User")){
            photo21.setIcon(using);
            status21.setForeground(java.awt.Color.GREEN);

        }
        if(status21.getText().equals("Repair")){
            status21.setForeground(java.awt.Color.blue);
            photo21.setIcon(repair);
            clear21.setEnabled(false);
        }
        if(status21.getText().equals("Dilapidated")){
            status21.setForeground(java.awt.Color.RED);
            photo21.setIcon(broken);
            clear21.setEnabled(false);
        }
        if(status21.getText().equals("User")&&hour21==0&&min21==0&&sec21==0){
            status21.setText("Available");
            photo21.setIcon(available);
            Updatecomputer21();
        }
        /*22*/
        if(status22.getText().equals("Available")){
            status22.setForeground(java.awt.Color.GRAY);
            photo22.setIcon(available);
        }
        if(status22.getText().equals("User")){
            photo22.setIcon(using);
            status22.setForeground(java.awt.Color.GREEN);

        }
        if(status22.getText().equals("Repair")){
            status22.setForeground(java.awt.Color.blue);
            photo22.setIcon(repair);
            clear22.setEnabled(false);
        }
        if(status22.getText().equals("Dilapidated")){
            status22.setForeground(java.awt.Color.RED);
            photo22.setIcon(broken);
            clear22.setEnabled(false);
        }
        if(status22.getText().equals("User")&&hour22==0&&min22==0&&sec22==0){
            status22.setText("Available");
            photo22.setIcon(available);
            Updatecomputer22();
        }
        /*23*/
        if(status23.getText().equals("Available")){
            status23.setForeground(java.awt.Color.GRAY);
            photo23.setIcon(available);
        }
        if(status23.getText().equals("User")){
            photo23.setIcon(using);
            status23.setForeground(java.awt.Color.GREEN);

        }
        if(status23.getText().equals("Repair")){
            status23.setForeground(java.awt.Color.blue);
            photo23.setIcon(repair);
            clear23.setEnabled(false);
        }
        if(status23.getText().equals("Dilapidated")){
            status23.setForeground(java.awt.Color.RED);
            photo23.setIcon(broken);
            clear23.setEnabled(false);
        }
        if(status23.getText().equals("User")&&hour23==0&&min23==0&&sec23==0){
            status23.setText("Available");
            photo23.setIcon(available);
            Updatecomputer23();
        }
        /*24*/
        if(status24.getText().equals("Available")){
            status24.setForeground(java.awt.Color.GRAY);
            photo24.setIcon(available);
        }
        if(status24.getText().equals("User")){
            photo24.setIcon(using);
            status24.setForeground(java.awt.Color.GREEN);

        }
        if(status24.getText().equals("Repair")){
            status24.setForeground(java.awt.Color.blue);
            photo24.setIcon(repair);
            clear24.setEnabled(false);
        }
        if(status24.getText().equals("Dilapidated")){
            status24.setForeground(java.awt.Color.RED);
            photo24.setIcon(broken);
            clear24.setEnabled(false);

        }
        if(status24.getText().equals("User")&&hour24==0&&min24==0&&sec24==0){
            status24.setText("Available");
            photo24.setIcon(available);
            Updatecomputer24();
        }
        
    }//GEN-LAST:event_nextpage2MouseClicked

    private void Stop13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop13ActionPerformed
        stopname = cusernam13.getText();
        stophour13 = hour13;
        stopmin13 = min13;
        stopsec13= sec13;
        ifStop13 = true;
        timer13.stop();
        jbstart13.setEnabled(true);
        Stop13.setEnabled(false);
        transfer13.setEnabled(false);
        iconstop13.setEnabled(true);
    }//GEN-LAST:event_Stop13ActionPerformed

    private void jbstart13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart13ActionPerformed

            if(status13.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status13.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status13.getText().equals("Available")||status13.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour13.setText("0"+jbox1.getSelectedItem());
            hour13 =Integer.parseInt(lhour13.getText());
            cusernam13.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo13.setIcon(using);
            status13.setText("User");
            status13.setForeground(java.awt.Color.GREEN);

            Updatecomputer13();
            timer13 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lhour13.setForeground(java.awt.Color.BLACK);
                    lmin13.setForeground(java.awt.Color.BLACK);
                    lsec13.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour13==0&&min13==0&&sec13==0){
                        cusernam13.setText(stopname);
                        hour13 = tranferhour;
                        min13 = tranfermin;
                        sec13 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop13){
                        cusernam13.setText(stopname);
                        hour13 = stophour13;
                        min13 = stopmin13;
                        sec13 = stopsec13;
                        ifStop13 = false;
                    }
                    if(min13==0&&hour13>0){
                        min13=60;
                        hour13--;
                    }
                    if(sec13==0&&min13>0){
                        sec13=60;
                        min13--;
                    }

                    if(hour13==0){
                        if(min13<=15){
                            lhour13.setForeground(java.awt.Color.red);
                            lmin13.setForeground(java.awt.Color.red);
                            lsec13.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour13==0&&min13==0&&sec13==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 13 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status13.setText("Available");
                        photo13.setIcon(available);
                        status13.setForeground(java.awt.Color.GRAY);
                        Updatecomputer13();
                        cusernam13.setText("");
                        hour13=0;min13=0;sec13=0;
                        lhour13.setForeground(java.awt.Color.BLACK);
                        lmin13.setForeground(java.awt.Color.BLACK);
                        lsec13.setForeground(java.awt.Color.BLACK);
                        timer13.stop();
                        jbstart13.setEnabled(true);
                        Stop13.setEnabled(false);
                        transfer13.setEnabled(false);

                    }else{
                        sec13--;
                        lhour13.setText(""+hour13);
                        lsec13.setText(""+sec13);
                        lmin13.setText(""+min13);
                    }

                }
            });
            timer13.start();
            jbstart13.setEnabled(false);
            Stop13.setEnabled(true);
            transfer13.setEnabled(true);
            iconstop13.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart13ActionPerformed

    private void transfer13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer13ActionPerformed
        stopname = cusernam13.getText();
        tranferhour = hour13;
        tranfermin = min13;
        tranfersec = sec13;
        ifTranfer = true;
        timer13.stop();
        lhour13.setText("00");
        lsec13.setText("00");
        lmin13.setText("00");
        cusernam13.setText("");
        status13.setText("Available");
        status13.setForeground(java.awt.Color.GRAY);
        photo13.setIcon(available);
        Updatecomputer13();
        jbstart13.setEnabled(false);
        Stop13.setEnabled(false);
        transfer13.setEnabled(false);
        iconstop13.setEnabled(false);
        clear13.setEnabled(true);
    }//GEN-LAST:event_transfer13ActionPerformed

    private void clear13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear13ActionPerformed
            timer13.stop();
            hour13 =0;
            min13 = 0;
            sec13 = 0;
            stophour13 = 0;
            stopmin13 = 0;
            stopsec13 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status13.setText("Available");
            lhour13.setText("00");
            lsec13.setText("00");
            lmin13.setText("00");
            cusernam13.setText("");
            photo13.setIcon(available);
            status13.setForeground(java.awt.Color.GRAY);
            Updatecomputer13();
            jbstart13.setEnabled(true);
            Stop13.setEnabled(false);
            transfer13.setEnabled(false);
            iconstop13.setEnabled(false);
    }//GEN-LAST:event_clear13ActionPerformed

    private void jbstart14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart14ActionPerformed

            if(status14.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status14.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status14.getText().equals("Available")||status14.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour14.setText("0"+jbox1.getSelectedItem());
            hour14 =Integer.parseInt(lhour14.getText());
            cusernam14.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo14.setIcon(using);
            status14.setText("User");
            status14.setForeground(java.awt.Color.GREEN);

            Updatecomputer14();
            timer14 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lhour14.setForeground(java.awt.Color.BLACK);
                    lmin14.setForeground(java.awt.Color.BLACK);
                    lsec14.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour14==0&&min14==0&&sec14==0){
                        cusernam14.setText(stopname);
                        hour14 = tranferhour;
                        min14 = tranfermin;
                        sec14 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop14){
                        cusernam14.setText(stopname);
                        hour14 = stophour14;
                        min14 = stopmin14;
                        sec14 = stopsec14;
                        ifStop14 = false;
                    }
                    if(min14==0&&hour14>0){
                        min14=60;
                        hour14--;
                    }
                    if(sec14==0&&min14>0){
                        sec14=60;
                        min14--;
                    }

                    if(hour14==0){
                        if(min14<=15){
                            lhour14.setForeground(java.awt.Color.red);
                            lmin14.setForeground(java.awt.Color.red);
                            lsec14.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour14==0&&min14==0&&sec14==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 14 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status14.setText("Available");
                        photo14.setIcon(available);
                        status14.setForeground(java.awt.Color.GRAY);
                        Updatecomputer14();
                        cusernam14.setText("");
                        hour14=0;min14=0;sec14=0;
                        lhour14.setForeground(java.awt.Color.BLACK);
                        lmin14.setForeground(java.awt.Color.BLACK);
                        lsec14.setForeground(java.awt.Color.BLACK);
                        timer14.stop();
                        jbstart14.setEnabled(true);
                        Stop14.setEnabled(false);
                        transfer14.setEnabled(false);

                    }else{
                        sec14--;
                        lhour14.setText(""+hour14);
                        lsec14.setText(""+sec14);
                        lmin14.setText(""+min14);
                    }

                }
            });
            timer14.start();
            jbstart14.setEnabled(false);
            Stop14.setEnabled(true);
            transfer14.setEnabled(true);
            iconstop14.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart14ActionPerformed

    private void Stop14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop14ActionPerformed
        stopname = cusernam14.getText();
        stophour14 = hour14;
        stopmin14 = min14;
        stopsec14 = sec14;
        ifStop14 = true;
        timer14.stop();
        jbstart14.setEnabled(true);
        Stop14.setEnabled(false);
        transfer14.setEnabled(false);
        iconstop14.setEnabled(true);
    }//GEN-LAST:event_Stop14ActionPerformed

    private void transfer14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer14ActionPerformed
        stopname = cusernam14.getText();
        tranferhour = hour14;
        tranfermin = min14;
        tranfersec = sec14;
        ifTranfer = true;
        timer14.stop();
        lhour14.setText("00");
        lsec14.setText("00");
        lmin14.setText("00");
        cusernam14.setText("");
        status14.setText("Available");
        status14.setForeground(java.awt.Color.GRAY);
        photo14.setIcon(available);
        Updatecomputer14();
        jbstart14.setEnabled(false);
        Stop14.setEnabled(false);
        transfer14.setEnabled(false);
        iconstop14.setEnabled(false);
        clear14.setEnabled(true);
    }//GEN-LAST:event_transfer14ActionPerformed

    private void clear14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear14ActionPerformed
            timer14.stop();
            hour14 =0;
            min14 = 0;
            sec14 = 0;
            stophour14 = 0;
            stopmin14 = 0;
            stopsec14 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status14.setText("Available");
            lhour14.setText("00");
            lsec14.setText("00");
            lmin14.setText("00");
            cusernam14.setText("");
            photo14.setIcon(available);
            status14.setForeground(java.awt.Color.GRAY);
            Updatecomputer14();
            jbstart14.setEnabled(true);
            Stop14.setEnabled(false);
            transfer14.setEnabled(false);
            iconstop14.setEnabled(false);
    }//GEN-LAST:event_clear14ActionPerformed

    private void jbstart15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart15ActionPerformed

            if(status15.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status15.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status15.getText().equals("Available")||status15.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour15.setText("0"+jbox1.getSelectedItem());
            hour15 =Integer.parseInt(lhour15.getText());
            cusernam15.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo15.setIcon(using);
            status15.setText("User");
            status15.setForeground(java.awt.Color.GREEN);

            Updatecomputer15();
            timer15 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lhour15.setForeground(java.awt.Color.BLACK);
                    lmin15.setForeground(java.awt.Color.BLACK);
                    lsec15.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour15==0&&min15==0&&sec15==0){
                        cusernam15.setText(stopname);
                        hour15 = tranferhour;
                        min15 = tranfermin;
                        sec15 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop15){
                        cusernam15.setText(stopname);
                        hour15 = stophour15;
                        min15 = stopmin15;
                        sec15 = stopsec15;
                        ifStop15 = false;
                    }
                    if(min15==0&&hour15>0){
                        min15=60;
                        hour15--;
                    }
                    if(sec15==0&&min15>0){
                        sec15=60;
                        min15--;
                    }

                    if(hour15==0){
                        if(min15<=15){
                            lhour15.setForeground(java.awt.Color.red);
                            lmin15.setForeground(java.awt.Color.red);
                            lsec15.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour15==0&&min15==0&&sec15==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 15 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status15.setText("Available");
                        photo15.setIcon(available);
                        status15.setForeground(java.awt.Color.GRAY);
                        Updatecomputer15();
                        cusernam15.setText("");
                        hour15=0;min15=0;sec15=0;
                        lhour15.setForeground(java.awt.Color.BLACK);
                        lmin15.setForeground(java.awt.Color.BLACK);
                        lsec15.setForeground(java.awt.Color.BLACK);
                        timer15.stop();
                        jbstart15.setEnabled(true);
                        Stop15.setEnabled(false);
                        transfer15.setEnabled(false);

                    }else{
                        sec15--;
                        lhour15.setText(""+hour15);
                        lsec15.setText(""+sec15);
                        lmin15.setText(""+min15);
                    }

                }
            });
            timer15.start();
            jbstart15.setEnabled(false);
            Stop15.setEnabled(true);
            transfer15.setEnabled(true);
            iconstop15.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart15ActionPerformed

    private void Stop15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop15ActionPerformed
        stopname = cusernam15.getText();
        stophour15 = hour15;
        stopmin15= min15;
        stopsec15 = sec15;
        ifStop15 = true;
        timer15.stop();
        jbstart15.setEnabled(true);
        Stop15.setEnabled(false);
        transfer15.setEnabled(false);
        iconstop15.setEnabled(true);
    }//GEN-LAST:event_Stop15ActionPerformed

    private void transfer15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer15ActionPerformed
        stopname = cusernam15.getText();
        tranferhour = hour15;
        tranfermin = min15;
        tranfersec = sec15;
        ifTranfer = true;
        timer15.stop();
        lhour15.setText("00");
        lsec15.setText("00");
        lmin15.setText("00");
        cusernam15.setText("");
        status15.setText("Available");
        status15.setForeground(java.awt.Color.GRAY);
        photo15.setIcon(available);
        Updatecomputer15();
        jbstart15.setEnabled(false);
        Stop15.setEnabled(false);
        transfer15.setEnabled(false);
        iconstop15.setEnabled(false);
        clear15.setEnabled(true);
    }//GEN-LAST:event_transfer15ActionPerformed

    private void clear15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear15ActionPerformed
            timer15.stop();
            hour15 =0;
            min15 = 0;
            sec15 = 0;
            stophour15 = 0;
            stopmin15 = 0;
            stopsec15 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status15.setText("Available");
            lhour15.setText("00");
            lsec15.setText("00");
            lmin15.setText("00");
            cusernam15.setText("");
            photo15.setIcon(available);
            status15.setForeground(java.awt.Color.GRAY);
            Updatecomputer15();
            jbstart15.setEnabled(true);
            Stop15.setEnabled(false);
            transfer15.setEnabled(false);
            iconstop15.setEnabled(false);
    }//GEN-LAST:event_clear15ActionPerformed

    private void jbstart16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart16ActionPerformed

            if(status16.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status16.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status16.getText().equals("Available")||status16.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour16.setText("0"+jbox1.getSelectedItem());
            hour16 =Integer.parseInt(lhour16.getText());
            cusernam16.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo16.setIcon(using);
            status16.setText("User");
            status16.setForeground(java.awt.Color.GREEN);

            Updatecomputer16();
            timer16 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lhour16.setForeground(java.awt.Color.BLACK);
                    lmin16.setForeground(java.awt.Color.BLACK);
                    lsec16.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour16==0&&min16==0&&sec16==0){
                        cusernam16.setText(stopname);
                        hour16 = tranferhour;
                        min16 = tranfermin;
                        sec16 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop16){
                        cusernam16.setText(stopname);
                        hour16 = stophour16;
                        min16 = stopmin16;
                        sec16 = stopsec16;
                        ifStop16 = false;
                    }
                    if(min16==0&&hour16>0){
                        min16=60;
                        hour16--;
                    }
                    if(sec16==0&&min16>0){
                        sec16=60;
                        min16--;
                    }

                    if(hour16==0){
                        if(min16<=15){
                            lhour16.setForeground(java.awt.Color.red);
                            lmin16.setForeground(java.awt.Color.red);
                            lsec16.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour16==0&&min16==0&&sec16==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 16 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status16.setText("Available");
                        photo16.setIcon(available);
                        status16.setForeground(java.awt.Color.GRAY);
                        Updatecomputer16();
                        cusernam16.setText("");
                        hour16=0;min16=0;sec16=0;
                        lhour16.setForeground(java.awt.Color.BLACK);
                        lmin16.setForeground(java.awt.Color.BLACK);
                        lsec16.setForeground(java.awt.Color.BLACK);
                        timer16.stop();
                        jbstart16.setEnabled(true);
                        Stop16.setEnabled(false);
                        transfer16.setEnabled(false);

                    }else{
                        sec16--;
                        lhour16.setText(""+hour16);
                        lsec16.setText(""+sec16);
                        lmin16.setText(""+min16);
                    }

                }
            });
            timer16.start();
            jbstart16.setEnabled(false);
            Stop16.setEnabled(true);
            transfer16.setEnabled(true);
            iconstop16.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart16ActionPerformed

    private void Stop16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop16ActionPerformed
        stopname = cusernam16.getText();
        stophour16 = hour16;
        stopmin16= min16;
        stopsec16 = sec16;
        ifStop16 = true;
        timer16.stop();
        jbstart16.setEnabled(true);
        Stop16.setEnabled(false);
        transfer16.setEnabled(false);
        iconstop16.setEnabled(true);
    }//GEN-LAST:event_Stop16ActionPerformed

    private void clear16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear16ActionPerformed
            timer16.stop();
            hour16 =0;
            min16 = 0;
            sec16 = 0;
            stophour16 = 0;
            stopmin16 = 0;
            stopsec16 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status16.setText("Available");
            lhour16.setText("00");
            lsec16.setText("00");
            lmin16.setText("00");
            cusernam16.setText("");
            photo16.setIcon(available);
            status16.setForeground(java.awt.Color.GRAY);
            Updatecomputer16();
            jbstart16.setEnabled(true);
            Stop16.setEnabled(false);
            transfer16.setEnabled(false);
            iconstop16.setEnabled(false);
    }//GEN-LAST:event_clear16ActionPerformed

    private void transfer16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer16ActionPerformed
       stopname = cusernam16.getText();
        tranferhour = hour16;
        tranfermin = min16;
        tranfersec = sec16;
        ifTranfer = true;
        timer16.stop();
        lhour16.setText("00");
        lsec16.setText("00");
        lmin16.setText("00");
        cusernam16.setText("");
        status16.setText("Available");
        status16.setForeground(java.awt.Color.GRAY);
        photo16.setIcon(available);
        Updatecomputer16();
        jbstart16.setEnabled(false);
        Stop16.setEnabled(false);
        transfer16.setEnabled(false);
        iconstop16.setEnabled(false);
        clear16.setEnabled(true);
    }//GEN-LAST:event_transfer16ActionPerformed

    private void Stop17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop17ActionPerformed
        stopname = cusernam17.getText();
        stophour17 = hour17;
        stopmin17 = min17;
        stopsec17 = sec17;
        ifStop17 = true;
        timer17.stop();
        jbstart17.setEnabled(true);
        Stop17.setEnabled(false);
        transfer17.setEnabled(false);
        iconstop17.setEnabled(true);
    }//GEN-LAST:event_Stop17ActionPerformed

    private void jbstart17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart17ActionPerformed

            if(status17.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status17.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status17.getText().equals("Available")||status17.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour17.setText("0"+jbox1.getSelectedItem());
            hour17 =Integer.parseInt(lhour17.getText());
            cusernam17.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo17.setIcon(using);
            status17.setText("User");
            status17.setForeground(java.awt.Color.GREEN);

            Updatecomputer17();
            timer17 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour17.setForeground(java.awt.Color.BLACK);
                    lmin17.setForeground(java.awt.Color.BLACK);
                    lsec17.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour17==0&&min17==0&&sec17==0){
                        cusernam17.setText(stopname);
                        hour17 = tranferhour;
                        min17 = tranfermin;
                        sec17 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop17){
                        cusernam17.setText(stopname);
                        hour17 = stophour17;
                        min17 = stopmin17;
                        sec17 = stopsec17;
                        ifStop17 = false;
                    }
                    if(min17==0&&hour17>0){
                        min17=60;
                        hour17--;
                    }
                    if(sec17==0&&min17>0){
                        sec17=60;
                        min17--;
                    }

                    if(hour17==0){
                        if(min17<=15){
                            lhour17.setForeground(java.awt.Color.red);
                            lmin17.setForeground(java.awt.Color.red);
                            lsec17.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour17==0&&min17==0&&sec17==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 17 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status17.setText("Available");
                        photo17.setIcon(available);
                        status17.setForeground(java.awt.Color.GRAY);
                        Updatecomputer17();
                        cusernam17.setText("");
                        hour17=0;min17=0;sec17=0;
                        lhour17.setForeground(java.awt.Color.BLACK);
                        lmin17.setForeground(java.awt.Color.BLACK);
                        lsec17.setForeground(java.awt.Color.BLACK);
                        timer17.stop();
                        jbstart17.setEnabled(true);
                        Stop17.setEnabled(false);
                        transfer17.setEnabled(false);

                    }else{
                        sec17--;
                        lhour17.setText(""+hour17);
                        lsec17.setText(""+sec17);
                        lmin17.setText(""+min17);
                    }

                }
            });
            timer17.start();
            jbstart17.setEnabled(false);
            Stop17.setEnabled(true);
            transfer17.setEnabled(true);
            iconstop17.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart17ActionPerformed

    private void transfer17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer17ActionPerformed
        stopname = cusernam17.getText();
        tranferhour = hour17;
        tranfermin = min17;
        tranfersec = sec17;
        ifTranfer = true;
        timer17.stop();
        lhour17.setText("00");
        lsec17.setText("00");
        lmin17.setText("00");
        cusernam17.setText("");
        status17.setText("Available");
        status17.setForeground(java.awt.Color.GRAY);
        photo17.setIcon(available);
        Updatecomputer17();
        jbstart17.setEnabled(false);
        Stop17.setEnabled(false);
        transfer17.setEnabled(false);
        iconstop17.setEnabled(false);
        clear17.setEnabled(true);
    }//GEN-LAST:event_transfer17ActionPerformed

    private void clear17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear17ActionPerformed
            timer17.stop();
            hour17 =0;
            min17 = 0;
            sec17 = 0;
            stophour17 = 0;
            stopmin17 = 0;
            stopsec17 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status17.setText("Available");
            lhour17.setText("00");
            lsec17.setText("00");
            lmin17.setText("00");
            cusernam17.setText("");
            photo17.setIcon(available);
            status17.setForeground(java.awt.Color.GRAY);
            Updatecomputer17();
            jbstart17.setEnabled(true);
            Stop17.setEnabled(false);
            transfer17.setEnabled(false);
            iconstop17.setEnabled(false);
    }//GEN-LAST:event_clear17ActionPerformed

    private void jbstart18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart18ActionPerformed

            if(status18.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status18.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status18.getText().equals("Available")||status18.getText().equals("User")){
             if(jbox1.getSelectedIndex()!=0){
            lhour18.setText("0"+jbox1.getSelectedItem());
            hour18 =Integer.parseInt(lhour18.getText());
            cusernam18.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo18.setIcon(using);
            status18.setText("User");
            status18.setForeground(java.awt.Color.GREEN);

            Updatecomputer18();
            timer18 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour18.setForeground(java.awt.Color.BLACK);
                    lmin18.setForeground(java.awt.Color.BLACK);
                    lsec18.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour18==0&&min18==0&&sec18==0){
                        cusernam18.setText(stopname);
                        hour18 = tranferhour;
                        min18 = tranfermin;
                        sec18 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop18){
                        cusernam18.setText(stopname);
                        hour18 = stophour18;
                        min18 = stopmin18;
                        sec18 = stopsec18;
                        ifStop18 = false;
                    }
                    if(min18==0&&hour18>0){
                        min18=60;
                        hour18--;
                    }
                    if(sec18==0&&min18>0){
                        sec18=60;
                        min18--;
                    }

                    if(hour18==0){
                        if(min18<=15){
                            lhour18.setForeground(java.awt.Color.red);
                            lmin18.setForeground(java.awt.Color.red);
                            lsec18.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour18==0&&min18==0&&sec18==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 18 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status18.setText("Available");
                        photo18.setIcon(available);
                        status18.setForeground(java.awt.Color.GRAY);
                        Updatecomputer18();
                        cusernam18.setText("");
                        hour18=0;min18=0;sec18=0;
                        lhour18.setForeground(java.awt.Color.BLACK);
                        lmin18.setForeground(java.awt.Color.BLACK);
                        lsec18.setForeground(java.awt.Color.BLACK);
                        timer18.stop();
                        jbstart18.setEnabled(true);
                        Stop18.setEnabled(false);
                        transfer18.setEnabled(false);

                    }else{
                        sec18--;
                        lhour18.setText(""+hour18);
                        lsec18.setText(""+sec18);
                        lmin18.setText(""+min18);
                    }

                }
            });
            timer18.start();
            jbstart18.setEnabled(false);
            Stop18.setEnabled(true);
            transfer18.setEnabled(true);
            iconstop18.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart18ActionPerformed

    private void Stop18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop18ActionPerformed
        stopname = cusernam18.getText();
        stophour18 = hour18;
        stopmin18 = min18;
        stopsec18 = sec18;
        ifStop18 = true;
        timer18.stop();
        jbstart18.setEnabled(true);
        Stop18.setEnabled(false);
        transfer18.setEnabled(false);
        iconstop18.setEnabled(true);
    }//GEN-LAST:event_Stop18ActionPerformed

    private void transfer18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer18ActionPerformed
        stopname = cusernam18.getText();
        tranferhour = hour18;
        tranfermin = min18;
        tranfersec = sec18;
        ifTranfer = true;
        timer18.stop();
        lhour18.setText("00");
        lsec18.setText("00");
        lmin18.setText("00");
        cusernam18.setText("");
        status18.setText("Available");
        status18.setForeground(java.awt.Color.GRAY);
        photo18.setIcon(available);
        Updatecomputer18();
        jbstart18.setEnabled(false);
        Stop18.setEnabled(false);
        transfer18.setEnabled(false);
        iconstop18.setEnabled(false);
        clear18.setEnabled(true);
    }//GEN-LAST:event_transfer18ActionPerformed

    private void clear18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear18ActionPerformed
            timer18.stop();
            hour18 =0;
            min18 = 0;
            sec18 = 0;
            stophour18 = 0;
            stopmin18 = 0;
            stopsec18 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status18.setText("Available");
            lhour18.setText("00");
            lsec18.setText("00");
            lmin18.setText("00");
            cusernam18.setText("");
            photo18.setIcon(available);
            status18.setForeground(java.awt.Color.GRAY);
            Updatecomputer18();
            jbstart18.setEnabled(true);
            Stop18.setEnabled(false);
            transfer18.setEnabled(false);
            iconstop18.setEnabled(false);
    }//GEN-LAST:event_clear18ActionPerformed

    private void jbstart19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart19ActionPerformed

            if(status19.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status19.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status19.getText().equals("Available")||status19.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour19.setText("0"+jbox1.getSelectedItem());
            hour19 =Integer.parseInt(lhour19.getText());
            cusernam19.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo19.setIcon(using);
            status19.setText("User");
            status19.setForeground(java.awt.Color.GREEN);

            Updatecomputer19();
            timer19 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour19.setForeground(java.awt.Color.BLACK);
                    lmin19.setForeground(java.awt.Color.BLACK);
                    lsec19.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour19==0&&min19==0&&sec19==0){
                        cusernam19.setText(stopname);
                        hour19 = tranferhour;
                        min19 = tranfermin;
                        sec19 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop19){
                        cusernam19.setText(stopname);
                        hour19 = stophour19;
                        min19 = stopmin19;
                        sec19 = stopsec19;
                        ifStop19 = false;
                    }
                    if(min19==0&&hour19>0){
                        min19=60;
                        hour19--;
                    }
                    if(sec19==0&&min19>0){
                        sec19=60;
                        min19--;
                    }

                    if(hour19==0){
                        if(min19<=15){
                            lhour19.setForeground(java.awt.Color.red);
                            lmin19.setForeground(java.awt.Color.red);
                            lsec19.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour19==0&&min19==0&&sec19==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 19 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status19.setText("Available");
                        photo19.setIcon(available);
                        status19.setForeground(java.awt.Color.GRAY);
                        Updatecomputer19();
                        cusernam19.setText("");
                        hour19=0;min19=0;sec19=0;
                        lhour19.setForeground(java.awt.Color.BLACK);
                        lmin19.setForeground(java.awt.Color.BLACK);
                        lsec19.setForeground(java.awt.Color.BLACK);
                        timer19.stop();
                        jbstart19.setEnabled(true);
                        Stop19.setEnabled(false);
                        transfer19.setEnabled(false);

                    }else{
                        sec19--;
                        lhour19.setText(""+hour19);
                        lsec19.setText(""+sec19);
                        lmin19.setText(""+min19);
                    }

                }
            });
            timer19.start();
            jbstart19.setEnabled(false);
            Stop19.setEnabled(true);
            transfer19.setEnabled(true);
            iconstop19.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart19ActionPerformed

    private void Stop19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop19ActionPerformed
        stopname = cusernam19.getText();
        stophour19 = hour19;
        stopmin19 = min19;
        stopsec19 = sec19;
        ifStop19 = true;
        timer19.stop();
        jbstart19.setEnabled(true);
        Stop19.setEnabled(false);
        transfer19.setEnabled(false);
        iconstop19.setEnabled(true);
    }//GEN-LAST:event_Stop19ActionPerformed

    private void transfer19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer19ActionPerformed
        stopname = cusernam19.getText();
        tranferhour = hour19;
        tranfermin = min19;
        tranfersec = sec19;
        ifTranfer = true;
        timer19.stop();
        lhour19.setText("00");
        lsec19.setText("00");
        lmin19.setText("00");
        cusernam19.setText("");
        status19.setText("Available");
        status19.setForeground(java.awt.Color.GRAY);
        photo19.setIcon(available);
        Updatecomputer19();
        jbstart19.setEnabled(false);
        Stop19.setEnabled(false);
        transfer19.setEnabled(false);
        iconstop19.setEnabled(false);
        clear19.setEnabled(true);
    }//GEN-LAST:event_transfer19ActionPerformed

    private void clear19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear19ActionPerformed
            timer19.stop();
            hour19 =0;
            min19 = 0;
            sec19 = 0;
            stophour19 = 0;
            stopmin19 = 0;
            stopsec19 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status19.setText("Available");
            lhour19.setText("00");
            lsec19.setText("00");
            lmin19.setText("00");
            cusernam19.setText("");
            photo19.setIcon(available);
            status19.setForeground(java.awt.Color.GRAY);
            Updatecomputer19();
            jbstart19.setEnabled(true);
            Stop19.setEnabled(false);
            transfer19.setEnabled(false);
            iconstop19.setEnabled(false);
    }//GEN-LAST:event_clear19ActionPerformed

    private void jbstart20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart20ActionPerformed

            if(status20.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status20.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status20.getText().equals("Available")||status20.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour20.setText("0"+jbox1.getSelectedItem());
            hour20 =Integer.parseInt(lhour20.getText());
            cusernam20.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo20.setIcon(using);
            status20.setText("User");
            status20.setForeground(java.awt.Color.GREEN);

            Updatecomputer20();
            timer20 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour20.setForeground(java.awt.Color.BLACK);
                    lmin20.setForeground(java.awt.Color.BLACK);
                    lsec20.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour20==0&&min20==0&&sec20==0){
                        cusernam20.setText(stopname);
                        hour20 = tranferhour;
                        min20 = tranfermin;
                        sec20= tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop20){
                        cusernam20.setText(stopname);
                        hour20 = stophour20;
                        min20 = stopmin20;
                        sec20= stopsec20;
                        ifStop20 = false;
                    }
                    if(min20==0&&hour20>0){
                        min20=60;
                        hour20--;
                    }
                    if(sec20==0&&min20>0){
                        sec20=60;
                        min20--;
                    }

                    if(hour20==0){
                        if(min20<=15){
                            lhour20.setForeground(java.awt.Color.red);
                            lmin20.setForeground(java.awt.Color.red);
                            lsec20.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour20==0&&min20==0&&sec20==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 20 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status20.setText("Available");
                        photo20.setIcon(available);
                        status20.setForeground(java.awt.Color.GRAY);
                        Updatecomputer20();
                        cusernam20.setText("");
                        hour20=0;min20=0;sec20=0;
                        lhour20.setForeground(java.awt.Color.BLACK);
                        lmin20.setForeground(java.awt.Color.BLACK);
                        lsec20.setForeground(java.awt.Color.BLACK);
                        timer20.stop();
                        jbstart20.setEnabled(true);
                        Stop20.setEnabled(false);
                        transfer20.setEnabled(false);

                    }else{
                        sec20--;
                        lhour20.setText(""+hour20);
                        lsec20.setText(""+sec20);
                        lmin20.setText(""+min20);
                    }

                }
            });
            timer20.start();
            jbstart20.setEnabled(false);
            Stop20.setEnabled(true);
            transfer20.setEnabled(true);
            iconstop20.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart20ActionPerformed

    private void Stop20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop20ActionPerformed
        stopname = cusernam20.getText();
        stophour20 = hour20;
        stopmin20 = min20;
        stopsec20 = sec20;
        ifStop20 = true;
        timer20.stop();
        jbstart20.setEnabled(true);
        Stop20.setEnabled(false);
        transfer20.setEnabled(false);
        iconstop20.setEnabled(true);
    }//GEN-LAST:event_Stop20ActionPerformed

    private void transfer20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer20ActionPerformed
        stopname = cusernam20.getText();
        tranferhour = hour20;
        tranfermin = min20;
        tranfersec = sec20;
        ifTranfer = true;
        timer20.stop();
        lhour20.setText("00");
        lsec20.setText("00");
        lmin20.setText("00");
        cusernam20.setText("");
        status20.setText("Available");
        status20.setForeground(java.awt.Color.GRAY);
        photo20.setIcon(available);
        Updatecomputer20();
        jbstart20.setEnabled(false);
        Stop20.setEnabled(false);
        transfer20.setEnabled(false);
        iconstop20.setEnabled(false);
        clear20.setEnabled(true);
    }//GEN-LAST:event_transfer20ActionPerformed

    private void clear20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear20ActionPerformed
            timer20.stop();
            hour20 =0;
            min20 = 0;
            sec20 = 0;
            stophour20 = 0;
            stopmin20 = 0;
            stopsec20 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status20.setText("Available");
            lhour20.setText("00");
            lsec20.setText("00");
            lmin20.setText("00");
            cusernam20.setText("");
            photo20.setIcon(available);
            status20.setForeground(java.awt.Color.GRAY);
            Updatecomputer20();
            jbstart20.setEnabled(true);
            Stop20.setEnabled(false);
            transfer20.setEnabled(false);
            iconstop20.setEnabled(false);
    }//GEN-LAST:event_clear20ActionPerformed

    private void jbstart21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart21ActionPerformed

            if(status21.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status21.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status21.getText().equals("Available")||status21.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour21.setText("0"+jbox1.getSelectedItem());
            hour21 =Integer.parseInt(lhour21.getText());
            cusernam21.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo21.setIcon(using);
            status21.setText("User");
            status21.setForeground(java.awt.Color.GREEN);

            Updatecomputer21();
            timer21 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour21.setForeground(java.awt.Color.BLACK);
                    lmin21.setForeground(java.awt.Color.BLACK);
                    lsec21.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour21==0&&min21==0&&sec21==0){
                        cusernam21.setText(stopname);
                        hour21 = tranferhour;
                        min21 = tranfermin;
                        sec21= tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop21){
                        cusernam21.setText(stopname);
                        hour21= stophour21;
                        min21 = stopmin21;
                        sec21 = stopsec21;
                        ifStop21 = false;
                    }
                    if(min21==0&&hour21>0){
                        min21=60;
                        hour21--;
                    }
                    if(sec21==0&&min21>0){
                        sec21=60;
                        min21--;
                    }

                    if(hour21==0){
                        if(min21<=15){
                            lhour21.setForeground(java.awt.Color.red);
                            lmin21.setForeground(java.awt.Color.red);
                            lsec21.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour21==0&&min21==0&&sec21==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 21 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status21.setText("Available");
                        photo21.setIcon(available);
                        status21.setForeground(java.awt.Color.GRAY);
                        Updatecomputer21();
                        cusernam21.setText("");
                        hour21=0;min21=0;sec21=0;
                        lhour21.setForeground(java.awt.Color.BLACK);
                        lmin21.setForeground(java.awt.Color.BLACK);
                        lsec21.setForeground(java.awt.Color.BLACK);
                        timer21.stop();
                        jbstart21.setEnabled(true);
                        Stop21.setEnabled(false);
                        transfer21.setEnabled(false);

                    }else{
                        sec21--;
                        lhour21.setText(""+hour21);
                        lsec21.setText(""+sec21);
                        lmin21.setText(""+min21);
                    }

                }
            });
            timer21.start();
            jbstart21.setEnabled(false);
            Stop21.setEnabled(true);
            transfer21.setEnabled(true);
            iconstop21.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart21ActionPerformed

    private void Stop21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop21ActionPerformed
        stopname = cusernam21.getText();
        stophour21 = hour21;
        stopmin21 = min21;
        stopsec21 = sec21;
        ifStop21 = true;
        timer21.stop();
        jbstart21.setEnabled(true);
        Stop21.setEnabled(false);
        transfer21.setEnabled(false);
        iconstop21.setEnabled(true);
    }//GEN-LAST:event_Stop21ActionPerformed

    private void transfer21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer21ActionPerformed
       stopname = cusernam21.getText();
        tranferhour = hour21;
        tranfermin = min21;
        tranfersec = sec21;
        ifTranfer = true;
        timer21.stop();
        lhour21.setText("00");
        lsec21.setText("00");
        lmin21.setText("00");
        cusernam21.setText("");
        status21.setText("Available");
        status21.setForeground(java.awt.Color.GRAY);
        photo21.setIcon(available);
        Updatecomputer21();
        jbstart21.setEnabled(false);
        Stop21.setEnabled(false);
        transfer21.setEnabled(false);
        iconstop21.setEnabled(false);
        clear21.setEnabled(true);
    }//GEN-LAST:event_transfer21ActionPerformed

    private void clear21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear21ActionPerformed
            timer21.stop();
            hour21 =0;
            min21 = 0;
            sec21 = 0;
            stophour21 = 0;
            stopmin21 = 0;
            stopsec21 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status21.setText("Available");
            lhour21.setText("00");
            lsec21.setText("00");
            lmin21.setText("00");
            cusernam21.setText("");
            photo21.setIcon(available);
            status21.setForeground(java.awt.Color.GRAY);
            Updatecomputer21();
            jbstart21.setEnabled(true);
            Stop21.setEnabled(false);
            transfer21.setEnabled(false);
            iconstop21.setEnabled(false);
    }//GEN-LAST:event_clear21ActionPerformed

    private void jbstart22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart22ActionPerformed

            if(status22.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status22.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status22.getText().equals("Available")||status22.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour22.setText("0"+jbox1.getSelectedItem());
            hour22 =Integer.parseInt(lhour22.getText());
            cusernam22.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo22.setIcon(using);
            status22.setText("User");
            status22.setForeground(java.awt.Color.GREEN);

            Updatecomputer22();
            timer22 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour22.setForeground(java.awt.Color.BLACK);
                    lmin22.setForeground(java.awt.Color.BLACK);
                    lsec22.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour22==0&&min22==0&&sec22==0){
                        cusernam22.setText(stopname);
                        hour22 = tranferhour;
                        min22 = tranfermin;
                        sec22 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop22){
                        cusernam22.setText(stopname);
                        hour22= stophour22;
                        min22 = stopmin22;
                        sec22 = stopsec22;
                        ifStop22 = false;
                    }
                    if(min22==0&&hour22>0){
                        min22=60;
                        hour22--;
                    }
                    if(sec22==0&&min22>0){
                        sec22=60;
                        min22--;
                    }

                    if(hour22==0){
                        if(min22<=15){
                            lhour22.setForeground(java.awt.Color.red);
                            lmin22.setForeground(java.awt.Color.red);
                            lsec22.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour22==0&&min22==0&&sec22==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 22 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status22.setText("Available");
                        photo22.setIcon(available);
                        status22.setForeground(java.awt.Color.GRAY);
                        Updatecomputer22();
                        cusernam22.setText("");
                        hour22=0;min22=0;sec22=0;
                        lhour22.setForeground(java.awt.Color.BLACK);
                        lmin22.setForeground(java.awt.Color.BLACK);
                        lsec22.setForeground(java.awt.Color.BLACK);
                        timer22.stop();
                        jbstart22.setEnabled(true);
                        Stop22.setEnabled(false);
                        transfer22.setEnabled(false);

                    }else{
                        sec22--;
                        lhour22.setText(""+hour22);
                        lsec22.setText(""+sec22);
                        lmin22.setText(""+min22);
                    }

                }
            });
            timer22.start();
            jbstart22.setEnabled(false);
            Stop22.setEnabled(true);
            transfer22.setEnabled(true);
            iconstop22.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart22ActionPerformed

    private void Stop22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop22ActionPerformed
        stopname = cusernam22.getText();
        stophour22 = hour22;
        stopmin22 = min22;
        stopsec22 = sec22;
        ifStop22 = true;
        timer22.stop();
        jbstart22.setEnabled(true);
        Stop22.setEnabled(false);
        transfer22.setEnabled(false);
        iconstop22.setEnabled(true);
    }//GEN-LAST:event_Stop22ActionPerformed

    private void transfer22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer22ActionPerformed
        stopname = cusernam22.getText();
        tranferhour = hour22;
        tranfermin = min22;
        tranfersec = sec22;
        ifTranfer = true;
        timer22.stop();
        lhour22.setText("00");
        lsec22.setText("00");
        lmin22.setText("00");
        cusernam22.setText("");
        status22.setText("Available");
        status22.setForeground(java.awt.Color.GRAY);
        photo22.setIcon(available);
        Updatecomputer22();
        jbstart22.setEnabled(false);
        Stop22.setEnabled(false);
        transfer22.setEnabled(false);
        iconstop22.setEnabled(false);
        clear22.setEnabled(true);
    }//GEN-LAST:event_transfer22ActionPerformed

    private void clear22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear22ActionPerformed
            timer22.stop();
            hour22 =0;
            min22 = 0;
            sec22 = 0;
            stophour22 = 0;
            stopmin22 = 0;
            stopsec22 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status22.setText("Available");
            lhour22.setText("00");
            lsec22.setText("00");
            lmin22.setText("00");
            cusernam22.setText("");
            photo22.setIcon(available);
            status22.setForeground(java.awt.Color.GRAY);
            Updatecomputer22();
            jbstart22.setEnabled(true);
            Stop22.setEnabled(false);
            transfer22.setEnabled(false);
            iconstop22.setEnabled(false);
    }//GEN-LAST:event_clear22ActionPerformed

    private void jbstart23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart23ActionPerformed

            if(status23.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status23.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status23.getText().equals("Available")||status23.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour23.setText("0"+jbox1.getSelectedItem());
            hour23 =Integer.parseInt(lhour23.getText());
            cusernam23.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo23.setIcon(using);
            status23.setText("User");
            status23.setForeground(java.awt.Color.GREEN);

            Updatecomputer23();
            timer23 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour23.setForeground(java.awt.Color.BLACK);
                    lmin23.setForeground(java.awt.Color.BLACK);
                    lsec23.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour23==0&&min23==0&&sec23==0){
                        cusernam23.setText(stopname);
                        hour23 = tranferhour;
                        min23 = tranfermin;
                        sec23 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop23){
                        cusernam23.setText(stopname);
                        hour23= stophour23;
                        min23 = stopmin23;
                        sec23 = stopsec23;
                        ifStop23 = false;
                    }
                    if(min23==0&&hour23>0){
                        min23=60;
                        hour23--;
                    }
                    if(sec23==0&&min23>0){
                        sec23=60;
                        min23--;
                    }

                    if(hour23==0){
                        if(min23<=15){
                            lhour23.setForeground(java.awt.Color.red);
                            lmin23.setForeground(java.awt.Color.red);
                            lsec23.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour23==0&&min23==0&&sec23==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 23 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status23.setText("Available");
                        photo23.setIcon(available);
                        status23.setForeground(java.awt.Color.GRAY);
                        Updatecomputer23();
                        cusernam23.setText("");
                        hour23=0;min23=0;sec23=0;
                        lhour23.setForeground(java.awt.Color.BLACK);
                        lmin23.setForeground(java.awt.Color.BLACK);
                        lsec23.setForeground(java.awt.Color.BLACK);
                        timer23.stop();
                        jbstart23.setEnabled(true);
                        Stop23.setEnabled(false);
                        transfer23.setEnabled(false);

                    }else{
                        sec23--;
                        lhour23.setText(""+hour23);
                        lsec23.setText(""+sec23);
                        lmin23.setText(""+min23);
                    }

                }
            });
            timer23.start();
            jbstart23.setEnabled(false);
            Stop23.setEnabled(true);
            transfer23.setEnabled(true);
            iconstop23.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart23ActionPerformed

    private void Stop23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop23ActionPerformed
        stopname = cusernam23.getText();
        stophour23 = hour23;
        stopmin23 = min23;
        stopsec23 = sec23;
        ifStop23 = true;
        timer23.stop();
        jbstart23.setEnabled(true);
        Stop23.setEnabled(false);
        transfer23.setEnabled(false);
        iconstop23.setEnabled(true);
    }//GEN-LAST:event_Stop23ActionPerformed

    private void transfer23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer23ActionPerformed
        stopname = cusernam23.getText();
        tranferhour = hour23;
        tranfermin = min23;
        tranfersec = sec23;
        ifTranfer = true;
        timer23.stop();
        lhour23.setText("00");
        lsec23.setText("00");
        lmin23.setText("00");
        cusernam23.setText("");
        status23.setText("Available");
        status23.setForeground(java.awt.Color.GRAY);
        photo23.setIcon(available);
        Updatecomputer23();
        jbstart23.setEnabled(false);
        Stop23.setEnabled(false);
        transfer23.setEnabled(false);
        iconstop23.setEnabled(false);
        clear23.setEnabled(true);
    }//GEN-LAST:event_transfer23ActionPerformed

    private void clear23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear23ActionPerformed
            timer23.stop();
            hour23 =0;
            min23 = 0;
            sec23 = 0;
            stophour23 = 0;
            stopmin23 = 0;
            stopsec23 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status23.setText("Available");
            lhour23.setText("00");
            lsec23.setText("00");
            lmin23.setText("00");
            cusernam23.setText("");
            photo23.setIcon(available);
            status23.setForeground(java.awt.Color.GRAY);
            Updatecomputer23();
            jbstart23.setEnabled(true);
            Stop23.setEnabled(false);
            transfer23.setEnabled(false);
            iconstop23.setEnabled(false);
    }//GEN-LAST:event_clear23ActionPerformed

    private void jbstart24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart24ActionPerformed

            if(status24.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status24.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status24.getText().equals("Available")||status24.getText().equals("User")){
             if(jbox1.getSelectedIndex()!=0){
            lhour24.setText("0"+jbox1.getSelectedItem());
            hour24 =Integer.parseInt(lhour24.getText());
            cusernam24.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo24.setIcon(using);
            status24.setText("User");
            status24.setForeground(java.awt.Color.GREEN);

            Updatecomputer24();
            timer24 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour24.setForeground(java.awt.Color.BLACK);
                    lmin24.setForeground(java.awt.Color.BLACK);
                    lsec24.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour24==0&&min24==0&&sec24==0){
                        cusernam24.setText(stopname);
                        hour24 = tranferhour;
                        min24 = tranfermin;
                        sec24 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop24){
                        cusernam24.setText(stopname);
                        hour24= stophour24;
                        min24 = stopmin24;
                        sec24 = stopsec24;
                        ifStop24 = false;
                    }
                    if(min24==0&&hour24>0){
                        min24=60;
                        hour24--;
                    }
                    if(sec24==0&&min24>0){
                        sec24=60;
                        min24--;
                    }

                    if(hour24==0){
                        if(min24<=15){
                            lhour24.setForeground(java.awt.Color.red);
                            lmin24.setForeground(java.awt.Color.red);
                            lsec24.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour24==0&&min24==0&&sec24==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 24 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status24.setText("Available");
                        photo24.setIcon(available);
                        status24.setForeground(java.awt.Color.GRAY);
                        Updatecomputer24();
                        cusernam24.setText("");
                        hour24=0;min24=0;sec24=0;
                        lhour24.setForeground(java.awt.Color.BLACK);
                        lmin24.setForeground(java.awt.Color.BLACK);
                        lsec24.setForeground(java.awt.Color.BLACK);
                        timer24.stop();
                        jbstart24.setEnabled(true);
                        Stop24.setEnabled(false);
                        transfer24.setEnabled(false);

                    }else{
                        sec24--;
                        lhour24.setText(""+hour24);
                        lsec24.setText(""+sec24);
                        lmin24.setText(""+min24);
                    }

                }
            });
            timer24.start();
            jbstart24.setEnabled(false);
            Stop24.setEnabled(true);
            transfer24.setEnabled(true);
            iconstop24.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart24ActionPerformed

    private void Stop24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop24ActionPerformed
        stopname = cusernam24.getText();
        stophour24 = hour24;
        stopmin24 = min24;
        stopsec24 = sec24;
        ifStop24 = true;
        timer24.stop();
        jbstart24.setEnabled(true);
        Stop24.setEnabled(false);
        transfer24.setEnabled(false);
        iconstop24.setEnabled(true);
    }//GEN-LAST:event_Stop24ActionPerformed

    private void transfer24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer24ActionPerformed
       stopname = cusernam24.getText();
        tranferhour = hour24;
        tranfermin = min24;
        tranfersec = sec24;
        ifTranfer = true;
        timer24.stop();
        lhour24.setText("00");
        lsec24.setText("00");
        lmin24.setText("00");
        cusernam24.setText("");
        status24.setText("Available");
        status24.setForeground(java.awt.Color.GRAY);
        photo24.setIcon(available);
        Updatecomputer24();
        jbstart24.setEnabled(false);
        Stop24.setEnabled(false);
        transfer24.setEnabled(false);
        iconstop24.setEnabled(false);
        clear24.setEnabled(true);
    }//GEN-LAST:event_transfer24ActionPerformed

    private void clear24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear24ActionPerformed
            timer24.stop();
            hour24 =0;
            min24 = 0;
            sec24 = 0;
            stophour24 = 0;
            stopmin24 = 0;
            stopsec24 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status24.setText("Available");
            lhour24.setText("00");
            lsec24.setText("00");
            lmin24.setText("00");
            cusernam24.setText("");
            photo24.setIcon(available);
            status24.setForeground(java.awt.Color.GRAY);
            Updatecomputer24();
            jbstart24.setEnabled(true);
            Stop24.setEnabled(false);
            transfer24.setEnabled(false);
            iconstop24.setEnabled(false);
    }//GEN-LAST:event_clear24ActionPerformed

    private void backpage1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpage1MouseClicked
   c1.show(Jmain, "card6");
        statusComputer1();
        statusComputer2();
        statusComputer3();
        statusComputer4();
        statusComputer5();
        statusComputer6();
        statusComputer7();
        statusComputer8();
        statusComputer9();
        statusComputer10();
        statusComputer11();
        statusComputer12();
        /*1*/
        if(status1.getText().equals("Available")){
            status1.setForeground(java.awt.Color.GRAY);
            photo1.setIcon(available);
        }
        if(status1.getText().equals("User")){
            photo1.setIcon(using);
            status1.setForeground(java.awt.Color.GREEN);

        }
        if(status1.getText().equals("Repair")){
            status1.setForeground(java.awt.Color.blue);
            photo1.setIcon(repair);
            clear1.setEnabled(false);
        }
        if(status1.getText().equals("Dilapidated")){
            status1.setForeground(java.awt.Color.RED);
            photo1.setIcon(broken);
            clear1.setEnabled(false);
        }
        if(status1.getText().equals("User")&&hour==0&&min==0&&sec==0){
            status1.setText("Available");
            photo1.setIcon(available);
            Updatecomputer1();
        }
        /*2*/
         if(status2.getText().equals("Available")){
            status2.setForeground(java.awt.Color.GRAY);
            photo2.setIcon(available);
        }
        if(status2.getText().equals("User")){
            photo2.setIcon(using);
            status2.setForeground(java.awt.Color.GREEN);

        }
        if(status2.getText().equals("Repair")){
            status2.setForeground(java.awt.Color.blue);
            photo2.setIcon(repair);
            clear2.setEnabled(false);
        }
        if(status2.getText().equals("Dilapidated")){
            status2.setForeground(java.awt.Color.RED);
            photo2.setIcon(broken);
            clear2.setEnabled(false);

        }
        if(status2.getText().equals("User")&&hour2==0&&min2==0&&sec2==0){
            status2.setText("Available");
            photo2.setIcon(available);
            Updatecomputer2();
        }
        /*3*/
        if(status3.getText().equals("Available")){
            status3.setForeground(java.awt.Color.GRAY);
            photo3.setIcon(available);
            
        }
        if(status3.getText().equals("User")){
            photo3.setIcon(using);
            status3.setForeground(java.awt.Color.GREEN);

        }
        if(status3.getText().equals("Repair")){
            status3.setForeground(java.awt.Color.blue);
            photo3.setIcon(repair);
            clear3.setEnabled(false);
        }
        if(status3.getText().equals("Dilapidated")){
            status3.setForeground(java.awt.Color.RED);
            photo3.setIcon(broken);
            clear3.setEnabled(false);

        }
        if(status3.getText().equals("User")&&hour3==0&&min3==0&&sec3==0){
            status3.setText("Available");
            photo3.setIcon(available);
            Updatecomputer3();
        }
        /*4*/
        if(status4.getText().equals("Available")){
            status4.setForeground(java.awt.Color.GRAY);
            photo4.setIcon(available);
        }
        if(status4.getText().equals("User")){
            photo4.setIcon(using);
            status4.setForeground(java.awt.Color.GREEN);

        }
        if(status4.getText().equals("Repair")){
            status4.setForeground(java.awt.Color.blue);
            photo4.setIcon(repair);
            clear4.setEnabled(false);
        }
        if(status4.getText().equals("Dilapidated")){
            status4.setForeground(java.awt.Color.RED);
            photo4.setIcon(broken);
            clear4.setEnabled(false);

        }
        if(status4.getText().equals("User")&&hour4==0&&min4==0&&sec4==0){
            status4.setText("Available");
            photo4.setIcon(available);
            Updatecomputer4();
        }
        /*5*/
      if(status5.getText().equals("Available")){
            status5.setForeground(java.awt.Color.GRAY);
            photo5.setIcon(available);
        }
        if(status5.getText().equals("User")){
            photo5.setIcon(using);
            status5.setForeground(java.awt.Color.GREEN);

        }
        if(status5.getText().equals("Repair")){
            status5.setForeground(java.awt.Color.blue);
            photo5.setIcon(repair);
            clear5.setEnabled(false);
        }
        if(status5.getText().equals("Dilapidated")){
            status5.setForeground(java.awt.Color.RED);
            photo5.setIcon(broken);
            clear5.setEnabled(false);

        }
        if(status5.getText().equals("User")&&hour5==0&&min5==0&&sec5==0){
            status5.setText("Available");
            photo5.setIcon(available);
            Updatecomputer5();
        }
        /*6*/
      if(status6.getText().equals("Available")){
            status6.setForeground(java.awt.Color.GRAY);
            photo6.setIcon(available);
        }
        if(status6.getText().equals("User")){
            photo6.setIcon(using);
            status6.setForeground(java.awt.Color.GREEN);

        }
        if(status6.getText().equals("Repair")){
            status6.setForeground(java.awt.Color.blue);
            photo6.setIcon(repair);
            clear6.setEnabled(false);
        }
        if(status6.getText().equals("Dilapidated")){
            status6.setForeground(java.awt.Color.RED);
            photo6.setIcon(broken);
            clear6.setEnabled(false);
        }
        if(status6.getText().equals("User")&&hour6==0&&min6==0&&sec6==0){
            status6.setText("Available");
            photo6.setIcon(available);
            Updatecomputer6();
        }
        /*7*/
      if(status7.getText().equals("Available")){
            status7.setForeground(java.awt.Color.GRAY);
            photo7.setIcon(available);
        }
        if(status7.getText().equals("User")){
            photo7.setIcon(using);
            status7.setForeground(java.awt.Color.GREEN);

        }
        if(status7.getText().equals("Repair")){
            status7.setForeground(java.awt.Color.blue);
            photo7.setIcon(repair);
            clear7.setEnabled(false);
        }
        if(status7.getText().equals("Dilapidated")){
            status7.setForeground(java.awt.Color.RED);
            photo7.setIcon(broken);
            clear7.setEnabled(false);
        }
        if(status7.getText().equals("User")&&hour7==0&&min7==0&&sec7==0){
            status7.setText("Available");
            photo7.setIcon(available);
            Updatecomputer7();
        }
        /*8*/
        if(status8.getText().equals("Available")){
            status8.setForeground(java.awt.Color.GRAY);
            photo8.setIcon(available);
        }
        if(status8.getText().equals("User")){
            photo8.setIcon(using);
            status8.setForeground(java.awt.Color.GREEN);

        }
        if(status8.getText().equals("Repair")){
            status8.setForeground(java.awt.Color.blue);
            photo8.setIcon(repair);
            clear8.setEnabled(false);
        }
        if(status8.getText().equals("Dilapidated")){
            status8.setForeground(java.awt.Color.RED);
            photo8.setIcon(broken);
            clear8.setEnabled(false);
        }
        if(status8.getText().equals("User")&&hour8==0&&min8==0&&sec8==0){
            status8.setText("Available");
            photo8.setIcon(available);
            Updatecomputer8();
        }
        /*9*/
        if(status9.getText().equals("Available")){
            status9.setForeground(java.awt.Color.GRAY);
            photo9.setIcon(available);
        }
        if(status9.getText().equals("User")){
            photo9.setIcon(using);
            status9.setForeground(java.awt.Color.GREEN);

        }
        if(status9.getText().equals("Repair")){
            status9.setForeground(java.awt.Color.blue);
            photo9.setIcon(repair);
            clear9.setEnabled(false);
        }
        if(status9.getText().equals("Dilapidated")){
            status9.setForeground(java.awt.Color.RED);
            photo9.setIcon(broken);
            clear9.setEnabled(false);
        }
        if(status9.getText().equals("User")&&hour9==0&&min9==0&&sec9==0){
            status9.setText("Available");
            photo9.setIcon(available);
            Updatecomputer9();
        }
        /*10*/
        if(status10.getText().equals("Available")){
            status10.setForeground(java.awt.Color.GRAY);
            photo10.setIcon(available);
        }
        if(status10.getText().equals("User")){
            photo10.setIcon(using);
            status10.setForeground(java.awt.Color.GREEN);

        }
        if(status10.getText().equals("Repair")){
            status10.setForeground(java.awt.Color.blue);
            photo10.setIcon(repair);
            clear10.setEnabled(false);
        }
        if(status10.getText().equals("Dilapidated")){
            status10.setForeground(java.awt.Color.RED);
            photo10.setIcon(broken);
            clear10.setEnabled(false);
        }
        if(status10.getText().equals("User")&&hour10==0&&min10==0&&sec10==0){
            status10.setText("Available");
            photo10.setIcon(available);
            Updatecomputer10();
        }
        /*11*/
        if(status11.getText().equals("Available")){
            status11.setForeground(java.awt.Color.GRAY);
            photo11.setIcon(available);
        }
        if(status11.getText().equals("User")){
            photo11.setIcon(using);
            status11.setForeground(java.awt.Color.GREEN);

        }
        if(status11.getText().equals("Repair")){
            status11.setForeground(java.awt.Color.blue);
            photo11.setIcon(repair);
            clear11.setEnabled(false);
        }
        if(status11.getText().equals("Dilapidated")){
            status11.setForeground(java.awt.Color.RED);
            photo11.setIcon(broken);
            clear11.setEnabled(false);
        }
        if(status11.getText().equals("User")&&hour11==0&&min11==0&&sec11==0){
            status11.setText("Available");
            photo11.setIcon(available);
            Updatecomputer11();
        }
        /*12*/
        if(status12.getText().equals("Available")){
            status12.setForeground(java.awt.Color.GRAY);
            photo12.setIcon(available);
        }
        if(status12.getText().equals("User")){
            photo12.setIcon(using);
            status12.setForeground(java.awt.Color.GREEN);

        }
        if(status12.getText().equals("Repair")){
            status12.setForeground(java.awt.Color.blue);
            photo12.setIcon(repair);
            clear12.setEnabled(false);
        }
        if(status12.getText().equals("Dilapidated")){
            status12.setForeground(java.awt.Color.RED);
            photo12.setIcon(broken);
            clear12.setEnabled(false);
        }
        if(status12.getText().equals("User")&&hour12==0&&min12==0&&sec12==0){
            status12.setText("Available");
            photo12.setIcon(available);
            Updatecomputer12();
        }
        
    }//GEN-LAST:event_backpage1MouseClicked

    private void Stop25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop25ActionPerformed
        stopname = cusernam25.getText();
        stophour25 = hour25;
        stopmin25 = min25;
        stopsec25 = sec25;
        ifStop25 = true;
        timer25.stop();
        jbstart25.setEnabled(true);
        Stop25.setEnabled(false);
        transfer25.setEnabled(false);
        iconstop25.setEnabled(true);
    }//GEN-LAST:event_Stop25ActionPerformed

    private void jbstart25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart25ActionPerformed

            if(status25.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status25.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status25.getText().equals("Available")||status25.getText().equals("User")){
             if(jbox1.getSelectedIndex()!=0){
            lhour25.setText("0"+jbox1.getSelectedItem());
            hour25 =Integer.parseInt(lhour25.getText());
            cusernam25.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo25.setIcon(using);
            status25.setText("User");
            status25.setForeground(java.awt.Color.GREEN);

            Updatecomputer25();
            timer25 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour25.setForeground(java.awt.Color.BLACK);
                    lmin25.setForeground(java.awt.Color.BLACK);
                    lsec25.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour25==0&&min25==0&&sec25==0){
                        cusernam25.setText(stopname);
                        hour25 = tranferhour;
                        min25 = tranfermin;
                        sec25 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop25){
                        cusernam25.setText(stopname);
                        hour25= stophour25;
                        min25 = stopmin25;
                        sec25 = stopsec25;
                        ifStop25 = false;
                    }
                    if(min25==0&&hour25>0){
                        min25=60;
                        hour25--;
                    }
                    if(sec25==0&&min25>0){
                        sec25=60;
                        min25--;
                    }

                    if(hour25==0){
                        if(min25<=15){
                            lhour25.setForeground(java.awt.Color.red);
                            lmin25.setForeground(java.awt.Color.red);
                            lsec25.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour25==0&&min25==0&&sec25==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 25 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status25.setText("Available");
                        photo25.setIcon(available);
                        status25.setForeground(java.awt.Color.GRAY);
                        Updatecomputer25();
                        cusernam25.setText("");
                        hour25=0;min25=0;sec25=0;
                        lhour25.setForeground(java.awt.Color.BLACK);
                        lmin25.setForeground(java.awt.Color.BLACK);
                        lsec25.setForeground(java.awt.Color.BLACK);
                        timer25.stop();
                        jbstart25.setEnabled(true);
                        Stop25.setEnabled(false);
                        transfer25.setEnabled(false);

                    }else{
                        sec25--;
                        lhour25.setText(""+hour25);
                        lsec25.setText(""+sec25);
                        lmin25.setText(""+min25);
                    }

                }
            });
            timer25.start();
            jbstart25.setEnabled(false);
            Stop25.setEnabled(true);
            transfer25.setEnabled(true);
            iconstop25.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart25ActionPerformed

    private void transfer25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer25ActionPerformed
        stopname = cusernam25.getText();
        tranferhour = hour25;
        tranfermin = min25;
        tranfersec = sec25;
        ifTranfer = true;
        timer25.stop();
        lhour25.setText("00");
        lsec25.setText("00");
        lmin25.setText("00");
        cusernam25.setText("");
        status25.setText("Available");
        status25.setForeground(java.awt.Color.GRAY);
        photo25.setIcon(available);
        Updatecomputer25();
        jbstart25.setEnabled(false);
        Stop25.setEnabled(false);
        transfer25.setEnabled(false);
        iconstop25.setEnabled(false);
        clear25.setEnabled(true);
    }//GEN-LAST:event_transfer25ActionPerformed

    private void clear25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear25ActionPerformed
            timer25.stop();
            hour25 =0;
            min25 = 0;
            sec25 = 0;
            stophour25 = 0;
            stopmin25 = 0;
            stopsec25 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status25.setText("Available");
            lhour25.setText("00");
            lsec25.setText("00");
            lmin25.setText("00");
            cusernam25.setText("");
            photo25.setIcon(available);
            status25.setForeground(java.awt.Color.GRAY);
            Updatecomputer25();
            jbstart25.setEnabled(true);
            Stop25.setEnabled(false);
            transfer25.setEnabled(false);
            iconstop25.setEnabled(false);
    }//GEN-LAST:event_clear25ActionPerformed

    private void jbstart26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart26ActionPerformed

            if(status26.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status26.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status26.getText().equals("Available")||status26.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour26.setText("0"+jbox1.getSelectedItem());
            hour26 =Integer.parseInt(lhour26.getText());
            cusernam26.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo26.setIcon(using);
            status26.setText("User");
            status26.setForeground(java.awt.Color.GREEN);

            Updatecomputer26();
            timer26 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour26.setForeground(java.awt.Color.BLACK);
                    lmin26.setForeground(java.awt.Color.BLACK);
                    lsec26.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour26==0&&min26==0&&sec26==0){
                        cusernam26.setText(stopname);
                        hour26 = tranferhour;
                        min26 = tranfermin;
                        sec26 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop26){
                        cusernam26.setText(stopname);
                        hour26= stophour26;
                        min26 = stopmin26;
                        sec26 = stopsec26;
                        ifStop26 = false;
                    }
                    if(min26==0&&hour26>0){
                        min26=60;
                        hour26--;
                    }
                    if(sec26==0&&min26>0){
                        sec26=60;
                        min26--;
                    }

                    if(hour26==0){
                        if(min26<=15){
                            lhour26.setForeground(java.awt.Color.red);
                            lmin26.setForeground(java.awt.Color.red);
                            lsec26.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour26==0&&min26==0&&sec26==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 26 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status26.setText("Available");
                        photo26.setIcon(available);
                        status26.setForeground(java.awt.Color.GRAY);
                        Updatecomputer26();
                        cusernam26.setText("");
                        hour26=0;min26=0;sec26=0;
                        lhour26.setForeground(java.awt.Color.BLACK);
                        lmin26.setForeground(java.awt.Color.BLACK);
                        lsec26.setForeground(java.awt.Color.BLACK);
                        timer26.stop();
                        jbstart26.setEnabled(true);
                        Stop26.setEnabled(false);
                        transfer26.setEnabled(false);

                    }else{
                        sec26--;
                        lhour26.setText(""+hour26);
                        lsec26.setText(""+sec26);
                        lmin26.setText(""+min26);
                    }

                }
            });
            timer26.start();
            jbstart26.setEnabled(false);
            Stop26.setEnabled(true);
            transfer26.setEnabled(true);
            iconstop26.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart26ActionPerformed

    private void Stop26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop26ActionPerformed
        stopname = cusernam26.getText();
        stophour26 = hour26;
        stopmin26 = min26;
        stopsec26 = sec26;
        ifStop26 = true;
        timer26.stop();
        jbstart26.setEnabled(true);
        Stop26.setEnabled(false);
        transfer26.setEnabled(false);
        iconstop26.setEnabled(true);
    }//GEN-LAST:event_Stop26ActionPerformed

    private void transfer26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer26ActionPerformed
        stopname = cusernam26.getText();
        tranferhour = hour26;
        tranfermin = min26;
        tranfersec = sec26;
        ifTranfer = true;
        timer26.stop();
        lhour26.setText("00");
        lsec26.setText("00");
        lmin26.setText("00");
        cusernam26.setText("");
        status26.setText("Available");
        status26.setForeground(java.awt.Color.GRAY);
        photo26.setIcon(available);
        Updatecomputer26();
        jbstart26.setEnabled(false);
        Stop26.setEnabled(false);
        transfer26.setEnabled(false);
        iconstop26.setEnabled(false);
        clear26.setEnabled(true);
    }//GEN-LAST:event_transfer26ActionPerformed

    private void clear26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear26ActionPerformed
            timer26.stop();
            hour26 =0;
            min26 = 0;
            sec26 = 0;
            stophour26 = 0;
            stopmin26 = 0;
            stopsec26 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status26.setText("Available");
            lhour26.setText("00");
            lsec26.setText("00");
            lmin26.setText("00");
            cusernam26.setText("");
            photo26.setIcon(available);
            status26.setForeground(java.awt.Color.GRAY);
            Updatecomputer26();
            jbstart26.setEnabled(true);
            Stop26.setEnabled(false);
            transfer26.setEnabled(false);
            iconstop26.setEnabled(false);
    }//GEN-LAST:event_clear26ActionPerformed

    private void jbstart27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart27ActionPerformed

            if(status27.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status27.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status27.getText().equals("Available")||status27.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour27.setText("0"+jbox1.getSelectedItem());
            hour27 =Integer.parseInt(lhour27.getText());
            cusernam27.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo27.setIcon(using);
            status27.setText("User");
            status27.setForeground(java.awt.Color.GREEN);

            Updatecomputer27();
            timer27 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour27.setForeground(java.awt.Color.BLACK);
                    lmin27.setForeground(java.awt.Color.BLACK);
                    lsec27.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour27==0&&min27==0&&sec27==0){
                        cusernam27.setText(stopname);
                        hour27 = tranferhour;
                        min27 = tranfermin;
                        sec27 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop27){
                        cusernam27.setText(stopname);
                        hour27= stophour27;
                        min27 = stopmin27;
                        sec27 = stopsec27;
                        ifStop27 = false;
                    }
                    if(min27==0&&hour27>0){
                        min27=60;
                        hour27--;
                    }
                    if(sec27==0&&min27>0){
                        sec27=60;
                        min27--;
                    }

                    if(hour27==0){
                        if(min27<=15){
                            lhour27.setForeground(java.awt.Color.red);
                            lmin27.setForeground(java.awt.Color.red);
                            lsec27.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour27==0&&min27==0&&sec27==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 27 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status27.setText("Available");
                        photo27.setIcon(available);
                        status27.setForeground(java.awt.Color.GRAY);
                        Updatecomputer27();
                        cusernam27.setText("");
                        hour27=0;min27=0;sec27=0;
                        lhour27.setForeground(java.awt.Color.BLACK);
                        lmin27.setForeground(java.awt.Color.BLACK);
                        lsec27.setForeground(java.awt.Color.BLACK);
                        timer27.stop();
                        jbstart27.setEnabled(true);
                        Stop27.setEnabled(false);
                        transfer27.setEnabled(false);

                    }else{
                        sec27--;
                        lhour27.setText(""+hour27);
                        lsec27.setText(""+sec27);
                        lmin27.setText(""+min27);
                    }

                }
            });
            timer27.start();
            jbstart27.setEnabled(false);
            Stop27.setEnabled(true);
            transfer27.setEnabled(true);
            iconstop27.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart27ActionPerformed

    private void Stop27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop27ActionPerformed
        stopname = cusernam27.getText();
        stophour27 = hour27;
        stopmin27 = min27;
        stopsec27 = sec27;
        ifStop27 = true;
        timer27.stop();
        jbstart27.setEnabled(true);
        Stop27.setEnabled(false);
        transfer27.setEnabled(false);
        iconstop27.setEnabled(true);
    }//GEN-LAST:event_Stop27ActionPerformed

    private void transfer27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer27ActionPerformed
         stopname = cusernam27.getText();
        tranferhour = hour27;
        tranfermin = min27;
        tranfersec = sec27;
        ifTranfer = true;
        timer27.stop();
        lhour27.setText("00");
        lsec27.setText("00");
        lmin27.setText("00");
        cusernam27.setText("");
        status27.setText("Available");
        status27.setForeground(java.awt.Color.GRAY);
        photo27.setIcon(available);
        Updatecomputer27();
        jbstart27.setEnabled(false);
        Stop27.setEnabled(false);
        transfer27.setEnabled(false);
        iconstop27.setEnabled(false);
        clear27.setEnabled(true);
    }//GEN-LAST:event_transfer27ActionPerformed

    private void clear27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear27ActionPerformed
            timer27.stop();
            hour27 =0;
            min27 = 0;
            sec27 = 0;
            stophour27 = 0;
            stopmin27 = 0;
            stopsec27 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status27.setText("Available");
            lhour27.setText("00");
            lsec27.setText("00");
            lmin27.setText("00");
            cusernam27.setText("");
            photo27.setIcon(available);
            status27.setForeground(java.awt.Color.GRAY);
            Updatecomputer27();
            jbstart27.setEnabled(true);
            Stop27.setEnabled(false);
            transfer27.setEnabled(false);
            iconstop27.setEnabled(false);
    }//GEN-LAST:event_clear27ActionPerformed

    private void jbstart28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart28ActionPerformed

            if(status28.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status28.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status28.getText().equals("Available")||status28.getText().equals("User")){
             if(jbox1.getSelectedIndex()!=0){
            lhour28.setText("0"+jbox1.getSelectedItem());
            hour28 =Integer.parseInt(lhour28.getText());
            cusernam28.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo28.setIcon(using);
            status28.setText("User");
            status28.setForeground(java.awt.Color.GREEN);

            Updatecomputer28();
            timer28 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour28.setForeground(java.awt.Color.BLACK);
                    lmin28.setForeground(java.awt.Color.BLACK);
                    lsec28.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour28==0&&min28==0&&sec28==0){
                        cusernam28.setText(stopname);
                        hour28 = tranferhour;
                        min28 = tranfermin;
                        sec28 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop28){
                        cusernam28.setText(stopname);
                        hour28= stophour28;
                        min28 = stopmin28;
                        sec28 = stopsec28;
                        ifStop28 = false;
                    }
                    if(min28==0&&hour28>0){
                        min28=60;
                        hour28--;
                    }
                    if(sec28==0&&min28>0){
                        sec28=60;
                        min28--;
                    }

                    if(hour28==0){
                        if(min28<=15){
                            lhour28.setForeground(java.awt.Color.red);
                            lmin28.setForeground(java.awt.Color.red);
                            lsec28.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour28==0&&min28==0&&sec28==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 28 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status28.setText("Available");
                        photo28.setIcon(available);
                        status28.setForeground(java.awt.Color.GRAY);
                        Updatecomputer28();
                        cusernam28.setText("");
                        hour28=0;min28=0;sec28=0;
                        lhour28.setForeground(java.awt.Color.BLACK);
                        lmin28.setForeground(java.awt.Color.BLACK);
                        lsec28.setForeground(java.awt.Color.BLACK);
                        timer28.stop();
                        jbstart28.setEnabled(true);
                        Stop28.setEnabled(false);
                        transfer28.setEnabled(false);

                    }else{
                        sec28--;
                        lhour28.setText(""+hour28);
                        lsec28.setText(""+sec28);
                        lmin28.setText(""+min28);
                    }

                }
            });
            timer28.start();
            jbstart28.setEnabled(false);
            Stop28.setEnabled(true);
            transfer28.setEnabled(true);
            iconstop28.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart28ActionPerformed

    private void Stop28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop28ActionPerformed
        stopname = cusernam28.getText();
        stophour28 = hour28;
        stopmin28 = min28;
        stopsec28 = sec28;
        ifStop28 = true;
        timer28.stop();
        jbstart28.setEnabled(true);
        Stop28.setEnabled(false);
        transfer28.setEnabled(false);
        iconstop28.setEnabled(true);
    }//GEN-LAST:event_Stop28ActionPerformed

    private void clear28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear28ActionPerformed
            timer28.stop();
            hour28 =0;
            min28 = 0;
            sec28 = 0;
            stophour28 = 0;
            stopmin28 = 0;
            stopsec28 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status28.setText("Available");
            lhour28.setText("00");
            lsec28.setText("00");
            lmin28.setText("00");
            cusernam28.setText("");
            photo28.setIcon(available);
            status28.setForeground(java.awt.Color.GRAY);
            Updatecomputer28();
            jbstart28.setEnabled(true);
            Stop28.setEnabled(false);
            transfer28.setEnabled(false);
            iconstop28.setEnabled(false);
    }//GEN-LAST:event_clear28ActionPerformed

    private void transfer28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer28ActionPerformed
        stopname = cusernam28.getText();
        tranferhour = hour28;
        tranfermin = min28;
        tranfersec = sec28;
        ifTranfer = true;
        timer28.stop();
        lhour28.setText("00");
        lsec28.setText("00");
        lmin28.setText("00");
        cusernam28.setText("Available");
        status28.setForeground(java.awt.Color.GRAY);
        photo28.setIcon(available);
        Updatecomputer28();
        jbstart28.setEnabled(false);
        Stop28.setEnabled(false);
        transfer28.setEnabled(false);
        iconstop28.setEnabled(false);
        clear28.setEnabled(true);
    }//GEN-LAST:event_transfer28ActionPerformed

    private void Stop29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop29ActionPerformed
        stopname = cusernam29.getText();
        stophour29 = hour29;
        stopmin29 = min29;
        stopsec29 = sec29;
        ifStop29 = true;
        timer29.stop();
        jbstart29.setEnabled(true);
        Stop29.setEnabled(false);
        transfer29.setEnabled(false);
        iconstop29.setEnabled(true);
    }//GEN-LAST:event_Stop29ActionPerformed

    private void jbstart29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart29ActionPerformed

            if(status29.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status29.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status29.getText().equals("Available")||status29.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour29.setText("0"+jbox1.getSelectedItem());
            hour29 =Integer.parseInt(lhour29.getText());
            cusernam29.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo29.setIcon(using);
            status29.setText("User");
            status29.setForeground(java.awt.Color.GREEN);

            Updatecomputer29();
            timer29 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour29.setForeground(java.awt.Color.BLACK);
                    lmin29.setForeground(java.awt.Color.BLACK);
                    lsec29.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour29==0&&min29==0&&sec29==0){
                        cusernam29.setText(stopname);
                        hour29 = tranferhour;
                        min29 = tranfermin;
                        sec29 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop29){
                        cusernam29.setText(Jtusername.getText());
                        hour29 = stophour29;
                        min29 = stopmin29;
                        sec29 = stopsec29;
                        ifStop29 = false;
                    }
                    if(min29==0&&hour29>0){
                        min29=60;
                        hour29--;
                    }
                    if(sec29==0&&min29>0){
                        sec29=60;
                        min29--;
                    }

                    if(hour29==0){
                        if(min29<=15){
                            lhour29.setForeground(java.awt.Color.red);
                            lmin29.setForeground(java.awt.Color.red);
                            lsec29.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour29==0&&min29==0&&sec29==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 29 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status29.setText("Available");
                        photo29.setIcon(available);
                        status29.setForeground(java.awt.Color.GRAY);
                        Updatecomputer29();
                        cusernam29.setText("");
                        hour29=0;min29=0;sec29=0;
                        lhour29.setForeground(java.awt.Color.BLACK);
                        lmin29.setForeground(java.awt.Color.BLACK);
                        lsec29.setForeground(java.awt.Color.BLACK);
                        timer29.stop();
                        jbstart29.setEnabled(true);
                        Stop29.setEnabled(false);
                        transfer29.setEnabled(false);

                    }else{
                        sec29--;
                        lhour29.setText(""+hour29);
                        lsec29.setText(""+sec29);
                        lmin29.setText(""+min29);
                    }

                }
            });
            timer29.start();
            jbstart29.setEnabled(false);
            Stop29.setEnabled(true);
            transfer29.setEnabled(true);
            iconstop29.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart29ActionPerformed

    private void transfer29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer29ActionPerformed
        stopname = cusernam29.getText();
        tranferhour = hour29;
        tranfermin = min29;
        tranfersec = sec29;
        ifTranfer = true;
        timer29.stop();
        lhour29.setText("00");
        lsec29.setText("00");
        lmin29.setText("00");
        cusernam29.setText("");
        status29.setText("Available");
        status29.setForeground(java.awt.Color.GRAY);
        photo29.setIcon(available);
        Updatecomputer29();
        jbstart29.setEnabled(false);
        Stop29.setEnabled(false);
        transfer29.setEnabled(false);
        iconstop29.setEnabled(false);
        clear29.setEnabled(true);
    }//GEN-LAST:event_transfer29ActionPerformed

    private void clear29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear29ActionPerformed
            timer29.stop();
            hour29 =0;
            min29 = 0;
            sec29 = 0;
            stophour29 = 0;
            stopmin29 = 0;
            stopsec29 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status29.setText("Available");
            lhour29.setText("00");
            lsec29.setText("00");
            lmin29.setText("00");
            cusernam29.setText("");
            photo29.setIcon(available);
            status29.setForeground(java.awt.Color.GRAY);
            Updatecomputer29();
            jbstart29.setEnabled(true);
            Stop29.setEnabled(false);
            transfer29.setEnabled(false);
            iconstop29.setEnabled(false);
    }//GEN-LAST:event_clear29ActionPerformed

    private void jbstart30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbstart30ActionPerformed

            if(status30.getText().equals("Repair")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องกำลังซ่อม",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status30.getText().equals("Dilapidated")){
            JOptionPane.showMessageDialog(null,"ไม่สารถใช้งานเครื่องนี้ได้",
                "EROR",JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null,"เครื่องชำรุด",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"โปรดใช้งานเครื่องอื่น",
                "INFO",JOptionPane.INFORMATION_MESSAGE);
        }
        if(status30.getText().equals("Available")||status30.getText().equals("User")){
            if(jbox1.getSelectedIndex()!=0){
            lhour30.setText("0"+jbox1.getSelectedItem());
            hour30 =Integer.parseInt(lhour30.getText());
            cusernam30.setText(Jtusername.getText());
            jbox1.setSelectedIndex(0);}
            photo30.setIcon(using);
            status30.setText("User");
            status30.setForeground(java.awt.Color.GREEN);

            Updatecomputer30();
            timer30 = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    lhour30.setForeground(java.awt.Color.BLACK);
                    lmin30.setForeground(java.awt.Color.BLACK);
                    lsec30.setForeground(java.awt.Color.BLACK);
                    if(ifTranfer&&hour30==0&&min30==0&&sec30==0){
                        cusernam30.setText(stopname);
                        hour30 = tranferhour;
                        min30 = tranfermin;
                        sec30 = tranfersec;
                        ifTranfer = false;
                    }
                    if(ifStop30){
                        cusernam30.setText(stopname);
                        hour30 = stophour30;
                        min30 = stopmin30;
                        sec30 = stopsec30;
                        ifStop30 = false;
                    }
                    if(min30==0&&hour30>0){
                        min30=60;
                        hour30--;
                    }
                    if(sec30==0&&min30>0){
                        sec30=60;
                        min30--;
                    }

                    if(hour30==0){
                        if(min30<=15){
                            lhour30.setForeground(java.awt.Color.red);
                            lmin30.setForeground(java.awt.Color.red);
                            lsec30.setForeground(java.awt.Color.red);
                        }
                    }
                    if(hour30==0&&min30==0&&sec30==0){
                        JOptionPane.showMessageDialog(rootPane, "เครื่องที่ 30 หมดเวลา","Stopped",0);
                        JOptionPane.showMessageDialog(rootPane, "กรุณาเติมเวลา","Stopped",0);
                        status30.setText("Available");
                        photo30.setIcon(available);
                        status30.setForeground(java.awt.Color.GRAY);
                        Updatecomputer30();
                        cusernam30.setText("");
                        hour30=0;min30=0;sec30=0;
                        lhour30.setForeground(java.awt.Color.BLACK);
                        lmin30.setForeground(java.awt.Color.BLACK);
                        lsec30.setForeground(java.awt.Color.BLACK);
                        timer30.stop();
                        jbstart30.setEnabled(true);
                        Stop30.setEnabled(false);
                        transfer30.setEnabled(false);

                    }else{
                        sec30--;
                        lhour30.setText(""+hour30);
                        lsec30.setText(""+sec30);
                        lmin30.setText(""+min30);
                    }

                }
            });
            timer30.start();
            jbstart30.setEnabled(false);
            Stop30.setEnabled(true);
            transfer30.setEnabled(true);
            iconstop30.setEnabled(false);
        }
    }//GEN-LAST:event_jbstart30ActionPerformed

    private void Stop30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stop30ActionPerformed
        stopname = cusernam30.getText();
        stophour30 = hour30;
        stopmin30 = min30;
        stopsec30 = sec30;
        ifStop30 = true;
        timer30.stop();
        jbstart30.setEnabled(true);
        Stop30.setEnabled(false);
        transfer30.setEnabled(false);
        iconstop30.setEnabled(true);
    }//GEN-LAST:event_Stop30ActionPerformed

    private void transfer30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transfer30ActionPerformed
        stopname = cusernam30.getText();
        tranferhour = hour30;
        tranfermin = min30;
        tranfersec = sec30;
        ifTranfer = true;
        timer30.stop();
        lhour30.setText("00");
        lsec30.setText("00");
        lmin30.setText("00");
        cusernam30.setText("");
        status30.setText("Available");
        status30.setForeground(java.awt.Color.GRAY);
        photo30.setIcon(available);
        Updatecomputer30();
        jbstart30.setEnabled(false);
        Stop30.setEnabled(false);
        transfer30.setEnabled(false);
        iconstop30.setEnabled(false);
        clear30.setEnabled(true);
    }//GEN-LAST:event_transfer30ActionPerformed

    private void clear30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear30ActionPerformed
            timer30.stop();
            hour30 =0;
            min30 = 0;
            sec30 = 0;
            stophour30 = 0;
            stopmin30 = 0;
            stopsec30 = 0;
            stopname = "";
            tranferhour = 0;
            tranfermin = 0;
            tranfermin = 0;
            status30.setText("Available");
            lhour30.setText("00");
            lsec30.setText("00");
            lmin30.setText("00");
            cusernam30.setText("");
            photo30.setIcon(available);
            status30.setForeground(java.awt.Color.GRAY);
            Updatecomputer30();
            jbstart30.setEnabled(true);
            Stop30.setEnabled(false);
            transfer30.setEnabled(false);
            iconstop30.setEnabled(false);
    }//GEN-LAST:event_clear30ActionPerformed

    private void backpage3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpage3MouseClicked
    c1.show(Jmain, "card7");
        statusComputer13();
        statusComputer14();
        statusComputer15();
        statusComputer16();
        statusComputer17();
        statusComputer18();
        statusComputer19();
        statusComputer20();
        statusComputer21();
        statusComputer22();
        statusComputer23();
        statusComputer24();
        /*13*/
        if(status13.getText().equals("Available")){
            status13.setForeground(java.awt.Color.GRAY);
            photo13.setIcon(available);
        }
        if(status13.getText().equals("User")){
            photo13.setIcon(using);
            status13.setForeground(java.awt.Color.GREEN);

        }
        if(status13.getText().equals("Repair")){
            status13.setForeground(java.awt.Color.blue);
            photo13.setIcon(repair);
            clear13.setEnabled(false);
        }
        if(status13.getText().equals("Dilapidated")){
            status13.setForeground(java.awt.Color.RED);
            photo13.setIcon(broken);
            clear13.setEnabled(false);

        }
        if(status13.getText().equals("User")&&hour13==0&&min13==0&&sec13==0){
            status13.setText("Available");
            photo13.setIcon(available);
            Updatecomputer13();
        }
        /*14*/
         if(status14.getText().equals("Available")){
            status14.setForeground(java.awt.Color.GRAY);
            photo14.setIcon(available);
        }
        if(status14.getText().equals("User")){
            photo14.setIcon(using);
            status14.setForeground(java.awt.Color.GREEN);

        }
        if(status14.getText().equals("Repair")){
            status14.setForeground(java.awt.Color.blue);
            photo14.setIcon(repair);
            clear14.setEnabled(false);
        }
        if(status14.getText().equals("Dilapidated")){
            status14.setForeground(java.awt.Color.RED);
            photo14.setIcon(broken);
            clear14.setEnabled(false);
        }
        if(status14.getText().equals("User")&&hour14==0&&min14==0&&sec14==0){
            status14.setText("Available");
            photo14.setIcon(available);
            Updatecomputer14();
        }
        /*15*/
        if(status15.getText().equals("Available")){
            status15.setForeground(java.awt.Color.GRAY);
            photo15.setIcon(available);
        }
        if(status15.getText().equals("User")){
            photo15.setIcon(using);
            status15.setForeground(java.awt.Color.GREEN);

        }
        if(status15.getText().equals("Repair")){
            status15.setForeground(java.awt.Color.blue);
            photo15.setIcon(repair);
            clear15.setEnabled(false);
        }
        if(status15.getText().equals("Dilapidated")){
            status15.setForeground(java.awt.Color.RED);
            photo15.setIcon(broken);
            clear15.setEnabled(false);

        }
        if(status15.getText().equals("User")&&hour15==0&&min15==0&&sec15==0){
            status15.setText("Available");
            photo15.setIcon(available);
            Updatecomputer15();
        }
        /*16*/
        if(status16.getText().equals("Available")){
            status16.setForeground(java.awt.Color.GRAY);
            photo16.setIcon(available);
        }
        if(status16.getText().equals("User")){
            photo16.setIcon(using);
            status16.setForeground(java.awt.Color.GREEN);

        }
        if(status16.getText().equals("Repair")){
            status16.setForeground(java.awt.Color.blue);
            photo16.setIcon(repair);
            clear16.setEnabled(false);
        }
        if(status16.getText().equals("Dilapidated")){
            status16.setForeground(java.awt.Color.RED);
            photo16.setIcon(broken);
            clear16.setEnabled(false);
        }
        if(status16.getText().equals("User")&&hour16==0&&min16==0&&sec16==0){
            status16.setText("Available");
            photo16.setIcon(available);
            Updatecomputer16();
        }
        /*17*/
      if(status17.getText().equals("Available")){
            status17.setForeground(java.awt.Color.GRAY);
            photo17.setIcon(available);
        }
        if(status17.getText().equals("User")){
            photo17.setIcon(using);
            status17.setForeground(java.awt.Color.GREEN);

        }
        if(status17.getText().equals("Repair")){
            status17.setForeground(java.awt.Color.blue);
            photo17.setIcon(repair);
            clear17.setEnabled(false);
        }
        if(status17.getText().equals("Dilapidated")){
            status17.setForeground(java.awt.Color.RED);
            photo17.setIcon(broken);
            clear17.setEnabled(false);
        }
        if(status17.getText().equals("User")&&hour17==0&&min17==0&&sec17==0){
            status17.setText("Available");
            photo17.setIcon(available);
            Updatecomputer17();
        }
        /*18*/
        if(status18.getText().equals("Available")){
            status18.setForeground(java.awt.Color.GRAY);
            photo18.setIcon(available);
        }
        if(status18.getText().equals("User")){
            photo18.setIcon(using);
            status18.setForeground(java.awt.Color.GREEN);

        }
        if(status18.getText().equals("Repair")){
            status18.setForeground(java.awt.Color.blue);
            photo18.setIcon(repair);
            clear18.setEnabled(false);
        }
        if(status18.getText().equals("Dilapidated")){
            status18.setForeground(java.awt.Color.RED);
            photo18.setIcon(broken);
            clear18.setEnabled(false);
        }
        if(status18.getText().equals("User")&&hour18==0&&min18==0&&sec18==0){
            status18.setText("Available");
            photo18.setIcon(available);
            Updatecomputer18();
        }
        /*19*/
      if(status19.getText().equals("Available")){
            status19.setForeground(java.awt.Color.GRAY);
            photo19.setIcon(available);
        }
        if(status19.getText().equals("User")){
            photo19.setIcon(using);
            status19.setForeground(java.awt.Color.GREEN);

        }
        if(status19.getText().equals("Repair")){
            status19.setForeground(java.awt.Color.blue);
            photo19.setIcon(repair);
            clear19.setEnabled(false);
        }
        if(status19.getText().equals("Dilapidated")){
            status19.setForeground(java.awt.Color.RED);
            photo19.setIcon(broken);
            clear19.setEnabled(false);
        }
        if(status19.getText().equals("User")&&hour19==0&&min19==0&&sec19==0){
            status19.setText("Available");
            photo19.setIcon(available);
            Updatecomputer19();
        }
        /*20*/
        if(status20.getText().equals("Available")){
            status20.setForeground(java.awt.Color.GRAY);
            photo20.setIcon(available);
        }
        if(status20.getText().equals("User")){
            photo20.setIcon(using);
            status20.setForeground(java.awt.Color.GREEN);

        }
        if(status20.getText().equals("Repair")){
            status20.setForeground(java.awt.Color.blue);
            photo20.setIcon(repair);
            clear20.setEnabled(false);
        }
        if(status20.getText().equals("Dilapidated")){
            status20.setForeground(java.awt.Color.RED);
            photo20.setIcon(broken);
            clear20.setEnabled(false);
        }
        if(status20.getText().equals("User")&&hour20==0&&min20==0&&sec20==0){
            status20.setText("Available");
            photo20.setIcon(available);
            Updatecomputer20();
        }
        /*21*/
        if(status21.getText().equals("Available")){
            status21.setForeground(java.awt.Color.GRAY);
            photo21.setIcon(available);
        }
        if(status21.getText().equals("User")){
            photo21.setIcon(using);
            status21.setForeground(java.awt.Color.GREEN);

        }
        if(status21.getText().equals("Repair")){
            status21.setForeground(java.awt.Color.blue);
            photo21.setIcon(repair);
            clear21.setEnabled(false);
        }
        if(status21.getText().equals("Dilapidated")){
            status21.setForeground(java.awt.Color.RED);
            photo21.setIcon(broken);
            clear21.setEnabled(false);
        }
        if(status21.getText().equals("User")&&hour21==0&&min21==0&&sec21==0){
            status21.setText("Available");
            photo21.setIcon(available);
            Updatecomputer21();
        }
        /*22*/
        if(status22.getText().equals("Available")){
            status22.setForeground(java.awt.Color.GRAY);
            photo22.setIcon(available);
        }
        if(status22.getText().equals("User")){
            photo22.setIcon(using);
            status22.setForeground(java.awt.Color.GREEN);

        }
        if(status22.getText().equals("Repair")){
            status22.setForeground(java.awt.Color.blue);
            photo22.setIcon(repair);
            clear22.setEnabled(false);
        }
        if(status22.getText().equals("Dilapidated")){
            status22.setForeground(java.awt.Color.RED);
            photo22.setIcon(broken);
            clear22.setEnabled(false);
        }
        if(status22.getText().equals("User")&&hour22==0&&min22==0&&sec22==0){
            status22.setText("Available");
            photo22.setIcon(available);
            Updatecomputer22();
        }
        /*23*/
        if(status23.getText().equals("Available")){
            status23.setForeground(java.awt.Color.GRAY);
            photo23.setIcon(available);
        }
        if(status23.getText().equals("User")){
            photo23.setIcon(using);
            status23.setForeground(java.awt.Color.GREEN);

        }
        if(status23.getText().equals("Repair")){
            status23.setForeground(java.awt.Color.blue);
            photo23.setIcon(repair);
            clear23.setEnabled(false);
        }
        if(status23.getText().equals("Dilapidated")){
            status23.setForeground(java.awt.Color.RED);
            photo23.setIcon(broken);
            clear23.setEnabled(false);
        }
        if(status23.getText().equals("User")&&hour23==0&&min23==0&&sec23==0){
            status23.setText("Available");
            photo23.setIcon(available);
            Updatecomputer23();
        }
        /*24*/
        if(status24.getText().equals("Available")){
            status24.setForeground(java.awt.Color.GRAY);
            photo24.setIcon(available);
        }
        if(status24.getText().equals("User")){
            photo24.setIcon(using);
            status24.setForeground(java.awt.Color.GREEN);

        }
        if(status24.getText().equals("Repair")){
            status24.setForeground(java.awt.Color.blue);
            photo24.setIcon(repair);
            clear24.setEnabled(false);
        }
        if(status24.getText().equals("Dilapidated")){
            status24.setForeground(java.awt.Color.RED);
            photo24.setIcon(broken);
            clear24.setEnabled(false);

        }
        if(status24.getText().equals("User")&&hour24==0&&min24==0&&sec24==0){
            status24.setText("Available");
            photo24.setIcon(available);
            Updatecomputer24();
        }
    }//GEN-LAST:event_backpage3MouseClicked

    private void nextpage3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextpage3MouseClicked
        c1.show(Jmain, "card8");
        statusComputer25();
        statusComputer26();
        statusComputer27();
        statusComputer28();
        statusComputer29();
        statusComputer30();
        /*25*/
        if(status25.getText().equals("Available")){
            status25.setForeground(java.awt.Color.GRAY);
            photo25.setIcon(available);
        }
        if(status25.getText().equals("User")){
            photo25.setIcon(using);
            status25.setForeground(java.awt.Color.GREEN);

        }
        if(status25.getText().equals("Repair")){
            status25.setForeground(java.awt.Color.blue);
            photo25.setIcon(repair);
            clear25.setEnabled(false);
        }
        if(status25.getText().equals("Dilapidated")){
            status25.setForeground(java.awt.Color.RED);
            photo25.setIcon(broken);
            clear25.setEnabled(false);
        }
        if(status25.getText().equals("User")&&hour25==0&&min25==0&&sec25==0){
            status25.setText("Available");
            photo25.setIcon(available);
            Updatecomputer25();
        }
        /*26*/
         if(status26.getText().equals("Available")){
            status26.setForeground(java.awt.Color.GRAY);
            photo26.setIcon(available);
        }
        if(status26.getText().equals("User")){
            photo26.setIcon(using);
            status26.setForeground(java.awt.Color.GREEN);

        }
        if(status26.getText().equals("Repair")){
            status26.setForeground(java.awt.Color.blue);
            photo26.setIcon(repair);
            clear26.setEnabled(false);
        }
        if(status26.getText().equals("Dilapidated")){
            status26.setForeground(java.awt.Color.RED);
            photo26.setIcon(broken);
            clear26.setEnabled(false);
        }
        if(status26.getText().equals("User")&&hour26==0&&min26==0&&sec26==0){
            status26.setText("Available");
            photo26.setIcon(available);
            Updatecomputer26();
        }
        /*27*/
        if(status27.getText().equals("Available")){
            status27.setForeground(java.awt.Color.GRAY);
            photo27.setIcon(available);
        }
        if(status27.getText().equals("User")){
            photo27.setIcon(using);
            status27.setForeground(java.awt.Color.GREEN);

        }
        if(status27.getText().equals("Repair")){
            status27.setForeground(java.awt.Color.blue);
            photo27.setIcon(repair);
            clear27.setEnabled(false);
        }
        if(status27.getText().equals("Dilapidated")){
            status27.setForeground(java.awt.Color.RED);
            photo27.setIcon(broken);
            clear27.setEnabled(false);
        }
        if(status27.getText().equals("User")&&hour27==0&&min27==0&&sec27==0){
            status27.setText("Available");
            photo27.setIcon(available);
            Updatecomputer27();
        }
        /*28*/
        if(status28.getText().equals("Available")){
            status28.setForeground(java.awt.Color.GRAY);
            photo28.setIcon(available);
        }
        if(status28.getText().equals("User")){
            photo28.setIcon(using);
            status28.setForeground(java.awt.Color.GREEN);

        }
        if(status28.getText().equals("Repair")){
            status28.setForeground(java.awt.Color.blue);
            photo28.setIcon(repair);
            clear28.setEnabled(false);
        }
        if(status28.getText().equals("Dilapidated")){
            status28.setForeground(java.awt.Color.RED);
            photo28.setIcon(broken);
            clear28.setEnabled(false);
        }
        if(status28.getText().equals("User")&&hour28==0&&min28==0&&sec28==0){
            status28.setText("Available");
            photo28.setIcon(available);
            Updatecomputer28();
        }
        /*29*/
      if(status29.getText().equals("Available")){
            status29.setForeground(java.awt.Color.GRAY);
            photo29.setIcon(available);
        }
        if(status29.getText().equals("User")){
            photo29.setIcon(using);
            status29.setForeground(java.awt.Color.GREEN);

        }
        if(status29.getText().equals("Repair")){
            status29.setForeground(java.awt.Color.blue);
            photo29.setIcon(repair);
            clear29.setEnabled(false);
        }
        if(status29.getText().equals("Dilapidated")){
            status29.setForeground(java.awt.Color.RED);
            photo29.setIcon(broken);
            clear29.setEnabled(false);
        }
        if(status29.getText().equals("User")&&hour29==0&&min29==0&&sec29==0){
            status29.setText("Available");
            photo29.setIcon(available);
            Updatecomputer29();
        }
        /*30*/
        if(status30.getText().equals("Available")){
            status30.setForeground(java.awt.Color.GRAY);
            photo30.setIcon(available);
        }
        if(status30.getText().equals("User")){
            photo30.setIcon(using);
            status30.setForeground(java.awt.Color.GREEN);

        }
        if(status30.getText().equals("Repair")){
            status30.setForeground(java.awt.Color.blue);
            photo30.setIcon(repair);
            clear30.setEnabled(false);
        }
        if(status30.getText().equals("Dilapidated")){
            status30.setForeground(java.awt.Color.RED);
            photo30.setIcon(broken);
            clear30.setEnabled(false);
        }
        if(status30.getText().equals("User")&&hour30==0&&min30==0&&sec30==0){
            status30.setText("Available");
            photo30.setIcon(available);
            Updatecomputer30();
        }
    }//GEN-LAST:event_nextpage3MouseClicked

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
           if(jRadioButton1.isSelected()){
        Jtfind.setEnabled(true);
        Jbfind.setEnabled(true);
        jTable1.setEnabled(true);
        jbpayment.setEnabled(true);
        jbox1.setEnabled(true);
        jbox1.setSelectedIndex(0);
        Jtprice.setText("");
        Jtgetmoney.setText("");
        Jtchange.setText("");
        jtreceipt.setText("");
        DefaultTableModel dtm = new DefaultTableModel();
        jTable1.setModel(dtm);
        jLabel20.setEnabled(true);
        jLabel19.setEnabled(false);
        jLabel22.setEnabled(false);
        jLabel23.setEnabled(true);
        jLabel24.setEnabled(true);
        jLabel25.setEnabled(true);
        jLabel26.setEnabled(true);
        jLabel27.setEnabled(true);
        jLabel28.setEnabled(true);
        jLabel121.setEnabled(true);
        jLabel122.setEnabled(true);
        jLabel123.setEnabled(true);
        jLabel124.setEnabled(true);
        jLabel126.setEnabled(true);
           }   
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
         if(jRadioButton2.isSelected()){
        Jtfind.setEnabled(false);
        Jbfind.setEnabled(false);
        jTable1.setEnabled(false);
        jbpayment.setEnabled(true);
        jbox1.setEnabled(true);
        jtname.setText("");
        jtlastname.setText("");
        Jtfind.setText("");
        JtcustomerId.setText("");
        Jtuserid.setText("");
        Jtusername.setText("");
        jbox1.setSelectedIndex(0);
        Jtprice.setText("");
        Jtgetmoney.setText("");
        Jtchange.setText("");
        jtreceipt.setText("");
        DefaultTableModel dtm = new DefaultTableModel();
        jTable1.setModel(dtm);
        jLabel19.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel20.setEnabled(false);
        jLabel23.setEnabled(false);
        jLabel24.setEnabled(false);
        jLabel25.setEnabled(false);
        jLabel26.setEnabled(false);
        jLabel27.setEnabled(false);
        jLabel28.setEnabled(true);
        jLabel121.setEnabled(true);
        jLabel122.setEnabled(true);
        jLabel123.setEnabled(true);
        jLabel124.setEnabled(false);
        jLabel126.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed
    }
    private void registpaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registpaymentMouseClicked
        c1.show(Jmain, "card3");
    }//GEN-LAST:event_registpaymentMouseClicked

    private void jjongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jjongActionPerformed
          c1.show(Jmain, "card6");
        statusComputer1();
        statusComputer2();
        statusComputer3();
        statusComputer4();
        statusComputer5();
        statusComputer6();
        statusComputer7();
        statusComputer8();
        statusComputer9();
        statusComputer10();
        statusComputer11();
        statusComputer12();
        /*1*/
        if(status1.getText().equals("Available")){
            status1.setForeground(java.awt.Color.GRAY);
            photo1.setIcon(available);
        }
        if(status1.getText().equals("User")){
            photo1.setIcon(using);
            status1.setForeground(java.awt.Color.GREEN);

        }
        if(status1.getText().equals("Repair")){
            status1.setForeground(java.awt.Color.blue);
            photo1.setIcon(repair);
            clear1.setEnabled(false);
        }
        if(status1.getText().equals("Dilapidated")){
            status1.setForeground(java.awt.Color.RED);
            photo1.setIcon(broken);
            clear1.setEnabled(false);
        }
        if(status1.getText().equals("User")&&hour==0&&min==0&&sec==0){
            status1.setText("Available");
            photo1.setIcon(available);
            Updatecomputer1();
        }
        /*2*/
         if(status2.getText().equals("Available")){
            status2.setForeground(java.awt.Color.GRAY);
            photo2.setIcon(available);
        }
        if(status2.getText().equals("User")){
            photo2.setIcon(using);
            status2.setForeground(java.awt.Color.GREEN);

        }
        if(status2.getText().equals("Repair")){
            status2.setForeground(java.awt.Color.blue);
            photo2.setIcon(repair);
            clear2.setEnabled(false);
        }
        if(status2.getText().equals("Dilapidated")){
            status2.setForeground(java.awt.Color.RED);
            photo2.setIcon(broken);
            clear2.setEnabled(false);

        }
        if(status2.getText().equals("User")&&hour2==0&&min2==0&&sec2==0){
            status2.setText("Available");
            photo2.setIcon(available);
            Updatecomputer2();
        }
        /*3*/
        if(status3.getText().equals("Available")){
            status3.setForeground(java.awt.Color.GRAY);
            photo3.setIcon(available);
            
        }
        if(status3.getText().equals("User")){
            photo3.setIcon(using);
            status3.setForeground(java.awt.Color.GREEN);

        }
        if(status3.getText().equals("Repair")){
            status3.setForeground(java.awt.Color.blue);
            photo3.setIcon(repair);
            clear3.setEnabled(false);
        }
        if(status3.getText().equals("Dilapidated")){
            status3.setForeground(java.awt.Color.RED);
            photo3.setIcon(broken);
            clear3.setEnabled(false);

        }
        if(status3.getText().equals("User")&&hour3==0&&min3==0&&sec3==0){
            status3.setText("Available");
            photo3.setIcon(available);
            Updatecomputer3();
        }
        /*4*/
        if(status4.getText().equals("Available")){
            status4.setForeground(java.awt.Color.GRAY);
            photo4.setIcon(available);
        }
        if(status4.getText().equals("User")){
            photo4.setIcon(using);
            status4.setForeground(java.awt.Color.GREEN);

        }
        if(status4.getText().equals("Repair")){
            status4.setForeground(java.awt.Color.blue);
            photo4.setIcon(repair);
            clear4.setEnabled(false);
        }
        if(status4.getText().equals("Dilapidated")){
            status4.setForeground(java.awt.Color.RED);
            photo4.setIcon(broken);
            clear4.setEnabled(false);

        }
        if(status4.getText().equals("User")&&hour4==0&&min4==0&&sec4==0){
            status4.setText("Available");
            photo4.setIcon(available);
            Updatecomputer4();
        }
        /*5*/
      if(status5.getText().equals("Available")){
            status5.setForeground(java.awt.Color.GRAY);
            photo5.setIcon(available);
        }
        if(status5.getText().equals("User")){
            photo5.setIcon(using);
            status5.setForeground(java.awt.Color.GREEN);

        }
        if(status5.getText().equals("Repair")){
            status5.setForeground(java.awt.Color.blue);
            photo5.setIcon(repair);
            clear5.setEnabled(false);
        }
        if(status5.getText().equals("Dilapidated")){
            status5.setForeground(java.awt.Color.RED);
            photo5.setIcon(broken);
            clear5.setEnabled(false);

        }
        if(status5.getText().equals("User")&&hour5==0&&min5==0&&sec5==0){
            status5.setText("Available");
            photo5.setIcon(available);
            Updatecomputer5();
        }
        /*6*/
      if(status6.getText().equals("Available")){
            status6.setForeground(java.awt.Color.GRAY);
            photo6.setIcon(available);
        }
        if(status6.getText().equals("User")){
            photo6.setIcon(using);
            status6.setForeground(java.awt.Color.GREEN);

        }
        if(status6.getText().equals("Repair")){
            status6.setForeground(java.awt.Color.blue);
            photo6.setIcon(repair);
            clear6.setEnabled(false);
        }
        if(status6.getText().equals("Dilapidated")){
            status6.setForeground(java.awt.Color.RED);
            photo6.setIcon(broken);
            clear6.setEnabled(false);
        }
        if(status6.getText().equals("User")&&hour6==0&&min6==0&&sec6==0){
            status6.setText("Available");
            photo6.setIcon(available);
            Updatecomputer6();
        }
        /*7*/
      if(status7.getText().equals("Available")){
            status7.setForeground(java.awt.Color.GRAY);
            photo7.setIcon(available);
        }
        if(status7.getText().equals("User")){
            photo7.setIcon(using);
            status7.setForeground(java.awt.Color.GREEN);

        }
        if(status7.getText().equals("Repair")){
            status7.setForeground(java.awt.Color.blue);
            photo7.setIcon(repair);
            clear7.setEnabled(false);
        }
        if(status7.getText().equals("Dilapidated")){
            status7.setForeground(java.awt.Color.RED);
            photo7.setIcon(broken);
            clear7.setEnabled(false);
        }
        if(status7.getText().equals("User")&&hour7==0&&min7==0&&sec7==0){
            status7.setText("Available");
            photo7.setIcon(available);
            Updatecomputer7();
        }
        /*8*/
        if(status8.getText().equals("Available")){
            status8.setForeground(java.awt.Color.GRAY);
            photo8.setIcon(available);
        }
        if(status8.getText().equals("User")){
            photo8.setIcon(using);
            status8.setForeground(java.awt.Color.GREEN);

        }
        if(status8.getText().equals("Repair")){
            status8.setForeground(java.awt.Color.blue);
            photo8.setIcon(repair);
            clear8.setEnabled(false);
        }
        if(status8.getText().equals("Dilapidated")){
            status8.setForeground(java.awt.Color.RED);
            photo8.setIcon(broken);
            clear8.setEnabled(false);
        }
        if(status8.getText().equals("User")&&hour8==0&&min8==0&&sec8==0){
            status8.setText("Available");
            photo8.setIcon(available);
            Updatecomputer8();
        }
        /*9*/
        if(status9.getText().equals("Available")){
            status9.setForeground(java.awt.Color.GRAY);
            photo9.setIcon(available);
        }
        if(status9.getText().equals("User")){
            photo9.setIcon(using);
            status9.setForeground(java.awt.Color.GREEN);

        }
        if(status9.getText().equals("Repair")){
            status9.setForeground(java.awt.Color.blue);
            photo9.setIcon(repair);
            clear9.setEnabled(false);
        }
        if(status9.getText().equals("Dilapidated")){
            status9.setForeground(java.awt.Color.RED);
            photo9.setIcon(broken);
            clear9.setEnabled(false);
        }
        if(status9.getText().equals("User")&&hour9==0&&min9==0&&sec9==0){
            status9.setText("Available");
            photo9.setIcon(available);
            Updatecomputer9();
        }
        /*10*/
        if(status10.getText().equals("Available")){
            status10.setForeground(java.awt.Color.GRAY);
            photo10.setIcon(available);
        }
        if(status10.getText().equals("User")){
            photo10.setIcon(using);
            status10.setForeground(java.awt.Color.GREEN);

        }
        if(status10.getText().equals("Repair")){
            status10.setForeground(java.awt.Color.blue);
            photo10.setIcon(repair);
            clear10.setEnabled(false);
        }
        if(status10.getText().equals("Dilapidated")){
            status10.setForeground(java.awt.Color.RED);
            photo10.setIcon(broken);
            clear10.setEnabled(false);
        }
        if(status10.getText().equals("User")&&hour10==0&&min10==0&&sec10==0){
            status10.setText("Available");
            photo10.setIcon(available);
            Updatecomputer10();
        }
        /*11*/
        if(status11.getText().equals("Available")){
            status11.setForeground(java.awt.Color.GRAY);
            photo11.setIcon(available);
        }
        if(status11.getText().equals("User")){
            photo11.setIcon(using);
            status11.setForeground(java.awt.Color.GREEN);

        }
        if(status11.getText().equals("Repair")){
            status11.setForeground(java.awt.Color.blue);
            photo11.setIcon(repair);
            clear11.setEnabled(false);
        }
        if(status11.getText().equals("Dilapidated")){
            status11.setForeground(java.awt.Color.RED);
            photo11.setIcon(broken);
            clear11.setEnabled(false);
        }
        if(status11.getText().equals("User")&&hour11==0&&min11==0&&sec11==0){
            status11.setText("Available");
            photo11.setIcon(available);
            Updatecomputer11();
        }
        /*12*/
        if(status12.getText().equals("Available")){
            status12.setForeground(java.awt.Color.GRAY);
            photo12.setIcon(available);
        }
        if(status12.getText().equals("User")){
            photo12.setIcon(using);
            status12.setForeground(java.awt.Color.GREEN);

        }
        if(status12.getText().equals("Repair")){
            status12.setForeground(java.awt.Color.blue);
            photo12.setIcon(repair);
            clear12.setEnabled(false);
        }
        if(status12.getText().equals("Dilapidated")){
            status12.setForeground(java.awt.Color.RED);
            photo12.setIcon(broken);
            clear12.setEnabled(false);
        }
        if(status12.getText().equals("User")&&hour12==0&&min12==0&&sec12==0){
            status12.setText("Available");
            photo12.setIcon(available);
            Updatecomputer12();
        }
    }//GEN-LAST:event_jjongActionPerformed

    private void JtcustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JtcustomerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JtcustomerIdActionPerformed

    private void dataanalysisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataanalysisMouseClicked
        c1.show(Jmain, "card9");
    }//GEN-LAST:event_dataanalysisMouseClicked

    private void findname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findname1ActionPerformed
        if(jComboBox1.getSelectedIndex()==2){       
        try{
                DefaultTableModel dtm = new DefaultTableModel();
                jTable2.setModel(dtm);
                dtm.setColumnCount(4);
                dtm.setRowCount(1);
                String sql = " SELECT COUNT(OrderID) as OrderID,SUM(Hour) as SUMHour,SUM(Price) as SUMPrice,DATE(OrderDate) as Date FROM orders WHERE Date(OrderDate) = ? ";
                PreparedStatement stmt = c.prepareStatement(sql);
                stmt.setString(1, jTextField8.getText());
                String[] names = {"OrderID","SUMHour","SUMPrice","Date"};
                for (int i = 0; i < names.length; i++) {jTable2.getColumnModel().getColumn(i).setHeaderValue(names[i]);}
                ResultSet rs = stmt.executeQuery();
                int n = 0;
                while(rs.next()){
                    dtm.setValueAt(rs.getString("OrderID"), n, 0);
                    dtm.setValueAt(rs.getString("SUMHour"), n, 1);
                    dtm.setValueAt(rs.getString("SUMPrice"), n, 2);
                    dtm.setValueAt(rs.getString("Date"), n, 3);
                    n++;
                    dtm.setRowCount(n+1);
                }
            }    
        catch(Exception e){e.printStackTrace();}
        }else if(jComboBox1.getSelectedIndex()==3){       
        try{
                DefaultTableModel dtm = new DefaultTableModel();
                jTable2.setModel(dtm);
                dtm.setColumnCount(5);
                dtm.setRowCount(1);
                String sql = " SELECT COUNT(OrderID) as OrderID,SUM(Hour) as SUMHour,SUM(Price) as SUMPrice,MONTH(OrderDate) as MONTH,"
                        + "Year(OrderDate) as Year FROM orders WHERE MONTH(Orderdate)  = ? ";
                PreparedStatement stmt = c.prepareStatement(sql);
                stmt.setString(1,jTextField8.getText());
                String[] names = {"OrderID","SUMHour","SUMPrice","Month","Year"};
                for (int i = 0; i < names.length; i++) {jTable2.getColumnModel().getColumn(i).setHeaderValue(names[i]);}
                ResultSet rs = stmt.executeQuery();
                int n = 0;
                while(rs.next()){
                    dtm.setValueAt(rs.getString("OrderID"), n, 0);
                    dtm.setValueAt(rs.getString("SUMHour"), n, 1);
                    dtm.setValueAt(rs.getString("SUMPrice"), n, 2);
                    dtm.setValueAt(rs.getString("Month"), n, 3);
                    dtm.setValueAt(rs.getString("Year"), n, 4);
                    n++;
                    dtm.setRowCount(n+1);
                }
            }    
        catch(Exception e){e.printStackTrace();}
    }//GEN-LAST:event_findname1ActionPerformed
        else if(jComboBox1.getSelectedIndex()==4){       
        try{
                DefaultTableModel dtm = new DefaultTableModel();
                jTable2.setModel(dtm);
                dtm.setColumnCount(4);
                dtm.setRowCount(1);
                String sql = " SELECT COUNT(OrderID) as OrderID,SUM(Hour) as SUMHour,SUM(Price) as SUMPrice,YEAR(OrderDate) as Year FROM orders WHERE YEAR(Orderdate) = ? ";
                PreparedStatement stmt = c.prepareStatement(sql);
                stmt.setString(1, jTextField8.getText());
                String[] names = {"OrderID","SUMHour","SUMPrice","Year"};
                for (int i = 0; i < names.length; i++) {jTable2.getColumnModel().getColumn(i).setHeaderValue(names[i]);}
                ResultSet rs = stmt.executeQuery();
                int n = 0;
                while(rs.next()){
                    dtm.setValueAt(rs.getString("OrderID"), n, 0);
                    dtm.setValueAt(rs.getString("SUMHour"), n, 1);
                    dtm.setValueAt(rs.getString("SUMPrice"), n, 2);
                    dtm.setValueAt(rs.getString("Year"), n, 3);
                    n++;
                    dtm.setRowCount(n+1);
                }
            }    
        catch(Exception e){e.printStackTrace();}}else if(jComboBox1.getSelectedIndex()==5){       
       }
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       if(jComboBox1.getSelectedIndex()==0){
              textname.setText("");
            jTextField8.setEnabled(false);
            findname1.setEnabled(false);
            jTextField8.setText("");
            DefaultTableModel dtm = new DefaultTableModel();
            jTable2.setModel(dtm);
            iconphoto.setEnabled(false);
    }else if(jComboBox1.getSelectedIndex()==1){
             try{
              
                String sql = "SELECT COUNT(OrderID) as รายการทั้งหมด,SUM(Hour) as จำนวนชั่วโมงทั้งหมด,SUM(Price) as ยอดขายรวม FROM orders";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
                jTextField8.setEnabled(false);
                findname1.setEnabled(false);
                textname.setText("");
                jTextField8.setText("");
                 iconphoto.setEnabled(true);
                  iconphoto.setIcon(profit);
           }catch(Exception e){e.printStackTrace();}
        } else if(jComboBox1.getSelectedIndex()==2){
            textname.setText("YEAR-MONTH-DATE");
            jTextField8.setEnabled(true);
            findname1.setEnabled(true);
            jTextField8.setText("");
             iconphoto.setEnabled(true);
            iconphoto.setIcon(date);    
        try{
                String sql = " SELECT COUNT(OrderID) as รายการ,SUM(Hour) as จำนวนชั่วโมง,SUM(Price) as ยอดขาย,DATE(OrderDate) as วันที่ FROM orders WHERE Date(OrderDate) GROUP BY Date(OrderDate) ORDER BY Date(OrderDate) ";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));

           }catch(Exception e){e.printStackTrace();}
        }else if(jComboBox1.getSelectedIndex()==3){
            textname.setText("MONTH");
            jTextField8.setEnabled(true);
            findname1.setEnabled(true);
            jTextField8.setText("");
            try{
                String sql = " SELECT COUNT(OrderID) as รายาการ,SUM(Hour) as จำนวนชั่วโมง,SUM(Price) as ยอดขาย,MONTH(OrderDate) as เดือน,"
                        + "Year(OrderDate) as ปี FROM orders WHERE MONTH(Orderdate) > 0 GROUP BY MONTH(Orderdate)  ORDER BY MONTH(Orderdate)";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));

           }catch(Exception e){e.printStackTrace();}
             iconphoto.setEnabled(true);
            iconphoto.setIcon(date);
        }else if(jComboBox1.getSelectedIndex()==4){
            textname.setText("YEAR");
            jTextField8.setEnabled(true);
            findname1.setEnabled(true);
            jTextField8.setText("");
           try{
                String sql = " SELECT COUNT(OrderID) as รายการ,SUM(Hour) as จำนวนชั่วโมง,SUM(Price) as ยอดขาย,YEAR(OrderDate) as ปี FROM orders WHERE YEAR(Orderdate)";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));

           }catch(Exception e){e.printStackTrace();}
             iconphoto.setEnabled(true);
            iconphoto.setIcon(date);
        }else if(jComboBox1.getSelectedIndex()==5){
              jTextField8.setEnabled(false);
            findname1.setEnabled(false);
            jTextField8.setText("");
            try{
                String sql = "SELECT orders.UserID,customersid.User,COUNT(OrderID) as รายการ,SUM(Hour) as จำนวนชั่วโมง,SUM(Price) as ยอดขาย FROM orders INNER JOIN customersid ON orders.UserID = customersid.UserID  WHERE orders.UserID  GROUP BY orders.UserID ORDER BY orders.UserID ";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
                iconphoto.setEnabled(true);
                iconphoto.setIcon(idcard);
                textname.setText("");

           }catch(Exception e){e.printStackTrace();}


        }else if(jComboBox1.getSelectedIndex()==6){
              jTextField8.setEnabled(false);
            findname1.setEnabled(false);
            iconphoto.setEnabled(false);
            jTextField8.setText("");
            try{
                String sql = "SELECT UserID,COUNT(OrderID) as รายการ,SUM(Hour) as จำนวนชั่วโมง,SUM(Price) as ยอดขาย FROM orders WHERE ISNULL(UserID) GROUP BY UserID   ";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));
                textname.setText("");


           }catch(Exception e){e.printStackTrace();}


        }
    
   
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed
       if(jComboBox1.getSelectedIndex()==0){
           JOptionPane.showMessageDialog(null, "กรุณาเลือกตาราง");
       }else if(jComboBox1.getSelectedIndex()==1){       
        try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            String[] colName = {"รายการทั้งหมด", "จำนวนชั่วโมงทั้งหมด", "ยอดขายรวม"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i-1 , j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/Dataanalysistotal.xlsx";
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Complete");
            JOptionPane.showMessageDialog(rootPane, "Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox1.getSelectedIndex()==2){       
        try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
            String[] colName = {"รายการ", "จำนวนชั่วโมง", "ยอดขาย","วันที่"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/Dataanalysisdate.xlsx";
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Complete");
            JOptionPane.showMessageDialog(rootPane, "Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox1.getSelectedIndex()==3){       
        try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
            String[] colName = {"รายการ", "จำนวนชั่วโมง", "ยอดขาย","เดือน","ปี"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/DataAnalysistotalmonth.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox1.getSelectedIndex()==4){       
        try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
            String[] colName = {"รายการ", "จำนวนชั่วโมง", "ยอดขาย","ปี"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/DataAnalysistotalyear.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox1.getSelectedIndex()==5){       
        try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
            String[] colName = {"UserID", "User", "รายการ","จำนวนชั่วโมง","ยอดขาย"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/DataAnalysistotalmember.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox1.getSelectedIndex()==6){       
        try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable2.getModel();
            String[] colName = {"UserID","รายการ","จำนวนชั่วโมง","ยอดขาย"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/DataAnalysistotalnotmember.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }
        
             
    }//GEN-LAST:event_excelActionPerformed

    private void excel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excel1ActionPerformed
        if(jComboBox2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "กรุณาเลือกตาราง");
        }
        else if(jComboBox2.getSelectedIndex()==1){
            try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable4.getModel();
            String[] colName = {"CustomerID","Name","LastName","Age","Tel","Gender","Email","Adress"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/Customers.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox2.getSelectedIndex()==2){
            try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable4.getModel();
            String[] colName = {"UserID","CustomerID","User","Password"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/User.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox2.getSelectedIndex()==3){
            try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable4.getModel();
            String[] colName = {"OrderID","UserID","Hour","Price","OrdateDate"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/Orders.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox2.getSelectedIndex()==4){
            try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable4.getModel();
            String[] colName = {"ComputerID","Monitor","CPU","Graphiccard","Mouse","Keyboard","Headphones","Status"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }     
            String FILE_NAME = "D:/Computers.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox2.getSelectedIndex()==5){
            try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable4.getModel();
            String[] colName = {"CustomerID","UserID","Name","LastName","User","Password"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }
            String FILE_NAME = "D:/Customers+User.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(jComboBox2.getSelectedIndex()==6){
            try{
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            DefaultTableModel dtm = (DefaultTableModel)jTable4.getModel();
            String[] colName = {"AdminID","UserAdmin","Password"};
            for (int col = 0; col < 1; col++) {
                Row row = sheet.createRow(col);
                for (int col2 = 0; col2 < colName.length; col2++) {
                    String v = (String) colName[col2];
                    Cell c = row.createCell(col2);
                    c.setCellValue(v);
                }
            }
            for (int i = 1; i < dtm.getRowCount()+1; i++) {

                Row row = sheet.createRow(i);
                for (int j = 0; j < dtm.getColumnCount(); j++) {
                    String v = String.valueOf(dtm.getValueAt(i - 1, j));
                    Cell c = row.createCell(j);
                    c.setCellValue(v);
                }
            }
            String FILE_NAME = "D:/Admins.xlsx";
            FileOutputStream fos =  new FileOutputStream(FILE_NAME);
            workbook.write(fos);
            workbook.close();
            System.out.println("Ex");
            JOptionPane.showMessageDialog(null, "EXCEL Complete");
            

        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_excel1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        if(jComboBox2.getSelectedIndex()==0){
            deletedata.setEnabled(true);
            updatedata.setEnabled(true);
            jComboBox3.setEnabled(false);
            jsex.setEnabled(false);
            DefaultTableModel dtm = new DefaultTableModel();
            jTable4.setModel(dtm);
            update1.setText("");
            update2.setText("");
            update3.setText("");
            update4.setText("");
            update5.setText("");
            update6.setText("");
            update7.setText("");
            update8.setText("");
            update9.setText("");
            update10.setText("");
            update11.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            p1.setEnabled(false);
            p2.setEnabled(false);
            p3.setEnabled(false);
            p4.setEnabled(false);
            p5.setEnabled(false);
            p6.setEnabled(false);
            p7.setEnabled(false);
            p8.setEnabled(false);
            p9.setEnabled(false);
            p10.setEnabled(false);
            p11.setEnabled(false);
            update1.setEnabled(false);
            update2.setEnabled(false);
            update3.setEnabled(false);
            update4.setEnabled(false);
            update5.setEnabled(false);
            update6.setEnabled(false);
            update7.setEnabled(false);
            update8.setEnabled(false);
            update9.setEnabled(false);
            update10.setEnabled(false);
            update11.setEnabled(false);
            jComboBox3.setSelectedIndex(0);
            jsex.setSelectedIndex(0);
        }
        else if(jComboBox2.getSelectedIndex()==1){
            deletedata.setEnabled(true);
            updatedata.setEnabled(true);           
            jComboBox3.setEnabled(false);
            jsex.setEnabled(true);
            update1.setText("");
            update1.setEnabled(false);
            update2.setEnabled(true);
            update3.setEnabled(true);
            update4.setEnabled(true);
            update5.setEnabled(true);
            update6.setEnabled(false);
            update7.setEnabled(false);
            update8.setEnabled(false);
            update9.setEnabled(true);
            update10.setEnabled(false);
            update11.setEnabled(true);
            update2.setText("");
            update3.setText("");
            update4.setText("");
            update5.setText("");
            update6.setText("");
            update7.setText("");
            update8.setText("");
            update9.setText("");
            update10.setText("");
            update11.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            p1.setEnabled(true);
            p2.setEnabled(true);
            p3.setEnabled(true);
            p4.setEnabled(true);
            p5.setEnabled(true);
            p6.setEnabled(false);
            p7.setEnabled(false);
            p8.setEnabled(false);
            p9.setEnabled(true);
            p10.setEnabled(true);
            p11.setEnabled(true);
            try{
                String sql = "SELECT * FROM customers";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
            t1.setText("CustomerID");
            t2.setText("Name");
            t3.setText("LastName");
            t4.setText("Tel");
            t5.setText("Email");
            t9.setText("Address");
            t10.setText("Gender");
            t11.setText("Age");
            p1.setIcon(idcard);
            p2.setIcon(name);
            p3.setIcon(name);
            p4.setIcon(phone1);
            p5.setIcon(email1);
            p9.setIcon(address1);
            p10.setIcon(gender1);
            p11.setIcon(age);
        }else if(jComboBox2.getSelectedIndex()==2){
            jComboBox3.setEnabled(false);
            jsex.setEnabled(false);
            deletedata.setEnabled(true);
            updatedata.setEnabled(true);
            update1.setText("");
            update2.setText("");
            update1.setEnabled(false);
            update2.setEnabled(false);
            update3.setEnabled(true);
            update4.setEnabled(true);
            update5.setEnabled(false);
            update6.setEnabled(false);
            update7.setEnabled(false);
            update8.setEnabled(false);
            update9.setEnabled(false);
            update10.setEnabled(false);
            update11.setEnabled(false);
            update3.setText("");
            update4.setText("");
            update5.setText("");
            update6.setText("");
            update7.setText("");
            update8.setText("");
            update9.setText("");
            update10.setText("");
            update11.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");            
            t10.setText("");
            t11.setText("");
            p1.setEnabled(true);
            p2.setEnabled(true);
            p3.setEnabled(true);
            p4.setEnabled(true);
            p5.setEnabled(false);
            p6.setEnabled(false);
            p7.setEnabled(false);
            p8.setEnabled(false);
            p9.setEnabled(false);
            p10.setEnabled(false);
            p11.setEnabled(false);
            jComboBox3.setSelectedIndex(0);
            jsex.setSelectedIndex(0);
            try{
                String sql = "SELECT * FROM customersid";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
            t1.setText("UserID");
            t2.setText("CustomerID");
            t3.setText("User");
            t4.setText("Password");
            p1.setIcon(staff);
            p2.setIcon(idcard);
            p3.setIcon(user1);
            p4.setIcon(password1);
        }else if(jComboBox2.getSelectedIndex()==3){
            jComboBox3.setEnabled(false);
            jsex.setEnabled(false);
            deletedata.setEnabled(true);
            updatedata.setEnabled(true);
            update1.setText("");
            update2.setText("");
            update1.setEnabled(false);
            update2.setEnabled(false);
            update3.setEnabled(true);
            update4.setEnabled(true);
            update5.setEnabled(false);
            update6.setEnabled(false);
            update7.setEnabled(false);
            update8.setEnabled(false);
            update9.setEnabled(false);
            update10.setEnabled(false);
            update11.setEnabled(false);
            update3.setText("");
            update4.setText("");
            update5.setText("");
            update6.setText("");
            update7.setText("");
            update8.setText("");
            update9.setText("");
            update10.setText("");
            update11.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            p1.setEnabled(true);
            p2.setEnabled(true);
            p3.setEnabled(true);
            p4.setEnabled(true);
            p5.setEnabled(false);
            p6.setEnabled(false);
            p7.setEnabled(false);
            p8.setEnabled(false);
            p9.setEnabled(false);
            p10.setEnabled(false);
            p11.setEnabled(false);
            jComboBox3.setSelectedIndex(0);
            jsex.setSelectedIndex(0);
            try{
                String sql = "SELECT * FROM orders";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
            t1.setText("OrderID");
            t2.setText("UserID");
            t3.setText("Hour");
            t4.setText("Price");
            t5.setText("OrderDate");
            p1.setIcon(order);
            p2.setIcon(staff);
            p3.setIcon(h);
            p4.setIcon(m);
            
        }else if(jComboBox2.getSelectedIndex()==4){
            deletedata.setEnabled(false);
            updatedata.setEnabled(true);
            jsex.setEnabled(false);
            jComboBox3.setEnabled(true);
            update1.setText("");
            update1.setEnabled(false);
            update2.setEnabled(true);
            update3.setEnabled(true);
            update4.setEnabled(true);
            update5.setEnabled(true);
            update6.setEnabled(true);
            update7.setEnabled(true);
            update8.setEnabled(false);
            update9.setEnabled(false);
            update10.setEnabled(false);
            update11.setEnabled(false);
            update2.setText("");
            update3.setText("");
            update4.setText("");
            update5.setText("");
            update6.setText("");
            update7.setText("");
            update8.setText("");
            update9.setText("");
            update10.setText("");
            update11.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            p1.setEnabled(true);
            p2.setEnabled(true);
            p3.setEnabled(true);
            p4.setEnabled(true);
            p5.setEnabled(true);
            p6.setEnabled(true);
            p7.setEnabled(true);
            p8.setEnabled(true);
            p9.setEnabled(false);
            p10.setEnabled(false);
            p11.setEnabled(false);
            jsex.setSelectedIndex(0);
            try{
                String sql = "SELECT * FROM computers";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
            t1.setText("ComputerID");
            t2.setText("Monitor");
            t3.setText("CPU");
            t4.setText("Graphiccard");
            t5.setText("Mouse");
            t6.setText("Keyboard");
            t7.setText("Headphones");
            t8.setText("Status");
            p1.setIcon(com);
            p2.setIcon(monitor);
            p3.setIcon(cpu);
            p4.setIcon(gc);
            p5.setIcon(mouse);
        }else if(jComboBox2.getSelectedIndex()==5){
            deletedata.setEnabled(false);
            updatedata.setEnabled(false);
            jsex.setEnabled(false);
            jComboBox3.setEnabled(false);
            update1.setText("");
            update2.setText("");
            update3.setText("");
            update4.setText("");
            update5.setText("");
            update6.setText("");
            update7.setText("");
            update8.setText("");
            update9.setText("");
            update10.setText("");
            update11.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            p1.setEnabled(false);
            p2.setEnabled(false);
            p3.setEnabled(false);
            p4.setEnabled(false);
            p5.setEnabled(false);
            p6.setEnabled(false);
            p7.setEnabled(false);
            p8.setEnabled(false);
            p9.setEnabled(false);
            p10.setEnabled(false);
            p11.setEnabled(false);
            update1.setEnabled(false);
            update2.setEnabled(false);
            update3.setEnabled(false);
            update4.setEnabled(false);
            update5.setEnabled(false);
            update6.setEnabled(false);
            update7.setEnabled(false);
            update8.setEnabled(false);
            update9.setEnabled(false);
            update10.setEnabled(false);
            update11.setEnabled(false);
            jComboBox3.setSelectedIndex(0);
            jsex.setSelectedIndex(0);
            try{
                String sql = "SELECT customers.CustomerID,customersid.UserID,Name,LastName,User,Password FROM customers INNER JOIN customersid ON customers.CustomerID = customersid.CustomerID ";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
        } else if(jComboBox2.getSelectedIndex()==6){
            deletedata.setEnabled(true);
            updatedata.setEnabled(true);
            jsex.setEnabled(false);
            jComboBox3.setEnabled(false);
            update1.setText("");
            update2.setText("");
            update3.setText("");
            update4.setText("");
            update5.setText("");
            update6.setText("");
            update7.setText("");
            update8.setText("");
            update9.setText("");
            update10.setText("");
            update11.setText("");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
            t6.setText("");
            t7.setText("");
            t8.setText("");
            t9.setText("");
            t10.setText("");
            t11.setText("");
            p1.setEnabled(true);
            p2.setEnabled(true);
            p3.setEnabled(true);
            p4.setEnabled(false);
            p5.setEnabled(false);
            p6.setEnabled(false);
            p7.setEnabled(false);
            p8.setEnabled(false);
            p9.setEnabled(false);
            p10.setEnabled(false);
            p11.setEnabled(false);
            update1.setEnabled(false);
            update2.setEnabled(true);
            update3.setEnabled(true);
            update4.setEnabled(false);
            update5.setEnabled(false);
            update6.setEnabled(false);
            update7.setEnabled(false);
            update8.setEnabled(false);
            update9.setEnabled(false);
            update10.setEnabled(false);
            update11.setEnabled(false);
            jComboBox3.setSelectedIndex(0);
            jsex.setSelectedIndex(0);
            try{
                String sql = "SELECT * FROM admins ";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
            t1.setText("AdminID");
            t2.setText("UserAdmin");
            t3.setText("Password");
            p1.setIcon(manid);
            p2.setIcon(useradmin);
            p3.setIcon(passwordadmin);
    }//GEN-LAST:event_jComboBox2ActionPerformed
    }
    private void selectupdatedeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectupdatedeleteMouseClicked
       c1.show(Jmain, "card10");
    }//GEN-LAST:event_selectupdatedeleteMouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        if(jComboBox2.getSelectedIndex()==0){

            
        }else if(jComboBox2.getSelectedIndex()==1){
        DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        int row =  jTable4.getSelectedRow();
        
       update1.setText(model.getValueAt(row, 0).toString());
       update2.setText(model.getValueAt(row, 1).toString());
       update3.setText(model.getValueAt(row, 2).toString());
       update4.setText(model.getValueAt(row, 4).toString());
       update5.setText(model.getValueAt(row, 6).toString());
       update9.setText(model.getValueAt(row, 7).toString());
       update10.setText(model.getValueAt(row, 5).toString());
       update11.setText(model.getValueAt(row, 3).toString());
       
        }else if(jComboBox2.getSelectedIndex()==2){
        DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        int row =  jTable4.getSelectedRow();

       update1.setText(model.getValueAt(row, 0).toString());
       update2.setText(model.getValueAt(row, 1).toString());
       update3.setText(model.getValueAt(row, 2).toString());
       update4.setText(model.getValueAt(row, 3).toString());
        }else if(jComboBox2.getSelectedIndex()==3){
            DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        int row =  jTable4.getSelectedRow();

       update1.setText(model.getValueAt(row, 0).toString());
       update2.setText(model.getValueAt(row, 1).toString());
       update3.setText(model.getValueAt(row, 2).toString());
       update4.setText(model.getValueAt(row, 3).toString());
       update5.setText(model.getValueAt(row, 4).toString());       
        }else if(jComboBox2.getSelectedIndex()==4){
            DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        int row =  jTable4.getSelectedRow();

       update1.setText(model.getValueAt(row, 0).toString());
       update2.setText(model.getValueAt(row, 1).toString());
       update3.setText(model.getValueAt(row, 2).toString());
       update4.setText(model.getValueAt(row, 3).toString());
       update5.setText(model.getValueAt(row, 4).toString());
       update6.setText(model.getValueAt(row, 5).toString());
       update7.setText(model.getValueAt(row, 6).toString());
       update8.setText(model.getValueAt(row, 7).toString());        
        }else if(jComboBox2.getSelectedIndex()==4){
            DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        int row =  jTable4.getSelectedRow();
        
       update1.setText(model.getValueAt(row, 0).toString());
       update2.setText(model.getValueAt(row, 1).toString());
       update3.setText(model.getValueAt(row, 2).toString());
       update4.setText(model.getValueAt(row, 3).toString());
       update5.setText(model.getValueAt(row, 4).toString());
       update6.setText(model.getValueAt(row, 2).toString());     
        }else if(jComboBox2.getSelectedIndex()==6){
            DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
        int row =  jTable4.getSelectedRow();
        
       update1.setText(model.getValueAt(row, 0).toString());
       update2.setText(model.getValueAt(row, 1).toString());
       update3.setText(model.getValueAt(row, 2).toString());   
        }

    }//GEN-LAST:event_jTable4MouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        if(jComboBox2.getSelectedIndex()==4){
            if(jComboBox3.getSelectedIndex()==0){
                update8.setText("");
            }
           else if(jComboBox3.getSelectedIndex()==1){
                update8.setText(""+jComboBox3.getSelectedItem());
            } else if(jComboBox3.getSelectedIndex()==2){
                update8.setText(""+jComboBox3.getSelectedItem());
            } else if(jComboBox3.getSelectedIndex()==3){
                update8.setText(""+jComboBox3.getSelectedItem());
            } else if(jComboBox3.getSelectedIndex()==4){
                update8.setText(""+jComboBox3.getSelectedItem());
            }
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void updatedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatedataActionPerformed
       if(jComboBox2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "กรุณาเลือกตาราง");
        }
        if(jComboBox2.getSelectedIndex()==1){
              try{
        String sql = "UPDATE `customers` SET `CustomerID`= ?,`Name`= ? ,`LastName`= ?,`Age`= ?,`Tel`= ?,`Gender`= ?,`Email`= ?,`Address`= ? WHERE CustomerID = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, update1.getText());
            stmt.setString(2, update2.getText());
            stmt.setString(3, update3.getText());
            stmt.setString(4, update11.getText());
            stmt.setString(5, update4.getText());
            stmt.setString(6, update10.getText());
            stmt.setString(7, update5.getText());
            stmt.setString(8, update9.getText());
            stmt.setString(9, update1.getText());
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Update Success");
              
           }catch (Exception e) {e.printStackTrace();}
               try{
                String sql = "SELECT * FROM customers";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
           update1.setText("");
           update2.setText("");
           update3.setText("");
           update4.setText("");
           update5.setText("");
           update9.setText("");
           update10.setText("");
           update11.setText("");
           jsex.setSelectedIndex(0);
        }else if(jComboBox2.getSelectedIndex()==2){
            try{
        String sql = "UPDATE `customersid` SET `UserID`= ?,`CustomerID`= ? ,`User`= ?,`Password`= ? WHERE UserID = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, update1.getText());
            stmt.setString(2, update2.getText());
            stmt.setString(3, update3.getText());
            stmt.setString(4, update4.getText());
            stmt.setString(5, update1.getText());
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Update Success");              
           }catch (Exception e) {e.printStackTrace();}
            try{
                String sql = "SELECT * FROM customersid";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
           update1.setText("");
           update2.setText("");
           update3.setText("");
           update4.setText("");
        }else if(jComboBox2.getSelectedIndex()==3){
            try{
        String sql = "UPDATE `orders` SET `OrderID`= ?,`UserID`= ? ,`Hour`= ?,`Price`= ?,`OrderDate`= ? WHERE OrderID = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, update1.getText());
            stmt.setString(2, update2.getText());
            stmt.setString(3, update3.getText());
            stmt.setString(4, update4.getText());
            stmt.setString(5, update5.getText());
            stmt.setString(6, update1.getText());
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Update Success");              
           }catch (Exception e) {e.printStackTrace();}
            try{
                String sql = "SELECT * FROM orders";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
           update1.setText("");
           update2.setText("");
           update3.setText("");
           update4.setText("");
           update5.setText("");
        }else if(jComboBox2.getSelectedIndex()==4){
                        try{
        String sql = "UPDATE `computers` SET `ComputerID`= ?,`Monitor`= ? ,`CPU`= ?,`Graphiccard`= ?,`Mouse`= ?,`Keyboard`= ?,`Headphones`= ?,`Status`= ? WHERE ComputerID = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, update1.getText());
            stmt.setString(2, update2.getText());
            stmt.setString(3, update3.getText());
            stmt.setString(4, update4.getText());
            stmt.setString(5, update5.getText());
            stmt.setString(6, update6.getText());
            stmt.setString(7, update7.getText());
            stmt.setString(8, update8.getText());
            stmt.setString(9, update1.getText());
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Update Success");              
           }catch (Exception e) {e.printStackTrace();}
        try{
                String sql = "SELECT * FROM computers";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
            update1.setText("");
           update2.setText("");
           update3.setText("");
           update4.setText("");
           update5.setText("");
           update6.setText("");
           update7.setText("");
           update8.setText("");
           jComboBox3.setSelectedIndex(0);
        }else if(jComboBox2.getSelectedIndex()==6){
                        try{
        String sql = "UPDATE `admins` SET `AdminID`= ?,`UserAdmin`= ? ,`Password`= ? WHERE AdminID = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
            stmt.setString(1, update1.getText());
            stmt.setString(2, update2.getText());
            stmt.setString(3, update3.getText());
            stmt.setString(4, update1.getText());
        stmt.execute();
        JOptionPane.showMessageDialog(null, "Update Success");              
           }catch (Exception e) {e.printStackTrace();}
        try{
                String sql = "SELECT * FROM admins";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
            update1.setText("");
           update2.setText("");
           update3.setText("");
        }
    }//GEN-LAST:event_updatedataActionPerformed

    private void deletedataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedataActionPerformed
        if(jComboBox2.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null, "กรุณาเลือกตาราง");
        }
        if(jComboBox2.getSelectedIndex()==1){
        try{
           int row = jTable4.getSelectedRow();
           String id = jTable4.getModel().getValueAt(row,0).toString();
           String sql = "DELETE FROM `customers` WHERE CustomerID=? ";
           PreparedStatement stmt = c.prepareStatement(sql);
           stmt.setString(1, id);
           stmt.execute();
           JOptionPane.showMessageDialog(null, "Deleted Succesfully");
           }catch (Exception e) {e.printStackTrace();}
         try{
                String sql = "SELECT * FROM customers";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
           update1.setText("");
           update2.setText("");
           update3.setText("");
           update4.setText("");
           update5.setText("");
           update9.setText("");
           update10.setText("");
           update11.setText("");
        }else if(jComboBox2.getSelectedIndex()==2){
            try{
           int row = jTable4.getSelectedRow();
           String id = jTable4.getModel().getValueAt(row,0).toString();
           String sql = "DELETE FROM `customersid` WHERE UserID=? ";
           PreparedStatement stmt = c.prepareStatement(sql);
           stmt.setString(1, id);
           stmt.execute();
           JOptionPane.showMessageDialog(null, "Deleted Succesfully");
           }catch (Exception e) {e.printStackTrace();}
             try{
                String sql = "SELECT * FROM customersid";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
           update1.setText("");
           update2.setText("");
           update3.setText("");
           update4.setText("");
        }else if(jComboBox2.getSelectedIndex()==3){
            try{
           int row = jTable4.getSelectedRow();
           String id = jTable4.getModel().getValueAt(row,0).toString();
           String sql = "DELETE FROM `orders` WHERE OrderID=? ";
           PreparedStatement stmt = c.prepareStatement(sql);
           stmt.setString(1, id);
           stmt.execute();
           JOptionPane.showMessageDialog(null, "Deleted Succesfully");
           }catch (Exception e) {e.printStackTrace();}
            try{
                String sql = "SELECT * FROM orders";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
           update1.setText("");
           update2.setText("");
           update3.setText("");
           update4.setText("");
           update5.setText("");
        }else if(jComboBox2.getSelectedIndex()==6){
            try{
           int row = jTable4.getSelectedRow();
           String id = jTable4.getModel().getValueAt(row,0).toString();
           String sql = "DELETE FROM `admins` WHERE AdminID=? ";
           PreparedStatement stmt = c.prepareStatement(sql);
           stmt.setString(1, id);
           stmt.execute();
           JOptionPane.showMessageDialog(null, "Deleted Succesfully");
           }catch (Exception e) {e.printStackTrace();}
            try{
                String sql = "SELECT * FROM admins";
                PreparedStatement stmt = c.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();
                jTable4.setModel(DbUtils.resultSetToTableModel(rs));
           }catch(Exception e){e.printStackTrace();}
           update1.setText("");
           update2.setText("");
           update3.setText("");
        }
    }//GEN-LAST:event_deletedataActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        login = new Login();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void nameadmin1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameadmin1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadmin1AncestorAdded

    private void nameadmin2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameadmin2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadmin2AncestorAdded

    private void nameadmin3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameadmin3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadmin3AncestorAdded

    private void nameadmin4AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameadmin4AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadmin4AncestorAdded

    private void nameadmin7AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameadmin7AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadmin7AncestorAdded

    private void nameadmin8AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameadmin8AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadmin8AncestorAdded

    private void nameadmin6AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameadmin6AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadmin6AncestorAdded

    private void nameadmin5AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameadmin5AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadmin5AncestorAdded

    private void nameadminAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_nameadminAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_nameadminAncestorAdded

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed

        try {
            jtreceipt.print();
        } catch (PrinterException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

    private void timepage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timepage1ActionPerformed
        c1.show(Jmain, "card3");
    }//GEN-LAST:event_timepage1ActionPerformed

    private void timepage2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timepage2ActionPerformed
        c1.show(Jmain, "card3");
    }//GEN-LAST:event_timepage2ActionPerformed

    private void timepage3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timepage3ActionPerformed
        c1.show(Jmain, "card3");
    }//GEN-LAST:event_timepage3ActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
    this.setVisible(false);
    this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void jsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsexActionPerformed
       if(jsex.getSelectedIndex()==0){
           update10.setText("");
       }else if(jsex.getSelectedIndex()==1){
           update10.setText(jsex.getSelectedItem().toString());
       }else if(jsex.getSelectedIndex()==2){
           update10.setText(jsex.getSelectedItem().toString());
       }
    }//GEN-LAST:event_jsexActionPerformed
    
  
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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Aaddress;
    private javax.swing.JMenu Admin;
    private javax.swing.JButton Bregister;
    private javax.swing.JButton Bregister1;
    private javax.swing.JPanel JRegister;
    private javax.swing.JPanel JReservations;
    private javax.swing.JPanel JRpayment;
    private javax.swing.JButton Jbfind;
    private javax.swing.JLabel Jlchange;
    private javax.swing.JLabel Jlgetmoney;
    private javax.swing.JLabel Jlhour;
    private javax.swing.JLabel Jlprice;
    private javax.swing.JLabel Jluser;
    private javax.swing.JLabel Jluserid;
    private javax.swing.JLabel Jlusername;
    private javax.swing.JPanel Jmain;
    private javax.swing.JTextField Jtchange;
    private javax.swing.JTextField JtcustomerId;
    private javax.swing.JTextField Jtfind;
    private javax.swing.JTextField Jtgetmoney;
    private javax.swing.JTextField Jtprice;
    private javax.swing.JTextField Jtuserid;
    private javax.swing.JTextField Jtusername;
    private javax.swing.JLabel LName;
    private javax.swing.JLabel Llastname;
    private javax.swing.JLabel Llastname1;
    private javax.swing.JLabel Ltel;
    private javax.swing.JLabel Ltel1;
    private javax.swing.JMenu Main;
    private javax.swing.JMenu Register;
    private javax.swing.JMenu Reservations;
    private javax.swing.JButton Stop1;
    private javax.swing.JButton Stop10;
    private javax.swing.JButton Stop11;
    private javax.swing.JButton Stop12;
    private javax.swing.JButton Stop13;
    private javax.swing.JButton Stop14;
    private javax.swing.JButton Stop15;
    private javax.swing.JButton Stop16;
    private javax.swing.JButton Stop17;
    private javax.swing.JButton Stop18;
    private javax.swing.JButton Stop19;
    private javax.swing.JButton Stop2;
    private javax.swing.JButton Stop20;
    private javax.swing.JButton Stop21;
    private javax.swing.JButton Stop22;
    private javax.swing.JButton Stop23;
    private javax.swing.JButton Stop24;
    private javax.swing.JButton Stop25;
    private javax.swing.JButton Stop26;
    private javax.swing.JButton Stop27;
    private javax.swing.JButton Stop28;
    private javax.swing.JButton Stop29;
    private javax.swing.JButton Stop3;
    private javax.swing.JButton Stop30;
    private javax.swing.JButton Stop4;
    private javax.swing.JButton Stop5;
    private javax.swing.JButton Stop6;
    private javax.swing.JButton Stop7;
    private javax.swing.JButton Stop8;
    private javax.swing.JButton Stop9;
    private javax.swing.JLabel address;
    private javax.swing.JLabel backpage1;
    private javax.swing.JLabel backpage3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear1;
    private javax.swing.JButton clear10;
    private javax.swing.JButton clear11;
    private javax.swing.JButton clear12;
    private javax.swing.JButton clear13;
    private javax.swing.JButton clear14;
    private javax.swing.JButton clear15;
    private javax.swing.JButton clear16;
    private javax.swing.JButton clear17;
    private javax.swing.JButton clear18;
    private javax.swing.JButton clear19;
    private javax.swing.JButton clear2;
    private javax.swing.JButton clear20;
    private javax.swing.JButton clear21;
    private javax.swing.JButton clear22;
    private javax.swing.JButton clear23;
    private javax.swing.JButton clear24;
    private javax.swing.JButton clear25;
    private javax.swing.JButton clear26;
    private javax.swing.JButton clear27;
    private javax.swing.JButton clear28;
    private javax.swing.JButton clear29;
    private javax.swing.JButton clear3;
    private javax.swing.JButton clear30;
    private javax.swing.JButton clear4;
    private javax.swing.JButton clear5;
    private javax.swing.JButton clear6;
    private javax.swing.JButton clear7;
    private javax.swing.JButton clear8;
    private javax.swing.JButton clear9;
    private javax.swing.JPanel computerpage2;
    private javax.swing.JPanel computerpage3;
    private javax.swing.JLabel cusernam1;
    private javax.swing.JLabel cusernam10;
    private javax.swing.JLabel cusernam11;
    private javax.swing.JLabel cusernam12;
    private javax.swing.JLabel cusernam13;
    private javax.swing.JLabel cusernam14;
    private javax.swing.JLabel cusernam15;
    private javax.swing.JLabel cusernam16;
    private javax.swing.JLabel cusernam17;
    private javax.swing.JLabel cusernam18;
    private javax.swing.JLabel cusernam19;
    private javax.swing.JLabel cusernam2;
    private javax.swing.JLabel cusernam20;
    private javax.swing.JLabel cusernam21;
    private javax.swing.JLabel cusernam22;
    private javax.swing.JLabel cusernam23;
    private javax.swing.JLabel cusernam24;
    private javax.swing.JLabel cusernam25;
    private javax.swing.JLabel cusernam26;
    private javax.swing.JLabel cusernam27;
    private javax.swing.JLabel cusernam28;
    private javax.swing.JLabel cusernam29;
    private javax.swing.JLabel cusernam3;
    private javax.swing.JLabel cusernam30;
    private javax.swing.JLabel cusernam4;
    private javax.swing.JLabel cusernam5;
    private javax.swing.JLabel cusernam6;
    private javax.swing.JLabel cusernam7;
    private javax.swing.JLabel cusernam8;
    private javax.swing.JLabel cusernam9;
    private javax.swing.JPanel dataadmin;
    private javax.swing.JMenu dataanalysis;
    private javax.swing.JButton deletedata;
    private javax.swing.JPanel deleteupdate;
    private javax.swing.JLabel email;
    private javax.swing.JButton excel;
    private javax.swing.JButton excel1;
    private javax.swing.JMenu exit;
    private javax.swing.JButton findname;
    private javax.swing.JButton findname1;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel iconphoto;
    private javax.swing.JLabel iconstop1;
    private javax.swing.JLabel iconstop10;
    private javax.swing.JLabel iconstop11;
    private javax.swing.JLabel iconstop12;
    private javax.swing.JLabel iconstop13;
    private javax.swing.JLabel iconstop14;
    private javax.swing.JLabel iconstop15;
    private javax.swing.JLabel iconstop16;
    private javax.swing.JLabel iconstop17;
    private javax.swing.JLabel iconstop18;
    private javax.swing.JLabel iconstop19;
    private javax.swing.JLabel iconstop2;
    private javax.swing.JLabel iconstop20;
    private javax.swing.JLabel iconstop21;
    private javax.swing.JLabel iconstop22;
    private javax.swing.JLabel iconstop23;
    private javax.swing.JLabel iconstop24;
    private javax.swing.JLabel iconstop25;
    private javax.swing.JLabel iconstop26;
    private javax.swing.JLabel iconstop27;
    private javax.swing.JLabel iconstop28;
    private javax.swing.JLabel iconstop29;
    private javax.swing.JLabel iconstop3;
    private javax.swing.JLabel iconstop30;
    private javax.swing.JLabel iconstop4;
    private javax.swing.JLabel iconstop5;
    private javax.swing.JLabel iconstop6;
    private javax.swing.JLabel iconstop7;
    private javax.swing.JLabel iconstop8;
    private javax.swing.JLabel iconstop9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JButton jbclear;
    private javax.swing.JComboBox<String> jbox1;
    private javax.swing.JButton jbpayment;
    private javax.swing.JButton jbstart1;
    private javax.swing.JButton jbstart10;
    private javax.swing.JButton jbstart11;
    private javax.swing.JButton jbstart12;
    private javax.swing.JButton jbstart13;
    private javax.swing.JButton jbstart14;
    private javax.swing.JButton jbstart15;
    private javax.swing.JButton jbstart16;
    private javax.swing.JButton jbstart17;
    private javax.swing.JButton jbstart18;
    private javax.swing.JButton jbstart19;
    private javax.swing.JButton jbstart2;
    private javax.swing.JButton jbstart20;
    private javax.swing.JButton jbstart21;
    private javax.swing.JButton jbstart22;
    private javax.swing.JButton jbstart23;
    private javax.swing.JButton jbstart24;
    private javax.swing.JButton jbstart25;
    private javax.swing.JButton jbstart26;
    private javax.swing.JButton jbstart27;
    private javax.swing.JButton jbstart28;
    private javax.swing.JButton jbstart29;
    private javax.swing.JButton jbstart3;
    private javax.swing.JButton jbstart30;
    private javax.swing.JButton jbstart4;
    private javax.swing.JButton jbstart5;
    private javax.swing.JButton jbstart6;
    private javax.swing.JButton jbstart7;
    private javax.swing.JButton jbstart8;
    private javax.swing.JButton jbstart9;
    private javax.swing.JButton jjong;
    private javax.swing.JLabel jlcustomerid;
    private javax.swing.JComboBox<String> jsex;
    private javax.swing.JTextField jtfindname;
    private javax.swing.JTextField jtlastname;
    private javax.swing.JTextField jtname;
    private javax.swing.JTextArea jtreceipt;
    private javax.swing.JLabel lcustomerid;
    private javax.swing.JLabel lcustomerid1;
    private javax.swing.JLabel lhour1;
    private javax.swing.JLabel lhour10;
    private javax.swing.JLabel lhour11;
    private javax.swing.JLabel lhour12;
    private javax.swing.JLabel lhour13;
    private javax.swing.JLabel lhour14;
    private javax.swing.JLabel lhour15;
    private javax.swing.JLabel lhour16;
    private javax.swing.JLabel lhour17;
    private javax.swing.JLabel lhour18;
    private javax.swing.JLabel lhour19;
    private javax.swing.JLabel lhour2;
    private javax.swing.JLabel lhour20;
    private javax.swing.JLabel lhour21;
    private javax.swing.JLabel lhour22;
    private javax.swing.JLabel lhour23;
    private javax.swing.JLabel lhour24;
    private javax.swing.JLabel lhour25;
    private javax.swing.JLabel lhour26;
    private javax.swing.JLabel lhour27;
    private javax.swing.JLabel lhour28;
    private javax.swing.JLabel lhour29;
    private javax.swing.JLabel lhour3;
    private javax.swing.JLabel lhour30;
    private javax.swing.JLabel lhour4;
    private javax.swing.JLabel lhour5;
    private javax.swing.JLabel lhour6;
    private javax.swing.JLabel lhour7;
    private javax.swing.JLabel lhour8;
    private javax.swing.JLabel lhour9;
    private javax.swing.JLabel lmin1;
    private javax.swing.JLabel lmin10;
    private javax.swing.JLabel lmin11;
    private javax.swing.JLabel lmin12;
    private javax.swing.JLabel lmin13;
    private javax.swing.JLabel lmin14;
    private javax.swing.JLabel lmin15;
    private javax.swing.JLabel lmin16;
    private javax.swing.JLabel lmin17;
    private javax.swing.JLabel lmin18;
    private javax.swing.JLabel lmin19;
    private javax.swing.JLabel lmin2;
    private javax.swing.JLabel lmin20;
    private javax.swing.JLabel lmin21;
    private javax.swing.JLabel lmin22;
    private javax.swing.JLabel lmin23;
    private javax.swing.JLabel lmin24;
    private javax.swing.JLabel lmin25;
    private javax.swing.JLabel lmin26;
    private javax.swing.JLabel lmin27;
    private javax.swing.JLabel lmin28;
    private javax.swing.JLabel lmin29;
    private javax.swing.JLabel lmin3;
    private javax.swing.JLabel lmin30;
    private javax.swing.JLabel lmin4;
    private javax.swing.JLabel lmin5;
    private javax.swing.JLabel lmin6;
    private javax.swing.JLabel lmin7;
    private javax.swing.JLabel lmin8;
    private javax.swing.JLabel lmin9;
    private javax.swing.JLabel lpassword;
    private javax.swing.JLabel lpassword1;
    private javax.swing.JLabel lsec1;
    private javax.swing.JLabel lsec10;
    private javax.swing.JLabel lsec11;
    private javax.swing.JLabel lsec12;
    private javax.swing.JLabel lsec13;
    private javax.swing.JLabel lsec14;
    private javax.swing.JLabel lsec15;
    private javax.swing.JLabel lsec16;
    private javax.swing.JLabel lsec17;
    private javax.swing.JLabel lsec18;
    private javax.swing.JLabel lsec19;
    private javax.swing.JLabel lsec2;
    private javax.swing.JLabel lsec20;
    private javax.swing.JLabel lsec21;
    private javax.swing.JLabel lsec22;
    private javax.swing.JLabel lsec23;
    private javax.swing.JLabel lsec24;
    private javax.swing.JLabel lsec25;
    private javax.swing.JLabel lsec26;
    private javax.swing.JLabel lsec27;
    private javax.swing.JLabel lsec28;
    private javax.swing.JLabel lsec29;
    private javax.swing.JLabel lsec3;
    private javax.swing.JLabel lsec30;
    private javax.swing.JLabel lsec4;
    private javax.swing.JLabel lsec5;
    private javax.swing.JLabel lsec6;
    private javax.swing.JLabel lsec7;
    private javax.swing.JLabel lsec8;
    private javax.swing.JLabel lsec9;
    private javax.swing.JLabel lusernam;
    private javax.swing.JLabel lusernam1;
    private javax.swing.JLabel nameadmin;
    private javax.swing.JLabel nameadmin1;
    private javax.swing.JLabel nameadmin2;
    private javax.swing.JLabel nameadmin3;
    private javax.swing.JLabel nameadmin4;
    private javax.swing.JLabel nameadmin5;
    private javax.swing.JLabel nameadmin6;
    private javax.swing.JLabel nameadmin7;
    private javax.swing.JLabel nameadmin8;
    private javax.swing.JMenu newregister;
    private javax.swing.JLabel nextpage2;
    private javax.swing.JLabel nextpage3;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p10;
    private javax.swing.JLabel p11;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p8;
    private javax.swing.JLabel p9;
    private javax.swing.JLabel photo1;
    private javax.swing.JLabel photo10;
    private javax.swing.JLabel photo11;
    private javax.swing.JLabel photo12;
    private javax.swing.JLabel photo13;
    private javax.swing.JLabel photo14;
    private javax.swing.JLabel photo15;
    private javax.swing.JLabel photo16;
    private javax.swing.JLabel photo17;
    private javax.swing.JLabel photo18;
    private javax.swing.JLabel photo19;
    private javax.swing.JLabel photo2;
    private javax.swing.JLabel photo20;
    private javax.swing.JLabel photo21;
    private javax.swing.JLabel photo22;
    private javax.swing.JLabel photo23;
    private javax.swing.JLabel photo24;
    private javax.swing.JLabel photo25;
    private javax.swing.JLabel photo26;
    private javax.swing.JLabel photo27;
    private javax.swing.JLabel photo28;
    private javax.swing.JLabel photo29;
    private javax.swing.JLabel photo3;
    private javax.swing.JLabel photo30;
    private javax.swing.JLabel photo4;
    private javax.swing.JLabel photo5;
    private javax.swing.JLabel photo6;
    private javax.swing.JLabel photo7;
    private javax.swing.JLabel photo8;
    private javax.swing.JLabel photo9;
    private javax.swing.JButton print;
    private javax.swing.JPanel regisID;
    private javax.swing.JMenu registerID;
    private javax.swing.JMenu registpayment;
    private javax.swing.JMenu selectupdatedelete;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status10;
    private javax.swing.JLabel status11;
    private javax.swing.JLabel status12;
    private javax.swing.JLabel status13;
    private javax.swing.JLabel status14;
    private javax.swing.JLabel status15;
    private javax.swing.JLabel status16;
    private javax.swing.JLabel status17;
    private javax.swing.JLabel status18;
    private javax.swing.JLabel status19;
    private javax.swing.JLabel status2;
    private javax.swing.JLabel status20;
    private javax.swing.JLabel status21;
    private javax.swing.JLabel status22;
    private javax.swing.JLabel status23;
    private javax.swing.JLabel status24;
    private javax.swing.JLabel status25;
    private javax.swing.JLabel status26;
    private javax.swing.JLabel status27;
    private javax.swing.JLabel status28;
    private javax.swing.JLabel status29;
    private javax.swing.JLabel status3;
    private javax.swing.JLabel status30;
    private javax.swing.JLabel status4;
    private javax.swing.JLabel status5;
    private javax.swing.JLabel status6;
    private javax.swing.JLabel status7;
    private javax.swing.JLabel status8;
    private javax.swing.JLabel status9;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t12;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t9;
    private javax.swing.JTextField tage;
    private javax.swing.JTextField tcustomerID;
    private javax.swing.JTextField tcustomerID1;
    private javax.swing.JTextField temail;
    private javax.swing.JLabel textname;
    private javax.swing.JButton timepage1;
    private javax.swing.JButton timepage2;
    private javax.swing.JButton timepage3;
    private javax.swing.JTextField tlastname;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField tpassword;
    private javax.swing.JTextField tpassword1;
    private javax.swing.JButton transfer1;
    private javax.swing.JButton transfer10;
    private javax.swing.JButton transfer11;
    private javax.swing.JButton transfer12;
    private javax.swing.JButton transfer13;
    private javax.swing.JButton transfer14;
    private javax.swing.JButton transfer15;
    private javax.swing.JButton transfer16;
    private javax.swing.JButton transfer17;
    private javax.swing.JButton transfer18;
    private javax.swing.JButton transfer19;
    private javax.swing.JButton transfer2;
    private javax.swing.JButton transfer20;
    private javax.swing.JButton transfer21;
    private javax.swing.JButton transfer22;
    private javax.swing.JButton transfer23;
    private javax.swing.JButton transfer24;
    private javax.swing.JButton transfer25;
    private javax.swing.JButton transfer26;
    private javax.swing.JButton transfer27;
    private javax.swing.JButton transfer28;
    private javax.swing.JButton transfer29;
    private javax.swing.JButton transfer3;
    private javax.swing.JButton transfer30;
    private javax.swing.JButton transfer4;
    private javax.swing.JButton transfer5;
    private javax.swing.JButton transfer6;
    private javax.swing.JButton transfer7;
    private javax.swing.JButton transfer8;
    private javax.swing.JButton transfer9;
    private javax.swing.JTextField ttel;
    private javax.swing.JTextField tusername;
    private javax.swing.JTextField tusername1;
    private javax.swing.JTextField update1;
    private javax.swing.JTextField update10;
    private javax.swing.JTextField update11;
    private javax.swing.JTextField update2;
    private javax.swing.JTextField update3;
    private javax.swing.JTextField update4;
    private javax.swing.JTextField update5;
    private javax.swing.JTextField update6;
    private javax.swing.JTextField update7;
    private javax.swing.JTextField update8;
    private javax.swing.JTextArea update9;
    private javax.swing.JButton updatedata;
    private javax.swing.JLabel สมัครสมาชิก;
    private javax.swing.JLabel สมัครสมาชิก1;
    // End of variables declaration//GEN-END:variables
private CardLayout c1;
}
