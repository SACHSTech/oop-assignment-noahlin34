package Drive;
import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

import Drive.*;

/**
 * PDF class that inherits from document. 
 */
public class PDF extends Document {

    //initializing bufferedreader as this class requires keyboard input 
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); 

    //innitializing variables
    private boolean boolIsProtected;
    private String strPassword;

    //this variable is the status of whether the password check was passed or not 
    private boolean boolPassCheck;
    
    /**
     * Constructor method
     * @param wordCount - number of words, inherited from document 
     * @param owner - owner of the file, inherited from document
     * @param fileExtension - file extension, inherited from document 
     * @param boolIsProtected - boolean value for determining if the pdf is protected or not 
     * @param strPassword - string containing the given password 
     * @param strTitle - title, inherired from document 
     */
    public PDF(int wordCount, String owner, String fileExtension, boolean boolIsProtected, String strPassword, String strTitle) {
        super(wordCount, owner, fileExtension, strTitle);
        this.boolIsProtected = boolIsProtected;
        this.strPassword = strPassword;
        this.boolPassCheck = false;
    }

    /**
     * getter method for the given password
     * @return password protecting the pdf file 
     */
    public String getPassword() {
        return this.strPassword;
    }

    /**
     * getter for boolean representing if the pdf is encrypted
     * @return true if pdf is protected by pw, false if it is not 
     */
    public boolean isProtected() {
        return this.boolIsProtected;
    }

    /**
     * Method that is used to change the password check variable to true if the user inputs the correct password 
     * @param pass inputted password to check against saved password value 
     */
    public void checkPass(String pass) {   
            if(pass.equals(strPassword)) {

                //set variable to true if the correct password was entered 
                boolPassCheck = true;
            } else {

                //variable to false if the wrong password was entered 
                boolPassCheck = false;
                System.out.println("Incorrect password, returning...");
            }
          

    }

    /**
     * getter method for the status of whether the password check has been passed or not 
     * @return whether or not the password check has been passed 
     */
    public boolean passCheck() {
        return boolPassCheck;
    }

    
}


