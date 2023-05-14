package db;

import mode.Income;

import java.util.ArrayList;

public class DatabaseIncome {
    public static ArrayList<Income> incomeTable= new ArrayList<Income>();


    static {
        incomeTable.add(
                new Income("JANUARY",500.00,4500.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("FEBRUARY",90000.00,4500.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("MARCH",60000.00,45000.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("APRIL",30000.00,8000.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("MAY",200.00,90000.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("JUNE",7000.00,45000.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("JULY",80000.00,4500.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("AUGUST",40000.00,30000.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("SEPTEMBER",7000.00,45000.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("OCTOBER",800.00,45000.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("NOVEMBER",2000.00,4501.00,0.00,0.00)
        );
        incomeTable.add(
                new Income("DECEMBER",60630.00,72100.00,0.00,0.00)
        );



    }
}
