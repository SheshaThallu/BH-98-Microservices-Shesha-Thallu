package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SalaryPayRepository extends JpaRepository<SalaryPay, Long>
{

	Optional<SalaryPay> findByEmpIdAndYearAndMonth(Long empId, int year, int month);
	
}
