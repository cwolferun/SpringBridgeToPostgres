package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class DeviceStatusController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StatusDao statusDao;

    DeviceStatusController() {
    }

    //returns all available information for every every device in storage
    @GetMapping("/getall")
    List<Device> getAll() {
        return statusDao.getStatusFromDb();
    }

    //returns a history of most recent 15 timestamps and network speeds for an individual device
    @GetMapping("/gethistory/{ip}")
    List<Map<String, Object>> gethistory(@PathVariable String ip) {

        List<Map<String, Object>> entireHistory = statusDao.getHistory(ip.replaceAll("[.]", ""));

        int historyLength = entireHistory.size();

        if (historyLength<16){
            return entireHistory;
        }

        return entireHistory.subList(historyLength-15,historyLength);

    }

    //returns a the last store speed for a single device
    @GetMapping("/getonespeed/{ip}")
    String getOneSpeed(@PathVariable String ip) {
        return statusDao.getOneSpeed(ip);
    }


}
