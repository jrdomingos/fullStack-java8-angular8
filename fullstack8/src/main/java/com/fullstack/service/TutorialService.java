package com.fullstack.service;

import java.util.List;

import com.fullstack.entity.Tutorial;

public interface TutorialService {
 public Tutorial create(Tutorial tutorial);
 public List<Tutorial>findAll(); 
 public Tutorial findById(Long id);
 public Tutorial update(Long id, Tutorial tutorial);
 public void delete(Long id);
 
 
}
