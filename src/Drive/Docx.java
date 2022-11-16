package Drive;
import java.util.StringTokenizer;

import Drive.*;


/**
 * This class represents a .docx file. It inherits attributes from the document class, while also containing its own unique attributes
 */

public class Docx extends Document  {

    //initizlizing variables
    private int intParagraphCount;
    private String strIndentationType;
    
    /**
     * Constructor to create a docx file 
     * @param wordCount - number of words, inherited from document
     * @param fileSize - size of the file, inherited from document
     * @param owner - owner of this file, inherited from document
     * @param fileExtension - file extension, inherited from document
     * @param paragraphCount - number of pagraphs in this docx
     * @param indentationType - indentation type used in this docx
     * @param strTitle - title of the file, inherited from document
     */
    public Docx(int wordCount, double fileSize, String owner, String fileExtension, int paragraphCount, String indentationType, String strTitle) {
        super(wordCount, fileSize, owner, fileExtension, strTitle);
        intParagraphCount = paragraphCount;
        strIndentationType = indentationType;
    }

    /**
     * getter method for number of paragraphs
     * @return number of paragraphs
     */
    public int getParagraphCount() {
        return intParagraphCount;
    }

    /**
     * getter method for indentation type
     * @return indentation method used 
     */
    public String getIndentationType() {
        return strIndentationType;
    }


}
