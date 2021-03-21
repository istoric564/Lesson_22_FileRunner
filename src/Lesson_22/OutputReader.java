package Lesson_22;

import java.io.*;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

public class OutputReader {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources","output.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String value = "Hello World!";
            outputStream.write(value.getBytes(StandardCharsets.UTF_8));
            outputStream.write(System.lineSeparator().getBytes(StandardCharsets.UTF_8));

        }
    }
}
