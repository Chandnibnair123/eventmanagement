package com.example.demo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Quatation;
import com.example.demo.repository.QuatationRepository;




@Service
public class QuatationService {
	
	@Autowired
	QuatationRepository quatationrepository;
	
	
	
	
	
	public void addQuatation(Quatation quatation) {
		quatationrepository.save(quatation);
		}


	public Quatation FindQuatationById(String id) {
		// TODO Auto-generated method stub
		Optional<Quatation> result = quatationrepository.findById(id);
		Quatation quatation=result.get();
		return quatation;
		
	}
}
		
	
