package org.example;

import lombok.extern.log4j.Log4j2;

import java.util.HashMap;
import java.util.Map;

@Log4j2
public class KVStore {

    private WriteAheadLog wal;
    private Map<String, String> datastore;

    public KVStore(String filePath) {
        this.wal = WriteAheadLog.openWAL(filePath);
        datastore = new HashMap<>();
    }

    public void applyLog() {

    }
}
