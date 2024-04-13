package Quanlybanhangmaytinh;
import java.util.Scanner;
public class Nhanvien extends Nguoi{
    private String chucVu;
    private int HSL;
    private String maNV;

    public Nhanvien() {
    }

    public Nhanvien(String chucVu, int HSL, String maNV, String hoTen, String soDT, int namSinh, int gioiTinh) {
        super(hoTen, soDT, namSinh, gioiTinh);
        this.chucVu = chucVu;
        this.HSL = HSL;
        this.maNV = maNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public int getHSL() {
        return HSL;
    }

    public void setHSL(int HSL) {
        this.HSL = HSL;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    

    

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap chuc vu: ");
        chucVu = new Scanner(System.in).nextLine();
        System.out.println("Nhap he so luong: ");
        HSL = new Scanner(System.in).nextInt();
        System.out.println("Nhap ma nhan vien: ");
        maNV = new Scanner(System.in).nextLine();
    }

    @Override
    public void hien() {
        super.hien();
        System.out.println("\n{Chuc vu: " + getChucVu() + " he so luong: " + getHSL() + " ma nhan vien: " + getMaNV() + "}");
    }    
}
