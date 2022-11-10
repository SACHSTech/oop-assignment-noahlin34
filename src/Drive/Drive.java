package Drive;
import java.util.ArrayList;

import javax.print.Doc;

import Drive.*;


public class Drive {
    
    private int intFileCount;
    private double dblStorageSize;
    private String strAccountName;
    private String strAccountEmail;
    private ArrayList<Document> arrDocuments = new ArrayList<Document>();


    public Drive(int intFileCount, double dblStorageSize, String strAccountName, String strAccountEmail, ArrayList<Document> arrDocuments) {

        this.intFileCount = intFileCount;
        this.dblStorageSize = dblStorageSize;
        this.strAccountEmail = strAccountEmail;
        this.strAccountName = strAccountName;

        this.arrDocuments.addAll(arrDocuments);

    }


    public int getFileCount() {
        return intFileCount;
    }

    public double getStorageSize() {
        return dblStorageSize;
    }

    public String getAccountName() {
        return strAccountName;  
    }

    public String getAccountEmail() {
        return strAccountEmail;
    }

    public ArrayList<Document> returnArr() {
        return arrDocuments;
    }

    
}
