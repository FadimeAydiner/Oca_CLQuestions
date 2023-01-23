package Questions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question3LocalDate {
    public static void main(String[] args) {
        String date = LocalDate //We are using LocalDate then our formatter must be ISO_DATE
                .parse("2016-11-01") 	// time is not assigned here
                .format(DateTimeFormatter.ISO_DATE_TIME);  	//_TIME should be removed
        System.out.println(date);
    }
}

/*
* What is the result?
A. May 04, 2014T00:00:00.000
B. 2014-05-04T00:00: 00.000
C. 5/4/14T00:00:00.000
D. An exception is thrown at runtime*/
/*
*It gives UnsupportedTemporalTypeException */

/*
* https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
* ISO_DATE	 --Date with or without offset---	'2011-12-03+01:00'; '2011-12-03'
*ISO_DATE_TIME	--Date and time with ZoneId	-----'2011-12-03T10:15:30+01:00[Europe/Paris]'

* If we take the date with LocalDate class our DateTimeFormatter must be ISO_DATE
* ANd our parse pattern must be like '2011-12-03+01:00'; '2011-12-03'
*
 * If we take the date with LocalDateTime class our DateTimeFormatter must be ISO_DATE_TIME
 * ANd our parse pattern must be like 2011-12-03T10:15:30+01:00[Europe/Paris]
 *
 * * */