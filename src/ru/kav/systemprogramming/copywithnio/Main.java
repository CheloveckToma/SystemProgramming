package ru.kav.systemprogramming.copywithnio;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            long firstTime = System.currentTimeMillis();
            Path source = Paths.get("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForRead.txt");
            Path targetOne = Paths.get("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteOne.txt");
            Path targetTwo = Paths.get("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteTwo.txt");
            Files.copy(source, targetOne, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(source, targetTwo, StandardCopyOption.REPLACE_EXISTING);
            long secondTime = System.currentTimeMillis();
            System.out.println(secondTime-firstTime);
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
