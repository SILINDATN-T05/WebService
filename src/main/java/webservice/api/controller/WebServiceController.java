package webservice.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import webservice.api.models.CityModel;
import webservice.api.models.CountryModel;
import webservice.api.models.IPS;
import webservice.api.services.CityService;
import webservice.api.services.CountryService;


@RestController
public class WebServiceController{
	@CrossOrigin(origins = "*")
    @RequestMapping(value = "/countryiplookup/{ip}", method = RequestMethod.GET)
    public CountryModel saveCic(@PathVariable("ip") String ip) {
		CountryModel country = CountryService.CountryIpLookUp(ip);
		return country;
    }
	@CrossOrigin(origins = "*")
    @RequestMapping(value = "/cityiplookup/{ip}", method = RequestMethod.GET)
	public CityModel getCic(@PathVariable("ip") String ip) {
		CityModel city = CityService.CityIpLooUp(ip);
        return city;
	}
	@CrossOrigin(origins = "*")
    @RequestMapping(value = "/countryiplookup", method = RequestMethod.POST)
    public List<CountryModel> saveCic(@RequestBody IPS ips) {
		System.out.println(ips.getIps());
		List<CountryModel> list = new ArrayList<CountryModel>();
		for(String ip : ips.getIps()){
			CountryModel country = CountryService.CountryIpLookUp(ip);
			list.add(country);
		}
		return list;
    }
	@CrossOrigin(origins = "*")
    @RequestMapping(value = "/cityiplookup/", method = RequestMethod.POST)
	public List<CityModel> getCic(@RequestBody IPS ips) {
		System.out.println(ips.getIps());
		List<CityModel> list = new ArrayList<CityModel>();
		for(String ip : ips.getIps()){
			CityModel city = CityService.CityIpLooUp(ip);
			list.add(city);
		}
        return list;
	}
}