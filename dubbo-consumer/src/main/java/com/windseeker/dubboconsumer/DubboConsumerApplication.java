package com.windseeker.dubboconsumer;

import com.windseeker.dubboprovider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
@ImportResource("classpath:providers.xml")
public class DubboConsumerApplication {
    @Autowired
    private ProviderService providerService;

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApplication.class, args);
    }

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(HttpServletRequest request) {
        return providerService.getServerTime(request.getRemotePort() + "");
    }

}
