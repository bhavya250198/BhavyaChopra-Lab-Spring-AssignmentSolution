package com.greatLearning.debates.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.debates.entity.Debates;
import com.greatLearning.debates.repository.DebateRepository;
@Service
public class DebateService {

	@Autowired
	DebateRepository debate;
	public List<Debates> findAll()
	{
		return debate.findAll();
	}
	public Debates findById(int id) {
		return debate.findById(id).get();
		
	}
	public void saveDetails(Debates debateDetails) {
		debate.save(debateDetails);
		
	}
	public void delete(int id) {
		debate.deleteById(id);
	}
	
}
