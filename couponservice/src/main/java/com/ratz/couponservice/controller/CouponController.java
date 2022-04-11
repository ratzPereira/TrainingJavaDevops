package com.ratz.couponservice.controller;

import com.ratz.couponservice.model.Coupon;
import com.ratz.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {

  @Autowired
  CouponRepository couponRepository;

  @PostMapping
  public Coupon createCoupon(@RequestBody Coupon coupon){

    return couponRepository.save(coupon);
  }

  @GetMapping("/{code}")
  public Coupon getCoupon(@PathVariable String code){

    return couponRepository.findByCode(code);
  }
}
