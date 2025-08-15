package techmahindra.Java8;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Java 8 changes to return file lines as a stream and then work on streams....
 */
public class ReadingFiles {

    public static void main(String[] args) {
        Path filePath = Paths.get("./src/main/java/Java8", "Notes.txt");

        //try-with-resources
        try (Stream<String> lines = Files.lines( filePath ))
        {
            lines.forEach(System.out::println);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //Get the file reference
        Path path = Paths.get("./src/main/java/Java8/Notes.txt");

        //Use try-with-resource to get auto-closeable writer instance
        try (BufferedWriter writer = Files.newBufferedWriter(path))
        {
            writer.write("First line written by java8 writer");
            writer.newLine();
            writer.write("Second line written by java8 writer after new line");
        }catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
