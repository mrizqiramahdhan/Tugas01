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
        CPU ASUS = new CPU();
        
        ASUS.Merk="ASUS Perfection";
        ASUS.Processor="Inter Core-i3";
        ASUS.RAM="2x4GB DDR3";
        ASUS.HDD="500GB";
        ASUS.PSU="400Watt";

	ASUS.cetakInfo();
    }
}
