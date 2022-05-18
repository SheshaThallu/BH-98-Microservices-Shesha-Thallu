package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeavesRepository extends JpaRepository<Leaves, Long>
{
	Leaves findByEmpIdAndYearAndMonth(Long empId, int year, int month);

}