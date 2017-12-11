package com.mystudy.hotelservice;

import com.mystudy.hotelservice.model.City;
import com.mystudy.hotelservice.model.Hotel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainControllerTest {

    @Before
    public void setup(){
        City city = new City();
        city.setName("Москва");

        Hotel hotel = new Hotel();
        hotel.setName("Центральная");
        hotel.setAddress("Пр. Мира, 10");
    }

    //@Test

}
