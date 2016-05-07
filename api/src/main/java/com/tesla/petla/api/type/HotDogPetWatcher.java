package com.tesla.petla.api.type;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

public class HotDogPetWatcher {

private static HotDogPetWatcher instance = null;
	
	protected HotDogPetWatcher() {
	      // Exists only to defeat instantiation.
	}
	
	public static HotDogPetWatcher getInstance() {
	      if(instance == null) {
	         instance = new HotDogPetWatcher();
	      }
	      return instance;
	}
	
	private boolean watcherOn = false;
	private String teslaAuthToken = "30124a397a8b6436de0277f6a329d6493dd753ae42b05824ac6d1aa9dc1a1b1a";
	
	public void startPetWatcher(){
		
		// set temperature
		Client client = ClientBuilder.newClient();
		Entity<String> payload = Entity.text("");
		Response response = client.target("https://owner-api.teslamotors.com/api/1/vehicles/20477905281488809/command/set_temps?driver_temp=19&passenger_temp=19")
		  .request(MediaType.TEXT_PLAIN_TYPE)
		  .header("Authorization", "Bearer "+teslaAuthToken)
		  .post(payload);
		
		System.out.println("SETTING TEMPERATURE:");
		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));
		
		
		
		// open roof by ten percent
		response = client.target("https://owner-api.teslamotors.com/api/1/vehicles/20477905281488809/command/sun_roof_control?state=open&#38;percent=10")
				  .request(MediaType.TEXT_PLAIN_TYPE)
				  .header("Authorization", "Bearer "+teslaAuthToken)
				  .post(payload);

		System.out.println("OPEN SUN ROOF:");
		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));
		
		
		
		// turn on HVAC
		response = client.target("https://owner-api.teslamotors.com/api/1/vehicles/20477905281488809/command/auto_conditioning_start")
				.request(MediaType.TEXT_PLAIN_TYPE)
				.header("Authorization", "Bearer "+teslaAuthToken)
				.post(payload);

		System.out.println("STARTING CLIMATE CONTROL:");
		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		System.out.println("body:" + response.readEntity(String.class));
		
		this.watcherOn = true;
		
		System.out.println("Climate Control Started...");
		
	}
	
	public boolean stopPetWatcher(){
		
		if(watcherOn == true){
			this.watcherOn = false;
		}
		
		return true;
	}

	// Getters and Setters
	
	public void setTeslaAuthToken(String teslaAuthToken) {
		this.teslaAuthToken = teslaAuthToken;
	}
	
	public boolean getWatcherStatus(){
		return this.watcherOn;
	}
	
}
