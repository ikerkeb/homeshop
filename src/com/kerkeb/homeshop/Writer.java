package com.kerkeb.homeshop;

public interface Writer {

    /**
     * Start writing process
     */
    public void start();

    /**
     * Write on line
     * @param line
     */
    public void writeLine(String line);

    /**
     * stop writing process
     */
    public void stop();
}
