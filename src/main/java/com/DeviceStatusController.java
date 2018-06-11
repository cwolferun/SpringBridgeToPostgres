package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
public class DeviceStatusController {
    @Autowired
    StatusDao statusDao;

    DeviceStatusController(){}


    @GetMapping("/getstatus")
    Map<String, String> getStatus(){
        return  statusDao.getStatusFromDb();
    }



}
