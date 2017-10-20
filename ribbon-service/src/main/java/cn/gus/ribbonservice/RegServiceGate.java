package cn.gus.ribbonservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RegServiceGate {

    @Autowired
    RestTemplate restTemplate;

    public String regService(String name) {
        return restTemplate.getForObject("http://reg-server/gus1?name="+name,String.class);
    }

}
