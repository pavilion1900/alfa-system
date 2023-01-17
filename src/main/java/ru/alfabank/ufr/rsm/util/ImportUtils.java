package ru.alfabank.ufr.rsm.util;

import lombok.SneakyThrows;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class ImportUtils {

//    public static List<String> lines(String json) {
//        String[] split = json.split("[\\r\\n]+");
//        return Arrays.asList(split);
//    }

    @SneakyThrows
    public static List<String> lines(File file) {
        return Files.readAllLines(file.toPath());
    }
}
