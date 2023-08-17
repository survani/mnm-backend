package com.mythsnomore.MythsNoMore.repository;

import com.mythsnomore.MythsNoMore.entity.MythEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
    public interface MythRepository extends JpaRepository<MythEntity, Long> {

}

