package cn.gus.regserver1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class RegServer1Application {

	public static void main(String[] args) {

		SpringApplication.run(RegServer1Application.class, args);

	}

	@Value("${server.port}")
	String port;

	@Value("${server.txt}")
	String txt;

	@RequestMapping("/gus1")
	public String home(@RequestParam String name) {
		return "hello " + name + ",i am from port:" + port + "--" + txt;
	}

}
