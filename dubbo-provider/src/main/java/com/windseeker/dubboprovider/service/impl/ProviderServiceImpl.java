package com.windseeker.dubboprovider.service.impl;

import com.windseeker.dubboprovider.service.ProviderService;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("providerService")
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String getServerTime(String servicePort) {
        return "Hi," + servicePort + ".ServerTime is " + LocalDateTime.now().toString();
    }
}
