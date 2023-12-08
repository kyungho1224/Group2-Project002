package com.fastcampus.be7.group2.service;

import com.fastcampus.be7.group2.model.NumberDTO;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */
public interface ICalcService {

    NumberDTO add(NumberDTO numberDTO);
    NumberDTO sub(NumberDTO numberDTO);
    NumberDTO mul(NumberDTO numberDTO);
    NumberDTO div(NumberDTO numberDTO);
    NumberDTO rem(NumberDTO numberDTO);

}