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
public class CPUaction3 {
    public static void main(String[] args){
        CPU DA = new CPU();
        
        DA.Merk="Digital Alliance";
        DA.Processor="Inter Core-i7";
        DA.RAM="2x16GB DDR4";
        DA.HDD="2TB";
        DA.PSU="600Watt";

	DA.cetakInfo();
    }
}
