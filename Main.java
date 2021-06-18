package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<SachGk> arrSachGk = new ArrayList<>();
//		
		int soSachGiaoKhoa;
        double tongTienSachGiaoKhoa = 0;
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Nhập số sách giáo khoa: ");
        soSachGiaoKhoa = scanner.nextInt();
         
        
        for (int i = 0; i < soSachGiaoKhoa; i++) {
            System.out.println("Nhập thông tin quyển sách thứ " + (i + 1) + ":");
            SachGk sachGiaoKhoa = new SachGk();
            sachGiaoKhoa.nhapSach();
            arrSachGk.add(sachGiaoKhoa);
        }
            
         
        for (int i = 0; i < arrSachGk.size(); i++) {
            if (arrSachGk.get(i).getNumber() == 0) {
                tongTienSachGiaoKhoa += arrSachGk.get(i).getSoLuong() * 
                    arrSachGk.get(i).getDonGia() * 50 / 100;
            } else if (arrSachGk.get(i).getNumber() == 1) {
                tongTienSachGiaoKhoa += arrSachGk.get(i).getSoLuong() * 
                    arrSachGk.get(i).getDonGia();
            }
        }
        System.out.println("Tổng tiền sách giáo khoa = " + tongTienSachGiaoKhoa);
                
         
        System.out.println("-----Thông tin sách giáo khoa-----");
        for (int i = 0; i < arrSachGk.size(); i++) {
            System.out.println(arrSachGk.get(i).toString());
        }
           
//        System.out.println("Trung bình cộng đơn giá các sách tham khảo = " + trungBinhCongDonGia);
         
//        System.out.println("---Các sách giáo khoa của nhà xuất bản X---");
//        for (int i = 0; i < arrSachGk.size(); i++) {
//            if (arrSachGk.get(i).getNhaXuatBan().equalsIgnoreCase("X")) {
//                System.out.println(arrSachGk.get(i).toString());
//            }
//        }
	}
}