package com.fullstack.service;

import java.time.Period;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.entity.Tutorial;
import com.fullstack.repository.TutorialRepositoryCal;

@Service
public class CheckDaysPostageServiceImpl {

	@Autowired
	TutorialRepositoryCal tutorialRepositoryCal;

	public int daysCalculatorWithDatabase(String title) {
		Optional<Tutorial> tutorialOptional = tutorialRepositoryCal.findByTitleContaining(title);
		return Period.between(tutorialOptional.get().getCheckIn(), tutorialOptional.get().getCheckOut()).getDays();
	}

}
