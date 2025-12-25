package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Train;
import com.example.demo.service.TrainService;

@RestController
public class TrainController {
	
	@Autowired
	TrainService service;
	
	@PostMapping("train")
	ResponseEntity addTrain(@RequestBody Train train){
		service.saveTrain(train);
		return new ResponseEntity("TRain added",HttpStatus.CREATED);
	}
	
	
	@GetMapping("train/{tId}")
	
	ResponseEntity getTrain(@PathVariable int tID){
		
		Train t = service.getTrain(tID);
		return new ResponseEntity(t,HttpStatus.OK);
	}
	
	@DeleteMapping("train/{tId}")
	
	ResponseEntity deleteTrain(@PathVariable int tId) {
		service.deleteTrain(tId);
		
		return new ResponseEntity<>("trains is deleted",HttpStatus.OK);
	}
	
	@GetMapping("trains")
	ResponseEntity  getAllTrains()
	{
		
		List<Train>trains =  service.getAllTrains();
		if(trains.size()==0) {
			
		return new ResponseEntity("0 trains are availble", HttpStatus.NO_CONTENT);
		}
	return new ResponseEntity(trains,HttpStatus.OK)	;
	}
}
