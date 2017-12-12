package com.mystudy.hotelservice;

import com.mystudy.hotelservice.model.City;
import com.mystudy.hotelservice.model.Hotel;
import com.mystudy.hotelservice.repository.CityRepository;
import com.mystudy.hotelservice.repository.HotelRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainControllerTest {

    @Autowired
    CityRepository cityRepository;

    @Autowired
    HotelRepository hotelRepository;

    @Before
    public void setup(){
        City city = new City();
        city.setName("Москва");
        cityRepository.save(city);

        Hotel hotel = new Hotel();
        hotel.setName("Центральная");
        hotel.setAddress("Пр. Мира, 10");
        hotel.setCity(city);
        hotelRepository.save(hotel);
    }

    @Test
    public void contextLoads() {
    }

}
