package com.pro1.pro1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pro1.pro1.model.*;

@Repository
public interface TrawlingRepository extends JpaRepository<TrawlingDetails, Integer>{
	
List<TrawlingDetails> findAllByTrawlingNumber(String trawlingNumber); 

}
