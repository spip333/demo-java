package org.nstern.demos;

import java.util.ArrayList;
import java.util.List;

public class CalculeMoi {

    public static void main(String[] args) {
        List<String> operators = List.of("+", "-", "*", "/");
        List<Operation>operations = new ArrayList<>();

        for (int i = 0; i <= 29; i++) {
            int operand1 = (int) Math.round(Math.random() * 499);
            int operand2 = (int) Math.round(Math.random() * 499);
            int index = (int) Math.floor(Math.random() * operators.size());
            String operator = operators.get(index);
            Operation operation = new Operation(operand1, operand2, operator);
            operations.add(operation);
        }

        System.out.println("Exercices: ");

        int counter = 1;

        for (Operation op : operations){
            System.out.printf(" %s : %s %s %s \n", counter, op.operand1, op.operator, op.operand2);
            counter++;
        }

        System.out.println("Résultats: ");

        counter = 1;

        for (Operation op : operations){
            System.out.printf("  %s : %s %s %s = %s \n" , counter, op.operand1, op.operator, op.operand2, op.result);
            counter++;
        }
    }
}


class Operation {
    public int operand1;
    public int operand2;
    public float result;
    public String operator;

    public Operation(int operand1, int operand2, String operator) {
        this.operator = operator;
        this.operand1 = operand1;
        this.operand2 = operand2;
        computeResult(operand1, operand2, operator);
    }

    private void computeResult(int operand1, int operand2, String operator) {

        switch (operator) {
            case "+":
                this.result = operand1 + operand2; break;
            case "-":
                this.result = operand1 - operand2; break;
            case "*":
                this.result = operand1 * operand2; break;
            case "/":
                this.result =  (float) operand1 / (float) (operand2); break;
            default:
                throw new RuntimeException("Problem occured");
        }
    }
}
