package org.example;


public class WriteAheadLog {

    private final String filePath;

    private WriteAheadLog(String filePath) {
        this.filePath = filePath;
    }

    public static WriteAheadLog openWAL(String filePath) {
        return new WriteAheadLog(filePath);
    }
}
