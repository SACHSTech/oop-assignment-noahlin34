package Drive;

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

    /**
     * Constructor for document object
     * @param wordCount: number of words in the file 
     * @param fileSize: size of the file in gb
     * @param owner: the username of the person that owns the file
     * @param fileExtension: the file extension, .docx, .ppt, etc. 
     */
    public Document(int wordCount, double fileSize, String owner, String fileExtension) {
        intWordCount = wordCount;
        dblFileSize = fileSize;
        strOwner = owner;
        fileExtension = strFileExtension;
    }


    /**
     * Getter method for the intWordCount object
     * @return number of words 
     */
    public int getWordCount() {
        return intWordCount;
    }

    /**
     * Getter method for dblFileSize
     * @return size of the file in gb 
     */
    public double getFileSize() {
        return dblFileSize;
    }

    /**
     * Getter method for strOwner
     * @return name of the person who owns the file 
     */
    public String getOwner() {
        return strOwner;
    }

    /**
     * Getter method for strFileExtension
     * @return file extension
     */
    public String getFileExtension() {
        return strFileExtension;
    }





}
