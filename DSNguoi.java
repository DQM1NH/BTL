package Quanlybanhangmaytinh;
import java.util.ArrayList;
import java.util.Scanner;
public class DSNguoi {
    ArrayList<Nguoi> person;
//    ArrayList<Maytinh> maytinh;
    public DSNguoi(){
        person = new ArrayList<>();
//        maytinh = new ArrayList<>();
    }
    public void themDSNguoi(Nguoi a){
        System.out.println("Nhap so luong can them: ");
        int n = new Scanner(System.in).nextInt();
        for(int i=0; i<n; ++i){
            System.out.println("lan nhap thu: ");       
            a.nhap();
            person.add(a);
        }
    }
    public void menuSuaDoi(){
        System.out.println("-------------Moi ban lua chon -----------");
        System.out.println("1. Sua thong tin khach hang");
        System.out.println("2. Xoa khach hang");
        System.out.println("3. Sua thong tin nhan vien");
        System.out.println("4.Xoa nhan vien");
        System.out.println("5. Sua thong tin may tinh");
        System.out.println("6. Them may tinh");
        System.out.println("7. Xoa may tinh");
        System.out.println("----------- Chon so 0 đe thoat ----------");  
    }
    public void SuaDoi(){
        int n;
        do {
            menuSuaDoi();
            System.out.println("Chon ");
            n = new Scanner(System.in).nextInt();
            switch(n){
                case 1:{
                  String makh;
                  System.out.println("Nhap ma khach hang can sua: ");
                  makh = new Scanner(System.in).nextLine();
                  suaKhachHang(makh);
                  break;
                }
                case 2:{
                    String makh;
                    System.out.println("Nhap ma khach hang can xoa: ");
                    makh = new Scanner(System.in).nextLine();
                    xoaKhachHang(makh);
                    break;
                }
                case 3:{
                    String manv;
                    System.out.println("Nhap ma nhan vien can sua: ");
                    manv = new Scanner(System.in).nextLine();
                    suaNhanVien(manv);
                    break;
                }
                case 4:{
                    String manv;
                    System.out.println("Nhap ma nhan vien can xoa: ");
                    manv = new Scanner(System.in).nextLine();
                    xoaNhanVien(manv);
                    break;
                }
                case 5:{
                    String makh;
                    String maloai;
                    System.out.println("Nhap ma khach hang: ");
                    makh = new Scanner(System.in).nextLine();
                    System.out.println("Nhap ma loai: ");
                    maloai = new Scanner(System.in).nextLine();
                    suaMaytinh(makh, maloai);
                    break;
                }
                case 6:{
                    String makh;
                    System.out.println("Nhap ma khach hang: ");
                    makh = new Scanner(System.in).nextLine();
                    themMayTInh(makh);
                    break;
                }
                case 7:{
                    String makh;
                    String maloai;
                    System.out.println("Nhap ma khach hang: ");
                    makh = new Scanner(System.in).nextLine();
                    System.out.println("Nhap ma loai: ");
                    maloai = new Scanner(System.in).nextLine();
                    xoaMaytinh(makh, maloai);
                    break;
                }
                default:
                    break;
            }
        }while(n!= 0);
    }
    public void suaMaytinh(String makh, String maloai){
        for (Nguoi nguoi : person) {
            if(((Khachhang)nguoi).getMaKH().compareTo(makh)==0){
                for(int i=0; i<((Khachhang)nguoi).getMt().size();i++){
                    if(((Khachhang)nguoi).getMt().get(i).getMaLoai()==maloai){
                        ((Khachhang)nguoi).getMt().get(i).nhap();
                    }
                }
            }
        }
    }    
    public void xoaMaytinh(String makh, String maloai) {
        for (Nguoi nguoi : person) {
            if(((Khachhang)nguoi).getMaKH().compareTo(maloai)==0){
                for(int i=0;i<((Khachhang)nguoi).getMt().size();i++){
                    if(((Khachhang)nguoi).getMt().get(i).getMaLoai() == maloai){
                        ((Khachhang)nguoi).getMt().remove(i);
                    }
                }
            }
            
        }
    }
    public void themMayTInh(String makh){
        for (Nguoi nguoi : person) {
            if(nguoi instanceof Khachhang){
                ((Khachhang)nguoi).nhap();
            }
            
        }
    }
    public void suaKhachHang(String makh){
        for (Nguoi nguoi : person) {
            if(nguoi instanceof Khachhang){
                if(((Khachhang)nguoi).getMaKH().compareTo(makh)==0){
                    nguoi.nhap();
                }
            }
            
        }
    }
    public void xoaKhachHang(String makh){
        for (Nguoi nguoi : person) {
            if(nguoi instanceof Khachhang){
                if(((Khachhang)nguoi).getMaKH().compareTo(makh)==0){
                    person.remove(nguoi);
                }
            }
            
        }
    }
    public void suaNhanVien(String manv){
        for (Nguoi nguoi : person) {
            if(nguoi instanceof Nhanvien){
                if(((Nhanvien)nguoi).getMaNV().compareTo(manv)==0){
                    nguoi.nhap();
                }
            }
            
        }
    }
    public void xoaNhanVien(String manv){
        for (Nguoi nguoi : person) {
            if(nguoi instanceof Nhanvien){
                if(((Nhanvien)nguoi).getMaNV().compareTo(manv)==0){
                    person.remove(nguoi);
                }
            }
            
        }
    }
    public void hienDSNhanVien(Nguoi a){
        System.out.println("----------------------------------------------");
        for (Nguoi nguoi : person) {
            if(nguoi instanceof Nhanvien){
                nguoi.hien();
            }
        }
    }
    public void hienDS(Nguoi a){
        System.out.println("----------------------------------------------");
        for (Nguoi nguoi : person) {
            nguoi.hien();
            
        }
    }
    public void hienDSKhachHang(Nguoi a){
        System.out.println("----------------------------------------------");
        for (Nguoi nguoi : person) {
            if(nguoi instanceof Khachhang){
                nguoi.hien();
            }
            
        }
    }
    public void menuChinh()
    {
        System.out.println("------CHUONG TRINH QUAN LY BAN HANG MAY TINH ------");
        System.out.println("1. Nhap danh sach khach hang va may tinh cua khach hang");
        System.out.println("2. Nhap danh sach nhan vien");
        System.out.println("3. Hien thi danh sach khach hang mua hang ");
        System.out.println("4. Hien thi danh sach cac giam thi");
        System.out.println("5. Chinh sua thong tin(Khach hang, May tinh, Nhan vien)");
        System.out.println("6. Luu file da nhap");
        System.out.println("7. Doc du lieu tu file ");
        System.out.println("8. Sap xep he mat hang theo gia giam dan");
        System.out.println("9. Thong ke cac nhan vien co he so luong tren 5 trieu");
        System.out.println("-----Nhan phim 0 de thoat chuong trinh, xin cam on-----");
    }
}