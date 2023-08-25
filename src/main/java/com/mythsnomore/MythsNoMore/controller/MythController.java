package com.mythsnomore.MythsNoMore.controller;

import com.mythsnomore.MythsNoMore.entity.MythEntity;
import com.mythsnomore.MythsNoMore.service.MythService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin
@RequestMapping("/myths")
public class MythController {
    private final MythService mythService;


    public MythController(MythService mythService) {
        this.mythService = mythService;
    }

    @GetMapping
    public List<MythEntity> findAllMyths() {
        return mythService.findAllMyths();
    }

    @GetMapping("/{id}")
    public MythEntity findMythById(@PathVariable("id") Long id) {
        return mythService.findMythById(id);
    }

    @PostMapping
    public MythEntity saveMyth(@RequestBody MythEntity mythEntity) {
        return mythService.saveMyth(mythEntity);
    }

    @PutMapping("/{id}")
    public MythEntity updateMyth(@PathVariable("id") Long id, @RequestBody MythEntity mythEntity) {
        MythEntity existingMyth = mythService.findMythById(id);

        // Update the existing myth entity with the new data
        assert existingMyth != null;
        existingMyth.setTitle(mythEntity.getTitle());
        existingMyth.setDescription(mythEntity.getDescription());
        existingMyth.setTopic(mythEntity.getTopic());
        existingMyth.setImageUrl(mythEntity.getImageUrl());
        existingMyth.setContent(mythEntity.getContent());
        existingMyth.setFact(mythEntity.getFact());
        existingMyth.setFeatured(mythEntity.getFeatured());
        existingMyth.setLikes(mythEntity.getLikes());
        // Update other properties as needed

        return mythService.updateMyth(existingMyth);
    }

    @DeleteMapping("/{id}")
    public void deleteMythById(@PathVariable("id") Long id) {
        mythService.deleteMythById(id);
    }
}
