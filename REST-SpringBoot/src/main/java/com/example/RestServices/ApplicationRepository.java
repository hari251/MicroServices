package com.example.RestServices;
import java.util.ArrayList;
import java.util.List;

public class ApplicationRepository {

	List<Application> applications;  //Dependency Injection
	public ApplicationRepository() {
		
		applications = new ArrayList<>();
		Application a1 = new Application();
		a1.setId(1);
		a1.setName("Hari");
		a1.setPoints(90);
	
		Application a2 = new Application();
		a2.setId(2);
		a2.setName("Arun");
		a2.setPoints(60);
	
		applications.add(a1);
		applications.add(a2);
	}
	public List<Application> getApplication()
	{
		return applications;
	}
	
	public Application getApplication(int id) {
		for(Application a:applications){
			if(a.getId()==id) 
				return a;
		}
		return null;
	}
	
	public void create(Application a3) {
		applications.add(a3);
		
	}
	
	  public void deleteById(Integer id) { 
		  for(Application a:applications) {
			  if(a.getId()==id)
				applications.remove(a);  
		  } 
	  }
	 
}
