public class Utility {


    int magicYear(int year){
        int magicYear = year + 65;
        return  magicYear;
    }

    int monthSalary(int salary){
        int monthSalary = Math.round(salary / 12);
        return monthSalary;
    }
}