package com.example.hikaricpdemo.service.impl;

import com.example.hikaricpdemo.entity.K;
import com.example.hikaricpdemo.mapper.KMapper;
import com.example.hikaricpdemo.service.KService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Date 2019/10/21 14:45
 */
@Service
public class KServiceImpl implements KService {
    @Autowired
    private KMapper kMapper;

    @Override
    public List<K> findAll() {
        return kMapper.findAll();
    }
}
