package Quanlybanhangmaytinh;
import java.util.Calendar;
import java.util.Scanner;
public class HoaDonBanHang extends Maytinh{
    private int soLuong;
    private double thanhTien;
    private int ngayBan;
    private int thangBan;
    private int namBan;

    public HoaDonBanHang(int soLuong, double thanhTien, int ngayBan, int thangBan, int namBan, String maLoai, String ten, int namSX, int giaBan) {
        super(maLoai, ten, namSX, giaBan);
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.ngayBan = ngayBan;
        this.thangBan = thangBan;
        this.namBan = namBan;
    }


    public HoaDonBanHang() {
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(int ngayBan) {
        this.ngayBan = ngayBan;
    }

    public int getThangBan() {
        return thangBan;
    }

    public void setThangBan(int thangBan) {
        this.thangBan = thangBan;
    }

    public int getNamBan() {
        return namBan;
    }

    public void setNamBan(int namBan) {
        this.namBan = namBan;
    }
    
    public void nhapTT(){
        Calendar cal = Calendar.getInstance();
        System.out.println("Nhap so luong: ");
        soLuong = new Scanner(System.in).nextInt();
        thanhTien = soLuong*getGiaBan();
        System.out.println("Nhap ngay ban: ");
        int NgayBan = new Scanner(System.in).nextInt();
        System.out.println("Nhap thang ban: ");
        int ThangBan = new Scanner(System.in).nextInt();
        System.out.println("Nhap ngay ban: ");
        int NamBan = new Scanner(System.in).nextInt();
        cal.set(Calendar.YEAR,NamBan);
        cal.set(Calendar.MONTH, ThangBan);
        cal.set(Calendar.DAY_OF_MONTH, NgayBan);
        ngayBan = cal.get(Calendar.DAY_OF_MONTH);
        thangBan = cal.get(Calendar.MONTH);
        namBan = cal.get(Calendar.YEAR); 
    }
    public void hienTT(){
        System.out.println("So luong: " + soLuong + "Ngay ban: " + ngayBan +"/" + thangBan + "/" + namBan + "Thanh tien: " + thanhTien);
    }
}