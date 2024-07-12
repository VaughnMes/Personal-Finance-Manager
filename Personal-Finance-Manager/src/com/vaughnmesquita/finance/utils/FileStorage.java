package com.vaughnmesquita.finance.utils;

import java.io.*;
import java.util.List;

public class FileStorage {
    public static void saveToFile(String filename, List<?> data) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(data);
        }
    }

    public static List<?> loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (List<?>) ois.readObject();
        }
    }
}