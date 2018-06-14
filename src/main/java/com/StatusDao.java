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

    private final String GET_DEVICES = "SELECT * FROM devices";
    private final String GET_SINGLE_SPEED = "SELECT speed FROM devices where ipaddress =?";


    List<Device> getStatusFromDb() {

        return jdbcTemplate.query(GET_DEVICES,
                new BeanPropertyRowMapper<>(Device.class));

    }

    String getOneSpeed(String ipaddress) {

        return jdbcTemplate.query(GET_SINGLE_SPEED,
                new BeanPropertyRowMapper<>(String.class), ipaddress).get(0);

    }


    Map<String, Object> getHistory(String ipAddress) {
        return jdbcTemplate.queryForMap("select * from ip" + ipAddress);
    }


}
