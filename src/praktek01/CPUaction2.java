/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author WUMBO
 */
public class CPUaction2 {
    public static void main(String[] args){
        CPU MSI = new CPU();
        
        MSI.Merk="MSI Guardian";
        MSI.Processor="Inter Core-i5";
        MSI.RAM="2x8GB DDR4";
        MSI.HDD="1TB";
        MSI.PSU="500Watt";

	MSI.cetakInfo();
    }
}
