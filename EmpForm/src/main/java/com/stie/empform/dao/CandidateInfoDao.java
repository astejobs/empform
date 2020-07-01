package com.stie.empform.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.stie.empform.model.CandidateInfo;
import com.stie.empform.projections.CandidateInfoProj;

public interface CandidateInfoDao extends CrudRepository<CandidateInfo, Long> {
	@Query("Select c from CandidateInfo c where c.interviewAssesment is null")	
	List<CandidateInfoProj> findAllForAssessment();
	
	@Query("Select c from CandidateInfo c where c.hrReview is null and c.interviewAssesment != null")	
	List<CandidateInfoProj> findAllForReview();
	
	@Query("Select c from CandidateInfo c where c.id = :id")	
	CandidateInfoProj findByIdProjected(@Param("id") long id);
}
