package com.fastcampus.be7.group2.view;

/**
 * Created by KimKyungHo on 2023-12-08(008)
 */

import com.fastcampus.be7.group2.model.NumberDTO;

import java.util.Scanner;

public class CalcView {

    /*
    두 수를 입력받아야 하니 두 수를 입력하세요
    연산자를 입력하세요
     */
    public CalcView() {
    }

    Scanner scanner = new Scanner(System.in);

    public String InputNumber(NumberDTO number) {
        System.out.print("두 수와 연산자를 입력하세요: ");

        String input = scanner.nextLine();
        String[] inputs = input.split(" ");

        if (inputs.length == 3) {
            if (isInteger(inputs[0]) && isInteger(inputs[1])) {
                int num1 = Integer.parseInt(inputs[0]);
                int num2 = Integer.parseInt(inputs[1]);
                number.setNum1(num1);
                number.setNum2(num2);
            } else {
                return "error";
            }

            return inputs[2];
        } else if (inputs.length == 1 && inputs[0].equalsIgnoreCase("e")) {
            return "E";
        } else {
            return "error";
        }
    }

    public void printResult(NumberDTO number, String op) {
        switch (op) {
            case "+":
                System.out.println("두 수의 덧셈 결과는: " + number.getResult());
                break;
            case "-":
                System.out.println("두 수의 뺄셈 결과는: " + number.getResult());
                break;
            case "*":
                System.out.println("두 수의 곱셈 결과는: " + number.getResult());
                break;
            case "/":
                System.out.println("두 수의 나눗셈 결과는: " + number.getResult());
                break;
            case "%":
                System.out.println("두 수를 나눈 나머지는: " + number.getResult());
                break;
        }
    }

    /**
     * @param value 스캐너로 입력받은 문자
     * @return 입력받은 문자가 숫자이면 true, 아니면 false
     */
    public static boolean isInteger(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
