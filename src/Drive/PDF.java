package Drive;
import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;

import Drive.*;


public class PDF extends Document {

    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in)); 


    private boolean boolIsProtected;
    private String strPassword;
    private boolean boolPassCheck;
    
    public PDF(int wordCount, double fileSize, String owner, String fileExtension, boolean boolIsProtected, String strPassword, String strTitle) {
        super(wordCount, fileSize, owner, fileExtension, strTitle);
        this.boolIsProtected = boolIsProtected;
        this.strPassword = strPassword;
        this.boolPassCheck = false;
    }

    public String getPassword() {
        return this.strPassword;
    }

    public boolean isProtected() {
        return this.boolIsProtected;
    }

    public void checkPass(String pass) {   
            if(pass.equals(strPassword)) {
                boolPassCheck = true;
            } else {
                boolPassCheck = false;
                System.out.println("Incorrect password, returning...");
            }
          

    }

    public boolean passCheck() {
        return boolPassCheck;
    }

    
}


