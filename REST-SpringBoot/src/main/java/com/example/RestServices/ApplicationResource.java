package com.example.RestServices;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationResource {

	ApplicationRepository repo = new ApplicationRepository();

	
	  @GetMapping("/get-app")
	  @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	// http://localhost:8080/get-app      
	/* @GetMapping(value ="/application", produces = MediaType.APPLICATION_XML_VALUE) */
	public List<Application> getApplication() {
		return repo.getApplication();
	}
	  
	  @GetMapping("/get-app/{id}")
	  @Produces(MediaType.APPLICATION_XML)
	public Application getApplication(@PathVariable Integer id) {
		return repo.getApplication(id);
	}
	
	@PostMapping("/post-app")  
	@Produces(MediaType.APPLICATION_XML)
	public List<Application> createApplication(@RequestBody Application a3) {
		repo.create(a3);
		return repo.applications;
	}
	
	
	  @DeleteMapping("/del-app/{id}")
	  public List<Application> deleteEmployee(@PathVariable Integer id){ 
		  repo.deleteById(id);
		  return repo.applications;}
	 
}

