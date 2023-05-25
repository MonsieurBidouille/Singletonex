import java.io.FileNotFoundException;

public class Sngt_cosettings {
    private static Cosettings instance = null;

    private Sngt_cosettings() {
    }

    public static Cosettings getInstance() throws FileNotFoundException {
        if ( instance == null ) {
            instance = new Cosettings();
        }
        return instance;
    }
}
