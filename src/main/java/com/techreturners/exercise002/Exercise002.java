package com.techreturners.exercise002;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public  int past(int h, int m, int s)  {
    	int milliSeconds=(h*3600000)+(m*60000)+(s*1000);
        return milliSeconds;
    }
}