package Quanlybanhangmaytinh;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Quanly {
    ArrayList<Nguoi> preson;
    ArrayList<Khachhang> Khachhang;
    ArrayList<Maytinh> maytinh;
    ArrayList<Nhanvien> nhanvien;

    public Quanly() {
        preson = new ArrayList<>();
        maytinh = new ArrayList<>();
        Khachhang = new ArrayList<>();
        nhanvien = new ArrayList<>();
    }
    public void themDSNguoi(Nguoi a){
        System.out.println("Nhap so luong can them: ");
        int n = new Scanner(System.in).nextInt();
        for(int i=0; i<n; ++i){
            System.out.println("Lan nhap thu " + (i+1) + ": ");
            if(a instanceof Khachhang){
                a = new Khachhang();
                a.nhap();
            }else if(a instanceof Nhanvien){
                a = new Nhanvien();
                a.nhap();
            }
            preson.add(a);
        }
    }
    public void menuSuaDoi(){
        System.out.println("-------------Moi ban lua chon -----------");
        System.out.println("1. Sua thong tin khach hang");
        System.out.println("2. Xoa khach hang");
        System.out.println("3. Sua thong tin nhan vien");
        System.out.println("4. Xoa nhan vien");
        System.out.println("5. Sua may tinh");
        System.out.println("6. Them may tinh ");
        System.out.println("7. Xoa may tinh");
        System.out.println("----------- Chon so 0 de thoat ----------");
    }
    public void SuaDoi(){
        int n;
        do{
            menuSuaDoi();
            System.out.println("Chon: ");
            n = new Scanner(System.in).nextInt();
            switch(n){
                case 1:{
                    String makh;
                    System.out.println("Nhap ma khach hang can sua: ");
                    makh = new Scanner(System.in).nextLine();
                    suaKhachHang(makh);
                    break;
                }
                case 2: {
                    String makh;
                    System.out.print("Nhap ma khach hang can xoa: ");
                    makh = new Scanner(System.in).nextLine();
                    xoaKhachHang(makh);
                    break;
                }
                case 3: {
                    String maNV;
                    System.out.print("Nhap ma nhan vien can sua thong tin: ");
                    maNV = new Scanner(System.in).nextLine();
                    suaNhanvien(maNV);
                    break;
                }
                case 4: {
                    String maNV;
                    System.out.print("Nhap ma nhan vien can xoa thong tin: ");
                    maNV = new Scanner(System.in).nextLine();
                    xoaNhanvien(maNV);
                    break;
                }
                case 5: {
                    System.out.println("Nhap ma khach hang: ");
                    String makh = new Scanner(System.in).nextLine();
                    System.out.println("Nhap ma loai may tinh");
                    String maLoai = new Scanner(System.in).nextLine();
                    suaMaytinh(maLoai, makh);
                    break;
                }
                case 6: {
                    System.out.println("Nhap ma cua khach hang: ");
                    String makh = new Scanner(System.in).nextLine();
                    themMayTinh(makh);
                    break;
                }
                case 7: {
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
        }while (n != 0);
    }
    public void suaMaytinh(String makh, String maloai){
        for (Nguoi nguoi : preson) {
            if(((Khachhang)nguoi).getMaKH().compareTo(makh)==0){
                for(int i=0; i<((Khachhang)nguoi).getMt().size();i++){
                    if(((Khachhang)nguoi).getMt().get(i).getMaLoai()==maloai){
                        ((Khachhang)nguoi).getMt().get(i).nhap();
                        ((Khachhang)nguoi).getMt().get(i).hienMatHang();
                    }
                }
            }
        }
    }    
    public void xoaMaytinh(String makh, String maloai) {
        for (Nguoi nguoi : preson) {
            if(((Khachhang)nguoi).getMaKH().compareTo(maloai)==0){
                for(int i=0;i<((Khachhang)nguoi).getMt().size();i++){
                    if(((Khachhang)nguoi).getMt().get(i).getMaLoai() == maloai){
                        ((Khachhang)nguoi).getMt().remove(i);
                        ((Khachhang)nguoi).getMt().get(i).hienMatHang();
                    }
                }
            }
            
        }
    }
    public void themMayTinh(String makh){
        for (Nguoi nguoi : preson) {
            if(nguoi instanceof Khachhang){
                if(((Khachhang)nguoi).getMaKH().compareTo(makh) == 0){
                    ((Khachhang) nguoi).nhapDSMuaHang();
                }
            }  
        }
    }
    public void suaKhachHang(String makh){
        for (Khachhang khachhang : Khachhang) {
            if(khachhang instanceof Khachhang){
                if(((Khachhang)khachhang).getMaKH().compareTo(makh) == 0){
                    khachhang.nhap();
                    khachhang.hien();
                }
            }
            
        }
    }
    public void xoaKhachHang(String makh){
        for (Khachhang khachhang : Khachhang) {
            if(khachhang instanceof Khachhang){
                if(((Khachhang)khachhang).getMaKH().compareTo(makh) == 0){
                    khachhang.remove();
                    khachhang.hien();
                }
            }
            
        }
    }
    public void suaNhanvien(String manv){
        for (Nguoi nguoi : preson) {
            if(nguoi instanceof Nhanvien){
                if(((Nhanvien)nguoi).getMaNV().compareTo(manv) == 0){
                    nguoi.nhap();
                    nguoi.hien();
                }
            }
            
        }
    }
    public void xoaNhanvien(String manv){
        for (Nhanvien nhanvien : nhanvien) {
            if(nhanvien instanceof Nhanvien){
                if(((Nhanvien)nhanvien).getMaNV().compareTo(manv) == 0){
                    preson.remove(nhanvien);
                    nhanvien.hien();
                }
            }
            
        }
    }
    public void hienDSNhanvien(){
        System.out.println("----------------------------------------------");
        for (Nhanvien nhanvien : nhanvien) {
            if(nhanvien instanceof Nhanvien){
                nhanvien.hien();
            }    
        }
    }
    public  void hienDS(){
        System.out.println("----------------------------------------------");
        for (Nguoi nguoi : preson) {
            nguoi.hien();
            
        }
    }
    public void hienDSHoSoKhachHang(){
        System.out.println("----------------------------------------------");
        for (Nguoi nguoi : preson) {
            if(nguoi instanceof  Khachhang){
                ((Khachhang)nguoi).hien();
            }
        }  
    }
    public void hienDSKhachHang(){
        System.out.println("----------------------------------------------");
        for (Nguoi nguoi : preson) {
            if(nguoi instanceof Khachhang){
                nguoi.hien();
            } 
        }
    }
    public void ghiFile(String fileName){
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.flush();
            objOut.writeObject(preson);
            objOut.close();
            fileOut.close();
            System.out.println("Luu file thanh cong, ten file: " + fileName);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void docFile(String fileName) {
        try {
            preson = new ArrayList<>();
            FileInputStream fin = new FileInputStream(fileName);
            ObjectInputStream fout = new ObjectInputStream(fin);
            preson = (ArrayList) fout.readObject();
            hienDS();
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.print("\nKhong thay file.\n");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void Sapxeptheodongia(){
        Collections.sort(maytinh, new Comparator<Maytinh>(){
            @Override
            public int compare(Maytinh o1, Maytinh o2){
              return ((Integer)o1.getGiaBan()).compareTo((Integer)o2.getGiaBan());
            }
    });
    }
    public void hienNhanVienluonglonhon5trieu(){
        for (Nguoi nguoi : preson) {
            if(nguoi instanceof Nhanvien && ((Nhanvien)nguoi).getHSL() >= 5000000){
                nguoi.hien();
            }  
        }
    }
    public void menuChinh() {
        System.out.println("------CHUONG TRINH QUAN LY BAN HANG MAY TINH ------");
        System.out.println("1. Nhap danh sach khach hang va may tinh cua khach hang");
        System.out.println("2. Nhap danh sach nhan vien");
        System.out.println("3. Hien thi danh sach khach hang mua hang ");
        System.out.println("4. Hien thi danh sach cac nhan vien");
        System.out.println("5. Chinh sua thong tin(Khach hang, May tinh, Nhan vien)");
        System.out.println("6. Luu file da nhap");
        System.out.println("7. Doc du lieu tu file ");
        System.out.println("8. Sap xep he mat hang theo gia giam dan");
        System.out.println("9. Thong ke cac nhan vien co he so luong tren 5 trieu");
        System.out.println("-----Nhan phim 0 de thoat chuong trinh, xin cam on-----");
    }
}