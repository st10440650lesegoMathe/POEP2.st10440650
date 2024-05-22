 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.part.pkg2;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JDialog;

/**
 *
 * @author RC_Student_lab
 */
public class POEPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
            
            JDialog window = new JDialog( ) ;
            Task taskobj = new Task( );
              
            
            Scanner input = new Scanner(System.in);
            
            String firstname;
            String lastname;
            String usernameReg;
            String passwordReg;
            String usernameLog;
            String passwordLog;
            
            System.out.println("Hello there!"
                                   + "\nTo register an account with us, please follow the prompt below.");
            System.out.println("\nStep 1: Enter your firstname >>");
           firstname = input.next( );
           taskobj .setName_(firstname);
            
           System.out.println("\n" + "Step 2:  Enter your lastname ");
           lastname = input.next( );
           taskobj.setLastname_(lastname);
           
           System.out.print("\n" + "Step 3: Create a username"
                      + "\n*Please note that  your username:"
                      + "\n- must not exceed 5 characters in length and"
                      +"\n-  must contain an underscore ( _ ) ."
                      +"\nEnter a username >>");
          usernameReg = input.next( );
          taskobj.setUsername_Reg(usernameReg);
            
           taskobj.registerUser();
           
           System.out.println("\n" + "Step 4: Create the password"
                     + "\n*Please note that your pasword must"
                     + "\n- contain at least 8 characters"
                     + "\n- contain a capital letter"
                     + "\n- contain a digit and"
                     + "\n- contain a special character."
                     + "\nEnter a password >>");
           passwordReg = input.next( );
           taskobj.setPassword_(passwordReg);
           
           taskobj.registerUser();
           
           System.out.println("\nPlease enter your password >>");
           passwordLog = input.next( );
           taskobj.setPassword_(passwordLog);
           
           taskobj.returnLoginstatus();
           //end of part 1
            
           //part 2
           //displaying p2 on top 
           window.setAlwaysOnTop(true);
           
           
                       int size = 0;
                      String Taskdesc[]=  null;
                      String TaskName[]= null;
                      String DeveloperName[]= null;
                      String TaskDuration[]= null;
                      String TaskID[] = null;
                      int Status[]=null;
                      int Total=0;
                      int count;
                      String[] options ={ "To do", "Done","Doing"};
                      String[] del = { "delete", "cancel"};
                      String choice;
                       
                      choice = JOptionPane.showInputDialog(null, 
                                    "Pleasse select an action to proceed with:"
                                 +  "\n1. Add tasks"
                                 +  "\n2. show report"
                                 +  "\n3. Quit ",
                                            "Welcome to EasyKhanban",JOptionPane.PLAIN_MESSAGE);
                      taskobj.setChoice(choice);
                       choice = taskobj.verifyChoice( );
                       
                       while( choice.equals("1") || choice.equals("2") || choice.equals("3")) {
                                 
                                 if ( choice.equals("1")) {
                                            size = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount of task you want to create:",
                                                                  null,JOptionPane.PLAIN_MESSAGE));
                                            taskobj.setSize(size);
                                            
                                            TaskName = new String[size ];
                                            DeveloperName = new String [size ];
                                            TaskDuration = new String[ size];
                                            Status = new int[size ];
                                            TaskID = new String[size ];
                                            Taskdesc = new String[size];
                                            
                                            for ( count =0; count < size; count++) {
                                                  taskobj.setCount(count);
                                            
                                           TaskName[count] =JOptionPane.showInputDialog(null, "Enter a name for task" + count,
                                                                  "Task Name",JOptionPane.PLAIN_MESSAGE);
                                           taskobj.setTaskName(TaskName);
                                           
                                           TaskName[count] = taskobj.verifyTaskName( );
                                           
                                           Taskdesc[count] = JOptionPane.showInputDialog(null,"The description should not excced 50 characters in length",
                                                                 " Please a description for the task" ,JOptionPane.PLAIN_MESSAGE);
                                           taskobj.setTaskDesc(Taskdesc);
                                           
                                           while( !taskobj.checkTaskDescription(Taskdesc[count])) {
                                                       Taskdesc[count] = JOptionPane.showInputDialog(null, "Please enter a task of description of 50 characters or less.",
                                                                               "INVLAID ENTRY",JOptionPane.ERROR_MESSAGE);
                                                       taskobj.setTaskDesc(Taskdesc);
                                           }
                                            if ( taskobj.checkTaskDescription(choice)) {
                                                       JOptionPane.showMessageDialog(null,"Task successfully captured");
                                            }
                                            DeveloperName[count] = JOptionPane.showInputDialog(null, "Enter the first and last name of the developer assigned to",
                                                                  "Developer Details ",JOptionPane.PLAIN_MESSAGE);
                                            taskobj.setDeveloper_Name(DeveloperName);
                                            
                                            DeveloperName[count] = taskobj.verifyDeveloperName( );
                                            
                                            TaskDuration[count] = JOptionPane.showInputDialog(null, "Enter the estimated task duration in hours",
                                                                             "Task Duration",JOptionPane.PLAIN_MESSAGE);
                                            taskobj.setTaskDuration(TaskDuration);
                                            
                                            TaskDuration[count] = taskobj.verifyDuration( );
                                            
                                            Total = Total + Integer.parseInt(TaskDuration[count]);
                                            taskobj.setTotal(Total);
                                            
                                            Status[count] =JOptionPane.showOptionDialog(null,"Please specify the status of this task", "Task  status ",
                                                    JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, taskobj.getOptions( ), null);
                                            taskobj.setStatus(Status);
                                            
                                            JOptionPane.showMessageDialog(null, taskobj.printTaskDetails( ), "Task Details", JOptionPane.PLAIN_MESSAGE);
                                            
                                            TaskID[count] = taskobj.createTaskID( );
                                            
                                            }
                                 }          
                                 if( choice.equals("2")) {
                                            StringBuilder report = new StringBuilder( );
                                            
                                            for( int i = 0; i < size ; i ++) {
                                                       
                                                       if( TaskName[i] != null) {
                                                                  report.append("Task name: " ).append(TaskName[i])
                                                                             .append("\nDeveloper: ").append(DeveloperName[i])
                                                                            .append("\nDuration: ").append(TaskDuration[i] + "hours")
                                                                            .append("\nTask ID ").append(TaskID[i])
                                                                            .append("\nStatus ").append(Status[i] + "\n\n");
                                                                   }
                                                       }
                                                       if (size == 0) {
                                                                  JOptionPane.showMessageDialog(null, "Please add tasks to view a report", "No task to display", JOptionPane.PLAIN_MESSAGE);
                                                         
                                                       }
                                                       else {
                                                       JOptionPane.showMessageDialog(null, report.toString( ), "Task report", JOptionPane.PLAIN_MESSAGE);
                                                       }
                                                       
                                             }
                                                       if(choice.equals("3")) {
                                                                  JOptionPane.showMessageDialog(null, "Your task will have a total of " +taskobj.returnTotalHours( ) + "hours", "Total duration", JOptionPane.PLAIN_MESSAGE);
                                                                   JOptionPane.showMessageDialog(null, "Good bye for now", "See you soon", JOptionPane.PLAIN_MESSAGE);
                                                       }
                                           } 
                                   }
                                                                            
}                                        
                                                       
                                            
                                           
                                            
                                 
                       
                              
                      
            
                                        
           
            


