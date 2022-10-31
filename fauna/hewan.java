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
public class hewan {
    private String Nama;
    private String Jenis;
    private String Suara;
    private String Umur;
    private String Makan;

public String getNama (){
    return Nama;
}
public void setNama(String nama){
    this.Nama = nama;
}
public String getJenis (){
    return Jenis;
}
public void setJenis(String jenis){
    this.Jenis = jenis;
}
public String getSuara (){
    return Suara;
}
public void setSuara(String suara){
    this.Suara = suara;
}
public String getUmur (){
    return Umur;
}
public void setUmur(String umur){
    this.Umur = umur;
}
public String getMakan (){
    return Makan;
}
public void setMakan(String makan){
    this.Makan = makan;
}
public void tampilhewan(){
    System.out.println("Nama Hewan : "+getNama());
    System.out.println("Jenis Hewan : "+getJenis());
    System.out.println("Suara Hewan : "+getSuara());
    System.out.println("Umur Hewan : "+getUmur());
    System.out.println("Makan Hewan : "+getMakan());
}

public void inputhewan(String n, String j, String s, String u, String m){
    setNama(n);
    setJenis(j);
    setSuara(s);
    setUmur(u);
    setMakan(m);
}    

   




}