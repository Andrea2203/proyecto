package edu.eci.arsw.happ.service;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.beans.factory.annotation.Value;


@Component
public class Conexion {
	
	@Bean
	public DataSource dataSource() throws SQLException {
        HikariConfig config = new HikariConfig();
		config.setJdbcUrl("jdbc:postgresql://ec2-3-234-169-147.compute-1.amazonaws.com:5432/du9cn7hjagit0?sslmode=require");
		config.setUsername("dtmarhrahmjlva");
		config.setPassword("1876aa241c30f307f63e90f7f12557fa7e55719dd69e83f10add8ea19de20be9");
		config.setMaximumPoolSize(2);
		return new HikariDataSource(config);

	}
	
}