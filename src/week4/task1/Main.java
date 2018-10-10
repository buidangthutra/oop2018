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
public class Main {
    public static void main(String[] args) {
        Cam cam = new Cam(204,45,"My");
        Tao t = new Tao(305,50,"Anh");
        Caophong cp = new Caophong(342,67,"Hue");
        Camsanh s = new Camsanh(455,34,"Nghe An");
        
        System.out.println("CAM:");
        cam.TongQuaNhap();
        System.out.println("Tong von dau tu cam: " + cam.TongGiaDauTu()+"$");
        System.out.println("Xuat xu: " + cam.getNguongoc());
        
        System.out.println("TAO:");
        t.TongQuaNhap();
        System.out.println("Tong von dau tu cam: " + t.TongGiaDauTu()+"$");
        System.out.println("Xuat xu: " + t.getNguongoc());
        
        System.out.println("CAO PHONG:");
        cp.TongQuaNhap();
        System.out.println("Tong von dau tu cam: " + cp.TongGiaDauTu()+"$");
        System.out.println("Xuat xu: " + cp.getNguongoc());
        
        System.out.println("CAM SANH:");
        s.TongQuaNhap();
        System.out.println("Tong von dau tu cam: " + s.TongGiaDauTu()+"$");
        System.out.println("Xuat xu: " + s.getNguongoc());
    }
}
