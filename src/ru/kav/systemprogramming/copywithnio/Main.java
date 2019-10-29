package ru.kav.systemprogramming.copywithnio;

import java.io.IOException;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        try {
            long firstTime = System.currentTimeMillis();
            Path sourceOne = Paths.get("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForRead.txt");
            Path targetOne = Paths.get("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteOne.txt");
            Path sourceTwo = Paths.get("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForRead.txt");
            Path targetTwo = Paths.get("src\\\\ru\\\\kav\\\\systemprogramming\\\\copywithnio\\\\fileForWriteTwo.txt");
            Files.copy(sourceOne, targetOne, StandardCopyOption.REPLACE_EXISTING);
            Files.copy(sourceTwo, targetTwo, StandardCopyOption.REPLACE_EXISTING);
            long secondTime = System.currentTimeMillis();
            System.out.println("Время выполнения программы: " + (secondTime-firstTime));
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода " + e);
        }
    }
}
