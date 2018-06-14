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
    private final String GET_SINGLE_SPEED = "SELECT speed FROM devices where ipaddress = ";
                                            //"select count(*) from t_actor where first_name = ?"

    List<Device> getStatusFromDb() {

        return jdbcTemplate.query(GET_DEVICES,
                new BeanPropertyRowMapper<>(Device.class));

    }

    String getOneSpeed(String ipaddress) {
        logger.info("getting " + ipaddress);
        return jdbcTemplate.queryForList(GET_SINGLE_SPEED+"'"+ipaddress+"'", String.class).get(0);

    }


    List<Map<String, Object>> getHistory(String ipAddress) {

        return jdbcTemplate.queryForList("select * from ip" + ipAddress + ";");
    }


}
