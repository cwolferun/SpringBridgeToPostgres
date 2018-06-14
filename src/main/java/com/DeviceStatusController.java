package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

@GetMapping("/gethistory/:ip")
    Map<String,String> gethistory(@RequestParam String ip){

}



}
