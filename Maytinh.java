package Quanlybanhangmaytinh;
import java.util.Scanner;
import java.io.Serializable;
public class Maytinh implements Serializable{
    private String maLoai;
    private String ten;
    private int namSX;
    private int giaBan;

    public Maytinh(String maLoai, String ten, int namSX, int giaBan) {
        this.maLoai = maLoai;
        this.ten = ten;
        this.namSX = namSX;
        this.giaBan = giaBan;
    }

    public Maytinh() {
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }


    
    public void nhap(){
        System.out.println("Nhap ma loai may tinh: ");
        maLoai = new Scanner(System.in).nextLine();
        System.out.println("Nhap ten: ");
        ten = new Scanner(System.in).nextLine();
        System.out.println("Nhap nam san xuat: ");
        namSX = new Scanner(System.in).nextInt();
        System.out.println("Nhap gia ban: ");
        giaBan = new Scanner(System.in).nextInt();
    }

    public void hienMatHang(){
        System.out.println("Ma loai may tinh: " + getMaLoai() + " ten may tinh: " + getTen() + " nam san xuat: " + getNamSX() + " gia ban: " + getGiaBan()  + "}");
    }
}
