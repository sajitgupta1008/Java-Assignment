package com.knoldus;

import java.time.LocalDate;
import java.time.Period;

public class DateTime {

    int calculateAge(LocalDate bithdayDate){

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(bithdayDate, currentDate);
       return period.getYears();
    }
}
