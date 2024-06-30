public class NumberComplement {
    public static int findComplement(int num) {
        //O(1)
        int bStringLength = Integer.toBinaryString(num).length(); //The length of bits in the binary representation of num.
        int h = (1 << bStringLength) - 1; //Uses "<<" to shift the binary bits of 1 (0001) to the left 'bStringLength' times.
                                          //Then we subtract one from the integer we get.
        return h ^ num;                   //Now we just do h XOR num and it should give us the complement of num.
    }

    public static void main(String args[])
    {
        System.out.println(findComplement(5)); //Prints 2.
        //Binary of 5 is '101'.
        //Its complement (negation) is ;'010', which is the binary representation of two.
        //Lastly we return 2.
        
    }
}
