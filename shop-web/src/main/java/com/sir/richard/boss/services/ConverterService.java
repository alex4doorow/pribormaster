package com.sir.richard.boss.services;

import com.sir.richard.boss.bl.entity.TeProduct;
import com.sir.richard.boss.bl.jpa.TeProductRepository;
import com.sir.richard.boss.error.CoreException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ConverterService {

    @Autowired
    private TeProductRepository teProductRepository;

    @Autowired
    private Environment environment;

    private Connection getConnection() throws Exception {
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

    public void init() {
        String selectSql = "SELECT * FROM sr_v_product where product_id = 40";
        try (Connection connection = getConnection();
             Statement stmt = connection.createStatement();
             ResultSet resultSet = stmt.executeQuery(selectSql);) {
            List<TeProduct> products = new ArrayList<>();
            while (resultSet.next()) {
                TeProduct teProduct = new TeProduct();
                teProduct.setId(resultSet.getLong("product_id"));
                products.add(teProduct);
                log.info("teProduct: {}", teProduct.getId());
            }
            List<TeProduct> products1 = teProductRepository.findAll();
            log.info("products: {}", products1.size());
        } catch (Exception ex) {
            log.error(ex.getMessage(), ex);
        }

    }

}
