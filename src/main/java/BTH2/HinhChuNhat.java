/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2;

/**
 *
 * @author quang
 */
public class HinhChuNhat {

    private B1_Diem diemTrenTrai;
    private B1_Diem diemDuoiPhai;

    public HinhChuNhat(B1_Diem diemTrenTrai, B1_Diem diemDuoiPhai) {
        if (diemDuoiPhai.getHd() > diemTrenTrai.getHd() && diemTrenTrai.getTd() > diemDuoiPhai.getTd()) {
            this.diemTrenTrai = diemTrenTrai;
            this.diemDuoiPhai = diemDuoiPhai;
        }
    }

    public B1_Diem getDiemTrenTrai() {
        return diemTrenTrai;
    }

    public void setDiemTrenTrai(B1_Diem diemTrenTrai) {
        this.diemTrenTrai = diemTrenTrai;
    }

    public B1_Diem getDiemDuoiPhai() {
        return diemDuoiPhai;
    }

    public void setDiemDuoiPhai(B1_Diem diemDuoiPhai) {
        this.diemDuoiPhai = diemDuoiPhai;
    }
    
     public double DienTich() {
        int width = diemDuoiPhai.getHd() - diemTrenTrai.getHd();
        int height = diemTrenTrai.getTd() - diemDuoiPhai.getTd();
        return width * height;
    }

    public void HienThi() {
        System.out.printf("Hinh Chu Nhat: [( %d, %d), ( %d, %d)]\n",
                this.diemTrenTrai.getHd(), this.diemTrenTrai.getTd(),
                this.diemDuoiPhai.getHd(), this.diemDuoiPhai.getTd());
    }

}
