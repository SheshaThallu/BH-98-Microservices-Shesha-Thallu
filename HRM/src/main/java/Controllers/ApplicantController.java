package Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import Entities.Applicant;
import Services.ApplicantService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ApplicantController 
{
	@Autowired
	ApplicantService applicantService;
	@GetMapping("/applicants")
	List<Applicant> getAll()
	{
		return applicantService.getAll();
	}
}
