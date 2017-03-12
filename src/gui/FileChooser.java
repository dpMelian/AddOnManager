package gui;

import java.io.File;
import javax.swing.JFileChooser;
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.*;

/**
 *
 * @author dpMelian
 */

public class FileChooser {
    private static String current;
    
    public FileChooser(String spawn) {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File src = chooser.getSelectedFile();
        
        File dest = new File("src/resources/" +
                spawn + ".jpg");
        dest.mkdirs();
        
        try{
            Files.copy(src.toPath(), dest.toPath(), REPLACE_EXISTING);
        } catch (Exception e){
            e.printStackTrace();
        }
        
        current = src.getAbsolutePath();
    }

    public static String getCurrent() {
        return current;
    }
}
