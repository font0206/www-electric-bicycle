package com.nhom11.webseller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{
	

    @GetMapping(value = {"/", "/home"})
    public String getHome(){
        return "index";
    }

    @GetMapping("/dangnhap")
    public String getDangnhap(){
        return "dangnhap";
    }
    @GetMapping("/dangky")
    public String getDangky(){
        return "dangky";
    }
    @GetMapping("/sanpham")
    public String getSP(){
        return "sanpham";
    }
    @GetMapping("/ctsp")
    public String getCTSP(){
        return "ct-sanpham";
    }
    @GetMapping("/giohang")
    public String getGioHang(){
        return "giohang";
    }
    @GetMapping("/thanhtoan")
    public String getThanhToan(){
        return "thanhtoan";
    }
    @GetMapping("/ctdonhang")
    public String getCTDonHang(){
        return "ct-donhang";
    }
    @GetMapping("/user-donhang")
    public String getUserDH(){
        return "user-donhang";
    }



}