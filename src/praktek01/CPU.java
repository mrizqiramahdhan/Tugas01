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
public class CPU {
    String Merk;
    String Processor;
    String RAM;
    String HDD;
    String PSU;
    
    void cetakInfo() {
        System.out.println("Merk :"+Merk);
        System.out.println("Processor :"+Processor);
        System.out.println("RAM :"+RAM);
        System.out.println("HDD :"+HDD);
        System.out.println("PSU :"+PSU);
    }
}
