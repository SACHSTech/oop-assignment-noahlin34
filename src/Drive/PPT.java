package Drive;
import Drive.*;

public class PPT extends Document {
    
    //initializing variables
    private int intSlideCount;
    private String strTheme;

    /**
     * Constructor method for the pdf object that is child of document
     * @param wordCount number of words, inherited from documents
     * @param owner owner of the file, inherited from document
     * @param fileExtension file extension, inherited from document
     * @param slideCount number of slides
     * @param strTheme slideshow theme
     * @param strTitle title, inherited from document 
     */
    public PPT(int wordCount, String owner, String fileExtension, int slideCount, String strTheme, String strTitle) {
        super(wordCount, owner, fileExtension, strTitle);

        this.intSlideCount = slideCount;
        this.strTheme = strTheme;
        
    }

    /**
     * Getter method for the number of slides 
     * @return number of slides 
     */
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
