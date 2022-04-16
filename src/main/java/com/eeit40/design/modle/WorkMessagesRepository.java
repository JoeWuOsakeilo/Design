package com.eeit40.design.modle;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkMessagesRepository extends JpaRepository<WorkMessages, Integer> {
       
	public WorkMessages findFirstByOrderByAddedDesc();
}
