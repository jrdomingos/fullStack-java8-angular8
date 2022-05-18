package com.fullstack.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstack.entity.Tutorial;

public interface TutorialRepositoryCal extends JpaRepository<Tutorial, Long> {	
	Optional<Tutorial> findByTitleContaining(String title);
}
