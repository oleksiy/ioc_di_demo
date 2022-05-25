package com.iocdi.demo;
import java.io.File;
import java.io.IOException;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

@Slf4j
public class DataWriter {
    private final String filepath = "src/main/resources/";
    private static final String FILE_NAME = "database.txt";
    private final File file;

    public DataWriter() throws IOException {
        file = FileUtils.getFile(filepath, FILE_NAME);
        log.info("here's the file -> {}", file.getAbsolutePath());

    }
}
