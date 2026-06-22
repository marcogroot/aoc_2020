import java.util.*;
import java.nio.file.*;

public class Day04 {
    public static Integer part1(List<String> input) {
        return -1;
    }

    public static Integer part2(List<String> input) {
        return -1;
    }

    public static void main(String[] args) throws Exception {
        var input = Files.readAllLines(Path.of("day4.txt")).stream()
            .filter(s -> !s.isBlank())
            .toList();
        System.out.println(part1(input));
        System.out.println(part2(input));
    }
}
