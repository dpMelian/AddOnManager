package gui;

import addonmanager.AddOnManager;
import java.awt.Image;
import java.io.File;
import java.util.Scanner;
import javax.swing.ImageIcon;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;
import javax.swing.JOptionPane;

/**
 *
 * @author dpMelian
 */

public class AddOnGUI extends javax.swing.JFrame {
    Properties prop;
    InputStream input = null;
    
    public void showImg(String path){
        try{
            ImageIcon icon = new ImageIcon(this.getClass().
                    getResource("/resources/" + path + ".jpg");
            Image scaleImage = icon.getImage().getScaledInstance(192,
                -1,Image.SCALE_AREA_AVERAGING);
            
        
            img.setIcon(new ImageIcon(scaleImage));
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null,
                "No se encontró imagen para este elemento");
        }
    }
        
    /**
     * Creates new form AddOnGUI
     */
    public AddOnGUI() {
        initComponents();
        
        prop = new Properties();
        
        try {
            File data = new File("data.properties");
            data.createNewFile();
            
            input = new FileInputStream(data);

            // load a properties file
            prop.load(input);
                
            // get the property value and print it out
            for (String key : prop.stringPropertyNames()) {
                String value = prop.getProperty(key);
                    
                AddOnManager.ldapContent.put(key, value);
                    
                list1.add(key);
            }

            // Read paths file
            File paths = new File("paths");
            paths.createNewFile();
                
            Scanner scanner = new Scanner(paths);
            while(scanner.hasNext()){
                AddOnManager.pathStrings.add(scanner.next());
            }
            scanner.close();
                
	} catch (IOException ex) {
            ex.printStackTrace();
	}finally {
            if (input != null) {
                try {
                    input.close();
		} catch (IOException e) {
                    e.printStackTrace();
		}
            }
	}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logo = new javax.swing.JLabel();
        anadir = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        list1 = new java.awt.List();
        img = new javax.swing.JLabel();
        ordenar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gtaLogo.png"))); // NOI18N

        anadir.setText("Añadir");
        anadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        ordenar.setText("Ordenar");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ordenar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addGap(74, 74, 74)
                .addComponent(img)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(anadir)
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 296, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(modificar)
                        .addGap(95, 95, 95))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ordenar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(img)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anadir)
                    .addComponent(borrar)
                    .addComponent(modificar))
                .addGap(45, 45, 45)
                .addComponent(salir)
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(671, 475));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void anadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirActionPerformed
        // TODO add your handling code here:
        Anadir anadir = new Anadir(this, true);
        anadir.setVisible(true);
    }//GEN-LAST:event_anadirActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed
        // TODO add your handling code here:
        String key = list1.getSelectedItem();
        System.out.println(key);
        System.out.println(AddOnManager.ldapContent.get(key));
        
        try{
            showImg(AddOnManager.ldapContent.get(key));
        } catch (Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_list1ActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        // TODO add your handling code here:
        System.out.println(list1.getSelectedItem());
        AddOnManager.ldapContent.remove(list1.getSelectedItem());
        
        System.out.println(AddOnManager.ldapContent);
        
        try {
            File data = new File("data.properties");
            data.createNewFile();
                
            input = new FileInputStream(data);

            // load a properties file
            prop.load(input);
            prop.remove(list1.getSelectedItem());
            System.out.println(prop);
            prop.store(new FileOutputStream("data.properties"), null);
            list1.remove(list1.getSelectedItem());
            
        } catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed
        // TODO add your handling code here:
        
        String[] ar = list1.getItems();
        Arrays.sort(ar); 
            
        list1.removeAll();
            
        for(String item : ar){
            list1.add(item);
        }
    }//GEN-LAST:event_ordenarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        // TODO add your handling code here:
        String str = list1.getSelectedItem();
        
        if(str != null && !str.equals("")){
            Modificar modif = new Modificar(null, true, 
                    list1.getSelectedItem());
            modif.setSpLabel();
            modif.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null,
                "Selecciona un vehículo");
        }
    }//GEN-LAST:event_modificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddOnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddOnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddOnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddOnGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddOnGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadir;
    private javax.swing.JButton borrar;
    public static javax.swing.JLabel img;
    public static java.awt.List list1;
    private javax.swing.JLabel logo;
    private javax.swing.JButton modificar;
    private javax.swing.JButton ordenar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}