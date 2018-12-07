package com.littleprogram.sanlin_background.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

@RestController
@EnableAutoConfiguration
public class HelloController {
    @RequestMapping("/hello")
    private String index(){
        Jedis jedis=new Jedis("127.0.0.1",6379);
        jedis.set("hello","lcjbb");
        String ss=jedis.get("hello");
        return ss;
    }
}
