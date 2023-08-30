package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.UsersModel;

@Repository
public interface UsersRepository extends JpaRepository<UsersModel, Integer>{
	@Query(value = "select * from users where first_name =:fn",nativeQuery = true)
	public List<UsersModel> getbyfirstname (@Param("fn") String fn);
}
