package Drive;

import java.lang.invoke.WrongMethodTypeException;

/**
 * 
 * This will be the main document class that all other classes will extend
 * 
 */

public class Document {
    
    private int intWordCount;
    private double dblFileSize;
    private String strOwner;
    private String strFileExtension;
    private String strTitle;

    /**
     * Constructor for document object
     * @param wordCount: number of words in the file 
     * @param fileSize: size of the file in gb
     * @param owner: the username of the person that owns the file
     * @param fileExtension: the file extension, .docx, .ppt, etc. 
     */
    public Document(int wordCount, double fileSize, String owner, String fileExtension, String strTitle) {
        this.intWordCount = wordCount;
        this.dblFileSize = fileSize;
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

    public String getTitle() {
        return strTitle;
    }
    /**
     * Getter method for dblFileSize
     * @return size of the file in gb 
     */
    public double getFileSize() {
        dblFileSize = 1.1 * intWordCount;
        return dblFileSize;
    }


    /**
     * Getter method for strFileExtension
     * @return file extension
     */
    public String getFileExtension() {
        return strFileExtension;
    }





}
