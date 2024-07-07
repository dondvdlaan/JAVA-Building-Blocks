package dev.manyroads;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class TestLogFile {

    static final String LOG_FILE_PATH = "E:\\applications\\java\\JAVA-Building-Blocks\\log.text";

    static void writeToLog(String body) throws IOException {
        try{
            Files.writeString(
                    Path.of(LOG_FILE_PATH),
                    body,
                    StandardOpenOption.APPEND);
        } catch(IOException ex){
            throw new IOException("Foutje schrijven naar log");
        }
    }
    static Stream<String> readFromLog() throws IOException {

        return Files.lines(Path.of(LOG_FILE_PATH));

    }

    static void createBufferFile() {
        try{
            // New file is created at the root
            Files.createFile(Path.of("fileName2.txt"));
            Files.writeString(
                    Path.of("fileName2.txt"),
                    "testBody",
                    StandardOpenOption.APPEND);

        }catch(IOException ex){
            System.out.println("Foutje: " + ex.getMessage());
        }

    }
    public static void main(String[] args) throws IOException {
        //TestLogFile.writeToLog("Schrijven naar log \n");
        //TestLogFile.writeToLog("Schrijven naar log, nog een keer \n");

        //TestLogFile.readFromLog().forEach(System.out::println);
        TestLogFile.createBufferFile();
    }
}
