import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {
Scanner sc = new Scanner(System.in);
    void insertStudentData() throws ClassNotFoundException,SQLException
    {
        System.out.print("Enter Roll No Of Student : ");
        int r=sc.nextInt();
        System.out.print("Enter Enrollment Number of Student :");
        double e =sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Batch Of Student : ");
        String b =sc.nextLine();
        System.out.print("Enter Name of the Student : ");
        String n=sc.nextLine();
        System.out.print("Enter Department of Student :");
        String d=sc.nextLine();
        System.out.print("Enter Branch of Student : ");
        String b1 = sc.nextLine();
        System.out.print("Enter Marks Obtained In Java : ");
        double jm=sc.nextDouble();
        System.out.print("Enter Marks Obtained In DS : ");
        double ds=sc.nextDouble();
        System.out.print("Enter Marks Obtained In DBMS : ");
        double db=sc.nextDouble();
        System.out.print("Enter Marks Obtained In Maths : ");
        double ma=sc.nextDouble();
        System.out.print("Enter Marks Obtained In FEE : ");
        double fe=sc.nextDouble();
        double se2=jm+ds+db+ma+fe;
        System.out.print("Enter Sem I Total Marks Obtained By student : ");
        double se1=sc.nextDouble();
        System.out.print("Enter Rank Of Student Obtained By Branch : ");
        int r1=sc.nextInt();
        new Conn();
        Statement st = Conn.getCon().createStatement();

        String sql = "insert into Student_record values ("+r+","+e+",'"+b+"','"+n+"','"+d+"','"+b1+"',"+jm+","+ds+","+db+","+ma+","+fe+","+se2+","+se1+","+r1+")";
        int i =st.executeUpdate(sql);
        if(i>0)
        {
            System.out.println("Insertion SuccesFully...");
        }
        else
        {
            System.out.println("Not Inserted...");
        }
    }
    void insertNStudentData() throws ClassNotFoundException,SQLException
    {
        System.out.println("Enter How Many Student Data You Want to Add ?");
        int ch=sc.nextInt();
        for (int j = 1; j <=ch; j++) {
        System.out.print("Enter Roll No Of Student : ");
        int r=sc.nextInt();
        System.out.print("Enter Enrollment Number of Student :");
        double e =sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter Batch Of Student : ");
        String b =sc.nextLine();
        System.out.print("Enter Name of the Student : ");
        String n=sc.nextLine();
        System.out.print("Enter Department of Student :");
        String d=sc.nextLine();
        System.out.print("Enter Branch of Student : ");
        String b1 = sc.nextLine();
        System.out.print("Enter Marks Obtained In Java : ");
        double jm=sc.nextDouble();
        System.out.print("Enter Marks Obtained In DS : ");
        double ds=sc.nextDouble();
        System.out.print("Enter Marks Obtained In DBMS : ");
        double db=sc.nextDouble();
        System.out.print("Enter Marks Obtained In Maths : ");
        double ma=sc.nextDouble();
        System.out.print("Enter Marks Obtained In FEE : ");
        double fe=sc.nextDouble();
        double se2=jm+ds+db+ma+fe;
        System.out.print("Enter Sem I Total Marks Obtained By student : ");
        double se1=sc.nextDouble();
        System.out.print("Enter Rank Of Student Obtained By Branch : ");
        int r1=sc.nextInt();
        new Conn();
        Statement st = Conn.getCon().createStatement();

        String sql = "insert into Student_record values ("+r+","+e+",'"+b+"','"+n+"','"+d+"','"+b1+"',"+jm+","+ds+","+db+","+ma+","+fe+","+se2+","+se1+","+r1+")";
        int i =st.executeUpdate(sql);
        if(i>0)
        {
            System.out.println("Insertion SuccesFully...");
        }
        else
        {
            System.out.println("Not Inserted...");
        }
    }
    }
    void deleteDataByRollNo() throws ClassNotFoundException,SQLException
    {
        new Conn();
        Statement st =Conn.getCon().createStatement();
        System.out.print("Enter Roll No which Data you Want to Delete : ");
        int ch=sc.nextInt();
        String sql ="Delete From student_record where Roll_No = "+ch+" ";
        int i =st.executeUpdate(sql);
        if(i>0)
        {
            System.out.println("Roll No : "+ch+" data are Deleted From Database.");
        }
        else
        {
            System.out.println("Error... While Deleteing Data of Roll No : "+ch+" .");
        }

    }
    void deleteDataByEnrollmentNo() throws ClassNotFoundException,SQLException
    {
        new Conn();
        Statement st =Conn.getCon().createStatement();
        System.out.print("Enter Enrollment No which Data you Want to Delete : ");
        double ch=sc.nextDouble();
        String sql ="Delete From student_record where Enrollment_Number="+ch+"";
        int i =st.executeUpdate(sql);
        if(i>0)
        {
            System.out.println("Enrollment No : "+ch+" data are Deleted From Database.");
        }
        else
        {
            System.out.println("Error... While Deleteing Data of Enrollment No : "+ch+" .");
        }

    }
    void updateNameByRoll() throws ClassNotFoundException,SQLException
    {
        new Conn();
        String sql ="update student_record set student_Name =? where Roll_No=?";
        PreparedStatement pst = Conn.getCon().prepareStatement(sql);
        System.out.print("Enter Roll Number Student whose Name you would to Updated : ");
        int n =sc.nextInt();
        System.out.println("Enter New Name of Student : ");
        String s=sc.next();
        pst.setInt(2, n);
        pst.setString(1, s);
        int i =pst.executeUpdate();
        if(i>0)
        {
            System.out.println("Updated SuccessFully.\nUpdate Name : "+s+" of Roll Number : "+n+" .");
        }
        else
        {
            System.out.println("Error... While Updating Name Of Roll No : "+n+" .");
        }

    }
    void updateBBByRoll() throws ClassNotFoundException,SQLException
    {
        new Conn();
        String sql ="update student_record set Batch=?,Branch =? where Roll_No=?";
        PreparedStatement pst = Conn.getCon().prepareStatement(sql);
        System.out.print("Enter Roll Number Student whose Name you would to Updated : ");
        int n =sc.nextInt();
        System.out.print("Enter New Batch of Student : ");
        String s=sc.next();
        System.out.print("Enter New Branch Of Student : ");
        String s1 =sc.next();
        pst.setString(1, s);
        pst.setString(2, s1);
        pst.setInt(3, n);
        int i =pst.executeUpdate();
        if(i>0)
        {
            System.out.println("Updated SuccessFully .");
        }
        else
        {
            System.out.println("Error... While Updating Branch and Batch Of Roll No : "+n+" .");
        }

    }
    void updateSemIMarkByRoll() throws ClassNotFoundException,SQLException
    {
        new Conn();
       String sql ="update student_record set Sem_I_Total = ? where Roll_No=?";
        PreparedStatement pst = Conn.getCon().prepareStatement(sql);
        System.out.print("Enter Roll Number of Student whose Sem-I Marks you would to Updated : ");
        int n =sc.nextInt();
        System.out.println("Enter Total Marks Obtaines by Student in SEM_I : ");
        double s=sc.nextDouble();
        pst.setDouble(1, s);
        pst.setInt(2, n);
        int i =pst.executeUpdate();
        if(i>0)
        {
            System.out.println("Updated SuccessFully.\nUpdate Name : "+s+" of Roll Number : "+n+" .");
        }
        else
        {
            System.out.println("Error... While Updating Name Of Roll No : "+n+" .");
        }

    }
    void updateSemIIMarkByRoll() throws ClassNotFoundException,SQLException
    {
        new Conn();
        String sql ="update student_record set Java_Total = ?,Ds_Total=?,DBMS_Total=?,Mathematics_Total=?,Fee_Total=?,Sem_II_Total=? where Roll_No=?";
        PreparedStatement pst = Conn.getCon().prepareStatement(sql);
        System.out.print("Enter Roll Number Student whose Sem-II Marks you would to Updated : ");
        int n =sc.nextInt();
       System.out.print("Enter New Marks Obtained In Java : ");
        double jm=sc.nextDouble();
        System.out.print("Enter New Marks Obtained In DS : ");
        double ds=sc.nextDouble();
        System.out.print("Enter New Marks Obtained In DBMS : ");
        double db=sc.nextDouble();
        System.out.print("Enter New Marks Obtained In Maths : ");
        double ma=sc.nextDouble();
        System.out.print("EntercNew Marks Obtained In FEE : ");
        double fe=sc.nextDouble();
        double se2=jm+ds+db+ma+fe;
        pst.setDouble(1, jm);
        pst.setDouble(2, ds);
        pst.setDouble(3, db);
        pst.setDouble(4, ma);
        pst.setDouble(5, fe);
        pst.setDouble(6, se2);
        pst.setInt(7, n);
        int i =pst.executeUpdate();
        if(i>0)
        {
            System.out.println("Updated SuccessFully.");
        }
        else
        {
            System.out.println("Error... While Updating Sem-II Marks Of Roll No : "+n+" .");
        }

    }
    void maxSem1() throws SQLException,ClassNotFoundException
    {
        // new Conn();
        // String sql="Select * from student order by Sem_I_Total Desc Limit 10)";
        // PreparedStatement cst =Conn.getCon().prepareStatement(sql);
        // ResultSet rs=cst.executeQuery();
         new Conn();
        String sql="{call getMaxMarkInSemI()}";
        CallableStatement cst =Conn.getCon().prepareCall(sql);
        ResultSet rs=cst.executeQuery();
        while (rs.next()) {
             System.out.println("Roll No of Student : "+rs.getInt(1));
             System.out.println("Name of Student : "+rs.getString(2));
              System.out.println("Total Marks obtained by Student in Sem-I : "+rs.getDouble(3));
              System.out.println();
        }
    }
    void maxSem2() throws SQLException,ClassNotFoundException
    {
        new Conn();
        String sql="{call getMaxMarkInSemII()}";
        CallableStatement cst =Conn.getCon().prepareCall(sql);
        ResultSet rs=cst.executeQuery();
        while (rs.next()) {
             System.out.println("Roll No of Student : "+rs.getInt(1));
             System.out.println("Name of Student : "+rs.getString(2));
              System.out.println("Total Marks obtained by Student in Sem-I : "+rs.getDouble(3));
              System.out.println();
        }

    }
    
    void displayAllData() throws ClassNotFoundException,SQLException
    {
        new Conn();
        String sql="{call getStudentData()}";
        CallableStatement cst =Conn.getCon().prepareCall(sql);
        ResultSet rs=cst.executeQuery();
        while (rs.next()) {
        System.out.println("Roll No of Student : "+rs.getInt(1));
        System.out.println("Enrollment number of Student : "+rs.getDouble(2));
        System.out.println("Batch of Student : "+rs.getString(3));
        System.out.println("Name of Student : "+rs.getString(4));
        System.out.println("Department Of Student : "+rs.getString(5));
        System.out.println("Branch Of Student : "+rs.getString(6));
        System.out.println("Marks obtained by Student in Java : "+rs.getDouble(7));
        System.out.println("Marks obtained by Student in Ds : "+rs.getDouble(8)); 
        System.out.println("Marks obtained by Student in DBMS : "+rs.getDouble(9));
        System.out.println("Marks obtained by Student in Maths : "+rs.getDouble(10));
        System.out.println("Marks obtained by Student in FEE : "+rs.getDouble(11));
        System.out.println("Total Marks obtained by Student in Sem-II : "+rs.getDouble(12));
        System.out.println("Total Marks obtained by Student in Sem-I : "+rs.getDouble(13));
        System.out.println("Branch Rank Obtained By Student : "+rs.getInt(14));
        System.out.println();
        
        }
    }
    void displayDataByRoll() throws ClassNotFoundException,SQLException
    {
        new Conn();
        String sql="{call getStudentDataById(?)}";
        CallableStatement cst =Conn.getCon().prepareCall(sql);
        System.out.print("Enter Roll Number Whose Data You want to  display : ");
        int n=sc.nextInt();
        cst.setInt(1,n);
        ResultSet rs=cst.executeQuery();
        while (rs.next()) {
        System.out.println("Roll No of Student : "+rs.getInt(1));
        System.out.println("Enrollment number of Student : "+rs.getDouble(2));
        System.out.println("Batch of Student : "+rs.getString(3));
        System.out.println("Name of Student : "+rs.getString(4));
        System.out.println("Department Of Student : "+rs.getString(5));
        System.out.println("Branch Of Student : "+rs.getString(6));
        System.out.println("Marks obtained by Student in Java : "+rs.getDouble(7));
        System.out.println("Marks obtained by Student in Ds : "+rs.getDouble(8)); 
        System.out.println("Marks obtained by Student in DBMS : "+rs.getDouble(9));
        System.out.println("Marks obtained by Student in Maths : "+rs.getDouble(10));
        System.out.println("Marks obtained by Student in FEE : "+rs.getDouble(11));
        System.out.println("Total Marks obtained by Student in Sem-II : "+rs.getDouble(12));
        System.out.println("Total Marks obtained by Student in Sem-I : "+rs.getDouble(13));
        System.out.println("Branch Rank Obtained By Student : "+rs.getInt(14));
        System.out.println();
        
        }
    }
    void displayDataByEnroll() throws ClassNotFoundException,SQLException
    {
        new Conn();
        String sql="{call getStudentDataByEn(?)}";
        CallableStatement cst =Conn.getCon().prepareCall(sql);
        System.out.print("Enter Enrollment Number Whose Data You want to  display : ");
        double n=sc.nextDouble();
        cst.setDouble(1, n);
        ResultSet rs=cst.executeQuery();
        while (rs.next()) {
        System.out.println("Roll No of Student : "+rs.getInt(1));
        System.out.println("Enrollment number of Student : "+rs.getDouble(2));
        System.out.println("Batch of Student : "+rs.getString(3));
        System.out.println("Name of Student : "+rs.getString(4));
        System.out.println("Department Of Student : "+rs.getString(5));
        System.out.println("Branch Of Student : "+rs.getString(6));
        System.out.println("Marks obtained by Student in Java : "+rs.getDouble(7));
        System.out.println("Marks obtained by Student in Ds : "+rs.getDouble(8)); 
        System.out.println("Marks obtained by Student in DBMS : "+rs.getDouble(9));
        System.out.println("Marks obtained by Student in Maths : "+rs.getDouble(10));
        System.out.println("Marks obtained by Student in FEE : "+rs.getDouble(11));
        System.out.println("Total Marks obtained by Student in Sem-II : "+rs.getDouble(12));
        System.out.println("Total Marks obtained by Student in Sem-I : "+rs.getDouble(13));
        System.out.println("Branch Rank Obtained By Student : "+rs.getInt(14));
        System.out.println();
        
        }
    }
    void insertData() throws ClassNotFoundException,SQLException
    {
        while(true)
        {
            System.out.println("1. Insert a data oF student.");
            System.out.println("2. Insert N number of Student Data.");
            System.out.println("3. Exit");
            System.out.print("Enter Your Choice : ");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    insertStudentData();
                    break;
                case 2:
                    insertNStudentData();
                    break;
                case 3 :
                    return;
                default:
                    System.out.println("Enter A Valid Choice !!.");
                    break;
            }
        }
    }
    void deleteData() throws ClassNotFoundException,SQLException
    {
        while(true)
        {
            System.out.println("1. Delete Data By Roll No.");
            System.out.println("2. Delete Data by Enrollment No");
            System.out.println("3. Exit.");
            System.out.print("Enter Your Choice : ");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    deleteDataByRollNo();
                    break;
                case 2 :
                    deleteDataByEnrollmentNo();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Enter A valid Choice ....");
                    break;
            }
        }
    }
    void updateData() throws SQLException,ClassNotFoundException
    {
        while (true)
        {
        System.out.println("1. Update the Name by Roll Number.");
        System.out.println("2. Update Batch And Branch By Roll Number.");
        System.out.println("3. Update Sem-I Marks by Roll Number.");
        System.out.println("4. Update Sem-II Marks By Roll Number.");
        System.out.println("5. Exit");
        System.out.print("Enter Your Choice : ");
        int choice =sc.nextInt();
        switch (choice) {
            case 1:
                updateNameByRoll();
                break;
            case 2 :
                updateBBByRoll();
                break;
            case 3 :
                updateSemIMarkByRoll();
                break;
            case 4 :
                updateSemIIMarkByRoll();
                break;
            case 5 :

                return;
        
            default:
            System.out.println("Enter A Valid Choice...");
                break;
        }
    }
    }
    void displayData() throws ClassNotFoundException, SQLException
    {
        while(true)
        {
            System.out.println("1. Display a data oF student by Roll Number.");
            System.out.println("2. Display a data oF student by Enrollment Number.");
            System.out.println("3. Display record of all Student Present in DataBAse.");
            System.out.println("4. Exit");
            System.out.print("Enter Your Choice : ");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    displayDataByRoll();
                    break;
                case 2:
                    displayDataByEnroll();
                    break;
                case 3:
                    displayAllData();
                    break;
                case 4 :
                    return;
                default:
                    System.out.println("Enter A Valid Choice !!.");
                    break;
            }
        }
    }
    void extraData() throws SQLException,ClassNotFoundException
    {
        while(true)
        {
            System.out.println("1. Name of student Obtained Maximum Mark in Sem-I");
            System.out.println("2. Name of student Obtained Maximum Mark in Sem-II");
            System.out.println("3. Exit");
            System.out.println("Enter Your choice : ");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    maxSem1();
                    break;
                case 2 :
                    maxSem2();
                    break;
                case 3 :
                    return;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        App A = new App();
        // new Conn();
        // Statement st = Conn.getCon().createStatement();
        // String sql = "Delete from Student_record where roll_no=125";
        // //Step 4 : Execute Query
        // int i =st.executeUpdate(sql);
        // if(i>0)
        // {
        //     System.out.println("Insertion Succesfully..");
        // }
        // else
        // {
        //     System.out.println("Not Inserted..");
        // }
        while(true)
        {
            System.out.println("Welcome To LJ DataBase System");
            System.out.println("1. Insert Data.");
            System.out.println("2. Delete Data.");
            System.out.println("3. Update Data.");
            System.out.println("4. Display Data.");
            System.out.println("5. Extra");
            System.out.println("6. Exit From DataBase.");
            System.out.print("Enter Your Choice : ");
            int choice =sc.nextInt();
            switch (choice) {
                case 1:
                    A.insertData();
                    break;
                case 2 :
                A.deleteData();
                    break;
                case 3 :
                    A.updateData();
                    break;
                case 4 :
                    A.displayData();
                    break;
                case 5 :
                    A.extraData();
                    break;
                case 6 :
                System.out.println("LJ UNIVERSITY DataBase LogOut ! ");
                System.exit(0);
                    break;
            
                default:
                    break;
            }
        }
        
    }
}
