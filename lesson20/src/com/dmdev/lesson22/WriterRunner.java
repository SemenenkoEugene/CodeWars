package com.dmdev.lesson22;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriterRunner {

    public static void main(String[] args) throws IOException {
        Path file = Path.of("resources", "writer.poem");
//
        try (BufferedWriter fileWriter = Files.newBufferedWriter(file)) {
            fileWriter.append("Hello World!");
            fileWriter.newLine();
            fileWriter.append("Java");
        }
    }
}
