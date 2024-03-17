/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System.Employee;

import System.Employee.PayRate;
public class Benefit {
    
    public double getTotalBenefits(PayRate pay) {
        double totalBenefits;
               totalBenefits = pay.getClothingAllowance()+ pay.getPhoneAllowance() + pay.getRiceSubsidy();
        return totalBenefits;
    }
    
}
