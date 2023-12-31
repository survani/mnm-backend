package com.mythsnomore.MythsNoMore.service;

import com.mythsnomore.MythsNoMore.entity.MythEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MythService {

    List<MythEntity> findAllMyths();
    MythEntity findMythById(Long id);
    MythEntity findMythByTitle(String title);
    MythEntity findMythBySlug(String slug);
    MythEntity saveMyth(MythEntity mythEntity);
    MythEntity updateMyth(MythEntity mythEntity);

    void deleteMythById(Long id);
    // New method for pagination
    Page<MythEntity> findAllMyths(Pageable pageable);

}
