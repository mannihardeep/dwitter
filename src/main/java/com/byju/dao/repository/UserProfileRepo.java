package com.byju.dao.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.byju.dao.entity.UserProfile;

@Repository
public interface UserProfileRepo extends JpaRepository<UserProfile, Serializable> {
	
	public List<UserProfile> getUserProfileByUsername(String username);

}
