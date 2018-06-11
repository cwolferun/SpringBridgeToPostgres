package com;

import org.springframework.stereotype.Component;

public class Device {
    private String ipAddress;
    private String speed;
    private String devicename;
    private String devicetype;

    Device() {
    }

    public Device(String ipAddress, String speed, String devicename, String devicetype) {
        this.ipAddress = ipAddress;
        this.speed = speed;
        this.devicename = devicename;
        this.devicetype = devicetype;
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
