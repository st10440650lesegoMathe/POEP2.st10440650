/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.part.pkg2;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author RC_Student_lab
 */
public class Task { 
           //part 1
           private String firstname_;
                      private String lastname_;
                      private String username_Reg;
                      private String password_Reg;
                      private String username_Log;
                      private String password_Log;
                      boolean flag;
                      boolean flag1;
                      boolean flag2;
                      String regex = "^ (?=.*[0-9])  (?=.*[a-z])  (?=.*[A-Z] ) (?=.*[!@#&( ) -[{}]: ; ',?/*~$^+=<>]) .{8,}$";
                      private final Pattern pattern = Pattern.compile(regex);
                      
                      Scanner Sc = new Scanner(System.in);
                      
                      public String getName_( ) {
                                 return firstname_;
                      } 
                      
                      public void setName_(String firstname_) {
                                 this.firstname_= firstname_;
                      }
                      public String getLastname_( ) {
                                 return lastname_;
                      }
                      public void setLastname_(String lastname_) {
                                this.lastname_ = lastname_;
                      }
                      public String getUsername_( ) {
                                 return username_Reg;
                      }
                      public  void setUsername_Reg( String username_Reg) {
                                this.username_Reg = username_Reg;
                      }
                       public   String getPassword_Reg( ) {
                                 return password_Reg;
                       }
                       public void setPassword_( String password_Reg ) {
                                 this.password_Reg = password_Reg;
                       }
                       public String getUsername_Log( ) {
                                 return username_Log;
                       }
                       public void setUsername_Log(String username_Log) {
                                this.username_Log = username_Log;
                       }
                       public String getPassword_Log( ) {
                                 return password_Log;
                       }
                       public void Password_Log( String password_Log) {
                                this.password_Log = password_Log;
                       }
                       public boolean checkUsername(String username_Reg) {
                                 flag = ( username_Reg.contains("_")) && (username_Reg.length() < 6);
                                 return flag;
                       }
                       public boolean checkPasswordComplexity( String password_Reg ) {
                                 Matcher matcher = pattern.matcher( password_Reg );
                                 
                                 flag1 = matcher.matches( );
                                 return  flag1;
                       }
                      public void registerUser( ) {
                          label_1: {
                                while ( password_Reg != null) {
                                  break label_1;  
                       }
                       if ( username_Reg != null) {
                       //username portion
                       while (!checkUsername( username_Reg)) {
                                  System.out.println("Username is not correctly formatted,"
                                                            + "please ensure that your username contains an userscore and is no more than 5 charachers in length.");
                                                                 System.out.println("Please enter a username that meets these conditions>>");
                                                                 username_Reg = Sc.next( );
                                                        }
                                                       if ( checkUsername (username_Reg)) {
                                                                  System.out.println("Username succussfully captured ");
                                                       }
                                            }
                                 }        
                      if ( password_Reg == null) {
                                 return;    
                      }
                      
                      Matcher matcher = pattern.matcher(password_Reg);
                      
                     while ( !checkPasswordComplexity(password_Reg)) {
                                 System.out.println("Password is not correctly formatted,"
                                                     + "please ensure your password contains at least 8 characters, a capital letter, number and special character.");
                                            System.out.println("please enter a password that meets these conditions>>");
                                            password_Reg = Sc.next( );
                                            matcher = pattern.matcher(password_Reg) ;
                                 }
                      if ( checkPasswordComplexity (password_Reg)) {
                                 System.out.println("Password successfully captured");
                                 System.out.println("\nCongratulation! You have succuessfully registered your account");
                      }
           }
                      public boolean loginUser( ) {
                          
                          flag2 = password_Log.equals(password_Reg) && username_Log.equals(username_Reg);
                                 return flag2;
                      }  
                      public void returnLoginstatus( ) {
                                while(! loginUser( )) {
                                 System.out.println("\nUsername or password incorrect , please try again.");
                                 System.out.println("Please re-enter your username");
                                 username_Log = Sc.next( );
                                 System.out.println("Please re-enter your password");
                                 password_Log = Sc.next( );
                                }
                                 if (loginUser( )) {
                                            System.out.println("\nWelcome" + firstname_+ "" + lastname_ + "It is great to see you again.");
                                 }
                      }
          // beginning of p2
                      private int size;
                      private String Task_desc[]= new String[ size];
                      private String Task_Name[]= new String[ size];
                      private String Developer_Name[]= new String[ size];
                      private String Task_Duration[]= new String[size];
                      private int Status[]= new int[size];
                      private int Total;
                      private int Count;
                      private String[] options = { "To do", "Done","Doing" };
                      private String Choice;
                      // getter and setter
                      public int getSize ( ) {
                                return size;
                      }
                      public void setSize( int size) {
                                 this.size =size;
                      }
                      public String[] getTaskName ( ) {
                                 return Task_Name;
                      }
                      public void setTaskName (String[]  Task_Name) {
                                this.Task_Name = Task_Name;       
                      }
                      public String getChoice( ) {
                                return Choice; 
                      }
                      public void setChoice( String Choice ) {
                                 this.Choice = Choice;
                      }
                      public String[] getOptions( ) {
                                 return options;
                      }
                      public void setOptions( String[] options) {
                                this.options = options;
                      }
                      public int getTotal( ) {
                                return Total;
                      }
                      public void setTotal( int Total ) {
                                 this.Total = Total;
                      }
                      public int[] getStatus( ) {
                                 return Status;
                      }
                      public void setStatus( int[] Status) {
                                 this.Status = Status;
                      }
                      public String[] getTaskDuration( ) {
                                 return Task_Duration;
                      }
                      public void setTaskDuration( String[] Task_Duration ) {
                                 this.Task_Duration = Task_Duration;
                      }
                      public String[] getDeveloper_Name( ) {
                                 return Developer_Name;
                      }
                      public void setDeveloper_Name( String[] Developer_Name) {
                                 this.Developer_Name = Developer_Name;
                      }
                      public int getCount( ) {
                                 return Count;
                      }
                      public void setCount( int Count) {
                                 this.Count = Count;
                      }
                      public String[] getTaskDesc( ) {
                                 return Task_desc;
                      }
                      public void setTaskDesc( String[] Task_desc ) {
                                 this.Task_desc = Task_desc;
                      }
                      //method 1
                      public boolean checkTaskDescription( String desc) {
                                   
                       boolean flag3 = desc.length() < 50  && desc.length( ) > 0;
                                 return flag3;
                      }
                      //method 2
                      public String createTaskID( ) {
                                 String a = Character.toString(Task_Name[getCount( )].charAt(0));
                                 String b =Character.toString(Task_Name[getCount( )].charAt(1));
                                 String c = Character.toString(Developer_Name[getCount( )].charAt(Developer_Name[getCount( )].length()-3));
                                 String d = Character.toString(Developer_Name[getCount( )].charAt(Developer_Name[getCount( )].length()-2));
                                 String e = Character.toString(Developer_Name[getCount( )].charAt(Developer_Name[getCount( )].length()-1));
                                
                                  String taskID = a.toUpperCase( ) + b.toUpperCase( ) + ":" + Count + ":" + c.toUpperCase( ) + d.toUpperCase( ) + e.toUpperCase( );
                                  return taskID;
                      }
                      //method 3
                      public String printTaskDetails( ) {
                      
                      String taskDet = "Status:" + options[Status[getCount( )]]
                                                             + "\nDeveloper:" + Developer_Name[getCount( )]
                                                             + "\nTask Number:" + getCount( )
                                                             + "\nTask Name:" + Task_Name[getCount( )]
                                                             + "\nDescription:" + Task_desc[getCount( )]
                                                             + "\nTask ID:" + createTaskID( )
                                                             +"\nDuration:" + Task_Duration[getCount( )] + "hours";
                      return taskDet;
                      }
                      public int returnTotalHours( ) {
                                return Total;
                      }
                      public String verifyChoice( ) {
                                 while(Choice == null || !(Choice.equals("1")) && !(Choice.equals("2")) && !(Choice.equals("3")) && !(Choice.equals("4")))     {
                                     
                                     
                                 Choice = JOptionPane.showInputDialog(null, "\nSelect an action to proceed with:"
                                            + "\n1. Add Tasks"
                                         + "\n2. .Show report"
                                         +"\n3. Quit"
                                         +"\n*Please enter only that corresponds to your chosen action","INVALID ENTRY",JOptionPane.ERROR_MESSAGE);
                                 } 
                                 return Choice;
                      }
                      public String verifyTaskName( ) {
                                 while( Task_Name[getCount( ) ].equals("") || Task_Name[getCount( )].length( ) <2) {
                                 Task_Name[getCount( )] = JOptionPane.showInputDialog(null, "Please ensure that your Task name is at least 2 characters long",
                                                                                                     "INVALID ENTRY ",JOptionPane.ERROR_MESSAGE);
                                 }
                                 return Task_Name[getCount( )] ;
                      }
                     public String verifyDeveloperName( ) {
                                  while( Developer_Name[getCount( ) ].equals("") || Developer_Name[getCount( )].length( ) <3) {
                                    Developer_Name[getCount( )] = JOptionPane.showInputDialog(null, "Please ensure that your Developer's name  is at least 3 letter long",
                                                                                                     "INVALID ENTRY ",JOptionPane.ERROR_MESSAGE);
                                  }
                                  return Developer_Name[getCount( )];
                      }
                     public String verifyDuration( ) {
                                 while( true) {
                                  try  {
                                            Integer.parseInt(Task_Duration[getCount( )]);
                                            break;
                                  }
                                 catch ( NumberFormatException e)  {
                                            Task_Duration[getCount( )] = JOptionPane.showInputDialog(null, "Enter the estimated task duration in hours"
                                                                                       +"\n*Ensure that it is a numeric value",
                                                                                        "INVALID ENTRY",JOptionPane.ERROR_MESSAGE);
                                            
                                
                                 }
                      }
             return Task_Duration[getCount( )] ;
}
}




