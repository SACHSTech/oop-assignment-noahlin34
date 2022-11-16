package Drive;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.*;
import java.util.ArrayList;

import javax.print.Doc;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.BooleanString;

import Drive.*;

/**
* 
* This program simulates the structure of google drive by allowing a user to input information about their personal google drive.
* It generates an interactive report of their drive, with stats and information about all their simulated "documents."
* 
* @author: Noah Lin
*/


public class Main {


    public static void main(String[] args) throws IOException {


        //initializing the input reader
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        //initial print statements when the app starts
        System.out.println("DRIVE REPORT CLI APP");
        System.out.println("------------------------------");
        System.out.println("Welcome to the Drive Report Command Line interface app.");
        System.out.println("Please enter the requested information. You will be provided a summary of your drive upon completion.");
        System.out.println("------------------------------");

        //initializing placeholder file count variable
        int intFileCount = 0;

        //while loop that iterates while the file count is equal to or less than 0
        while(intFileCount <= 0) {

            System.out.print("How many files does your drive contain? ");

            //try catch statement to ensure the value inputted is a proper number
            try {

                //getting the file number input
                intFileCount = Integer.parseInt(keyboard.readLine());

                //handling if the number inputted is an integer but is less than 0
                if(intFileCount <= 0) {
                    System.out.println("Please enter an integer  greater than 0");
                }
            } catch (NumberFormatException exception) {

                System.out.println("Please enter an integer  greater than 0");
            }
        }
        

        //get the account name
        System.out.print("Enter account name: ");
        String strAccountName = keyboard.readLine();

        //get the email
        System.out.print("Enter account email: ");
        String strAccountEmail = keyboard.readLine();

        //creating placeholder arraylist containing all the items that need to be added to the drive object
        ArrayList<Document> itemsToAdd = new ArrayList<Document>();

        //for loop that runs for how many files the user asked to add 
       for(int x = intFileCount; x > 0; x--) {
            
            //print statement and getting user input of the file type 
            System.out.print("Please enter the type of item you would like to add (doc, pdf, powerpoint, spreadsheet) ");
            String input = keyboard.readLine();

            if(input.equals("doc")) {

                //handing a doc file input, initializing variables and getting word count
                System.out.print("DOCX File added. How many words does this file contain? ");
                int intWordCount = 0;

                //while loop that runs until a valid input is detected via try catch
                boolean t = false;
                while( t == false) {
                    try {intWordCount = Integer.parseInt(keyboard.readLine());
                        t = true;
                    } catch (NumberFormatException e) {
                        System.out.print("Please enter a valid integer. ");
                        t = false;
                    }
                }

                //getting paragraph count
                System.out.print("how many paragraphs does this item have? ");

                //while loop that runs until valid input is detected via try catch
                boolean p = false;
                int intParagraphCount = 0;
                while(p == false) {
                    try {intParagraphCount = Integer.parseInt(keyboard.readLine());
                        p = true;
                    } catch (NumberFormatException e) {
                        System.out.print("Please enter a valid integer. ");
                        p = false;
                    }
                }

                //asking for justification type
                System.out.print("What type of justification does this file use (left, right, center, other...) ");
                String strJustification = keyboard.readLine();

                //title input
                System.out.print("what is the title of this item? ");
                String strTitle = keyboard.readLine();

                //creating the docx object using the parameters specified by the user 
                Docx docx = new Docx(intWordCount, intWordCount * 1.01, strAccountName, ".docx", intParagraphCount, strJustification, strTitle);

                //adds the created docx item to the arraylist of items to add to the drive objecgt 
                itemsToAdd.add(docx);

            } else {
                
                //nested if statement for if the user wishes to add a powerpoint 
                if(input.equals("powerpoint")) {

                    //getting word  count 
                    System.out.print("Powerpoint file added. How many words does this file contain? ");

                    //while loop that repeats until valid input is detected, handing exceptions with try catch 
                    int intWordCount = 0;
                    boolean w = false;
                    while(w == false) {
                        try{intWordCount = Integer.parseInt(keyboard.readLine());
                            w = true;
                        } catch (NumberFormatException e) {
                            w = false;
                            System.out.print("Please enter a valid integer. ");
                        }
                    }
                        
                    //getting slide count 
                    System.out.print("How many slides does this powerpoint have? ");

                    //while loop that repeats until valid input is detected, handling exceptions with try catch 
                    int intSlideCount = 0;
                    boolean sc = false;
                    while(sc == false) {
                        try {intSlideCount = Integer.parseInt(keyboard.readLine());
                            sc = true;
                        }catch (NumberFormatException e) {
                            sc = false;
                            System.out.println("Please enter a valid integer. ");
                        }
                    }

                    //getting the theme 
                    System.out.print("What theme does this powerpoint file use? ");
                    String strTheme = keyboard.readLine();

                    //getting the title
                    System.out.println("what is the title of this item? ");
                    String strTitle = keyboard.readLine();
    
                    //creating the ppt object using the parameters provided by the user 
                    PPT ppt = new PPT(intWordCount, intWordCount * 1.01, strAccountName, ".ppt", intSlideCount, strTheme, strTitle);

                    //adding the newly created ppt object to the arraylist of items to add to the drive object
                    itemsToAdd.add(ppt);
                } else {

                    //nested if statement for if the user wishes to add a spreadsheet
                    if(input.equals("spreadsheet")) {

                        //getting word count
                        System.out.print("Spreadsheet file added. How many words does this file contain? ");

                        //while loop that repeats until valid input is detected, exception handling w/ try catch
                        int intWordCount = 0;
                        Boolean swc = false;
                        while(swc == false ) {
                            try {intWordCount = Integer.parseInt(keyboard.readLine());
                                swc = true;
                            } catch (NumberFormatException e ) {
                                System.out.print("Please enter a valid integer.");
                            }
                        }
                        
                        //getting row count 
                        System.out.println("How many rows does this spreadsheet have? ");

                        //while loop that repeats until valid input is detected, exception handling w/ try catch 
                        int intRowCount = 0;
                        Boolean rc = false;
                        while(rc == false) {
                            try{
                                intRowCount = Integer.parseInt(keyboard.readLine());
                                rc = true;
                            } catch (NumberFormatException e) {
                                rc = false;
                                System.out.print("Please enter a valid integer. ");
                            }
                        }

                        //getting column count 
                        System.out.println("How many columns does this spreadsheet file have? ");

                        //while loop that repeats until valid input is detected, exception handling w/ try catch 
                        int intColumnCount = 0;
                        Boolean cc = false;
                        while (cc == false) {
                            try{intColumnCount = Integer.parseInt(keyboard.readLine());
                                cc = true;
                            } catch ( NumberFormatException e) {
                                cc = false;
                                System.out.println("Please enter a valid integer.");
                            }
                        }

                        //getting title
                        System.out.println("what is the title of this item? ");
                        String strTitle = keyboard.readLine();

                        //creating xlsx object using given parameters
                        XLSX xlsx = new XLSX(intWordCount, intWordCount * 1.01, strAccountEmail, ".xlsx", intRowCount, intColumnCount, strTitle);

                        //adding the object to the arraylist of items that need to be added 
                        itemsToAdd.add(xlsx);

                    } else {

                        //nested if statement for if the user wishes to add a pdf 
                        if(input.equals("pdf")) {

                            //getting word count 
                            System.out.print("PDF file added. How many words does this file contain? ");

                            //while loop that iterates until valid input is detected 
                            int intWordCount = 0;
                            Boolean t = false;
                            while(t == false) {
                                try{intWordCount = Integer.parseInt(keyboard.readLine());
                                    t = true;
                                } catch (NumberFormatException e) {
                                    System.out.println("Please enter a valid integer. ");
                                    t = false;
                                }
                            }

                            //asks if the file is password protected (adobe encrypted PDF )
                            System.out.println("Is this PDF file protected? (y/n) ");

                            //variable intizlization
                            boolean boolIsProtected = false;
                            String strPassword = "";
                            

                            //while loop that iterates until a valid y or n input is given
                            boolean pdfRepeat = true;
                            while (pdfRepeat == true) {
                                String boolInput = keyboard.readLine();

                                //if statement for if a password is to be added 
                                if(boolInput.equals("y")) {

                                    boolIsProtected = true;
                                    pdfRepeat = false;

                                    //getting the user's password
                                    System.out.println("Please enter the password you wish to use to protect this PDF. ");
                                    strPassword = keyboard.readLine();
                                } else if(boolInput.equals("n")) {

                                    //if no, end the loop and do nothing
                                    System.out.println("PDF will be freely modifiable.");
                                    pdfRepeat = false;
                                } else {

                                    //keep repeating
                                    pdfRepeat = true;
                                    System.out.println("Please enter a valid y/n");
                                }
                            } 
                        
                            //asking for the title 
                            System.out.println("what is the title of this item? ");
                            String strTitle = keyboard.readLine();

                            //creating pdf object using given parameters
                            PDF pdf = new PDF(intWordCount, intWordCount * 1.01, strAccountEmail, ".pdf", boolIsProtected, strPassword, strTitle);

                            //adding the new object to the arraylist 
                            itemsToAdd.add(pdf);

                        } else {

                            //in the case that the user inputted none of the options, re iterate the loop again. 
                            System.out.println("invalid input, returning");
                            x++;
                            continue;
                        }
                    }
                }       
            }
        }


        //generating statistics report message 
        System.out.println("thank you for inputting the required data. Please wait while the system calculates your drive report.");
        System.out.println("");

        //this is where the drive object is actually created and passed the array of items and other parameters
        Drive userDrive = new Drive(intFileCount, intFileCount * 2, strAccountName, strAccountEmail, itemsToAdd);

        //print statments for the statistics report 
        System.out.println(userDrive.getAccountName() + "'s drive stats: ");
        System.out.println("File count: " + userDrive.getFileCount());
        System.out.println("Total storage size: " + userDrive.getStorageSize());
        
       
        //initializing the input value variable 
        String selectionInput = " ";
        
        //while loop runs until the user presses RETURN
       OUTER: while(selectionInput.equals("") == false) {
        System.out.println("Choose an item to view info (0...." + (userDrive.getFileCount()-1) + ")" + " RETURN to quit");
        System.out.println("Current items in drive: ");

        //this for loop prints out all the items in a list with a number the user must choose to view them 
        for(int x = 0; x < userDrive.getFileCount(); x++) {
            System.out.println(userDrive.getDocuments().get(x).getTitle() + " - " + x);
        }

        //get the chosen item 
        selectionInput = keyboard.readLine();
        int selectionNum = 0;

            //if statement for when the user hits return 
            if(selectionInput.equals("")) {
                
                //goodbye message and break 
                System.out.println("Thank you for using this program. goodbye....");
                break;
            }

            //try catch for if the number input was valid 
            try { selectionNum = Integer.parseInt(selectionInput);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid selection.");
                continue;
            }

            //if the number the user inputted was not one of the options in the list, repeat 
            if(selectionNum < 0 || selectionNum > intFileCount-1 ) {
                System.out.println("Please enter a valid selection.");
                continue;
            }

            //finally, print out data on the selection 
            System.out.print("Selection: ");
            System.out.println("ITEM " + selectionInput);
            System.out.println("================");
            System.out.println("STATS: ");

            //if statement for if the requestd object is a PDF file 
            if(userDrive.getDocument(selectionNum) instanceof PDF) {

                //checks if the pdf file was protected
                if(((PDF)userDrive.getDocument(selectionNum)).isProtected()) {
                    
                    //blocking access if the pdf was protected 
                    System.out.println("THIS PDF FILE IS PROTECTED. PLEADE ENTER THE PASSWORD");

                    //getting hte password
                    String pass = keyboard.readLine();

                    //runs the method to check the password against recorded value
                    ((PDF)userDrive.getDocument(selectionNum)).checkPass(pass); 

                    //if password check was succesful
                    if(((PDF)userDrive.getDocument(selectionNum)).passCheck() == true) {

                        //printing file info "decrypting"
                        System.out.println("CORRECT, the password is: " + ((PDF)userDrive.getDocument(selectionNum)).getPassword());
                        System.out.println("TITLE: " + userDrive.getDocuments().get(selectionNum).getTitle());
                        System.out.println("STORAGE SIZE: " + userDrive.getDocuments().get(selectionNum).getFileSize());
                        System.out.println("FILE EXTENSION: " + userDrive.getDocuments().get(selectionNum).getFileExtension());  
                        System.out.println("OWNER: " + userDrive.getDocument(selectionNum).getOwner());          
                        
                    } else{
                        //if the password was wrong, the user is booted back to the main menu and can try again 
                        continue;
                    }     
                } 
            } 

            //generic file stats that are always printed 
            System.out.println("TITLE: " + userDrive.getDocuments().get(selectionNum).getTitle());
            System.out.println("STORAGE SIZE: " + userDrive.getDocuments().get(selectionNum).getFileSize());
            System.out.println("FILE EXTENSION: " + userDrive.getDocuments().get(selectionNum).getFileExtension());
            System.out.println("WORD COUNT: " + userDrive.getDocument(selectionNum).getWordCount());
            System.out.println("OWNER: " + userDrive.getDocument(selectionNum).getOwner());          


            //data to only be shown if the queried file is a docx object 
            if(userDrive.getDocument(selectionNum) instanceof Docx) {

                //printing out attributes unique to docx object
                System.out.println("PARAGRAPH COUNT: " + ((Docx)userDrive.getDocument(selectionNum)).getParagraphCount());
                System.out.println("INDENTATION TYPE: " + ((Docx)userDrive.getDocument(selectionNum)).getIndentationType());
            }  

            //data to only be shown if the queried file is a ppt object 
            if(userDrive.getDocument(selectionNum) instanceof PPT) {

                //printing out attributes unique to pdf object
                System.out.println("SLIDE COUNT: " + ((PPT)userDrive.getDocument(selectionNum)).getSlideCount());
                System.out.println("SLIDESHOW THEME: " + ((PPT)userDrive.getDocument(selectionNum)).getTheme());
                
            }

            //data to only be shown if the queried file is a xlsx object 
            if(userDrive.getDocument(selectionNum) instanceof XLSX) {
                
                //printing out attributes unique to xlsx object
                System.out.println("ROW COUNT: " + ((XLSX)userDrive.getDocument(selectionNum)).getRowCount());
                System.out.println("COLUMN COUNT: " + ((XLSX)userDrive.getDocument(selectionNum)).getColumnCount());
                System.out.println("TOTAL CELL COUNT: " + ((XLSX)userDrive.getDocument(selectionNum)).getTotalCellCount());

            }
            
            //ending line for stats
            System.out.println("================");

            //repeating options, allowing user to select another file to view in infinite loop
      
           

        }      
    }

}