package javaflweektwo.stacks;

import java.util.Stack;

public class SimpleCalculator {
  private Stack<Integer> stack;

  public SimpleCalculator() {
    stack = new Stack<>();
  }

  public void push(int element) {
    stack.push(element);
  }

  public int pop() {
    if (!stack.isEmpty()) {
      return stack.pop();
    } else {
      throw new RuntimeException("Stack is empty.");
    }
  }

  public void performOperation(char operator) {
    if (stack.size() < 2) {
      throw new RuntimeException("Insufficient operands in the stack.");
    }
      int operand2 = pop();
      int operand1 = pop();
      int result;

      switch (operator) {
          case '+':
              result = operand1 + operand2;
              break;
          case '-':
              result = operand1 - operand2;
              break;
          case '*':
              result = operand1 * operand2;
              break;
          case '/':
              if (operand2 != 0) {
                  result = operand1 / operand2;
              } else {
                  throw new RuntimeException("Division by zero error.");
              }
              break;
          default:
              throw new RuntimeException("Invalid operator.");
      }

      push(result);
  }
    public int evaluateExpression(String expression) {
        for (char c : expression.toCharArray()) {
            if (Character.isDigit(c)) {
                push(Character.getNumericValue(c));
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                performOperation(c);
            }
        }

        if (stack.size() != 1) {
            throw new RuntimeException("Invalid expression.");
        }

        return pop();
    }

}
