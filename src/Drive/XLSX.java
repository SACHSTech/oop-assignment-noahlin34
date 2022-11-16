package Drive;
import Drive.*;

public class XLSX extends Document {

    private int intRowCount;
    private int intColumnCount;

    /**
     * Constructor method for xlsx 
     * @param wordCount number of words, inherited from document
     * @param fileSize size of the file, inherited from document 
     * @param owner owner of the file, inherited from document
     * @param fileExtension file extension, inherited from document
     * @param intRowCount number of rows
     * @param intColumnCount number of columns
     * @param strTitle title of the file, inherited from document
     */
    public XLSX(int wordCount, double fileSize, String owner, String fileExtension, int intRowCount, int intColumnCount, String strTitle) {
        super(wordCount, fileSize, owner, fileExtension, strTitle);
        this.intColumnCount = intColumnCount;
        this.intRowCount = intRowCount;

    }

    /**
     * Getter method for the number of rows 
     * @return number of rows 
     */
    public int getRowCount() {
        return this.intRowCount;
    }

    /**
     * getter method for columns
     * @return number of columns
     */
    public int getColumnCount() {
        return this.intColumnCount;
    }

    /**
     * getter methdo for cell count 
     * @return number of cells 
     */
    public int getTotalCellCount() {
        return this.intRowCount * this.intColumnCount;
    }


    
}
