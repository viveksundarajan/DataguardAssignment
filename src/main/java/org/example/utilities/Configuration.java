package org.example.utilities;

public class Configuration {

    private long currentTimestamp;

    public String getTimestamp() {
        return Long.toString(currentTimestamp);
    }

    public String todoNameWithTimeStamp(final String toTimestamp) {
        currentTimestamp = System.currentTimeMillis();
        return toTimestamp.replace("<timestamp>", Long.toString(currentTimestamp));
    }
}
