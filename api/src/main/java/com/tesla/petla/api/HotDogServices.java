package com.tesla.petla.api;

import com.tesla.petla.api.type.HotDogPetWatcher;
import com.tesla.petla.api.type.Status;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;

import org.json.JSONObject;

public class HotDogServices {

	private static HotDogServices instance = null;
	
	public HotDogServices() {
	      // Exists only to defeat instantiation.
	}
	
	public static HotDogServices getInstance() {
	      if(instance == null) {
	         instance = new HotDogServices();
	      }
	      return instance;
	}
	
	
	private String teslaAuthToken = "30124a397a8b6436de0277f6a329d6493dd753ae42b05824ac6d1aa9dc1a1b1a";
	private String vehicleId = "20477905281488809";
	private boolean petModeEnabled = false;
	
	public boolean enablePetMode (){
		boolean status = false;
		// Use Auth token hardcoded above or do we need to auth via API?
		
		// call petwatcher
		HotDogPetWatcher instance = HotDogPetWatcher.getInstance();
    	instance.startPetWatcher();
		 
    	if (instance.getWatcherStatus() == true)
    	{
    		status = true;
    	}
		
		return status;
	}
	
	// method to return the status
	public Status getStatus() {

		Client client = ClientBuilder.newClient();
		Response response = client.target("https://owner-api.teslamotors.com/api/1/vehicles/20477905281488809/data_request/climate_state")
		  .request(MediaType.TEXT_PLAIN_TYPE)
		  .header("Authorization", "Bearer " + teslaAuthToken)
		  .get();

		System.out.println("status: " + response.getStatus());
		System.out.println("headers: " + response.getHeaders());
		final JSONObject r1 = new JSONObject(response.readEntity(String.class));
		final JSONObject r2 = r1.getJSONObject("response");
		System.out.println(r2);
		Integer.toString(r2.getInt("outside_temp"));
		Status s = new Status(true, Integer.toString(r2.getInt("outside_temp")), Integer.toString(r2.getInt("inside_temp")), r2.getBoolean("is_auto_conditioning_on"), true);
		return s;
	}
	
	// method to exit pet mode
	
	
	
}
