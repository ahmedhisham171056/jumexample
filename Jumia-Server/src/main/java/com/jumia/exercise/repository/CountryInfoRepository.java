package com.jumia.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jumia.exercise.entity.CountryInfo;

@Repository
public interface CountryInfoRepository extends JpaRepository<CountryInfo, String>{

}
