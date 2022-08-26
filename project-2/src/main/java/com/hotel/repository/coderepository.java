package com.hotel.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.transaction.Transactional;

import com.hotel.model.*;
@Repository
@Transactional
public interface coderepository extends JpaRepository<Hotel, Integer>
{
	List<Hotel> findAll();
	Hotel findById(int id);
	
 }