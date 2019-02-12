package com.april.country;

import java.util.concurrent.atomic.AtomicLong();

public class Country {
    private long id;
    private String name;
    private String population;
    private double landmasssize;
    private String medianage;
}

public Country(String name, String population, String landmass size, String median age;)
{
    this.id;
    this.name=name;
    this.population = population;
    this.medianage = medianage;
}

 public Country (Employee toClone)
 {
     this.id = toClone.getId();
     this.fname = toClone.getname();
     this.population = toClone.population();
     this.landmasssize = toClone.landmasssize();
     this.medianage = toClone.medianage();
     this.healthPlanID = toClone.getHealthPlanID();
 }

 public long getId()
 {
     return id;
 }

 public String population()
 {
     return population;
 }

 public String landmasssize()
 {
     return landmasssize;
 }
}