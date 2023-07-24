package com.example.dashboardDemo.constants;

public class SqlConstants {

	public static final String endYear = "end_year";
	public static final String topics = "topic";
	public static final String sector = "sector";
	public static final String region = "region";
	public static final String pest = "pest";
	public static final String source = "source";
	public static final String swot = "swot";
	public static final String country = "country";
	public static final String city = "city";

	// select query

	public static final String FETCH_QUERY_BY_ENDYEAR = "select intensity,likelihood,relevance,start_year,end_year,country,topic,region,city from data where end_year=:end_year";
	public static final String FETCH_QUERY_BY_TOPICS = "select intensity,likelihood,relevance,start_year,end_year,country,topic,region,city from data where topic=:topic";
	public static final String FETCH_QUERY_BY_SECTOR = "select intensity,likelihood,relevance,start_year,end_year,country,topic,region,city from data where sector=:sector";
	public static final String FETCH_QUERY_BY_REGION = "select intensity,likelihood,relevance,start_year,end_year,country,topic,region,city from data where region=:region";
	public static final String FETCH_QUERY_BY_PEST = "select intensity,likelihood,relevance,start_year,end_year,country,topic,region,city from data where pestle=:pestle";
	public static final String FETCH_QUERY_BY_SOURCE = "select intensity,likelihood,relevance,start_year,end_year,country,topic,region,city from data where source=:source";
	public static final String FETCH_QUERY_BY_SWOT = "select intensity,likelihood,relevance,start_year,end_year,country,topic,region,city from data where swot=:swot";
	public static final String FETCH_QUERY_BY_COUNTRY = "select intensity,likelihood,relevance,start_year,end_year,country,topic,region,city from data where country=:country";
	public static final String FETCH_QUERY_BY_CITY = "select intensity,likelihood,relevance,start_year,end_year,country,topic,region,city from data where city=:city";
}
