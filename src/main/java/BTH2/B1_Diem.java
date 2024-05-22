/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTH2;

/**
 *
 * @author quang
 */
public class B1_Diem {

    private int hd;
    private int td;

    public B1_Diem(int hd, int td) {
        this.hd = hd;
        this.td = td;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getTd() {
        return td;
    }

    public void setTd(int td) {
        this.td = td;
    }

    public void HienThi() {
        System.out.printf("(%d, %d)\t", this.hd, this.td);
    }

    public double khoangCach(B1_Diem d) {
        return Math.sqrt(Math.pow((this.hd - d.hd), 2) + Math.pow((this.td - d.td), 2));
    }

}
