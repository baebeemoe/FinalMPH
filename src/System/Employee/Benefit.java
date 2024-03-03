/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Employee;

import System.Employee.EmployeeRecords;
public class Benefit {
    
    public double getTotalBenefits(EmployeeRecords employee) {
        double totalBenefits;
               totalBenefits = employee.getClothingAllowance()+ employee.getPhoneAllowance() + employee.getRiceSubsidy();
        return totalBenefits;
    }
    
}
