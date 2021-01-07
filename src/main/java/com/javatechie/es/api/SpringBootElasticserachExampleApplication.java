package com.javatechie.es.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.es.api.model.YouTubeData;
import com.javatechie.es.api.repository.YouTubeRepository;

@SpringBootApplication
@RestController
public class SpringBootElasticserachExampleApplication {
	
	@Autowired
	private YouTubeRepository repository;
	
	@PostMapping("/saveCustomer")
	public int saveCustomer(@RequestBody List<YouTubeData> customers) {
		repository.saveAll(customers);
		return customers.size();
	}


	@GetMapping("/findByYoutubePublicId/{youTubepublicid}")
	public List<YouTubeData> findByyouTubepublicid(@PathVariable String youTubepublicid) {
		return repository.findByyouTubepublicid(youTubepublicid);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootElasticserachExampleApplication.class, args);
	}
}
