package com.stie.empform.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stie.empform.dao.CandidateInfoDao;
import com.stie.empform.model.CandidateInfo;
import com.stie.empform.model.HrReview;
import com.stie.empform.model.Image;
import com.stie.empform.model.InterviewAssesment;

@RestController
@CrossOrigin
public class HomeController {

	@Autowired
	CandidateInfoDao candidateInfoDao;
	
	String path="D:\\nadeem\\docs\\";
	
	@PostMapping("/candidate")
	public ResponseEntity<?> candidate(@RequestBody CandidateInfo candidateInfo){
		candidateInfo.getFamilyDetails().forEach(f->{
			f.setCandidateInfo(candidateInfo);
		});
		
		candidateInfo.getComputerProficiencies().forEach(f->{
			f.setCandidateInfo(candidateInfo);
		});
		
		candidateInfo.getEducations().forEach(f->{
			f.setCandidateInfo(candidateInfo);
		});
		
		candidateInfo.getEmploymentHistories().forEach(f->{
			f.setCandidateInfo(candidateInfo);
		});
		
		candidateInfo.getLanguages().forEach(f->{
			f.setCandidateInfo(candidateInfo);
		});
		
		candidateInfo.getMemberships().forEach(f->{
			f.setCandidateInfo(candidateInfo);
		});
		
		candidateInfo.getReferences().forEach(f->{
			f.setCandidateInfo(candidateInfo);
		});
		
		candidateInfoDao.save(candidateInfo);
		return ResponseEntity.ok(candidateInfo.getId());
	}
	
	@PostMapping("/image")
	public ResponseEntity<?> saveImage(@RequestBody Image image){
		System.err.println(image.getImage());
		CandidateInfo candidateInfo = candidateInfoDao.findById(image.getId()).orElse(null);
		String imageName=candidateInfo.getPersonalDetails().getFullName()+".jpeg";
		candidateInfo.getPersonalDetails().setImage(imageName);
		candidateInfoDao.save(candidateInfo);
		
		byte[] decodedImg = Base64.getMimeDecoder()
                .decode(image.getImage());
		Path destinationFile = Paths.get(path,imageName);
		try {
			Files.write(destinationFile,decodedImg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ResponseEntity.ok(null);
	}
	
	@GetMapping("/candidates/assessment")
	public ResponseEntity<?> getCandidatesForAssessment(){
		return ResponseEntity.ok(candidateInfoDao.findAllForAssessment());
	}
	
	@GetMapping("/candidates/review")
	public ResponseEntity<?> getCandidatesForReview(){
		return ResponseEntity.ok(candidateInfoDao.findAllForReview());
	}
	
	@GetMapping("/candidate/{id}")
	public ResponseEntity<?> getCandidate(@PathVariable("id") long id){
		return ResponseEntity.ok(candidateInfoDao.findByIdProjected(id));
	}
	
	@PostMapping("/assessment/{id}")
	public ResponseEntity<?> updateAssessmentOfCandidate(@PathVariable("id") long id,@RequestBody InterviewAssesment assesment){
		CandidateInfo candidateInfo= candidateInfoDao.findById(id).orElse(null); 
		candidateInfo.setInterviewAssesment(assesment);
		candidateInfoDao.save(candidateInfo);
		return ResponseEntity.ok(null);
	}
	
	@PostMapping("/review/{id}")
	public ResponseEntity<?> updateHrReviewOfCandidate(@PathVariable("id") long id,@RequestBody HrReview review){
		CandidateInfo candidateInfo= candidateInfoDao.findById(id).orElse(null); 
		candidateInfo.setHrReview(review);
		candidateInfoDao.save(candidateInfo);
		return ResponseEntity.ok(null);
	}
		
}
