package com.wipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.model.PersonalDetail;

@Repository
public interface PensionerDetailRepository extends JpaRepository<PersonalDetail, String> {

}
