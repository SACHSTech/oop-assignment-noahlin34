package Drive;
import java.util.ArrayList;
import javax.print.Doc;
import Drive.*;


/**
 * This is the parent drive class. This class represents the top level drive. It contains the array of documents, and has 
 * its own parameters that represent global statistics. 
 * @author Noah Lin 
 */
public class Drive {
    
    //variable declaration
    private int intFileCount;
    private double dblStorageSize;
    private String strAccountName;
    private String strAccountEmail;
    
    //arraylist that will contain all of the document objects
    private ArrayList<Document> arrDocuments;


    /**
     * constructor method for the drive object 
     * @param intFileCount number of files contained
     * @param dblStorageSize total storage size of the drive 
     * @param strAccountName name of the account the drive belongs to 
     * @param strAccountEmail email of the account the drive belongs to 
     * @param arrDocuments array containing all of the document objects the drive contains
     */
    public Drive(int intFileCount, String strAccountName, String strAccountEmail, ArrayList<Document> arrDocuments) {

        this.intFileCount = intFileCount;
        this.strAccountEmail = strAccountEmail;
        this.strAccountName = strAccountName;
        this.arrDocuments = arrDocuments;
        this.arrDocuments.addAll(arrDocuments);

    }


    /**
     * getter method for the file count 
     * @return number of files in the drive 
     */
    public int getFileCount() {
        return intFileCount;
    }

    /**
     * getter method that computes and returns total storage size of the drive 
     * @return total storage size of the drive 
     */
    public double getStorageSize() {
        double dblStorageSize = 0;

        //adds up the storage space taken up by each file contained in the drive. 
        for(int x = 0; x < intFileCount; x++) {
            dblStorageSize = dblStorageSize + getDocument(x).getFileSize();
        }

        return dblStorageSize;
    }

    /**
     * getter method for the name of the account the drive belongs to 
     * @return account name 
     */
    public String getAccountName() {
        return strAccountName;  
    }

    /**
     * getter method for the email the drive belongs to 
     * @return email address
     */ 
    public String getAccountEmail() {
        return strAccountEmail;
    }

    /**
     * getter method that returns the entire arraylist of documents 
     * @return arraylist of all files 
     */
    public ArrayList<Document> getDocuments() {
        return arrDocuments;
    }

    /**
     * getter method that retrieves and returns one singular item from the document arraylist 
     * @param i position of the item to be returned 
     * @return the queried item from the arraylist at position i 
     */ 
    public Document getDocument(int i) {
        return arrDocuments.get(i);
    }

}
