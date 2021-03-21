package Lesson_22_HomeWork;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * 1. Задан файл с текстом, найти и вывести в консоль все слова,
 * начинающиеся с гласной буквы.
 */
public class Task1 {
//    Объявляем список гласных букв
    private static final String VOWELS = "аоэеиыуёюя";

    public static void main(String[] args) throws IOException {

        Path path = Path.of("resources", "text.txt");
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNext()){
//               Проверяем значение и переводим в нижний регистр
                String word = scanner.next().toLowerCase();
//                присваиваем значение первого символа.
                char firstSymbol = word.charAt(0);
//                is true. In either case, if no such character occurs in this string, then -1 is returned.
                if (VOWELS.indexOf(firstSymbol) != -1){
                    System.out.println(word);
                }
            }
        }
    }
}
