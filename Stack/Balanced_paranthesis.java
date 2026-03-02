import java.util.Scanner;

public class Balanced_paranthesis {

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
 
    public String checkBalancedParanthesis(String exp)
    {
        String a = "";
        String ch = "";

        for(int i = 0; i < exp.length(); i++)
        {
            ch = Character.toString(exp.charAt(i));
            if(ch.matches("[\\[\\{\\(]"))
            {
                push(ch);
            }
            else if(ch.matches("[\\]\\}\\)]"))
            {
                if(top == -1) return "Unbalanced.";
                a = peek();
                if(a.equals("(") && ch.equals(")") ||
                (a.equals("{") && ch.equals("}")) ||
                (a.equals("[") && ch.equals("]")))
                {
                    pop();
                }
                else
                {
                    return "Unbalanced.";
                }
            }
        }
        if(top == -1) return "Balanced.";
        return "Unbalanced.";
    }
    public static void main(String[] args) {
        Balanced_paranthesis obj = new Balanced_paranthesis();
        System.out.print("Enter expression: ");
        String exp = obj.sc.nextLine();
        String result = obj.checkBalancedParanthesis(exp);
        System.out.println("Expression: " +exp +" is " +result);
    }
}