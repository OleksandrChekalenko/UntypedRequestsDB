package com.test.bu.config;


import com.test.bu.dao.RequestsDaoImpl;
import com.test.bu.dao.interfaces.RequestsDao;
import com.test.bu.service.RequestsServiceImpl;
import com.test.bu.service.interfaces.RequestsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public RequestsService getRequestsService() {
        return new RequestsServiceImpl();}

    @Bean
    public RequestsDao getRequestsDao() { return new RequestsDaoImpl();}

}
