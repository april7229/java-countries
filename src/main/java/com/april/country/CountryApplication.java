package com.april.country;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CountryApplication {


static countryList ourcountryList;

    public static void main(String[] args)
    {
        ourcountryList = new countryList;
        SpringApplication.run(CountryApplication.class, args);
    }

}

