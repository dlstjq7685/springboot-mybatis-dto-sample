package com.example.mybatistutorial.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatistutorial.bean.Sample;

@Mapper
public interface DemoMapper {
    
    public Sample findSample(String key);

    public boolean registSample(Sample value);
}
