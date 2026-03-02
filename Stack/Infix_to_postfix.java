import java.util.Scanner;

public class Infix_to_postfix {

    Scanner sc = new Scanner(System.in);
    char[] stack = new char[100];
    int top = -1;

    public void push(char ch) {
        top++;
        stack[top] = ch;
    }

    public char pop() {
        if(top == -1) return '\0';
        return stack[top--];
    }

    public char peek() {
        if(top == -1) return '\0';
        return stack[top];
    }

    public int precedence(char op) {
        if(op == '+' || op == '-') return 1;
        if(op == '*' || op == '/' || op == '%') return 2;
        return 0;
    }

    public String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();

        for(int i = 0; i < infix.length(); i++) 
        {
            char ch = infix.charAt(i);

            if(Character.isLetterOrDigit(ch)) 
            {
                postfix.append(ch);
            }
            else if(ch == '(') 
            {
                push(ch);
            }
            else if(ch == ')') 
            {
                while(peek() != '\0' && peek() != '(') 
                {
                    postfix.append(pop());
                }
                pop();
            }
            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') 
            {
                while(top != -1 && precedence(peek()) >= precedence(ch)) 
                {
                    postfix.append(pop());
                }
                push(ch);
            }
        }

        while(top != -1) 
        {
            postfix.append(pop());
        }

        return postfix.toString();
    }

    public static void main(String[] args) {
        Infix_to_postfix obj = new Infix_to_postfix();
        System.out.print("Enter infix expression: ");
        String infix = obj.sc.nextLine();
        String postfix = obj.infixToPostfix(infix);
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
    }
}