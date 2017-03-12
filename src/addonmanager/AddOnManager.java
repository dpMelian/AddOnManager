package addonmanager;

import gui.AddOnGUI;
import java.util.*;

/**
 *
 * @author dpMelian
 */

public class AddOnManager {
    public static Map<String,
            String> ldapContent = new HashMap<String, String>();
    
    public static ArrayList<String> pathStrings = new ArrayList<String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AddOnGUI gui = new AddOnGUI();
        gui.setVisible(true);
    }
}