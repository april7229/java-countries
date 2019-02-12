package com.april.country;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

public class CountryController {

    @RestController
    @RequestMapping("/data")
    public class CountryController
    {
        @RequestMapping("/country")
        public Country getCountryDetail(@RequestParam(value="id")long id)
        {
            return CountryApplication.ourcourcountryList.findcountry(e->(e.getId()==id));
        }

        @RequestMapping("/allcountry")
        public ArrayList<country> getAllCountry()
        {
            CountryApplication.ourcountryList.countryList.sort((e1, e2)->
                    e1.getName().compareToIgnoreCase(e2.getName()));
            return CountryApplication.ourcountryList.countrList;
        }
    }
}
