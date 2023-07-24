package com.example.dashboardDemo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.dashboardDemo.constants.SqlConstants;

@Repository
public class DaoClass {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	public List<Map<String, Object>> fetchDeatilsByYear(int endYear) {
		Map<String, Integer> namedParameter = new HashMap<>();
		namedParameter.put("end_year", endYear);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(SqlConstants.FETCH_QUERY_BY_ENDYEAR,
				namedParameter);
		return result;
	}

	public List<Map<String, Object>> fetchDeatilsByTopic(String topic) {
		Map<String, String> namedParameter = new HashMap<>();
		namedParameter.put("topic", topic);

		List<Map<String, Object>> result = jdbcTemplate.queryForList(SqlConstants.FETCH_QUERY_BY_TOPICS,
				namedParameter);
		return result;
	}

	public List<Map<String, Object>> fetchDeatilsBySector(String sector) {
		Map<String, String> namedParameter = new HashMap<>();
		namedParameter.put("sector", sector);

		List<Map<String, Object>> result = jdbcTemplate.queryForList(SqlConstants.FETCH_QUERY_BY_SECTOR,
				namedParameter);
		return result;
	}

	public List<Map<String, Object>> fetchDeatilsByRegion(String region) {
		Map<String, String> namedParameter = new HashMap<>();
		namedParameter.put("region", region);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(SqlConstants.FETCH_QUERY_BY_REGION,
				namedParameter);
		return result;
	}

	public List<Map<String, Object>> fetchDeatilsByPestle(String pestle) {
		Map<String, String> namedParameter = new HashMap<>();
		namedParameter.put("pestle", pestle);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(SqlConstants.FETCH_QUERY_BY_PEST, namedParameter);
		return result;
	}

	public List<Map<String, Object>> fetchDeatilsBySource(String source) {
		Map<String, String> namedParameter = new HashMap<>();
		namedParameter.put("source", source);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(SqlConstants.FETCH_QUERY_BY_SOURCE,
				namedParameter);
		return result;
	}

	public List<Map<String, Object>> fetchDeatilsBySwot(String swot) {
		Map<String, String> namedParameter = new HashMap<>();
		namedParameter.put("swot", swot);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(SqlConstants.FETCH_QUERY_BY_SWOT, namedParameter);
		return result;
	}

	public List<Map<String, Object>> fetchDeatilsByCountry(String country) {
		Map<String, String> namedParameter = new HashMap<>();
		namedParameter.put("country", country);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(SqlConstants.FETCH_QUERY_BY_COUNTRY,
				namedParameter);
		return result;
	}

	public List<Map<String, Object>> fetchDeatilsByCity(String city) {
		Map<String, String> namedParameter = new HashMap<>();
		namedParameter.put("city", city);
		List<Map<String, Object>> result = jdbcTemplate.queryForList(SqlConstants.FETCH_QUERY_BY_CITY, namedParameter);
		return result;
	}

}
