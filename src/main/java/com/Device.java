package com;

import org.springframework.stereotype.Component;

public class Device {
    private String ipAddress;
    private String status;

    Device(){}

    public Device(String ipAddress, String status) {
        this.ipAddress = ipAddress;
        this.status = status;
    }


    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
