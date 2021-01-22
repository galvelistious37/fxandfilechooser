package com.johnny.pack.age;

import javax.swing.*;
import java.io.File;

public class FileChooser {

    private final String START_DIR = "C:\\Users\\johnr\\Desktop\\java_dummies";
    private final String TITLE = "Select-O-Matic";

    public File selectFile(){
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
