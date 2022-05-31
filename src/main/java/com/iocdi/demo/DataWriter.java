package com.iocdi.demo;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import ch.qos.logback.core.util.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataWriter {
    private final String filepath = "src/main/resources/";
    private static final String FILE_NAME = "database.txt";
    private final File file;

    public DataWriter() {
        file = FileUtils.getFile(filepath, FILE_NAME);
        log.info("here's the file -> {}", file.getAbsolutePath());
    }

    public void save(String data) {
        try {
            FileUtils.writeStringToFile(file, data, StandardCharsets.UTF_8, true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getFilepath() {
        return this.filepath;
    }
}
