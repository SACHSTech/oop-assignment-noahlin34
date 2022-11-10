package Drive;
import Drive.*;


public class PDF extends Document {


    private boolean boolIsProtected;
    private String strPassword;
    private boolean boolPassCheck;
    
    public PDF(int wordCount, double fileSize, String owner, String fileExtension, boolean boolIsProtected, String strPassword) {
        super(wordCount, fileSize, owner, fileExtension);
        this.boolIsProtected = boolIsProtected;
        this.strPassword = strPassword;
        this.boolPassCheck = false;
    }

    
}


