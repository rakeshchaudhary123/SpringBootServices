package com.example.dashboardDemo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.dashboardDemo.service.ServiceClass;

@RestController
public class DashboardClass {

	@Autowired
	private ServiceClass serviceClass;

	@RequestMapping(value = "/year/{endOfYear}", method = RequestMethod.GET)
	public List<Map<String, Object>> getDetailsByEndOfYear(@PathVariable int endOfYear) {
		List<Map<String, Object>> result = serviceClass.getDetailsByEdYear(endOfYear);
		return result;

	}

	@RequestMapping(value = "/topic/{topic}", method = RequestMethod.GET)
	public List<Map<String, Object>> getDetailsByTopic(@PathVariable("topic") String topic) {
		List<Map<String, Object>> result = serviceClass.getDetailsByTopic(topic);
		return result;

	}

	@RequestMapping(value = "/sector/{sector}", method = RequestMethod.GET)
	public List<Map<String, Object>> getDetailsBySector(@PathVariable("sector") String sector) {
		List<Map<String, Object>> result = serviceClass.getDetailsBySector(sector);
		return result;

	}

	@RequestMapping(value = "/region/{region}", method = RequestMethod.GET)
	public List<Map<String, Object>> getDetailsByRegion(@PathVariable("region") String region) {
		List<Map<String, Object>> result = serviceClass.getDetailsByRegion(region);
		return result;

	}

	@RequestMapping(value = "/pest/{pestle}", method = RequestMethod.GET)
	public List<Map<String, Object>> getDetailsByPest(@PathVariable("pestle") String pestle) {
		List<Map<String, Object>> result = serviceClass.getDetailsByPestle(pestle);
		return result;

	}

	@RequestMapping(value = "/source/{source}", method = RequestMethod.GET)
	public List<Map<String, Object>> getDetailsBySource(@PathVariable("source") String source) {
		List<Map<String, Object>> result = serviceClass.getDetailsBySource(source);
		return result;

	}

	@RequestMapping(value = "/swot/{swot}", method = RequestMethod.GET)
	public List<Map<String, Object>> getDetailsBySwot(@PathVariable("swot") String swot) {
		List<Map<String, Object>> result = serviceClass.getDetailsByEdSwot(swot);
		return result;

	}

	@RequestMapping(value = "/country/{country}", method = RequestMethod.GET)
	public List<Map<String, Object>> getDetailsByCountry(@PathVariable("country") String country) {
		List<Map<String, Object>> result = serviceClass.getDetailsByCountry(country);
		return result;

	}

	@RequestMapping(value = "/city/{city}", method = RequestMethod.GET)
	public List<Map<String, Object>> getDetailsByEndOfCity(@PathVariable("city") String city) {
		List<Map<String, Object>> result = serviceClass.getDetailsByCity(city);
		return result;

	}

}
