package Drive;
import Drive.*;

public class PPT extends Document {
    

    private int intSlideCount;
    private String strTheme;

    public PPT(int wordCount, double fileSize, String owner, String fileExtension, int slideCount, String strTheme) {
        super(wordCount, fileSize, owner, fileExtension);

        this.intSlideCount = slideCount;
        this.strTheme = strTheme;
        
    }


    public int getSlideCount() {
        return intSlideCount;
    }
    
    /**
     * Getter method to return the type of theme the slide show has
     * @return Theme of the slideshow file
     */
    public String getTheme() {
        return strTheme;
    }

}
