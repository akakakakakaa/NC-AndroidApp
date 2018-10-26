package com.vuforia.samples.ARVR;

public class STTServerOpts {
    private String ip = "163.180.117.216";
    private int port = 9091;
    private int maxReadSize = 1024;

    public STTServerOpts(String ip, int port, int maxReadSize) {
        this.ip = ip;
        this.port = port;
        this.maxReadSize = maxReadSize;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public int getMaxReadSize() {
        return maxReadSize;
    }

    public void setMaxReadSize(int maxReadSize) {
        this.maxReadSize = maxReadSize;
    }
}
