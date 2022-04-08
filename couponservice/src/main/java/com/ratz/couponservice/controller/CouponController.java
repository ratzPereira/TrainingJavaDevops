package com.ratz.couponservice.controller;

import com.ratz.couponservice.model.Coupon;
import com.ratz.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coupon")
public class CouponController {

  @Autowired
  CouponRepository couponRepository;

  @PostMapping
  public Coupon createCoupon(Coupon coupon){

    couponRepository.save(coupon);
    return coupon;
  }

  @GetMapping
  public Coupon getCoupon(String code){

    return couponRepository.findByCode(code);
  }
}
