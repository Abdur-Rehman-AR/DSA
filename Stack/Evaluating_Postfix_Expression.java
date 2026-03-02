import java.util.Scanner;

public class Evaluating_Postfix_Expression {

    Scanner sc = new Scanner(System.in);
    int[] stack = new int[100];
    int top = -1;

    public void push(int ch)
    {
        top++;
        stack[top] = ch;
    }

    public int pop()
    {
        if(top == -1) return 0;
        return stack[top--];
    }

    public int peek()
    {
        if(top == -1) return 0;  
        return stack[top];
    }
 
    public int evaluatingPostfixExpression(String postfix)
    {
        int a = 0;
        int b = 0;

        for(int i = 0; i < postfix.length(); i++)
        {
            char ch = postfix.charAt(i);
            if(Character.isDigit(ch))
            {
                push(ch - '0');
            }
            else
            {
               b = pop();
               a = pop();
               if(ch == '+') push(a+b);
               if(ch == '-') push(a-b);
               if(ch == '*') push(a*b);
               if(ch == '/') push(a/b);
               if(ch == '%') push(a%b);
            }
        }
        if(top != -1) return peek();
        return 0;
    }
    public static void main(String[] args) {
        Evaluating_Postfix_Expression obj = new Evaluating_Postfix_Expression();
        System.out.print("Enter postfix expression: ");
        String postfix = obj.sc.nextLine();
        int result = obj.evaluatingPostfixExpression(postfix);
        System.out.println("Answer: " +result);
    }
}