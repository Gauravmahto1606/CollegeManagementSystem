import java.sql.*;
import java.util.Scanner;

public class Method {
    Scanner scanner = new Scanner(System.in);

    // Insertion Method of one student Data
    void insertStudentData() throws ClassNotFoundException, SQLException {
        try {
            // Taking Student data From Authorised Person.
            System.out
                    .println("                           Entering Data Of a Student                                 ");
            System.out.print("Enter Roll No Of Student : ");
            String convert_to_Int = scanner.nextLine();
            int roll = Integer.parseInt(convert_to_Int);

            System.out.print("Enter Enrollment Number of Student :");
            String convert_to_long = scanner.nextLine();
            Long enrollment = Long.parseLong(convert_to_long);

            System.out.print("Enter Batch Of Student : ");
            String batch = scanner.nextLine();

            System.out.print("Enter Name of the Student : ");
            String name = scanner.nextLine();

            System.out.print("Enter Department of Student :");
            String department = scanner.nextLine();

            System.out.print("Enter Branch of Student : ");
            String branch = scanner.nextLine();

            System.out.print("Enter Marks Obtained In Java : ");
            String convert_to_double1 = scanner.nextLine();
            double java_mark = Double.parseDouble(convert_to_double1);

            System.out.print("Enter Marks Obtained In DS : ");
            String convert_to_double2 = scanner.nextLine();
            double ds_Marks = Double.parseDouble(convert_to_double2);

            System.out.print("Enter Marks Obtained In DBMS : ");
            String convert_to_double3 = scanner.nextLine();
            double dbms_marks = Double.parseDouble(convert_to_double3);

            System.out.print("Enter Marks Obtained In Maths : ");
            String convert_to_double4 = scanner.nextLine();
            double maths_marks = Double.parseDouble(convert_to_double4);

            System.out.print("Enter Marks Obtained In FEE : ");
            String convert_to_double5 = scanner.nextLine();
            double fee_marks = Double.parseDouble(convert_to_double5);

            double sem_II_total = java_mark + ds_Marks + dbms_marks + maths_marks + fee_marks;

            System.out.print("Enter Sem I Total Marks Obtained By student : ");
            String convert_to_double6 = scanner.nextLine();
            double sem_I_total = Double.parseDouble(convert_to_double6);

            System.out.print("Enter Rank Of Student Obtained By Branch : ");
            String convert_to_Int1 = scanner.nextLine();
            int branch_rank = Integer.parseInt(convert_to_Int1);

            Statement st = Conn.getCon().createStatement();

            // Insertion Query
            String sql = "insert into Student_record values (" + roll + "," + enrollment + ",'" + batch + "','" + name
                    + "','" + department + "','" + branch + "',"
                    + java_mark + "," + ds_Marks + "," + dbms_marks + "," + maths_marks + "," + fee_marks + ","
                    + sem_II_total + "," + sem_I_total + "," + branch_rank + ")";

            int i = st.executeUpdate(sql);// Executing the Sql Query.
            if (i > 0) {
                System.out.println("Insertion SuccesFully...");
            } else {
                System.out.println("Not Inserted...");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    void insertNStudentData() throws ClassNotFoundException, SQLException {
        try {
            // Taking Student data From Authorised Person.
            System.out.print("Enter How Many Student Data You Want to Add :");
            // Logic of adding data for more than one Student.
            String choice = scanner.nextLine();
            int ch = Integer.parseInt(choice);

            for (int j = 1; j <= ch; j++) {
                System.out.println("Enter Data of Student-" + j + " .");

                System.out.print("Enter Roll No Of Student : ");
                String convert_to_Int = scanner.nextLine();
                int roll = Integer.parseInt(convert_to_Int);

                System.out.print("Enter Enrollment Number of Student :");
                String convert_to_long = scanner.nextLine();
                Long enrollment = Long.parseLong(convert_to_long);

                System.out.print("Enter Batch Of Student : ");
                String batch = scanner.nextLine();

                System.out.print("Enter Name of the Student : ");
                String name = scanner.nextLine();

                System.out.print("Enter Department of Student :");
                String department = scanner.nextLine();

                System.out.print("Enter Branch of Student : ");
                String branch = scanner.nextLine();

                System.out.print("Enter Marks Obtained In Java : ");
                String convert_to_double1 = scanner.nextLine();
                double java_mark = Double.parseDouble(convert_to_double1);

                System.out.print("Enter Marks Obtained In DS : ");
                String convert_to_double2 = scanner.nextLine();
                double ds_Marks = Double.parseDouble(convert_to_double2);

                System.out.print("Enter Marks Obtained In DBMS : ");
                String convert_to_double3 = scanner.nextLine();
                double dbms_marks = Double.parseDouble(convert_to_double3);

                System.out.print("Enter Marks Obtained In Maths : ");
                String convert_to_double4 = scanner.nextLine();
                double maths_marks = Double.parseDouble(convert_to_double4);

                System.out.print("Enter Marks Obtained In FEE : ");
                String convert_to_double5 = scanner.nextLine();
                double fee_marks = Double.parseDouble(convert_to_double5);

                double sem_II_total = java_mark + ds_Marks + dbms_marks + maths_marks + fee_marks;

                System.out.print("Enter Sem I Total Marks Obtained By student : ");
                String convert_to_double6 = scanner.nextLine();
                double sem_I_total = Double.parseDouble(convert_to_double6);

                System.out.print("Enter Rank Of Student Obtained By Branch : ");
                String convert_to_Int1 = scanner.nextLine();
                int branch_rank = Integer.parseInt(convert_to_Int1);

                Statement st = Conn.getCon().createStatement();

                // Insertion Query
                String sql = "insert into Student_record values (" + roll + "," + enrollment + ",'" + batch + "','"
                        + name + "','" + department + "','" + branch + "',"
                        + java_mark + "," + ds_Marks + "," + dbms_marks + "," + maths_marks + "," + fee_marks + ","
                        + sem_II_total + "," + sem_I_total + "," + branch_rank + ")";

                int i = st.executeUpdate(sql);// Excetuing the Query
                if (i > 0) {
                    System.out.println("Insertion SuccesFully...");
                } else {
                    System.out.println("Not Inserted...");
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    void deleteDataByRollNo() throws ClassNotFoundException, SQLException {
        Statement st = Conn.getCon().createStatement();
        try {
            System.out.print("Enter Roll No which Data you Want to Delete : ");
            String convert_to_Int = scanner.nextLine();
            int roll = Integer.parseInt(convert_to_Int);

            // Deletion Query
            String sql = "Delete From student_record where Roll_No = " + roll + ";";

            int i = st.executeUpdate(sql);// Executing the Sql Query.
            if (i > 0) {
                System.out.println("Roll No : " + roll + " data are Deleted From Database.");
            } else {
                // System.out.println("Error... While Deleteing Data of Roll No : "+roll+" .");
                System.out.println("Roll No : " + roll + " not found in DataBase.");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    void deleteDataByEnrollmentNo() throws ClassNotFoundException, SQLException {

        Statement st = Conn.getCon().createStatement();
        try {
            System.out.print("Enter Enrollment No which Data you Want to Delete : ");
            String convert_to_long = scanner.nextLine();
            Long enrollment = Long.parseLong(convert_to_long);

            // Deletion Query.
            String sql = "Delete From student_record where Enrollment_Number=" + enrollment + ";";

            int i = st.executeUpdate(sql);// Executing the Sql Query.

            if (i > 0) {
                System.out.println("Enrollment No : " + enrollment + " data are Deleted From Database.");
            } else {
                // System.out.println("Error... While Deleteing Data of Enrollment No :
                // "+enrollment+" .");
                System.out.println("Enrollment No : " + enrollment + " not found in DataBase.");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    void updateNameByRoll() throws ClassNotFoundException, SQLException {
        // Update Query.
        String sql = "update student_record set student_Name =? where Roll_No=?";

        // Prepared Statement
        PreparedStatement pst = Conn.getCon().prepareStatement(sql);
        try {
            System.out.print("Enter Roll Number Student whose Name you would to Updated : ");
            String convert_to_int = scanner.nextLine();
            int roll = Integer.parseInt(convert_to_int);

            System.out.print("Enter New Name of Student : ");
            String new_Name = scanner.nextLine();

            // Giving value to the Query.
            pst.setString(1, new_Name);
            pst.setInt(2, roll);

            int i = pst.executeUpdate();// Executing the Sql Query.
            if (i > 0) {
                System.out.println(
                        "Updated SuccessFully.\nUpdate Name : " + new_Name + " of Roll Number : " + roll + ".");
            } else {
                // System.out.println("Error... While Updating Name Of Roll No : "+roll+" .");
                System.out.println("Roll No : " + roll + " not found in DataBase.");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }

    void updateBBByRoll() throws ClassNotFoundException, SQLException {
        // Update Sql query.
        String sql = "update student_record set Batch=?,Branch =? where Roll_No=?";

        PreparedStatement pst = Conn.getCon().prepareStatement(sql);
        try {
            System.out.print("Enter Roll Number Student whose Name you would to Updated : ");
            String convert_to_Int = scanner.nextLine();
            int roll = Integer.parseInt(convert_to_Int);

            System.out.print("Enter New Batch of Student : ");
            String new_Batch = scanner.next();

            System.out.print("Enter New Branch Of Student : ");
            String new_Branch = scanner.next();

            // Giving Values to Prepared Statement Query.
            pst.setString(1, new_Batch);
            pst.setString(2, new_Branch);
            pst.setInt(3, roll);

            int i = pst.executeUpdate();// Executing the Sql Query.
            if (i > 0) {
                System.out.println(
                        "Updated SuccessFully.\nUpdate Batch  : " + new_Batch + ". Update Branch : " + new_Branch +
                                "of Roll Number : " + roll + ".");
            } else {
                // System.out.println("Error... While Updating Branch and Batch Of Roll No :
                // "+roll+" .");
                System.out.println("Roll No : " + roll + " not found in DataBase.");

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    void updateSemIMarkByRoll() throws ClassNotFoundException, SQLException {
        // Update Sql Query.
        String sql = "update student_record set Sem_I_Total = ? where Roll_No=?";

        PreparedStatement pst = Conn.getCon().prepareStatement(sql);
        try {
            System.out.print("Enter Roll Number of Student whose Sem-I Marks you would to Updated : ");
            String convert_to_Int = scanner.nextLine();
            int roll = Integer.parseInt(convert_to_Int);

            System.out.print("Enter Total Marks Obtained by Student in SEM_I : ");
            String convert_to_Double = scanner.nextLine();
            double Total_mark = Double.parseDouble(convert_to_Double);

            // Giving Value to prepared Statement Query
            pst.setDouble(1, Total_mark);
            pst.setInt(2, roll);

            int i = pst.executeUpdate();// Executing the Sql Query.
            if (i > 0) {
                System.out.println("Updated SuccessFully.\nUpdate Sem-I Marks : " + Total_mark + " of Roll Number : "
                        + roll + " .");
            } else {
                // System.out.println("Error... While Updating Sem-I Marks Of Roll No : "+roll+"
                // .");
                System.out.println("Roll No : " + roll + " not found in DataBase.");

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    void updateSemIIMarkByRoll() throws ClassNotFoundException, SQLException {
        String sql = "update student_record set Java_Total = ?,Ds_Total=?,DBMS_Total=?,Mathematics_Total=?,Fee_Total=?,Sem_II_Total=? where Roll_No=?";
        PreparedStatement pst = Conn.getCon().prepareStatement(sql);
        try {
            System.out.print("Enter Roll Number Student whose Sem-II Marks you would to Updated : ");
            String convert_to_Int = scanner.nextLine();
            int roll = Integer.parseInt(convert_to_Int);

            System.out.print("Enter New Marks Obtained In Java : ");
            String convert_to_Double = scanner.nextLine();
            double newmark_java = Double.parseDouble(convert_to_Double);

            System.out.print("Enter New Marks Obtained In DS : ");
            String convert_to_Double1 = scanner.nextLine();
            double newmark_Ds = Double.parseDouble(convert_to_Double1);

            System.out.print("Enter New Marks Obtained In DBMS : ");
            String convert_to_Double2 = scanner.nextLine();
            double newmark_Dbms = Double.parseDouble(convert_to_Double2);

            System.out.print("Enter New Marks Obtained In Maths : ");
            String convert_to_Double3 = scanner.nextLine();
            double newmark_Maths = Double.parseDouble(convert_to_Double3);

            System.out.print("EntercNew Marks Obtained In FEE : ");
            String convert_to_Double4 = scanner.nextLine();
            double newmark_Fee = Double.parseDouble(convert_to_Double4);

            double Total_mark = newmark_java + newmark_Ds + newmark_Dbms + newmark_Maths + newmark_Fee;

            // Giving Values to Query
            pst.setDouble(1, newmark_java);
            pst.setDouble(2, newmark_Ds);
            pst.setDouble(3, newmark_Dbms);
            pst.setDouble(4, newmark_Maths);
            pst.setDouble(5, newmark_Fee);
            pst.setDouble(6, Total_mark);
            pst.setInt(7, roll);
            int i = pst.executeUpdate();// Excetuing the Query.
            if (i > 0) {
                System.out.println("Updated SuccessFully.\nUpdate Sem-II Marks : " + Total_mark + " of Roll Number : "
                        + roll + " .");

            } else {
                // System.out.println("Error... While Updating Sem-II Marks Of Roll No :
                // "+roll+" .");
                System.out.println("Roll No : " + roll + " not found in DataBase.");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    void maxSem1() throws SQLException, ClassNotFoundException {
        // Calling prodecure Present in the Database
        String sql = "{call getMaxMarkInSemI()}";

        CallableStatement cst = Conn.getCon().prepareCall(sql);

        ResultSet rs = cst.executeQuery();// Executing the Query
        while (rs.next()) {
            System.out.println("\nRoll No of Student : " + rs.getInt(1));
            System.out.println("Name of Student : " + rs.getString(2));
            System.out.println("Total Marks obtained by Student in Sem-I : " + rs.getDouble(3));
            System.out.println();
        }
    }

    void maxSem2() throws SQLException, ClassNotFoundException {
        // Calling prodecure Present in the Database
        String sql = "{call getMaxMarkInSemII()}";

        CallableStatement cst = Conn.getCon().prepareCall(sql);

        ResultSet rs = cst.executeQuery();// Executing the Query
        while (rs.next()) {
            System.out.println("\nRoll No of Student : " + rs.getInt(1));
            System.out.println("Name of Student : " + rs.getString(2));
            System.out.println("Total Marks obtained by Student in Sem-II : " + rs.getDouble(3));
            System.out.println();
        }

    }

    void displayAllData() throws ClassNotFoundException, SQLException {
        // Calling prodecure Present in the Database
        String sql = "{call getStudentData()}";

        CallableStatement cst = Conn.getCon().prepareCall(sql);

        ResultSet rs = cst.executeQuery();// Executing the Query

        while (rs.next()) {
            System.out.println("\nRoll No of Student : " + rs.getInt(1));
            System.out.println("Enrollment number of Student : " + rs.getLong(2));
            System.out.println("Batch of Student : " + rs.getString(3));
            System.out.println("Name of Student : " + rs.getString(4));
            System.out.println("Department Of Student : " + rs.getString(5));
            System.out.println("Branch Of Student : " + rs.getString(6));
            System.out.println("Marks obtained by Student in Java : " + rs.getDouble(7));
            System.out.println("Marks obtained by Student in Ds : " + rs.getDouble(8));
            System.out.println("Marks obtained by Student in DBMS : " + rs.getDouble(9));
            System.out.println("Marks obtained by Student in Maths : " + rs.getDouble(10));
            System.out.println("Marks obtained by Student in FEE : " + rs.getDouble(11));
            System.out.println("Total Marks obtained by Student in Sem-II : " + rs.getDouble(12));
            System.out.println("Total Marks obtained by Student in Sem-I : " + rs.getDouble(13));
            System.out.println("Branch Rank Obtained By Student : " + rs.getInt(14));
            System.out.println();

        }

    }

    void displayDataByRoll() throws ClassNotFoundException, SQLException {
        // Calling prodecure Present in the Database
        String sql = "{call getStudentDataById(?)}";

        CallableStatement cst = Conn.getCon().prepareCall(sql);

        System.out.print("Enter Roll Number Whose Data You want to  display : ");
        try {
            String input = scanner.nextLine();
            int roll = Integer.parseInt(input);

            // Giving values to Query.
            cst.setInt(1, roll);
            ResultSet rs = cst.executeQuery();// Executing the Query
            int rollfound = 0;
            while (rs.next()) {
                System.out.println("\nRoll No of Student : " + rs.getInt(1));
                System.out.println("Enrollment number of Student : " + rs.getLong(2));
                System.out.println("Batch of Student : " + rs.getString(3));
                System.out.println("Name of Student : " + rs.getString(4));
                System.out.println("Department Of Student : " + rs.getString(5));
                System.out.println("Branch Of Student : " + rs.getString(6));
                System.out.println("Marks obtained by Student in Java : " + rs.getDouble(7));
                System.out.println("Marks obtained by Student in Ds : " + rs.getDouble(8));
                System.out.println("Marks obtained by Student in DBMS : " + rs.getDouble(9));
                System.out.println("Marks obtained by Student in Maths : " + rs.getDouble(10));
                System.out.println("Marks obtained by Student in FEE : " + rs.getDouble(11));
                System.out.println("Total Marks obtained by Student in Sem-II : " + rs.getDouble(12));
                System.out.println("Total Marks obtained by Student in Sem-I : " + rs.getDouble(13));
                System.out.println("Branch Rank Obtained By Student : " + rs.getInt(14));
                System.out.println();
                rollfound++;

            }
            if (rollfound == 0) {
                System.out.println();
                System.out.println("Roll No : " + roll + " not found in DataBase.");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }

    void displayDataByEnroll() throws ClassNotFoundException, SQLException {
        // Calling Prodecure Make in Mysql
        String sql = "{call getStudentDataByEn(?)}";
        CallableStatement cst = Conn.getCon().prepareCall(sql);

        System.out.print("Enter Enrollment Number Whose Data You want to  display : ");
        try {
            String convert_to_long = scanner.nextLine();
            Long enrollment = Long.parseLong(convert_to_long);

            // Giving Values to Sql Query.
            cst.setLong(1, enrollment);
            ResultSet rs = cst.executeQuery();// Executing the Query
            int enrollmentfound = 0;
            while (rs.next()) {
                System.out.println("\nRoll No of Student : " + rs.getInt(1));
                System.out.println("Enrollment number of Student : " + rs.getLong(2));
                System.out.println("Batch of Student : " + rs.getString(3));
                System.out.println("Name of Student : " + rs.getString(4));
                System.out.println("Department Of Student : " + rs.getString(5));
                System.out.println("Branch Of Student : " + rs.getString(6));
                System.out.println("Marks obtained by Student in Java : " + rs.getDouble(7));
                System.out.println("Marks obtained by Student in Ds : " + rs.getDouble(8));
                System.out.println("Marks obtained by Student in DBMS : " + rs.getDouble(9));
                System.out.println("Marks obtained by Student in Maths : " + rs.getDouble(10));
                System.out.println("Marks obtained by Student in FEE : " + rs.getDouble(11));
                System.out.println("Total Marks obtained by Student in Sem-II : " + rs.getDouble(12));
                System.out.println("Total Marks obtained by Student in Sem-I : " + rs.getDouble(13));
                System.out.println("Branch Rank Obtained By Student : " + rs.getInt(14));
                System.out.println();
                enrollmentfound++;

            }
            if (enrollmentfound == 0) {
                System.out.println();
                System.out.println("Enrollment No : " + enrollment + " not found in DataBase.");
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
