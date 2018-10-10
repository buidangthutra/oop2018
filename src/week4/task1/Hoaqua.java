/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author Thu Trà
 */
public class Hoaqua {
    private int giaban, soluong;
    private String nguongoc;
    
    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }
    
    public int getGiaban(){
        return giaban;
    }
    
    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
    
    public int getSoluong() {
         return soluong;
    }
    
    public void setNguongoc(String xuat) {
        this.nguongoc = xuat;
    }
    
    public String getNguongoc() {
        return nguongoc;
    }
    
    public  Hoaqua(int soluong, int gia, String nguongoc) {
        this.giaban = gia;
        this.soluong = soluong;
        this.nguongoc = nguongoc;
    }
    public Hoaqua(){
        
    }       
            
    
    public int TongGiaDauTu(){
        return giaban*soluong;
    }
    
    void TongQuaNhap() {
        System.out.println("Da nhap vao kho " + soluong + " qua." );
    }
    
}
