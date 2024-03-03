/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;


public class Earning {
    
    
    
 public double monthlyRate (EmployeeRecords employee){
     double monthlyRate = employee.getBasicSalary();
     return monthlyRate;    
} 
    
public double dailyRate (EmployeeRecords employee ){
    
    double dailyRate = employee.getHourlyRate()*8;
     return dailyRate;
}    

public int daysWorked (PayPeriod payperiod, AttendanceRecord attendance){
    
      int daysWorked = payperiod.countDays(attendance);
     return daysWorked;
}
    
public double overTime (EmployeeRecords employee, PayPeriod payperiod, AttendanceRecord attendance ) {
    double overTime = payperiod.calculateTotalOvertime(attendance) * employee.getHourlyRate();
     return overTime;
    
}   
  
    
public double GrossSalary (EmployeeRecords employee, PayPeriod payperiod,AttendanceRecord attendance){
    double salary = 0;
    double dailyRate = dailyRate(employee);
    int daysWorked = daysWorked (payperiod,attendance);
    double overtime = overTime(employee,payperiod,attendance);
    salary = (dailyRate * daysWorked)+ overtime;
     return salary;
}    
    
    
}
