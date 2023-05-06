package com.sir.richard.boss.config;

import com.sir.richard.boss.error.CoreException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.sql.Connection;
import java.sql.DriverManager;


@Slf4j
@Configuration
@PropertySource(value = "classpath:application.properties", encoding = "UTF-8")
/*
@EntityScan("com.sir.richard.boss.bl.entity.secondary")
@EnableJpaRepositories(basePackages = "com.sir.richard.boss.bl.jpa.secondary",
        entityManagerFactoryRef = "secondaryEntityManager",
        transactionManagerRef = "secondaryTransactionManager")

*/
public class WebDbSecondaryConfig {





/*
    @Bean
    @ConfigurationProperties("spring.second-datasource")
    public DataSourceProperties secondaryDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name="secondaryDataSource")
    @ConfigurationProperties("spring.second-datasource")
    public HikariDataSource secondaryDataSource(DataSourceProperties dataSourceProperties) {
        return dataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "secondaryEntityManager")
    public LocalContainerEntityManagerFactoryBean secondaryEntityManager(EntityManagerFactoryBuilder builder,
                                                                       @Qualifier("secondaryDataSource") DataSource secondaryDataSource) {
        return builder
                .dataSource(secondaryDataSource)
                .packages("com.sir.richard.boss.bl.entity.secondary")
                .build();
    }

    @Bean(name = "secondaryTransactionManager")
    public PlatformTransactionManager secondaryTransactionManager(@Qualifier("secondaryEntityManager") EntityManagerFactory secondaryEntityManagerFactory) {
        return new JpaTransactionManager(secondaryEntityManagerFactory);
    }
 */
}
