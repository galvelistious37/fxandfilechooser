package com.johnny.pack.age;

import java.io.File;

public class TextFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File f) {
        if(f.isDirectory()){
            return true;
        }
        String name = f.getName();
        if(name.matches(".*\\.txt")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Text Files (*.txt)";
    }
}
