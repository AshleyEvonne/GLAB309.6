package com.perscholas.GLAB3096.myServices;


import org.springframework.stereotype.Component;

//We used @Component in this class so that Spring can auto-scan
// and find this implementation for the Spring container.

@Component
public class HappyFortuneService implements FortuneServices {

    @Override
    public String getFortune(){
        return "Today is Your lucky day!";
    }
}
