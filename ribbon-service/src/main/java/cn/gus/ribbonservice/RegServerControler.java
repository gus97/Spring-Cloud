package cn.gus.ribbonservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegServerControler {

    @Autowired
    RegServiceGate regServiceGate;

    @RequestMapping(value = "/gus1")
    public String hi(@RequestParam String name) {
        return regServiceGate.regService(name);
    }
}
