public class PassThePillow {
    public static int passThePillow(int n, int time) {
        Boolean add = true;
        int solution = 0;
        for (int i = 0; i <= time; i++)
        {
            if (add)
            {
                solution++;
            }
            else if(!add)
            {
                solution--;
            }
            
            if (solution == n)
            {
                add = false;
            }
            else if(solution == 1 && add == false)
            {   
                add = true;
            }
        }
        return solution;
    }
    
    public static void main(String args[])
    {
        System.out.println(passThePillow(4, 5));
    }

}
