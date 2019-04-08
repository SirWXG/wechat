package com.fengdi.wxapplet.hsgj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = {"com.fengdi.wxapplet.db","com.fengdi.wxapplet.hsgj"})

@EnableTransactionManagement
@EnableScheduling
public class HsgjApplication {

	public static void main(String[] args) {
		SpringApplication.run(HsgjApplication.class, args);
	}

}
