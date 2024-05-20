package com.DkAngelo.exercises.collections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordAfterWord {
    public static String wordAfterWord(String filename, String word) throws IOException{
        List<String> lines = getLines(filename);
        TreeSet<String> words = new TreeSet<>();
        for(String line : lines){
            words.addAll(lineToWords(line.toLowerCase()));
        }
        return words.tailSet(word, false).getFirst();
    }

    public static List<String> getLines(String filename) throws IOException {
        return Files.readAllLines(Path.of(filename));
    }
    public static List<String> lineToWords(String line) {
        return Arrays.asList(line.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
    }
}
