package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.jpa.TeProductRepository;
import com.sir.richard.boss.error.CoreException;
import com.sir.richard.boss.services.integrations.im.ProductConnector;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

@Service
@Slf4j
public class ConverterService {

    @Autowired
    private Environment environment;
    @Autowired
    private DataSource primaryDataSource;
    @Autowired
    private ProductConnector productConnector;

    public Connection getSecondaryConnection() throws Exception {
        final String url = environment.getProperty("spring.second-datasource.url");
        final String username = environment.getProperty("spring.second-datasource.username");
        final String password = environment.getProperty("spring.second-datasource.password");
        log.debug("spring.second-datasource.url: {}", url);
        log.debug("spring.second-datasource.username: {}", username);
        log.debug("spring.second-datasource.password: {}", password);
        if (StringUtils.isEmpty(url)) {
            throw new CoreException(CoreException.CONFIG_ERROR);
        }
        return DriverManager.getConnection(url, username, password);
    }


    //@PostConstruct
    public void init() {
        try (Connection secondaryConnection = getSecondaryConnection()){
            productConnector.loadProducts(primaryDataSource, secondaryConnection);
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }
    }
}
