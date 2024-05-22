/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PhanSo;

//Bài 5: Viết lớp PhanSo gồm hai thuộc tính nguyên là tử số, mẫu số của phân số và một
//thuộc tính tĩnh chứa số phân số đã được tạo. Lớp này có hai phương thức khởi tạo:
//- Phương thức khởi tạo không tham số khởi gán tử số là 0, mẫu là số 1.
//- Phương thức khởi tạo hai tham số tương ứng khởi gán giá trị tử số và mẫu số cho
//phân số.
//Các phương thức tĩnh
//- Tìm ước số chung lớn nhất hai số nguyên.
//Các phương thức getter, setter của tử số, mẫu số và các phương thức khác thực hiện các
//chức năng sau:
//- Rút gọn phân số.
//- Các phép tính cộng, trừ, nhân, chia hai phân số. Kết quả trả về của các phép tính này
//là các phân số đã được rút gọn.
//- So sánh bằng, lớn hơn, bé hơn hai phân số.
//- Hiển thị phân số dạng tửSố/mẫuSố.
//Viết phương thức main() kiểm tra các chức năng lớp PhanSo.
//Tạo mảng các phân số và thực hiện các yêu cầu sau trong main():
//- Duyệt và hiển thị các phân số trong mảng.
//- Tính tổng các phân số trong mảng.
//- Tìm phân số lớn nhất trong mảng
public class PhanSo {

    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
        this(0, 1);
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
   public void HienThi() {
        System.out.printf("%d/%d\n", this.tuSo, this.mauSo);
    }
   
     public static int uocChungLonNhat(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public PhanSo rutGon() {
        int ucln = uocChungLonNhat(this.tuSo, this.mauSo);
        return new PhanSo(this.tuSo /= ucln,  this.mauSo /= ucln);
   
    }
    
    public PhanSo cong(PhanSo p) {
        int ts = this.tuSo * p.mauSo + p.tuSo * this.mauSo;
        int ms = this.mauSo * p.mauSo;
        PhanSo kq = new PhanSo(ts, ms);
        kq.rutGon();
        return kq;
    }
    public PhanSo tru(PhanSo p) {
        int ts = this.tuSo * p.mauSo - p.tuSo * this.mauSo;
        int ms = this.mauSo * p.mauSo;
        PhanSo kq = new PhanSo(ts, ms);
        kq.rutGon();
        return kq;
    }

    public PhanSo nhan(PhanSo p) {
        int ts = this.tuSo * p.tuSo;
        int ms = this.mauSo * p.mauSo;
        PhanSo kq = new PhanSo(ts, ms);
        kq.rutGon();
        return kq;
    }

    public PhanSo chia(PhanSo p) {
        int ts = this.tuSo * p.mauSo;
        int ms = this.mauSo * p.tuSo;
        PhanSo kq = new PhanSo(ts, ms);
        kq.rutGon();
        return kq;
    }

    public boolean bangNhau(PhanSo p) {
        return this.tuSo * p.mauSo == p.tuSo * this.mauSo;
    }

    public boolean lonHon(PhanSo p) {
        return this.tuSo * p.mauSo > p.tuSo * this.mauSo;
    }

    public boolean nhoHon(PhanSo p) {
        return this.tuSo * p.mauSo < p.tuSo * this.mauSo;
    }



}
