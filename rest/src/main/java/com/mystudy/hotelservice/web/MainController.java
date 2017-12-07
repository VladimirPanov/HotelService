package com.mystudy.hotelservice.web;

import com.mystudy.hotelservice.model.City;
import com.mystudy.hotelservice.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController  {

    @Autowired
    CityRepository cityRepository;

    @RequestMapping("/api/cities")
    public @ResponseBody List<City> index(){
        return (List<City>) cityRepository.findAll();
    }
}
