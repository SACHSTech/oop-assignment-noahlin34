package Drive;

import java.io.*;
import java.util.ArrayList;

import javax.print.Doc;

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

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("DRIVE REPORT CLI APP");
        System.out.println("------------------------------");
        System.out.println("Welcome to the Drive Report Command Line interface app.");
        System.out.println("Please enter the requested information. You will be provided a summary of your drive upon completion.");

        System.out.println("------------------------------");
        int intFileCount = 0;

        while(intFileCount <= 0) {
            System.out.print("How many files does your drive contain? ");
            try {
                intFileCount = Integer.parseInt(keyboard.readLine());
                if(intFileCount == 0) {
                    System.out.println("Please enter an integer  greater than 0");
                }
    
            } catch (NumberFormatException exception) {
                System.out.println("Please enter an integer  greater than 0");
            }
        }
        

        System.out.print("Enter account name: ");
        String strAccountName = keyboard.readLine();

        System.out.print("Enter account email: ");
        String strAccountEmail = keyboard.readLine();

        ArrayList<Document> itemsToAdd = new ArrayList<Document>();

        for(int x = intFileCount; x > 0; x--) {
            System.out.print("Please enter the type of item you would like to add ");
            String input = keyboard.readLine();
            if(input.equals("doc")) {
                System.out.print("DOCX File added. How many words does this file contain? ");
                int intWordCount = Integer.parseInt(keyboard.readLine());
                System.out.print("how many paragraphs does this item have? ");
                int intParagraphCount = Integer.parseInt(keyboard.readLine());
                System.out.print("What type of justification does this file use (left, right, center) ");
                String strJustification = keyboard.readLine();

                System.out.println("what is the title of this item? ");
                String strTitle = keyboard.readLine();

                Docx docx = new Docx(intWordCount, intWordCount * 1.01, strAccountName, ".docx", intParagraphCount, strJustification, strTitle);
                itemsToAdd.add(docx);
            } else {

                if(input.equals("powerpoint")) {
                    System.out.print("Powerpoint file added. How many words does this file contain? ");
                    int intWordCount = Integer.parseInt(keyboard.readLine());
                    System.out.print("How many slides does this powerpoint have? ");
                    int intSlideCount = Integer.parseInt(keyboard.readLine());
                    System.out.print("What theme does this powerpoint file use? ");
                    String strTheme = keyboard.readLine();
                    System.out.println("what is the title of this item? ");
                    String strTitle = keyboard.readLine();
    
                    PPT ppt = new PPT(intWordCount, intWordCount * 1.01, strAccountName, ".ppt", intSlideCount, strTheme, strTitle);
                    itemsToAdd.add(ppt);
                } else {
                    if(input.equals("spreadsheet")) {
                        System.out.print("Spreadsheet file added. How many words does this file contain? ");
                        int intWordCount = Integer.parseInt(keyboard.readLine());
                        System.out.println("How many rows does this spreadsheet have? ");
                        int intRowCount = Integer.parseInt(keyboard.readLine());
                        System.out.println("How many columns does this spreadsheet file have? ");
                        int intColumnCount = Integer.parseInt(keyboard.readLine());
                        System.out.println("what is the title of this item? ");
                        String strTitle = keyboard.readLine();

                        XLSX xlsx = new XLSX(intWordCount, intWordCount * 1.01, strAccountEmail, ".xlsx", intRowCount, intColumnCount, strTitle);
                        itemsToAdd.add(xlsx);

                    } else {
                        if(input.equals("pdf")) {
                            System.out.print("PDF file added. How many words does this file contain? ");
                            int intWordCount = Integer.parseInt(keyboard.readLine());
                            System.out.println("Is this PDF file protected? (y/n) ");
                            String boolInput = keyboard.readLine();
                            boolean boolIsProtected = false;
                            String strPassword = "";
                            if(boolInput.equals("y")) {
                                boolIsProtected = true;
                                System.out.println("Please enter the password you wish to use to protect this PDF. ");
                                strPassword = keyboard.readLine();
                            } else {
                                System.out.println("PDF will be freely modifiable.");
                            }
                            System.out.println("what is the title of this item? ");
                            String strTitle = keyboard.readLine();

                            PDF pdf = new PDF(intWordCount, intWordCount * 1.01, strAccountEmail, ".pdf", boolIsProtected, strPassword, strTitle);
                            itemsToAdd.add(pdf);

                        }
                    }
                }       
            }
        }

        System.out.println("thank you for inputting the required data. Please wait while the system calculates your drive report.");

        Drive userDrive = new Drive(intFileCount, intFileCount * 2, strAccountName, strAccountEmail, itemsToAdd);

        System.out.println(userDrive.getAccountName() + "'s drive stats: ");
        System.out.println("File count: " + userDrive.getFileCount());
        System.out.println("Total storage size: " + userDrive.getStorageSize());
        System.out.println("Choose an item to view info (0...." + (userDrive.getFileCount()-1) + ")");
        System.out.println("Current items in drive: ");

        for(int x = 0; x < userDrive.getFileCount(); x++) {
            System.out.println(userDrive.getDocuments().get(x).getTitle() + " - " + x);
        }

        String selectionInput = keyboard.readLine();
        
        while(selectionInput.equals("") == false) {
            System.out.print("Selection: ");
            System.out.println("ITEM " + selectionInput);
            System.out.println("STATS: ");
            int selectionNum = Integer.parseInt(selectionInput);
            System.out.println("TITLE: " + userDrive.getDocuments().get(selectionNum).getTitle());
            System.out.println("STORAGE SIZE: " + userDrive.getDocuments().get(selectionNum).getFileSize());
            System.out.println("FILE EXTENSION: " + userDrive.getDocuments().get(selectionNum).getFileExtension());

            if(userDrive.getDocument(selectionNum) instanceof Docx) {
                System.out.println("PARAGRAPH COUNT: " + ((Docx)userDrive.getDocument(selectionNum)).getParagraphCount());
                System.out.println("INDENTATION TYPE: " + ((Docx)userDrive.getDocument(selectionNum)).getIndentationType());
            }  else {
                continue;
            }




            
            System.out.println("Choose an item to view info (0...." + (userDrive.getFileCount() - 1) + ")");

            System.out.println("Current items in drive: ");
            for(int x = 0; x < userDrive.getFileCount(); x++) {
                System.out.println(userDrive.getDocuments().get(x).getTitle() + " - " + x);
            }


            selectionInput = keyboard.readLine();

        }      
    }

}