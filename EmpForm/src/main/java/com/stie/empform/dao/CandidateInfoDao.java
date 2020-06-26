package com.stie.empform.dao;

import org.springframework.data.repository.CrudRepository;

import com.stie.empform.model.CandidateInfo;

public interface CandidateInfoDao extends CrudRepository<CandidateInfo, Long> {

}
