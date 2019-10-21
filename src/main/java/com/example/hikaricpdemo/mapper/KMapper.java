package com.example.hikaricpdemo.mapper;

import com.example.hikaricpdemo.entity.K;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Date 2019/10/21 14:42
 */
@Mapper
public interface KMapper {
    List<K> findAll();
}
