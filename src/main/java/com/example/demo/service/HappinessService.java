package com.example.demo.service;

import com.example.demo.Dao.HappinessDao;
import com.example.demo.domain.Happiness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HappinessService {

    @Autowired
    private HappinessDao happinessDao;

    public Happiness selectService(String city){
        return happinessDao.findHappinessByCity(city);
    }

    public void insertService(){
        happinessDao.insertHappiness(6,"长安",2134);
    }
}
