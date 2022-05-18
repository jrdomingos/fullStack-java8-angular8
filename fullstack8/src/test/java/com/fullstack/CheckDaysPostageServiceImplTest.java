package com.fullstack;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.fullstack.entity.Tutorial;
import com.fullstack.repository.TutorialRepositoryCal;
import com.fullstack.service.CheckDaysPostageServiceImpl;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CheckDaysPostageServiceImplTest {
	
	@TestConfiguration
	static class checkDaysPostageServiceTestConfiguration{
		
		@Bean		
		public CheckDaysPostageServiceImpl checkDaysPostageServiceImpl() {
			return new CheckDaysPostageServiceImpl();
		}  
	}
	
	@Autowired
	CheckDaysPostageServiceImpl checkDaysPostageServiceImpl;
	
	@MockBean
	TutorialRepositoryCal tutorialRepositoryCal;
	
	@Test
	public void checkDaysPostageCalculator() {
		String title = "Autocar";
		
		int days = checkDaysPostageServiceImpl.daysCalculatorWithDatabase(title);
		
		Assertions.assertEquals(days, 10);
	}
	
	
    @Before
	public void setup() {
		LocalDate checkIn = LocalDate.parse("2020-11-10");
		LocalDate checkOut = LocalDate.parse("2020-11-20");
		
		Tutorial tutorial = new Tutorial(1,"autocar",checkIn,checkOut,10);
		
		Mockito.when(tutorialRepositoryCal.findByTitleContaining(tutorial.getTitle()))
		.thenReturn(java.util.Optional.of(tutorial));
		
	}
	

}












