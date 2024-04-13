package Quanlybanhangmaytinh;
import java.util.ArrayList;
import  java.util.Scanner;
public class Khachhang extends Nguoi{
    private String diaChi;
    private String CCCD;
    private String maKH;
    private ArrayList<Maytinh> mt;
    Maytinh maytinh;

    public Khachhang(String diaChi, String CCCD, String maKH, ArrayList<Maytinh> mt, Maytinh maytinh, String hoTen, String soDT, int namSinh, int gioiTinh) {
        super(hoTen, soDT, namSinh, gioiTinh);
        this.diaChi = diaChi;
        this.CCCD = CCCD;
        this.maKH = maKH;
        this.mt = mt;
        this.maytinh = maytinh;
    }
    
    public Khachhang() {
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public ArrayList<Maytinh> getMt() {
        return mt;
    }

    public void setMt(ArrayList<Maytinh> mt) {
        this.mt = mt;
    }

    public Maytinh getMaytinh() {
        return maytinh;
    }

    public void setMaytinh(Maytinh maytinh) {
        this.maytinh = maytinh;
    }

    

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhap dia chi: ");
        diaChi = new Scanner(System.in).nextLine();
        System.out.println("Nhap CCCD: ");
        CCCD = new Scanner(System.in).nextLine();
        System.out.println("Nhap ma khach hang: ");
        maKH = new Scanner(System.in).nextLine();
        nhapDSMuaHang();
    }
    public void nhapDSMuaHang(){
        System.out.println("Nhap so mat hang can mua: ");
        int n = new Scanner(System.in).nextInt();
        mt = new ArrayList<>();
        for(int i=0; i<n; ++i){
            maytinh = new Maytinh();
            maytinh.nhap();
            mt.add(maytinh);
        }
    }
    public void hienDSMuaHang(){
        for (Maytinh maytinh1 : mt) {
            maytinh1.toString();    
        }
    }

    @Override
    public void hien() {
        super.hien();
        System.out.println("{So CCCD: " + getCCCD() + " dia chi: " + getDiaChi() + " ma khach hang: " + getMaKH()+ "}");
        hienDSMuaHang();
    }
    public void hienThongtinKH(){
        super.hien();
        System.out.println("{So CCCD: " + getCCCD() + " dia chi: " + getDiaChi() + " ma khach hang: " + getMaKH() + "}"); 
    } 
}