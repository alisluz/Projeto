package com.example.street.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.street.model.StreetModel;
import com.example.street.repository.StreetRepository;

@RestController
@RequestMapping(value = "/api")
//@Api(value="API REST Street")
@CrossOrigin(origins="*")
public class StreetController {

	@Autowired
	StreetRepository street;

	@PostMapping(value = "/create")
	public StreetModel CreateStreet(@RequestBody StreetModel param) {
		return (StreetModel) street.save(param);

	}

	@DeleteMapping(value = "/delete")
	public void DeleteStreet(long id) {
		street.deleteById(id);
		
	}

	@PutMapping(value = "/update")
	public void UpdateStreet(@RequestBody StreetModel params) {
		StreetModel streetModel = new StreetModel();
		streetModel = params;
		street.save(streetModel);

	}

	@GetMapping(value = "/read")
	public List<StreetModel> ReadStreet() {
		return street.findAll();
	}

}
