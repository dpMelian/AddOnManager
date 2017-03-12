package addonmanager;

import gui.AddOnGUI;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author dpMelian
 */

public class AddOn {

    private String name;
    private static String spawn;
    private static LinkedList<AddOn> list = new LinkedList<>();
    private FileWriter fw = null;
    
    Properties properties = new Properties();
    
    public AddOn(String nombre, String sp) {
        
        this.name = nombre;
        this.spawn = sp;
        
        AddOnGUI.list1.add(this.name);
        list.add(this);
        
        AddOnManager.ldapContent.put(nombre, sp);
        AddOnManager.pathStrings.add(sp);
        
        System.out.println(AddOnManager.ldapContent.size());
        
        for (Map.Entry<String,String> entry : AddOnManager.ldapContent.entrySet()) {
            properties.put(entry.getKey(), entry.getValue());
        }

        try{
            properties.store(new FileOutputStream("data.properties"), null);
        } catch(Exception e) {
            
        }
    }
    
    public LinkedList<AddOn> getList() {
        return list;
    }

    public static String getSpawn() {
        return spawn;
    }
    
}