package com.rim.logistics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rim.logistics.entity.LogisticsPartner;

@Repository
public interface LogisticsPartnerAccountRepo extends JpaRepository<Long, LogisticsPartner> {
}
