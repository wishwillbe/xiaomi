package com.example.xiaomi.controller;

import com.example.xiaomi.service.AddressService;
import com.example.xiaomi.view.ResultView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @PostMapping
    public ResultView addAddress(){
        return null;
    }

    @PutMapping
    public ResultView updateAddress(){
        return null;
    }

    @GetMapping("/list")
    public ResultView selectAddress(){
        return null;
    }

    @DeleteMapping("/{addressId}")
    public ResultView deleteAddress(){
        return null;
    }
}
