package com.hms.microservice;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hms.microservice.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{

	ExchangeValue findByFromAndTo(String from, String to);

}
