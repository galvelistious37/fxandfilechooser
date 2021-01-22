package com.johnny.pack.age;

import javax.swing.*;
import java.io.File;

class FileChooser {

    /**
     * Opens a JFileChooser and allows the user to select
     * a file from the GUI.
     * @return a File object or null
     */
    File selectFile(){
        final String START_DIR = "C:\\Users\\johnr\\Desktop\\java_dummies";
        final String TITLE = "Select-O-Matic";
        JFileChooser fc = new JFileChooser(START_DIR);
        fc.setDialogTitle(TITLE);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fc.setMultiSelectionEnabled(false);
        int result = fc.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            return fc.getSelectedFile();
        } else {
            return null;
        }
    }
}
