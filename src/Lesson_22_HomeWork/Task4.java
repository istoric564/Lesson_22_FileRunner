package Lesson_22_HomeWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 4. Задан файл с java-кодом.Прочитать текст программы из файла и
 все слова public в объявлении атрибутов и методов класса заменить
 на слово private. Результат сохранить в другой заранее созданный
 файл.
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "Lesson_22_HomeWork", "Task3.java");
        String string = Files.readString(path);
        String replace = string.replace("public", "private");

        Path resources = Path.of("resources", "Task3.java");

        Files.writeString(resources, replace);
    }
}
