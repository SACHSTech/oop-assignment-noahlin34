package Drive;
import java.util.StringTokenizer;

import Drive.*;


/**
 * This class represents a .docx file. It inherits attributes from the document class, while also containing its own unique attributes
 */

public class Docx extends Document  {

    private int intParagraphCount;
    private String strIndentationType;
    
    public Docx(int wordCount, double fileSize, String owner, String fileExtension, int paragraphCount, String indentationType) {
        super(wordCount, fileSize, owner, fileExtension);
        intParagraphCount = paragraphCount;
        strIndentationType = indentationType;
    }

    public int getParagraphCount() {
        return intParagraphCount;
    }

    public String getIndentationType() {
        return strIndentationType;
    }


}
