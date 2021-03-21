package Lesson_22;

import java.io.File;
import java.io.IOException;

/**            output stream
 * application ----> file
 *              input stream
 * application <---- file
 */
public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/text.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getAbsolutePath());

        File dir = new File("resources/test/dir ");
        dir.mkdirs();


    }
}
