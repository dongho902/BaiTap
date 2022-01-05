package com.hohhd200110098LTIOT;

public class SanhSu extends HangHoa {
    static int count = 0; 


    SanhSu(int maHangHoa, String loaiHangHoa, String tenHangHoa, int giaNhap, String ngayNhapKho,
            int soLuongTonKho) {
        super(maHangHoa, loaiHangHoa, tenHangHoa, giaNhap, ngayNhapKho, soLuongTonKho);
        count++;
    }

    
}
