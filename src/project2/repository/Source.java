package project2.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Source {
    public String readFromFile(String pathToFile) {
        try {
            List<String> strings = Files.readAllLines(Paths.get(pathToFile));
            return strings.stream().collect(Collectors.joining());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }
}
