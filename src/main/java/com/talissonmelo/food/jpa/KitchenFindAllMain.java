package com.talissonmelo.food.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.talissonmelo.food.AlgaFoodApiApplication;
import com.talissonmelo.food.domain.model.Kitchen;

public class KitchenFindAllMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new SpringApplicationBuilder(AlgaFoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		KitchenJPA jpa = applicationContext.getBean(KitchenJPA.class);
		List<Kitchen> list = jpa.findAll();

		for (Kitchen x : list) {
			System.out.println(x.getName());
		}
	}

}