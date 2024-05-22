/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2;

/**
 *
 * @author quang
 */

public class DemoMain {
    public static void main(String[] args) {
        B1_Diem d1 = new B1_Diem(2, 4);
        B1_Diem d2 = new B1_Diem(2, 5);
        d1.HienThi();
        d2.HienThi();
        
        double kc = d1.khoangCach(d2);
        System.out.printf("Khoang cach la %.2f\n", kc);
        
        DoanThang dt1 = new DoanThang(d1, d2);
        dt1.hienThi();
        
        B1_Diem trungDiem = dt1.trungDiem();
        System.out.print("Trung diem cua doan thang la: ");
        trungDiem.HienThi();
        
        double doDai = dt1.doDai();
        System.out.printf("Do dai cua doan thang la %.2f\n", doDai);

        B1_Diem d3 = new B1_Diem(3, 6);
        B1_Diem d4 = new B1_Diem(3, 7);
        DoanThang dt2 = new DoanThang(d3, d4);

        boolean songSong = DoanThang.isSongSong(dt1, dt2);
        System.out.println("Hai doan thang song song: " + songSong);
        
        
        B1_Diem d5 = new B1_Diem(2, 5);
        B1_Diem d6 = new B1_Diem(5, 2);
        
     
        HinhChuNhat hcn = new HinhChuNhat(d5, d6);
        hcn.HienThi();
        
        double dienTich = hcn.DienTich();
        System.out.printf("Dien tich cua hinh chu nhat la %.2f\n", dienTich);
    }
}
