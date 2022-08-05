package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.BankDetail;

@Repository
public interface BankDetailRepository extends JpaRepository<BankDetail, String> {

}
