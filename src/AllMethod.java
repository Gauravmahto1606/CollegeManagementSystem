import java.sql.*;
import java.util.Scanner;

public class AllMethod {
    Scanner scanner = new Scanner(System.in);// Created a object of Scanner Class
    Method callingMethod = new Method();//Created object of Method class to call Method present in that class.
    void insertData() throws ClassNotFoundException,SQLException
    {
        while(true)
        {
            System.out.println("\n                               Menu :                                             ");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("1. Insert a data oF student.");
            System.out.println("2. Insert N number of Student Data.");
            System.out.println("3. Return to Main Menu.");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.print("Enter Your Choice : ");
            try {
                 String input = scanner.nextLine();
                int choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    callingMethod.insertStudentData();//Calling InsertStudentdata Method.
                    break;
                case 2:
                    callingMethod.insertNStudentData();//Calling insertNStudentData Method.
                    break;
                case 3 :
                    return;
                default:
                    System.out.println("\n------------------------------------------------------------------------------------");
                    System.out.println("Important Message : \t\tMake a valid Choice between 1 to 3.");
                    System.out.println("------------------------------------------------------------------------------------");
                    break;
            }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            
        }
        
        
    }
    void deleteData() throws ClassNotFoundException,SQLException
    {
        while(true)
        {
            System.out.println("\n                               Menu :                                             ");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("1. Delete Data By Roll No.");
            System.out.println("2. Delete Data by Enrollment No");
            System.out.println("3. Return to Main Menu.");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.print("Enter Your Choice : ");
            try {
                 String input = scanner.nextLine();
                int choice = Integer.parseInt(input);
                switch (choice) {
                case 1:
                    callingMethod.deleteDataByRollNo();//Calling deleteDataByRollNo Method.
                    break;
                case 2 :
                    callingMethod.deleteDataByEnrollmentNo();//Calling deleteDataByEnrollmentNo Method.
                    break;
                case 3:
                    return;
                default:
                    System.out.println("\n------------------------------------------------------------------------------------");
                    System.out.println("Important Message : \t\tMake a valid Choice between 1 to 3.");
                    System.out.println("------------------------------------------------------------------------------------");
                    break;
            }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            
        }
        
       
    }
    
    void updateData() throws SQLException,ClassNotFoundException
    {
        while (true)
        {
            System.out.println("\n                               Menu :                                             ");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("1. Update the Name by Roll Number.");
            System.out.println("2. Update Batch And Branch By Roll Number.");
            System.out.println("3. Update Sem-I Marks by Roll Number.");
            System.out.println("4. Update Sem-II Marks By Roll Number.");
            System.out.println("5. Return to Main Menu.");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.print("Enter Your Choice : ");
        try {
             String input = scanner.nextLine();
            int choice = Integer.parseInt(input);
        switch (choice) {
            case 1:
                callingMethod.updateNameByRoll();//Calling updateNameByRoll Method.
                break;
            case 2 :
                callingMethod.updateBBByRoll();//Calling updateBBByRoll Method.
                break;
            case 3 :
                callingMethod.updateSemIMarkByRoll();//Calling updateSemIMarkByRoll Method.
                break;
            case 4 :
                callingMethod.updateSemIIMarkByRoll();//Calling updateSemIIMarkByRoll Method.
                break;
            case 5 :
                return;//returning to main Menu.
            default:
                System.out.println("\n------------------------------------------------------------------------------------");
                System.out.println("Important Message : \t\tMake a valid Choice between 1 to 5.");
                System.out.println("------------------------------------------------------------------------------------");
                break;
        }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
    }
       
        
    }
    void displayData() throws ClassNotFoundException, SQLException
    {
        
        while(true)
        {
            System.out.println("\n                               Menu :                                             ");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("1. Display a data oF student by Roll Number.");
            System.out.println("2. Display a data oF student by Enrollment Number.");
            System.out.println("3. Display record of all Student Present in DataBase.");
            System.out.println("4. Return to Main Menu.");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.print("Enter Your Choice : ");
            try {
                 String input = scanner.nextLine();
                int choice = Integer.parseInt(input);
            switch (choice) {
                case 1:
                    callingMethod.displayDataByRoll();//Calling DisplayDataByRoll.
                    break;
                case 2:
                    callingMethod.displayDataByEnroll();//Calling dispalyDataByEnroll.
                    break;
                case 3:
                    callingMethod.displayAllData();//Calling dispalyAllData Method.
                    break;
                case 4 :
                    return;//It Will return to Main Menu.
                default:
                    System.out.println("\n------------------------------------------------------------------------------------");
                    System.out.println("Important Message : \t\tMake a valid Choice between 1 to 4.");
                    System.out.println("------------------------------------------------------------------------------------");
                    break;
            }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            
        }
        
       
    }
    void extraData() throws SQLException,ClassNotFoundException
    {
        
            while(true)
        {
            System.out.println("\n                               Menu :                                             ");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("1. Print Data of Top 10 Student Of Sem_I");
            System.out.println("2. Print Data of Top 10 Student Of Sem_II");
            System.out.println("3. Return to Main Menu.");
            System.out.println("------------------------------------------------------------------------------------");
            System.out.print("Enter Your choice : ");
            try {
            String input = scanner.nextLine();
            int choice = Integer.parseInt(input);

            switch (choice) {
                case 1:
                    callingMethod.maxSem1();//Calling MaxSem1 Method.
                    break;
                case 2 :
                    callingMethod.maxSem2();//Calling MaxSem2 Method.
                    break;
                case 3 :
                    return;//It Will return to Main Menu.
                default:
                    System.out.println();
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println("Important Message : \t\tMake Choice between 1 to 3.");
                    System.out.println("------------------------------------------------------------------------------------");
                    break;
            }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            
        }
        
       
    }
}
