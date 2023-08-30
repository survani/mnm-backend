package com.mythsnomore.MythsNoMore.service;

import com.mythsnomore.MythsNoMore.entity.MythEntity;

import java.util.List;

public interface MythService {

    List<MythEntity> findAllMyths();
    MythEntity findMythById(Long id);
    MythEntity findMythByTitle(String title);
    MythEntity saveMyth(MythEntity mythEntity);
    MythEntity updateMyth(MythEntity mythEntity);

    void deleteMythById(Long id);

}
