package com.mythsnomore.MythsNoMore.service.impl;

import com.mythsnomore.MythsNoMore.entity.MythEntity;
import com.mythsnomore.MythsNoMore.repository.MythRepository;
import com.mythsnomore.MythsNoMore.service.MythService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class MythServiceImpl implements MythService {

    private final MythRepository mythRepository;

    public MythServiceImpl(MythRepository mythRepository) {
        this.mythRepository = mythRepository;
    }

    @Override
    public List<MythEntity> findAllMyths() {
        return mythRepository.findAll();
    }

    @Override
    public MythEntity findMythById(Long id) {
        return mythRepository.findById(id).orElse(null);
    }

    @Override
    public MythEntity findMythByTitle(String title) {
        return mythRepository.findByTitle(title);
    }

    @Override
    public MythEntity findMythBySlug(String slug) {
        return mythRepository.findBySlug(slug);
    }

    @Override
    public MythEntity saveMyth(MythEntity mythEntity) {
        return mythRepository.save(mythEntity);
    }

    @Override
    public MythEntity updateMyth(MythEntity mythEntity) {
        return mythRepository.save(mythEntity);
    }

    @Override
    public void deleteMythById(Long id) {
        mythRepository.deleteById(id);
    }

    @Override
    public Page<MythEntity> findAllMyths(Pageable pageable) {
        return mythRepository.findAll(pageable);
    }
}
