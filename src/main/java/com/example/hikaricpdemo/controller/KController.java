package com.example.hikaricpdemo.controller;

import com.example.hikaricpdemo.entity.K;
import com.example.hikaricpdemo.service.KService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Date 2019/10/21 14:49
 */
@RestController
@RequestMapping("/k")
public class KController {
    @Autowired
    private KService kService;

    @GetMapping("/all")
    public List<K> all(){
        return kService.findAll();
    }
}
