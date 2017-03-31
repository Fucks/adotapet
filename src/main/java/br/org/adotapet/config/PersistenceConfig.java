package br.org.adotapet.config;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Wellington Felipe Fucks
 *
 * @version 1.0
 * @since 1.0, 30/03/2017
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"br.org.adotapet.application.infra.*", "br.org.adotapet.entity", "br.org.adotapet.service"})
@EnableJpaRepositories(basePackages = {"br.org.adotapet.repository"})
public class PersistenceConfig {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.sqlite.JDBC");
        dataSourceBuilder.url("jdbc:sqlite:/db/your.db");
        return dataSourceBuilder.build();
    }
}
