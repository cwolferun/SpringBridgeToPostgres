package com;

public class Device {
    private String ipAddress;
    private String speed;
    private String devicename;

    public Device(String ipAddress, String speed, String devicename, String devicetype, String firstScanned) {
        this.ipAddress = ipAddress;
        this.speed = speed;
        this.devicename = devicename;
        this.devicetype = devicetype;
        this.firstscanned = firstScanned;
    }

    private String devicetype;

    public String getFirstscanned() {
        return firstscanned;
    }

    public void setFirstscanned(String firstscanned) {
        this.firstscanned = firstscanned;
    }

    private String firstscanned;

    Device() {
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }


    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getDevicetype() {
        return devicetype;
    }

    public void setDevicetype(String devicetype) {
        this.devicetype = devicetype;
    }
}
