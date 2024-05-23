import java.util.Stack;
//Very fast solution, beats 99% of users.

class ValidParenthesis {
    public boolean isValid(String s) {
        char[] characters = s.toCharArray();
        Stack<Character> Stack = new Stack<>();

        for (int i = 0; i < characters.length; i++)
        {
            if (characters[i] == '(')
            {
                Stack.push(characters[i]);
            }
            else if (characters[i] == ')')
            {
                if (Stack.size() != 0)
                {
                    if (Stack.peek() == '(')
                    {
                        Stack.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
                
            }
            else if (characters[i] == '[')
            {
                Stack.push(characters[i]);
            }
            else if (characters[i] == ']')
            {
                if (Stack.size() != 0)
                {
                    if (Stack.peek() == '[')
                    {
                        Stack.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
                
            }
            else if (characters[i] == '{')
            {
                Stack.push(characters[i]);
            }
            else if (characters[i] == '}')
            {
                if (Stack.size() != 0)
                {
                    if (Stack.peek() == '{')
                    {
                        Stack.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    return false;
                }
                
            }
        }
        if (Stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}