package com.howthere.app.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/administrator/*")
public class AdministratorController {
    @GetMapping("program")
    public void program() {;}

    @GetMapping("stay")
    public void stay() {;}

    @GetMapping("reservation")
    public void reserve() {;}

    @GetMapping("member")
    public void member() {;}

    @GetMapping("notice")
    public void notice() {;}

    @GetMapping("notice/detail")
    public String noticeDetail() {
        return "/administrator/notice-detail";
    }

    @GetMapping("notice/write")
    public String noticeWrite() {
        return "/administrator/notice-write";
    }

    @GetMapping("inquiry")
    public void inquiry() {;}

    @GetMapping("inquiry/detail")
    public String inquiryDetail() {
        return "/administrator/inquiry-detail";
    }
    @GetMapping("inquiry/write")
    public String inquiryWrite() {
        return "/administrator/inquiry-write";
    }
}
