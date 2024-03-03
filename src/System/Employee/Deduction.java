/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Employee;

import System.Employee.EmployeeRecords;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Deduction {

public double calculateSssContribution(EmployeeRecords employee) {
        double basicSalary = (double)employee.getBasicSalary();
        double salary = basicSalary;
        boolean con1 = salary <= 3250.0;
        boolean con2 = salary > 3250.0 && salary <= 3750.0;
        boolean con3 = salary > 3750.0 && salary <= 4250.0;
        boolean con4 = salary > 4250.0 && salary <= 4750.0;
        boolean con5 = salary > 4750.0 && salary <= 5250.0;
        boolean con6 = salary > 5250.0 && salary <= 5750.0;
        boolean con7 = salary > 5750.0 && salary <= 6250.0;
        boolean con8 = salary > 6250.0 && salary <= 6750.0;
        boolean con9 = salary > 6750.0 && salary <= 7250.0;
        boolean con10 = salary > 7250.0 && salary <= 7750.0;
        boolean con11 = salary > 7750.0 && salary <= 8250.0;
        boolean con12 = salary > 8250.0 && salary <= 8750.0;
        boolean con13 = salary > 8750.0 && salary <= 9250.0;
        boolean con14 = salary > 9250.0 && salary <= 9750.0;
        boolean con15 = salary > 9750.0 && salary <= 10250.0;
        boolean con16 = salary > 10250.0 && salary <= 10750.0;
        boolean con17 = salary > 10750.0 && salary <= 11250.0;
        boolean con18 = salary > 11250.0 && salary <= 11750.0;
        boolean con19 = salary > 11750.0 && salary <= 12250.0;
        boolean con20 = salary > 12250.0 && salary <= 12750.0;
        boolean con21 = salary > 12750.0 && salary <= 13250.0;
        boolean con22 = salary > 13250.0 && salary <= 13750.0;
        boolean con23 = salary > 13750.0 && salary <= 14250.0;
        boolean con24 = salary > 14250.0 && salary <= 14750.0;
        boolean con25 = salary > 14750.0 && salary <= 15250.0;
        boolean con26 = salary > 15250.0 && salary <= 15750.0;
        boolean con27 = salary > 15750.0 && salary <= 16250.0;
        boolean con28 = salary > 16250.0 && salary <= 16750.0;
        boolean con29 = salary > 16750.0 && salary <= 17250.0;
        boolean con30 = salary > 17250.0 && salary <= 17750.0;
        boolean con31 = salary > 17750.0 && salary <= 18250.0;
        boolean con32 = salary > 18250.0 && salary <= 18750.0;
        boolean con33 = salary > 18750.0 && salary <= 19250.0;
        boolean con34 = salary > 19250.0 && salary <= 19750.0;
        boolean con35 = salary > 19750.0 && salary <= 20250.0;
        boolean con36 = salary > 20250.0 && salary <= 20750.0;
        boolean con37 = salary > 20750.0 && salary <= 21250.0;
        boolean con38 = salary > 21250.0 && salary <= 21750.0;
        boolean con39 = salary > 21750.0 && salary <= 22250.0;
        boolean con40 = salary > 22250.0 && salary <= 22750.0;
        boolean con41 = salary > 22750.0 && salary <= 23250.0;
        boolean con42 = salary > 23250.0 && salary <= 23750.0;
        boolean con43 = salary > 23750.0 && salary <= 24250.0;
        boolean con44 = salary > 24250.0 && salary <= 24750.0;
        if (con1) {
            return 135.0;
        } else if (con2) {
            return 157.5;
        } else if (con3) {
            return 180.0;
        } else if (con4) {
            return 202.5;
        } else if (con5) {
            return 225.0;
        } else if (con6) {
            return 247.5;
        } else if (con7) {
            return 315.0;
        } else if (con8) {
            return 337.5;
        } else if (con9) {
            return 360.0;
        } else if (con10) {
            return 382.5;
        } else if (con11) {
            return 405.0;
        } else if (con12) {
            return 427.5;
        } else if (con13) {
            return 450.0;
        } else if (con14) {
            return 472.5;
        } else if (con15) {
            return 495.0;
        } else if (con16) {
            return 517.5;
        } else if (con17) {
            return 540.0;
        } else if (con18) {
            return 562.5;
        } else if (con19) {
            return 585.0;
        } else if (con20) {
            return 607.5;
        } else if (con21) {
            return 630.0;
        } else if (con22) {
            return 652.5;
        } else if (con23) {
            return 697.5;
        } else if (con24) {
            return 720.0;
        } else if (con25) {
            return 742.5;
        } else if (con26) {
            return 765.0;
        } else if (con27) {
            return 787.5;
        } else if (con28) {
            return 810.0;
        } else if (con29) {
            return 832.5;
        } else if (con30) {
            return 855.0;
        } else if (con31) {
            return 877.5;
        } else if (con32) {
            return 900.0;
        } else if (con33) {
            return 922.5;
        } else if (con34) {
            return 945.5;
        } else if (con35) {
            return 990.0;
        } else if (con36) {
            return 1012.5;
        } else if (con37) {
            return 1035.0;
        } else if (con38) {
            return 1057.5;
        } else if (con39) {
            return 1080.0;
        } else if (con40) {
            return 1012.5;
        } else if (con41) {
            return 1035.0;
        } else if (con42) {
            return 1057.5;
        } else if (con43) {
            return 1080.0;
        } else {
            return con44 ? 1102.5 : 1125.0;
        }
    }

    public double calculatePhilhealthContribution(EmployeeRecords employee) {
        return (double)employee.getBasicSalary() * 0.03 / 2.0;
    }

    public double calculatePagibigContribution(EmployeeRecords employee) {
        return (double)employee.getBasicSalary() < 1500.0 ? (double)employee.getBasicSalary() * 0.01 : 100.0;
    }

   
    
    public double calculateTotalGovernmentDeduction(EmployeeRecords employee){
    double sssDeduction = calculateSssContribution(employee);
    double philhealthContribution = calculatePhilhealthContribution(employee);
    double pagibigContribution = calculatePagibigContribution(employee);

    return sssDeduction + philhealthContribution + pagibigContribution;
    }
    public  double calculateTax(EmployeeRecords employee ) {
        double grossSalary = (double)employee.getGrossSalary();
        double totalDeductionBeforeTax = calculateTotalGovernmentDeduction(employee);
        double salary = grossSalary - totalDeductionBeforeTax;
        double taxRate = 0.0;
        if (salary > 20832.0 && salary <= 33333.0) {
            taxRate = (salary - 20833.0) * 0.2;
        } else if (salary > 33333.0 && salary <= 66667.0) {
            taxRate = 2500.0 + (salary - 33333.0) * 0.25;
        } else if (salary > 66667.0 && salary <= 166667.0) {
            taxRate = 10833.0 + (salary - 66667.0) * 0.3;
        } else if (salary > 166667.0 && salary <= 666667.0) {
            taxRate = 166667.0 + (salary - 40833.33) * 0.32;
        } else if (salary > 666667.0) {
            taxRate = 200833.33 + (salary - 666667.0) * 0.35;
        }
        return taxRate;
    }
    
     public double totalDeduction(EmployeeRecords employee){
        double total = 0;
        double contribution = calculateTotalGovernmentDeduction(employee);
        double tax = calculateTax( employee );
        total = contribution + tax;
    return total;
    }
     
     
     
}