import java.util.Scanner;

public class Postfix_to_infix {

    Scanner sc = new Scanner(System.in);
    String[] stack = new String[100];
    int top = -1;

    public void push(String ch)
    {
        top++;
        stack[top] = ch;
    }

    public String pop()
    {
        if(top == -1) return null;
        return stack[top--];
    }

    public String peek()
    {
        if(top == -1) return null;  
        return stack[top];
    }
 
    public String postfixToInfix(String postfix, Postfix_to_infix obj)
    {
        String a = "";
        String b = "";
        String result = "";

        for(int i = 0; i < postfix.length(); i++)
        {
            String ch = Character.toString(postfix.charAt(i));
            if(Character.isLetterOrDigit(postfix.charAt(i)))
            {
                obj.push(ch);
            }
            else
            {
               b = obj.pop();
               a = obj.pop();
               result = "(" +a +ch +b +")";
               obj.push(result);
            }
        }
        return obj.peek();
    }
    public static void main(String[] args) {
        Postfix_to_infix obj = new Postfix_to_infix();
        System.out.print("Enter postfix expression: ");
        String postfix = obj.sc.nextLine();
        String infix = obj.postfixToInfix(postfix, obj);
        System.out.println("Postfix: " + postfix);
        System.out.println("Infix: " + infix);
    }
}