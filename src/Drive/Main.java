package Drive;

import java.io.*;
import java.util.ArrayList;

import Drive.*;

/**
* 
* This is the main class file
* @author: Noah Lin
*/


public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("----- GOOGLE DRIVE CLI -----");

        System.out.println("Welcome to the Google Drive Command Line interface. Please initalize your drive by providing the following values.");

        System.out.print("How many files does your drive contain? ");
        int intFileCount = Integer.parseInt(keyboard.readLine());

        System.out.print("Enter account name: ");
        String strAccountName = keyboard.readLine();

        System.out.print("Enter account email: ");
        String strAccountEmail = keyboard.readLine();

        ArrayList<Object> itemsToAdd = new ArrayList<Object>();

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

                Docx docx = new Docx(intWordCount, intWordCount * 1.01, strAccountName, ".docx", intParagraphCount, strJustification);
                itemsToAdd.add(docx);
            } else {

                if(input.equals("powerpoint")) {
                    System.out.print("Powerpoint file added. How many words does this file contain? ");
                    int intWordCount = Integer.parseInt(keyboard.readLine());
                    System.out.print("How many slides does this powerpoint have? ");
                    int intSlideCount = Integer.parseInt(keyboard.readLine());
                    System.out.print("What theme does this powerpoint file use? ");
                    String strTheme = keyboard.readLine();
    
                    PPT ppt = new PPT(intWordCount, intWordCount * 1.01, strAccountName, ".ppt", intSlideCount, strTheme);
                    itemsToAdd.add(ppt);
                } else {
                    if(input.equals("spreadsheet")) {
                        System.out.print("Spreadsheet file added. How many words does this file contain? ");
                        int intWordCount = Integer.parseInt(keyboard.readLine());
                        System.out.println("How many rows does this spreadsheet have? ");
                        int intRowCount = Integer.parseInt(keyboard.readLine());
                        System.out.println("How many columns does this spreadsheet file have? ");
                        int intColumnCount = Integer.parseInt(keyboard.readLine());

                        XLSX xlsx = new XLSX(intWordCount, intWordCount * 1.01, strAccountEmail, ".xlsx", intRowCount, intColumnCount);


                    }
                }       
            }

            

            

        }

    }

}