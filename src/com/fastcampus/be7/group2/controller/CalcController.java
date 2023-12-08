package com.fastcampus.be7.group2.controller;

import com.fastcampus.be7.group2.model.NumberDTO;
import com.fastcampus.be7.group2.service.ICalcService;
import com.fastcampus.be7.group2.view.CalcView;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */
public class CalcController {
    ICalcService service;

    public CalcController(ICalcService service) {
        this.service = service;
    }

    public void applicationStart() {
        CalcView view = new CalcView();
        // while에 로직을 구현하시오.(연산자에 따라서 switch~ case로 분기 하면 된다.)
        while (true) {
            NumberDTO number = new NumberDTO();
            String op = view.InputNumber(number);
            NumberDTO result = new NumberDTO();
            switch (op) {
                case "E":
                    break;
                case "+":
                    result = service.add(number);
                    break;
                case "-":
                    result = service.sub(number);
                    break;
                case "*":
                    result = service.mul(number);
                    break;
                case "/":
                    result = service.div(number);
                    break;
                case "%":
                    result = service.rem(number);
                    break;
                default:
                    System.out.println("알 수 없는 에러를 만났습니다.");
                    break;
            }

            if (result != null) {
                if (op.equalsIgnoreCase("e")) {
                    break;
                } else {
                    view.printResult(result, op);
                }
            }
        }
    }
}
