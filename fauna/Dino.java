/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fauna;

/**
 *
 * @author PC-A-30
 */
public class Dino extends hewan {
    public void tampilkan(){
        String berkebembangbiak;
        String berkembangbiak = "Beranak";
        Hewan h = new Hewan();
        h.inputhewan("Dino", "rawr", "asep", "aolo", "alo");
        h.tampilhewan();
        System.out.print("Cara berkembangbiak : "+berkembangbiak);
              
             
    }
}
