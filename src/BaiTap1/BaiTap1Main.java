/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author HaiNguyen
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         HoaDon hd = new HoaDon.HoaDonBuilder().addMaHD("IP09")
                .addNgayBan("20/12/2019")
                .addTenKH("Nguyễn Thanh Hải")
                .build();
        CTHD cthd1 = new CTHD.CTHDBuilder().addTenSP("Iphone X")
                .addSoLuong(5)
                .addDonGia(14000000)
                .addChietKhau("21%")
                .build();
        CTHD cthd2 = new CTHD.CTHDBuilder().addTenSP("Iphone X")
                .addSoLuong(1)
                .addDonGia(150000)
                .addChietKhau("19%")
                .build();
        hd.addCTHD(cthd2);
        hd.addCTHD(cthd1);
        hd.xuatHoaDon();

    }
    
}
