package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
public class DeviceStatusController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StatusDao statusDao;

    DeviceStatusController() {
    }


    @GetMapping("/getall")
    List<Device> getAll() {
        return statusDao.getStatusFromDb();
    }

    @GetMapping("/gethistory/{ip}")
    List<Map<String, Object>> gethistory(@PathVariable String ip) {
        return statusDao.getHistory(ip.replaceAll("[.]", ""));

    }

    @GetMapping("/getonespeed/{ip}")
    String getOneSpeed(@PathVariable String ip) {

        return statusDao.getOneSpeed(ip);

    }


}
