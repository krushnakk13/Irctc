package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Train;
import com.example.demo.repo.TrainRepo;

@Service
public class TrainServiceImpl implements TrainService {
	
	@Autowired
	TrainRepo repo;

	@Override
	public void saveTrain(Train train) {
		// TODO Auto-generated method stub
		repo.save(train);
	}

	@Override
	public Train getTrain(int tId) {
		// TODO Auto-generated method stub
		return repo.findById(tId).get();
	}

	@Override
	public void deleteTrain(int tId) {
		// TODO Auto-generated method stub
		repo.deleteById(tId);
	}

	@Override
	public List<Train> getAllTrains() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
