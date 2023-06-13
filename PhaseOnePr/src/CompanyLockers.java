import java.util.*;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
public class CompanyLockers {
	public static void main(String[] args) {
		
		System.out.println("WELCOME to LOCKedMe.com");
		
		System.out.println("Devloper name: ROHAN Dange");
		
		System.out.println("Features to accept the user input are:");

        Scanner in = new Scanner(System.in);

        int userChoice;

        boolean quit = false;

        float balance = 0f;
        
        do {

            System.out.println("1.  Return the current file names in ascending order");

            System.out.println("2. Add a file to the existing directory list");

            System.out.println("3. Delete a user specified file from the existing directory list");
           
            System.out.print("4. Search a user specified file from the main directory ");
            
            System.out.print("5. Option to navigate back to the main context ");

            System.out.print("Close your Application, 0 to quit: ");
            
            userChoice = in.nextInt();

            switch (userChoice) {
            
            case 1:
            	
            	File dir = new File("C:\\Program Files\\Java\\jdk-11.0.7");

                File[] files = dir.listFiles();

                Arrays.sort(files, (f1, f2) -> f1.compareTo(f2));

                for (File file : files) {
                   if (!file.isHidden()) {
                      if (file.isDirectory()) {
                         System.out.println("DIR \t" + file.getName());
                      } else {
                         System.out.println("FILE\t" + file.getName());
                      }
                   }
                }
                break;
                
                
            case 2:
            	
            	System.out.println("Enter the path to create a directory: ");
                Scanner sc = new Scanner(System.in);
                String path = sc.next();
                System.out.println("Enter the name of the desired a directory: ");
                path = path+sc.next();
                File file = new File(path);               
                boolean bool = file.mkdir();
                if(bool){
                   System.out.println("Directory created successfully");
                }else{
                   System.out.println("Sorry couldn’t create specified directory");
                }
                break;
                
            case 3:
            	
            	try  
            	{         
            	File f= new File("E:\\demo.txt");            
            	if(f.delete())                        
            	{  
            	System.out.println(f.getName() + " deleted");     
            	}  
            	else  
            	{  
            	System.out.println("failed");  
            	}  
            	}  
            	catch(Exception e)  
            	{  
            	e.printStackTrace();  
            	}  
            	
            	break;
            	
            case 4:
            	
            	File dir1 = new File("C:");
                FilenameFilter filter = new FilenameFilter() {
                   public boolean accept (File dir, String name) { 
                      return name.startsWith("b");
                   } 
                }; 
                String[] children = dir1.list(filter);
                if (children == null) {
                   System.out.println("Either dir does not exist or is not a directory"); 
                } else { 
                   for (int i = 0; i< children.length; i++) {
                      String filename = children[i];
                      System.out.println(filename);
                   } 
                } 
                 
                 break;
                 
            case 5:
            	
            	System.out.println("Back to main page - Provide user choice");
            	
            	break;
            	
            case 0:
            	
            	quit = true;

                break;
                
            default:

                System.out.println("Wrong choice.");

                break;
                
            }

            System.out.println();

      } while (!quit);

      System.out.println("Bye!");

}

}

            	
            	
            



