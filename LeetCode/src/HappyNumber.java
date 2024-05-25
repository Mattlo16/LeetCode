public class HappyNumber {
    public boolean isHappy(int n) {
        //Beats 100% of users
        //Two Pointers (kinda like a linked list :0 )
        int Ptr1 = n; //Fast ptr
        int Ptr2 = n; //Slow ptr
        Ptr1 = replace(replace(Ptr1));
        Ptr2 = replace(Ptr2);
        while (Ptr1 != Ptr2)
        {
            Ptr1 = replace(replace(Ptr1));
            Ptr2 = replace(Ptr2);
        }

        return Ptr1 == 1; //Or Ptr2
    }

    public static int replace(int n)
    {
        int product = 0;
        while (n != 0)
        {
            int modulo = n % 10;
            product = product + (modulo * modulo);
            n = n/10;
        }
        return product;
    }
}
