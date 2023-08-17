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

    @PutMapping
    public MythEntity updateMyth(@RequestBody MythEntity mythEntity) {
        return mythService.updateMyth(mythEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteMythById(@PathVariable("id") Long id) {
        mythService.deleteMythById(id);
    }
}
