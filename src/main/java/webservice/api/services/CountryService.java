package webservice.api.services;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

import com.maxmind.geoip2.DatabaseReader;
import com.maxmind.geoip2.WebServiceClient;
import com.maxmind.geoip2.exception.GeoIp2Exception;
import com.maxmind.geoip2.model.CountryResponse;
import com.maxmind.geoip2.record.Country;

import webservice.api.models.CountryModel;

@Service
public class CountryService {
	public CountryService(){}
	public static CountryModel CountryIpLookUp(String ip) {
		CountryModel ctry = new CountryModel();
		try (WebServiceClient client = new WebServiceClient.Builder(42, "license_key").build()) {
			File database1 = new File("./database/GeoLite2-Country_20180501/GeoLite2-Country.mmdb");
	    	InetAddress ipAddress = null;
			try {
				ipAddress = InetAddress.getByName(ip);
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

	    // Do the lookup
	    	CountryResponse response = null;
		    CountryResponse response2 = null;
		    
			try {
				response = client.country(ipAddress);
			} catch (IOException | GeoIp2Exception e) {
					// TODO Auto-generated catch block
				try (DatabaseReader reader = new DatabaseReader.Builder(database1).build()) {
					try {
						response2 = reader.country(ipAddress);
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
				Country country = response.getCountry();
				System.out.println(country.getIsoCode());
				System.out.println(country.getName());
				System.out.println(country.getNames().get("en-US"));
			    System.out.println(country.getConfidence());
			    ctry.setIsoCode(country.getIsoCode());
			    ctry.setConfidence(country.getConfidence());
			    ctry.setName(country.getName());
			    ctry.setNames(country.getNames().get("en-US"));
				
			} else {
				
if(response2 != null) {
				    Country country = response2.getCountry();
				    System.out.println(country.getIsoCode());           
				    System.out.println(country.getName());              
				    System.out.println(country.getNames().get("en-US"));
				    System.out.println(country.getConfidence());
				    ctry.setIsoCode(country.getIsoCode());
				    ctry.setConfidence(country.getConfidence());
				    ctry.setName(country.getName());
				    ctry.setNames(country.getNames().get("en-US"));
}
				}
			
	} catch (IOException e3) {
		// TODO Auto-generated catch block
		e3.printStackTrace();
	}
		return ctry;
	}
}