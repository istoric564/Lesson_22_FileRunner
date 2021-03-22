package Lesson_22_HomeWork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

/**
 * 5. Задан файл с java-кодом.Прочитать текст программы из файла и
 * записать в другой файл в обратном порядке символы каждой
 * строки.
 */
public class Task5 {
    public static void main(String[] args) {
        Path path = Path.of("src", "Lesson_22_HomeWork", "Task4.java");
        Path resources = Path.of("resources", "Task4.java");

        try (Stream<String> stringStream = Files.lines(path);
             BufferedWriter bufferedWriter = Files.newBufferedWriter(resources,APPEND, CREATE)) {
            stringStream.map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try{
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        }catch (IOException e ){
                            e.printStackTrace();
                        }
                    });

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
