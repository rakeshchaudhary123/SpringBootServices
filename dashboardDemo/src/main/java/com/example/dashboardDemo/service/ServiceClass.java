package com.example.dashboardDemo.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dashboardDemo.dao.DaoClass;

@Service
public class ServiceClass {

	@Autowired
	private DaoClass daoClass;

	public List<Map<String, Object>> getDetailsByEdYear(int endYear) {

		List<Map<String, Object>> result = daoClass.fetchDeatilsByYear(endYear);
		return result;

	}

	public List<Map<String, Object>> getDetailsByTopic(String topic) {
		List<Map<String, Object>> result = daoClass.fetchDeatilsByTopic(topic);
		return result;

	}

	public List<Map<String, Object>> getDetailsBySector(String sector) {
		List<Map<String, Object>> result = daoClass.fetchDeatilsBySector(sector);
		return result;

	}

	public List<Map<String, Object>> getDetailsByRegion(String region) {
		List<Map<String, Object>> result = daoClass.fetchDeatilsByRegion(region);
		return result;

	}

	public List<Map<String, Object>> getDetailsByPestle(String pestle) {
		List<Map<String, Object>> result = daoClass.fetchDeatilsByPestle(pestle);
		return result;

	}

	public List<Map<String, Object>> getDetailsBySource(String source) {
		List<Map<String, Object>> result = daoClass.fetchDeatilsBySource(source);
		return result;

	}

	public List<Map<String, Object>> getDetailsByEdSwot(String swot) {
		List<Map<String, Object>> result = daoClass.fetchDeatilsBySwot(swot);
		return result;

	}

	public List<Map<String, Object>> getDetailsByCountry(String country) {
		List<Map<String, Object>> result = daoClass.fetchDeatilsByCountry(country);
		return result;

	}

	public List<Map<String, Object>> getDetailsByCity(String city) {
		List<Map<String, Object>> result = daoClass.fetchDeatilsByCity(city);
		return result;

	}

}
