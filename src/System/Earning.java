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
    
public double dailyRate (EmployeeRecords employee){
    double dailyRate = employee.getHourlyRate()*8;
     return dailyRate;
}    

public int daysWorked (PayPeriod payperiod){
    
      int daysWorked = payperiod.countDays();
     return daysWorked;
}
    
public double overTime (EmployeeRecords employee, PayPeriod payperiod ) {
    double overTime = payperiod.calculateTotalOvertime() * employee.getHourlyRate();
     return overTime;
    
}   
  
    
public double GrossSalary (EmployeeRecords employee, PayPeriod payperiod){
    double salary = 0;
    double dailyRate = dailyRate(employee);
    int daysWorked = daysWorked (payperiod);
    double overtime = overTime(employee,payperiod);
    salary = (dailyRate * daysWorked)+ overtime;
     return salary;
}    
    
    
}
