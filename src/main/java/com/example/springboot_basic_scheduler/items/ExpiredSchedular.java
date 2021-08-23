package com.example.springboot_basic_scheduler.items;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ExpiredSchedular {

    private static final Logger logger= LoggerFactory.getLogger(ExpiredSchedular.class);

    //after programme starts wait for 10 milisec and runs after every 30 sec
    @Scheduled(initialDelay = 10000,fixedDelay=30000)
    public void expired(){
        logger.info("Welcome to my channel : {}", new Date());
    }
}

