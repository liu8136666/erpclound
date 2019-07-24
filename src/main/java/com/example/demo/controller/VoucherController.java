package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//基类不要@RestController
public class VoucherController<Voucher> extends BaseController {
    public VoucherController() {

    }
    @RequestMapping("/findById/{id}")
    public Voucher findById(@PathVariable String id) {
        return null;
    }
}
