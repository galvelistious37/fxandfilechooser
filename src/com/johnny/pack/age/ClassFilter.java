package com.johnny.pack.age;

import java.io.File;

public class ClassFilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File f) {
        if(f.isDirectory()){
            return true;
        }
        String name = f.getName();
        if(name.matches(".*\\.class")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getDescription() {
        return "Class Files (*.class)";
    }
}
