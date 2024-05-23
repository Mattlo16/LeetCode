public class Roman_To_Integer {
    public int romanToInt(String s) {
        //Beats 100% users on runtime. 
        char[] romanNumerals = s.toCharArray();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--)
        {
            if (romanNumerals[i] == 'M') //If the index is the Numeral M
            {
                if (i != 0) //If there is a numeral before this one
                {
                    if (romanNumerals[i-1] == 'C') //If the previous numeral is C
                    {
                        count = count + 900;
                        i--;
                    }
                    else
                    {
                        count = count + 1000;
                    }
                }
                else
                {
                    count = count + 1000;
                }
                
            }
            else if (romanNumerals[i] == 'D')
            {
                if (i != 0)
                {
                    if (romanNumerals[i-1] == 'C')
                    {
                        count = count + 400;
                        i--;
                    }
                    else
                    {
                        count = count + 500;
                    }
                }
                else
                {
                    count = count + 500;
                }
            }
            else if (romanNumerals[i] == 'C')
            {
                if (i != 0)
                {
                    if (romanNumerals[i-1] == 'X')
                    {
                        count = count + 90;
                        i--;
                    }
                    else
                    {
                        count = count + 100;
                    }
                }
                else
                {
                    count = count + 100;
                }
            }
            else if (romanNumerals[i] == 'L')
            {
                if (i != 0)
                {
                    if (romanNumerals[i-1] == 'X')
                    {
                        count = count + 40;
                        i--;
                    }
                    else
                    {
                        count = count + 50;
                    }
                }
                else
                {
                    count = count + 50;
                }
            }
            else if (romanNumerals[i] == 'X')
            {
                if (i != 0)
                {
                    if (romanNumerals[i-1] == 'I')
                    {
                        count = count + 9;
                        i--;
                    }
                    else
                    {
                        count = count + 10;
                    }
                }
                else
                {
                    count = count + 10;
                }
            }
            else if (romanNumerals[i] == 'V')
            {
                if (i != 0)
                {
                    if (romanNumerals[i-1] == 'I')
                    {
                        count = count + 4;
                        i--;
                    }
                    else
                    {
                        count = count + 5;
                    }
                }
                else
                {
                    count = count + 5;
                }
            }
            else if (romanNumerals[i] == 'I')
            {
                count = count + 1;
            }
        }
        return count;
    }
}
