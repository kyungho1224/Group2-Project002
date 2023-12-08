package com.fastcampus.be7.group2;

import com.fastcampus.be7.group2.controller.CalcController;
import com.fastcampus.be7.group2.service.CalcServiceBiz;
import com.fastcampus.be7.group2.service.ICalcService;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */
public class Java2CalcMain {
    public static void main(String[] args) {
        ICalcService service = new CalcServiceBiz(); //upcasting
        CalcController controller = new CalcController(service);
        controller.applicationStart();
    }
}