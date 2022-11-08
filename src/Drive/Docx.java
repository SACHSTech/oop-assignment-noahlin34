package Drive;
import java.util.StringTokenizer;

import Drive.*;

public class Docx extends Document  {

    private int intParagraphCount;
    private String strIndentationType;
    
    public Docx(int wordCount, double fileSize, String owner, String fileExtension, int paragraphCount, String indentationType) {
        super(wordCount, fileSize, owner, fileExtension);
        paragraphCount = intParagraphCount;
        indentationType = strIndentationType;
    }

    public int getParagraphCount() {
        return intParagraphCount;
    }

    public String getIndentationType() {
        return strIndentationType;
    }


}
