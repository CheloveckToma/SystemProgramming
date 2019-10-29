package ru.kav.systemprogramming.copywithnioalong;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyNIO extends Thread {
String path;
    CopyNIO(String path){
        this.path = path;
        start();
    }
    public void run(){
        long firstTime = System.currentTimeMillis();
        try {
            Path source = Paths.get("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForRead.txt");
            Path target = Paths.get(path);
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        long secondTime = System.currentTimeMillis();
        System.out.println(secondTime - firstTime);


    }
}
