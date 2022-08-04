package com.test.bhut.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.bhut.model.Cars;
import com.test.bhut.repository.CarsRepository;


@RestController
@RequestMapping("/cars")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CarsController {
    
    @Autowired
	private CarsRepository repository;

    @GetMapping("/listCars")
    public ResponseEntity<List<Cars>> getAll(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Cars> post(@Valid @RequestBody Cars cars){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cars));
    }
 
}
