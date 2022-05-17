package com.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.entity.Tutorial;
import com.fullstack.repository.TutorialRepository;

@Service
public class TutorialServiceImpl implements TutorialService {
	
	@Autowired
	private TutorialRepository tutorialRepository;	
	
	public TutorialServiceImpl(TutorialRepository tutorialRepository) {
		this.tutorialRepository = tutorialRepository;
	}

	@Override
	public Tutorial create(Tutorial tutorial) {
		return this.tutorialRepository.save(tutorial);
	}

	@Override
	public List<Tutorial> findAll() {
		return this.tutorialRepository.findAll();
	}

	@Override
	public Tutorial findById(Long id) {
		return this.tutorialRepository.findById(id).get();
	}

	@Override
	public Tutorial update(Long id, Tutorial tutorial) {
		
		Tutorial tutorialExists = this.tutorialRepository.findById(id).get();
		
		if(tutorialExists != null) {
			tutorial.setId(tutorialExists.getId());  
			this.tutorialRepository.save(tutorial);
		}
		
		return tutorial;
	}

	@Override
	public void delete(Long id) {
		Tutorial tutorial = this.tutorialRepository.findById(id).get();
		
		if(tutorial != null) {
			this.tutorialRepository.delete(tutorial);
		}
		
	}
	
	/*
	@Override
	public List<Tutorial> findByTitleContaining(String title) {		
		return this.tutorialRepository.findByTitleContaining(title); 
				
	}

	@Override
	public List<Tutorial> findByPublished(boolean published) {
		return null;
	}
*/
	

}
