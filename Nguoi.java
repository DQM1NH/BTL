package Quanlybanhangmaytinh;
import java.util.Scanner;
import java.io.Serializable;
public class Nguoi implements Serializable {
    private String hoTen;
    private String soDT;
    private int namSinh;
    private int gioiTinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String soDT, int namSinh, int gioiTinh) {
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        if(gioiTinh ==1)
            return "Nam";
        else if(gioiTinh==0)
            return "Nu";
        else return null;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void hien(){
        System.out.println("{Ho va ten: " + getHoTen() + " so dien thoai: " + getSoDT() + " nam sinh: " + getNamSinh() + " gioi tinh: " + getGioiTinh() + "}");
    }
    
    public void nhap(){
        System.out.println("Nhap ho va ten: ");
        hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhap so dien thoai: ");
        soDT = new Scanner(System.in).nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = new Scanner(System.in).nextInt();
        do
        {
            System.out.print("Gioi tinh(nam: 1/ nu: 0) ");
            gioiTinh= new Scanner(System.in).nextInt();
            
        }
        while(gioiTinh!=1 && gioiTinh!=0);
    }
}
