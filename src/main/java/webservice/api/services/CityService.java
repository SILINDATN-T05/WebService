package webservice.api.services;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.WebServiceClient;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.AnonymousIpResponse;
import com.maxmind.geoip2.model.CityResponse;
import com.maxmind.geoip2.record.City;
import com.maxmind.geoip2.record.Country;
import com.maxmind.geoip2.record.Location;
import com.maxmind.geoip2.record.Postal;
import com.maxmind.geoip2.record.Subdivision;

import webservice.api.models.CityModel;

@Service
public class CityService{
	public CityService() {}
	public static CityModel CityIpLooUp(String ip) {
		CityModel cty = new CityModel();
		try (WebServiceClient client = new WebServiceClient.Builder(42, "license_key")
		        .build()) {
			File database1 = new File("./database/GeoLite2-City_20180501/GeoLite2-City.mmdb");

		    InetAddress ipAddress = null;
			try {
				ipAddress = InetAddress.getByName(ip);
			} catch (UnknownHostException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}

		    // Do the lookup
		    CityResponse response = null;
	    	AnonymousIpResponse response1 = null;
		    CityResponse response2 = null;
			try {
				response = client.city(ipAddress);
			} catch (GeoIp2Exception | IOException e) {
				try (DatabaseReader reader = new DatabaseReader.Builder(database1).build()) {
					try {
						response2 = reader.city(ipAddress);
					} catch (GeoIp2Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
					e.printStackTrace();
				}
			}

		    if(response !=null) {
		    	Country country = response2.getCountry();
			    System.out.println(country.getIsoCode());            
			    System.out.println(country.getName());               
			    System.out.println(country.getNames().get("zh-CN")); 
			    System.out.println(country.getConfidence());         
		    	cty.setIsoCode(country.getIsoCode());
		    	cty.setName(country.getName());
		    	cty.setNames(country.getNames());
		    	cty.setConfidence(country.getConfidence());

			    Subdivision subdivision = response2.getMostSpecificSubdivision();
			    System.out.println(subdivision.getName());           
			    System.out.println(subdivision.getIsoCode());        
			    System.out.println(subdivision.getConfidence());     
		    	cty.setSubdivisionName(subdivision.getName());
		    	cty.setSubdivisionIsoCode(subdivision.getIsoCode());
		    	cty.setSubdivisionConfidence(subdivision.getConfidence());

			    City city = response2.getCity();
			    System.out.println(city.getName());      
			    System.out.println(city.getConfidence()); 
		    	cty.setCityName(city.getName());
		    	cty.setCityConfidence(city.getConfidence());

			    Postal postal = response2.getPostal();
			    System.out.println(postal.getCode()); 
			    System.out.println(postal.getConfidence()); 
			    cty.setPostalCode(postal.getCode());
			    cty.setPostalConfidence(postal.getConfidence());

			    Location location = response2.getLocation();
			    System.out.println(location.getLatitude());  
			    System.out.println(location.getLongitude()); 
			    System.out.println(location.getAccuracyRadius()); 
			    cty.setLatitude(location.getLatitude());
			    cty.setLongitude(location.getLongitude());
			    cty.setAccuracyRadius(location.getAccuracyRadius());
			} else {
if(response2 != null) {
				    Country country = response2.getCountry();
				    System.out.println(country.getIsoCode());            
				    System.out.println(country.getName());               
				    System.out.println(country.getNames().get("zh-CN")); 
				    System.out.println(country.getConfidence());         
			    	cty.setIsoCode(country.getIsoCode());
			    	cty.setName(country.getName());
			    	cty.setNames(country.getNames());
			    	cty.setConfidence(country.getConfidence());

				    Subdivision subdivision = response2.getMostSpecificSubdivision();
				    System.out.println(subdivision.getName());           
				    System.out.println(subdivision.getIsoCode());        
				    System.out.println(subdivision.getConfidence());     
			    	cty.setSubdivisionName(subdivision.getName());
			    	cty.setSubdivisionIsoCode(subdivision.getIsoCode());
			    	cty.setSubdivisionConfidence(subdivision.getConfidence());

				    City city = response2.getCity();
				    System.out.println(city.getName());      
				    System.out.println(city.getConfidence()); 
			    	cty.setCityName(city.getName());
			    	cty.setCityConfidence(city.getConfidence());

				    Postal postal = response2.getPostal();
				    System.out.println(postal.getCode()); 
				    System.out.println(postal.getConfidence()); 
				    cty.setPostalCode(postal.getCode());
				    cty.setPostalConfidence(postal.getConfidence());

				    Location location = response2.getLocation();
				    System.out.println(location.getLatitude());  
				    System.out.println(location.getLongitude()); 
				    System.out.println(location.getAccuracyRadius()); 
				    cty.setLatitude(location.getLatitude());
				    cty.setLongitude(location.getLongitude());
				    cty.setAccuracyRadius(location.getAccuracyRadius());
}
				}
			} catch (IOException e4) {
				// TODO Auto-generated catch block
				e4.printStackTrace();
			}
		return cty;
	}
}