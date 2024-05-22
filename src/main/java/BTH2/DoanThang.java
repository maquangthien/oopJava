/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2;

/**
 *
 * @author quang
 */
public class DoanThang {
    private B1_Diem diemDau;
    private B1_Diem diemCuoi;

    public DoanThang(B1_Diem diemDau, B1_Diem diemCuoi) {
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }

    public B1_Diem getDiemDau() {
        return diemDau;
    }

    public void setDiemDau(B1_Diem diemDau) {
        this.diemDau = diemDau;
    }

    public B1_Diem getDiemCuoi() {
        return diemCuoi;
    }

    public void setDiemCuoi(B1_Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }

    
   public void hienThi(){
        System.out.printf("[(%d, %d), (%d, %d)]\t", this.diemDau.getHd(), this.diemDau.getTd(), 
                this.diemCuoi.getHd(), this.diemCuoi.getTd());
    }

    public B1_Diem trungDiem() {
        int trungDiemHd = (diemDau.getHd() + diemCuoi.getHd()) / 2;
        int trungDiemTd = (diemDau.getTd() + diemCuoi.getTd()) / 2;
        return new B1_Diem(trungDiemHd, trungDiemTd);
    }
    
     public double doDai() {
        return diemDau.khoangCach(diemCuoi);
    }
    
    public static boolean isSongSong(DoanThang dt1, DoanThang dt2) {
        int xa = dt1.getDiemDau().getHd();
        int ya = dt1.getDiemDau().getTd();
        int xb = dt1.getDiemCuoi().getHd();
        int yb = dt1.getDiemCuoi().getTd();
        
        int xc = dt2.getDiemDau().getHd();
        int yc = dt2.getDiemDau().getTd();
        int xd = dt2.getDiemCuoi().getHd();
        int yd = dt2.getDiemCuoi().getTd();
        
        return (ya - yb) * (xc - xd) == (yc - yd) * (xa - xb);
    }
}
