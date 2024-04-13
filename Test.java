package Quanlybanhangmaytinh;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Quanly a = new Quanly();
        Nguoi b;
        int n;
        do{
            a.menuChinh();
            System.out.println("Lua chon: ");
            n = new Scanner(System.in).nextInt();
            switch(n){
                case 1:{
                    b = new Khachhang();
                    a.themDSNguoi(b);
                    break;
                }
                case 2:{
                    b = new Nhanvien();
                    a.themDSNguoi(b);
                    break;
                }
                case 3:{
                    a.hienDSHoSoKhachHang();
                    break;
                }
                case 4:{
                    a.hienDSNhanvien();
                    break;
                }
                case 5:{
                    a.SuaDoi();
                    break;
                }
                case 6:{
                    String tenFile;
                    System.out.println("Nhap ten file: ");
                    tenFile = new Scanner(System.in).nextLine();
                    a.ghiFile(tenFile);
                    break;
                }
                case 7:{
                    String tenFile;
                    System.out.println("Nhap ten file: ");
                    tenFile = new Scanner(System.in).nextLine();
                    a.docFile(tenFile);
                    break;
                }
                case 8:{
                    System.out.println("-------------------------------");
                    a.Sapxeptheodongia();
                    a.hienDSKhachHang();
                    break;
                }
                case 9:{
                    a.hienNhanVienluonglonhon5trieu();
                    break;
                }
                default:
                        
                    break;
            }
        }
        while(n!=0);   
    }
}
