package Drive;
import Drive.*;

public class XLSX extends Document {

    private int intRowCount;
    private int intColumnCount;
    private int intTotalCellcount;

    public XLSX(int wordCount, double fileSize, String owner, String fileExtension, int intRowCount, int intColumnCount) {
        super(wordCount, fileSize, owner, fileExtension);

        this.intColumnCount = intColumnCount;
        this.intRowCount = intRowCount;
    }
    
}
