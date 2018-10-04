package com.capgroup.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
public class DataProducerApplication implements CommandLineRunner {
//	@EnableEurekaClient
	public static void main(String[] args) {
		SpringApplication.run(DataProducerApplication.class, args);
	}
	
	 @Autowired
	 private MessagePublisher sender;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		Random ran = new Random();
		
		Random ran1 = new Random();
		
		List<String> symbols = new ArrayList<String>();
		
		symbols.add("INTC");
		symbols.add("JKL");
		symbols.add("AAC");
		symbols.add("EDSS");
		symbols.add("ERES");
		symbols.add("WEDS");
		symbols.add("LOSS");
		symbols.add("JIKS");
		symbols.add("UIKS");
		symbols.add("NIJE");
		symbols.add("IIOE");
		symbols.add("SEII");
		
		
		Runnable task = () -> sender.send("test",symbols.get(ran1.nextInt(symbols.size())) + " : " +  Math.round(ran.doubles(12.00, 28.00).findAny().getAsDouble()*100) + " : "  + System.currentTimeMillis());

		int initialDelay = 10;
		int period = 4;
		executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);
		
		executor.submit(() -> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		    sender.send("test", "test22");
		});
	}
}
