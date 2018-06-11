package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StatusDao {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final String GET_DEVICES = "SELECT ipAddress, status FROM mytable";



    Map<String, String> getStatusFromDb() {
        HashMap<String, String> deviceStatuses = new HashMap<>();

        List<Device> devices = jdbcTemplate.query(GET_DEVICES,
                new BeanPropertyRowMapper<>(Device.class));

        for (Device device : devices) {
            deviceStatuses.put(device.getIpAddress(), device.getStatus());
        }

        return deviceStatuses;
    }
}
