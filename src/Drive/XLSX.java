package Drive;
import Drive.*;

public class XLSX extends Document {

    private int intRowCount;
    private int intColumnCount;

    
    public XLSX(int wordCount, double fileSize, String owner, String fileExtension, int intRowCount, int intColumnCount) {
        super(wordCount, fileSize, owner, fileExtension);

        this.intColumnCount = intColumnCount;
        this.intRowCount = intRowCount;

    }

    public int getRowCount() {
        return this.intRowCount;
    }

    public int getColumnCount() {
        return this.intColumnCount;
    }

    public int getTotalCellCount() {
        return this.intRowCount * this.intColumnCount;
    }


    
}
