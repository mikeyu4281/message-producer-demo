package com.capgroup.services;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataProducerController {

	@PostMapping("data")
	public List<Security> getSecurities(){
		
		Security s1 = new Security();

		s1.setCurrentPrice(290.0292f);
		s1.setCusip("UI9290292");
		s1.setName("BMP");
		s1.setPreviousClose(209.92f);
		s1.setTodayVolume(8929011.202f);
		
		Security s2 = new Security();
		s2.setCurrentPrice(290.0292f);
		s2.setCusip("UI9290292");
		s2.setName("BMP");
		s2.setPreviousClose(209.92f);
		s2.setTodayVolume(8929011.202f);
		
		Security s3 = new Security();
		s3.setCurrentPrice(290.0292f);
		s3.setCusip("UI9290292");
		s3.setName("BMP");
		s3.setPreviousClose(209.92f);
		s3.setTodayVolume(8929011.202f);
		
		Security s4 = new Security();
		s4.setCurrentPrice(290.0292f);
		s4.setCusip("UI9290292");
		s4.setName("BMP");
		s4.setPreviousClose(209.92f);
		s4.setTodayVolume(8929011.202f);
		
		Security s5 = new Security();
		s5.setCurrentPrice(290.0292f);
		s5.setCusip("UI9290292");
		s5.setName("BMP");
		s5.setPreviousClose(209.92f);
		s5.setTodayVolume(8929011.202f);
		
		Security s6 = new Security();
		s6.setCurrentPrice(290.0292f);
		s6.setCusip("UI9290292");
		s6.setName("BMP");
		s6.setPreviousClose(209.92f);
		s6.setTodayVolume(8929011.202f);
		return Arrays.asList(s1,s2,s3,s4,s5,s6);
	}
	
	
}
