//package com.jumia.exercise.cache;
//
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.jumia.exercise.entity.CountryInfo;
//import com.jumia.exercise.repository.CountryInfoRepository;
//
//public class CountryCache {
//
//	private static CountryCache countryCache = null;
//
//	private static Map<String, CountryInfo> COUNTRIES;
//
//	@Autowired
//	public CountryInfoRepository countryInfoRepository;
//
//	private void init(){
//		List<CountryInfo> result = countryInfoRepository.findAll();
//		COUNTRIES = result.stream().collect(Collectors.toMap(CountryInfo::getCountryCode, c -> c));
//	}
//
//	private CountryCache() {
//		init();
//	}
//
//	public static CountryCache getInstance() {
//		if (countryCache == null) {
//			countryCache = new CountryCache();
//		}
//		return countryCache;
//	}
//
//	
//	public Map<String, CountryInfo> getCountriesCache() {
//		return COUNTRIES;
//	}
//
//	public static void updateCountryCache() {
//		countryCache = new CountryCache();
//	}
//
//}
