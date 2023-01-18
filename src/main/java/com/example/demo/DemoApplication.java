package com.example.demo;

import ch.qos.logback.core.CoreConstants;
import com.example.demo.Entity.Team;
import com.example.demo.Repository.TeamRepository;
import com.example.demo.Service.Teamservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext context = SpringApplication.run (DemoApplication.class);

		final TeamRepository bean = context.getBean(TeamRepository.class);
		Teamservice a = new Teamservice(bean);
Team s= new Team("lol","kok",3l);
		Team h= new Team("lol","kok",6l);
		a.getAll();
		System.out.println(a.getById(3l));
a.add(h);
		a.getAll();
		a.update(s);
		a.getAll();
		a.deletById(6l);
		a.getAll();
	}

}

