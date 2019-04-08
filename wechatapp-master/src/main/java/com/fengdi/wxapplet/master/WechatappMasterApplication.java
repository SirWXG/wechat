package com.fengdi.wxapplet.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.fengdi.wxapplet.db","com.fengdi.wxapplet.master"})

public class WechatappMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatappMasterApplication.class, args);
	}

}
