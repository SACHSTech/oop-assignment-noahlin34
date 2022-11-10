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
    
    public PDF(int wordCount, double fileSize, String owner, String fileExtension, boolean boolIsProtected, String strPassword) {
        super(wordCount, fileSize, owner, fileExtension);
        this.boolIsProtected = boolIsProtected;
        this.strPassword = strPassword;
        this.boolPassCheck = false;
    }

    public String getPassword() {
        return this.strPassword;
    }

    public boolean boolIsProtected() {
        return this.boolIsProtected;
    }

    public void checkPass(String[] args) throws IOException {
        

         while(boolPassCheck = false) {
            System.out.println("Please type password");
            String input = keyboard.readLine();
            if(input.equals(strPassword)) {
                boolPassCheck = true;
            } else {
                continue;
            }
          }

    }

    
}


