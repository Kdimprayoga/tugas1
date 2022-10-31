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
public class Trex extends hewan {
    public void tampilkan(){
        String berkebembangbiak;
        String berkembangbiak = "Beranak";
        hewan h = new hewan();
        h.inputhewan("huwuss","rawr","alip","gahar","lopi");
        h.tampilhewan();
        System.out.print("Cara berkembangbiak : "+berkembangbiak);
    
}
}
