package Drive;

import java.io.*;
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

        

    }

}