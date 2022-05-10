package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Entities.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, Long>
{
	
}
