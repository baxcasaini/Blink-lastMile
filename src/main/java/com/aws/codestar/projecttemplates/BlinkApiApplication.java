package com.aws.codestar.projecttemplates;

import com.aws.codestar.projecttemplates.controller.DeliveryController;
import com.aws.codestar.projecttemplates.model.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BlinkApiApplication
		implements CommandLineRunner {

	@Autowired
	DeliveryController deliveryController;

	public static void main(String[] args) {
		SpringApplication.run(BlinkApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Thread.sleep(5000);

		try {
			Delivery delivery = new Delivery();
			delivery.setId("3");
			deliveryController.create(delivery);
		}catch (Exception e){
			;
		}
	}
}
