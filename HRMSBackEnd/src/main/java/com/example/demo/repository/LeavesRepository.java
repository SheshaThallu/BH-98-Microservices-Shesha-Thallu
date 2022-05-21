package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Leaves;

@Repository
public interface LeavesRepository extends JpaRepository<Leaves, Long>
{
	Leaves findByEmpIdAndYearAndMonth(Long empId, int year, int month);

}