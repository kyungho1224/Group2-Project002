package com.fastcampus.be7.group2.service;

import com.fastcampus.be7.group2.model.NumberDTO;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */
public class CalcServiceBiz implements com.fastcampus.be7.group2.service.ICalcService {

    @Override
    public NumberDTO add(NumberDTO numberDTO) {
        double result = numberDTO.getNum1() + numberDTO.getNum2();
        numberDTO.setResult(result);
        return numberDTO;
    }

    @Override
    public NumberDTO sub(NumberDTO numberDTO) {
        double result = numberDTO.getNum1() - numberDTO.getNum2();
        numberDTO.setResult(result);
        return numberDTO;
    }

    @Override
    public NumberDTO mul(NumberDTO numberDTO) {
        double result = numberDTO.getNum1() * numberDTO.getNum2();
        numberDTO.setResult(result);
        return numberDTO;
    }

    @Override
    public NumberDTO div(NumberDTO numberDTO) {
        if (numberDTO.getNum2() != 0) {
            double result = (double) numberDTO.getNum1() / numberDTO.getNum2();
            numberDTO.setResult(result);
            return numberDTO;
        } else {
            System.out.println("0으로는 나눌 수 없습니다.");
            return null;
        }
    }

    @Override
    public NumberDTO rem(NumberDTO numberDTO) {
        if (numberDTO.getNum2() != 0) {
            int result = numberDTO.getNum1() % numberDTO.getNum2();
            numberDTO.setResult(result);
            return numberDTO;
        } else {
            System.out.println("0으로는 나눌 수 없습니다.");
            return null;
        }
    }
}