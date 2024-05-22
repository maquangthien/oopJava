/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanSo;

/**
 *
 * @author quang
 */
public class Main {

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(2, 8);
        PhanSo ps2 = new PhanSo(2, 4);
        ps1.HienThi();
        ps2.HienThi();
        ps2.rutGon().HienThi();
        
        PhanSo tong = ps1.cong(ps2);
        System.out.print("Tong hai phan so: ");
        tong.HienThi();
        
        PhanSo hieu = ps1.tru(ps2);
        System.out.print("Hieu hai phan so: ");
        hieu.HienThi();
        
        PhanSo tich = ps1.nhan(ps2);
        System.out.print("Tich hai phan so: ");
        tich.HienThi();
        
        PhanSo thuong = ps1.chia(ps2);
        System.out.print("Thuong hai phan so: ");
        thuong.HienThi();

    }
    
    

}
