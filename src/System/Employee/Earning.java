/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Employee;


public class Earning {
 
    public double monthlyRate (PayRate pay){
    double monthlyRate = pay.getBasicSalary();
    return monthlyRate;    
}
    
    public double hourlyRate (PayRate pay) {
        double hourlyRate = (pay.getBasicSalary()/20)/8;
        return hourlyRate;
    }
    
    public double dailyRate (PayRate pay){
        double dailyRate = this.hourlyRate(pay)*8;
        return dailyRate;
    }    

    public int daysWorked (PayPeriod payperiod, AttendanceRecord attendance){
        int daysWorked = payperiod.countDays(attendance);
        return daysWorked;
    }
    
    public double overTime (EmployeeRecords employee, PayPeriod payperiod, AttendanceRecord attendance, PayRate pay) {
        double overTime = payperiod.calculateTotalOvertime(attendance) * pay.getHourlyRate();
        return overTime;
    } 
    
    public double grossSalary (EmployeeRecords employee, PayPeriod payperiod, AttendanceRecord attendance, PayRate pay){
        double salary = 0;
        double dailyRate = dailyRate(pay);
        int daysWorked = daysWorked (payperiod, attendance);
        double overtime = overTime(employee, payperiod, attendance, pay);
        salary = (dailyRate * daysWorked) + overtime;
    
    return salary;
}    
    
    
}
