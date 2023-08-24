package com.valcos98.personalportfolio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valcos98.personalportfolio.models.Technologies;

public interface TechnologiesRepository extends JpaRepository<Technologies,Long>{
    
}
