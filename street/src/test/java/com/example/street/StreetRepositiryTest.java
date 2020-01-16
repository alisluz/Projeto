package com.example.street;

import org.assertj.core.api.Assertions;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.street.model.StreetModel;
import com.example.street.repository.StreetRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class StreetRepositiryTest {
	
	@Autowired
	private StreetRepository streetRepository;
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void createShouldPersistStreet() {
		StreetModel street = 
				new StreetModel("Street Test", 12345, "", "Neighbour Test",
						"Test City", "State of Test", "Country Test", "1345872X", "", "");
		
		this.streetRepository.save(street);
		
		Assertions.assertThat(street.getId()).isNotNull();
		Assertions.assertThat(street.getStreetName()).isEqualTo("Street Test");
		Assertions.assertThat(street.getNumber()).isEqualTo(12345);
		Assertions.assertThat(street.getComplement()).isEqualTo("");
		Assertions.assertThat(street.getNeighbourhood()).isEqualTo("Neighbour Test");
		Assertions.assertThat(street.getCity()).isEqualTo("Test City");
		Assertions.assertThat(street.getState()).isEqualTo("State of Test");
		Assertions.assertThat(street.getCountry()).isEqualTo("Country Test");
		Assertions.assertThat(street.getZipcode()).isEqualTo("1345872X");
		Assertions.assertThat(street.getLatitude()).isEqualTo("");
		Assertions.assertThat(street.getLongitude()).isEqualTo("");
		
	}
	
	@Test
	public void deleteStreetTest() {
		StreetModel street = 
				new StreetModel("Street Test", 12345, "", "Neighbour Test",
						"Test City", "State of Test", "Country Test", "1345872X", "", "");
		
		this.streetRepository.save(street);
		streetRepository.delete(street);
		
		Assertions.assertThat(streetRepository.findById(street.getId())).isNull();
		
	}
	
	@Test
	public void updateStreetTest() {
		StreetModel street = 
				new StreetModel("Street Test", 12345, "", "Neighbour Test",
						"Test City", "State of Test", "Country Test", "1345872X", "", "");
		
		this.streetRepository.save(street);
		
		street.setStreetName("Street Test One");
		street.setNeighbourhood("Neighbour Test One");
		
		this.streetRepository.save(street);
		
		Assertions.assertThat(street.getId()).isNotNull();
		Assertions.assertThat(street.getStreetName()).isEqualTo("Street Test One");
		Assertions.assertThat(street.getNumber()).isEqualTo(12345);
		Assertions.assertThat(street.getComplement()).isEqualTo("");
		Assertions.assertThat(street.getNeighbourhood()).isEqualTo("Neighbour Test One");
		Assertions.assertThat(street.getCity()).isEqualTo("Test City");
		Assertions.assertThat(street.getState()).isEqualTo("State of Test");
		Assertions.assertThat(street.getCountry()).isEqualTo("Country Test");
		Assertions.assertThat(street.getZipcode()).isEqualTo("1345872X");
		Assertions.assertThat(street.getLatitude()).isEqualTo("");
		Assertions.assertThat(street.getLongitude()).isEqualTo("");
	}

}
