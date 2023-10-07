                                                    //Individual Project.
                                                    //Topic : College Management System.
                                                    //Enrollment No : 22002170410006.
                                                    //Name: Mahto Gaurav Devnath.
                                                    //Current-Sem : Sem-II.
                                                    //Date : 4-10-2023.
                                                    //Subject Name : DataBase Management System.
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("                                 Individual Project                                 ");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Topic : College Management System.");
        System.out.println("Prepared By : ");
        System.out.println("\tEnrollment No : 22002170410006     Name: Mahto Gaurav Devnath         Roll No : 02");
        System.out.println("Current-Sem : Sem-II");
        System.out.println("Date : 6-10-2023.");
        System.out.println("Subject Name : DataBase Management System.");
        System.out.println("------------------------------------------------------------------------------------");
        System.out.print("\nProgram For Implementing College Management System Using JDBC and DataBase Query.\n");
        System.out.println("------------------------------------------------------------------------------------");
        AllMethod callMethod = new AllMethod();//Created Refercence Variable of AllMethod Class to use it method.
        Scanner scanner = new Scanner(System.in);//created Scanner class object to take user choice.
            while (true) {
                //Menu
                System.out.println("\nWelcome To LJ DataBase System");
                System.out.println("1. Insert Data.");
                System.out.println("2. Delete Data.");
                System.out.println("3. Update Data.");
                System.out.println("4. Display Data.");
                System.out.println("5. Extra");
                System.out.println("6. Exit From DataBase.");
                System.out.print("Enter Your Choice : ");
                try {
                // int choice = scanner.nextInt();
                String input = scanner.nextLine();//Taken the choice from user 
                int choice = Integer.parseInt(input);//Convert the choice From String to Integer
                //Use Switch Case to Perform Various Operation.
                switch (choice) {
                    case 1:
                        callMethod.insertData();//Caling insertData Method from ALLMethod class to perform Insert Data Operation in dataBase.
                        break;
                    case 2:
                        callMethod.deleteData();//Caling deleteData Method from ALLMethod class to perform Delete Data Operation in dataBase.
                        break;
                    case 3:
                        callMethod.updateData();//Caling updateData Method from ALLMethod class to perform Update Data Operation in dataBase.
                        break;
                    case 4:
                        callMethod.displayData();//Caling displayData Method from ALLMethod class to perform Dispaly Data Operation in dataBase.
                        break;
                    case 5:
                        callMethod.extraData();//Caling extraData Method from ALLMethod class to perform Extra Data Operation in dataBase.
                        break;
                    case 6:
                        System.out.println("------------------------------------------------------------------------------------");
                        System.out.println("                        LJ UNIVERSITY DataBase LogOut.                              ");
                        System.out.println("------------------------------------------------------------------------------------");
                        System.exit(0);//Use this to Exit the From the terminal
                        break;

                    default:
                        System.out.println("\n------------------------------------------------------------------------------------");
                        System.out.println("Important Message : \tMake Choice between 1 to 6.");
                        System.out.println("------------------------------------------------------------------------------------");
                        break;
                }
                } catch (Exception e) {
                    System.out.println(e);//if any exception occur so it will print here.
                   // (if input is taken as int and user give String then exception Occurs)
                }
                
            }
        

    }
}
