package com.capgroup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;

@RestController
public class MessageProducerController {

	@Autowired
	private EurekaClient client;
	
	public MessageProducerController() {
		System.out.println();
	}
	
	@GetMapping("/applications")
	public Applications getApps() {
		
		return client.getApplications();
	}
	
	/*
	 * Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@5ecba515: startup date [Wed Oct 03 18:20:44 CST 2018]; parent: org.springframework.context.annotation.AnnotationConfigApplicationContext@3b77a04f
[2m2018-10-03 18:20:46.265[0;39m [32m INFO[0;39m [35m4032[0;39m [2m---[0;39m [2m[       Thread-4][0;39m [36mo.s.c.n.e.s.EurekaServiceRegistry       [0;39m [2m:[0;39m Unregistering application unknown with eureka with status DOWN
[2m2018-10-03 18:20:46.265[0;39m [33m WARN[0;39m [35m4032[0;39m [2m---[0;39m [2m[       Thread-4][0;39m [36mcom.netflix.discovery.DiscoveryClient   [0;39m [2m:[0;39m Saw local status change event StatusChangeEvent [timestamp=1538562046265, current=DOWN, previous=UP]
[2m2018-10-03 18:20:46.267[0;39m [32m INFO[0;39m [35m4032[0;39m [2m---[0;39m [2m[       Thread-4][0;39m [36mo.s.c.support.DefaultLifecycleProcessor [0;39m [2m:[0;39m Stopping beans in phase 0
[2m2018-10-03 18:20:46.268[0;39m [32m INFO[0;39m [35m4032[0;39m [2m---[0;39m [2m[       Thread-4][0;39m [36mo.s.j.e.a.AnnotationMBeanExporter       [0;39m [2m:[0;39m Unregistering JMX-exposed beans on shutdown
[2m2018-10-03 18:20:46.268[0;39m [32m INFO[0;39m [35m4032[0;39m [2m---[0;39m [2m[       Thread-4][0;39m [36mo.s.j.e.a.AnnotationMBeanExporter       [0;39m [2m:[0;39m Unregistering JMX-exposed beans
[2m2018-10-03 18:20:46.269[0;39m [32m INFO[0;39m [35m4032[0;39m [2m---[0;39m [2m[       Thread-4][0;39m [36mcom.netflix.discovery.DiscoveryClient   [0;39m [2m:[0;39m Shutting down DiscoveryClient ...
[2m2018-10-03 18:20:46.271[0;39m [33m WARN[0;39m [35m4032[0;39m [2m---[0;39m [2m[       Thread-4][0;39m [36m.s.c.a.CommonAnnotationBeanPostProcessor[0;39m [2m:[0;39m Invocation of destroy method failed on bean with name 'scopedTarget.eurekaClient': org.springframework.beans.factory.BeanCreationNotAllowedException: Error creating bean with name 'eurekaInstanceConfigBean': Singleton bean creation not allowed while singletons of this factory are in destruction (Do not request a bean from a BeanFactory in a destroy method implementation!)

	 * 
	 */
}
