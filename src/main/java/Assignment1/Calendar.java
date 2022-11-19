package Assignment1;

import java.util.Arrays;
import java.util.List;

public class Calendar {
    List<Months> months = Arrays.asList(Months.values());
    int year;

    public String printDate(String date){
        int day = Integer.parseInt(date.split("/")[0]);
        int month = Integer.parseInt(date.split("/")[1]);
        year = Integer.parseInt(date.split("/")[2]);

        String monthName = String.valueOf(months.get(month-1));

        return day+" "+monthName+ " "+ year;
    }

    public String IncrementDate(String date){
        int day = Integer.parseInt(date.split("/")[0]);
        int month = Integer.parseInt(date.split("/")[1]);
        year = Integer.parseInt(date.split("/")[2]);

        Months monthType = Months.valueOf(String.valueOf(months.get(month-1)));

        if(day == monthType.getDays()){
            day = 1;
            if(month == 12){
                month = 1;
                year++;
            }
            else month++;
        }else{
            day++;
        }

        String monthName = String.valueOf(months.get(month-1));
        return "Next date is "+day+" "+monthName+ " "+ year;
    }

    public boolean checkLeapYear(){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
