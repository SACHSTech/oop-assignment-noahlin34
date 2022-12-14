package Drive;

import java.lang.invoke.WrongMethodTypeException;

/**
 * This will be the main document class that all other classes will extend. It has general paremeters needed by all file types
 * @author Noah Lin 
 * 
 */

public class Document {
    
    //initializing variables
    private int intWordCount;
    private double dblFileSize;
    private String strOwner;
    private String strFileExtension;
    private String strTitle;

 
    /**
     * constructor method for document parent object
     * @param wordCount number of words in the file 
     * @param fileSize size of the file
     * @param owner
     * @param fileExtension
     * @param strTitle
     */
    public Document(int wordCount, String owner, String fileExtension, String strTitle) {
        this.intWordCount = wordCount;
        this.strOwner = owner;
        this.strTitle = strTitle;
        this.strFileExtension = fileExtension;
    }


    /**
     * Getter method for the intWordCount object
     * @return number of words 
     */
    public int getWordCount() {
        return intWordCount;
    }

    /**
     * Getter method for the owner 
     * @return owner of the file 
     */
    public String getOwner() {
        return strOwner;
    }

    /**
     * getter method for the title
     * @return the title
     */
    public String getTitle() {
        return strTitle;
    }
    /**
     * Getter method for dblFileSize using calculation
     * @return size of the file in kb, rounded  
     */
    public double getFileSize() {
        //derives file size based on word count 
        dblFileSize = 1.1 * intWordCount;
        
        
        return ((double) Math.round(dblFileSize * 100) / 100);
    }


    /**
     * Getter method for strFileExtension
     * @return file extension
     */
    public String getFileExtension() {
        return strFileExtension;
    }





}
