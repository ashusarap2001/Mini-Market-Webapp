package com.market.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.market.entity.HelpClass;

public interface HelpUserRepo extends JpaRepository<HelpClass, Integer> {

}
