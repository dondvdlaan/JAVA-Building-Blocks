package dev.manyroads.beans;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestHouseBean {

    @Autowired
    House house;
    @Test
    public void testHouse(){
        assertEquals(house.getName(),"HoutenHui");
    }
}
