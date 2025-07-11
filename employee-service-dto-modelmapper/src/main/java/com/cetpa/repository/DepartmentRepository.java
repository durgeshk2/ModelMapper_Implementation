package com.cetpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cetpa.entity.DepartmentEntity;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity, Integer>
{
	

}
