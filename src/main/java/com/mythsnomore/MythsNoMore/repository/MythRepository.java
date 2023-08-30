package com.mythsnomore.MythsNoMore.repository;

import com.mythsnomore.MythsNoMore.entity.MythEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
    public interface MythRepository extends JpaRepository<MythEntity, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM myths WHERE myths.title = :title")
    MythEntity findByTitle(String title);

}

