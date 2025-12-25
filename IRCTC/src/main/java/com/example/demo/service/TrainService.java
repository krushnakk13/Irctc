package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Train;

public interface TrainService {
	
	void saveTrain(Train train);
	Train getTrain(int tId);
	void deleteTrain(int tId);
	List<Train> getAllTrains();

}
