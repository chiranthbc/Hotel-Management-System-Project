package com.chiranth.HotelInvent_MS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class HotelInventMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelInventMsApplication.class, args);
	}

}
