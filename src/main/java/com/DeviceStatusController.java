package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Map;

@RestController
public class DeviceStatusController {
    @Autowired
    StatusDao statusDao;

    DeviceStatusController(){}


    @GetMapping("/getall")
    List<Device> getAll(){
        return  statusDao.getStatusFromDb();
    }



}
