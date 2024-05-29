import java.math.BigInteger;
import java.util.Stack;

public class AddTwoNumbers {
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<String> stackL1 = new Stack<>();
        Stack<String> stackL2 = new Stack<>();
        while (l1 != null)
        {
            stackL1.push(Integer.toString(l1.val));
            l1 = l1.next;
        }
        while (l2 != null)
        {
            stackL2.push(Integer.toString(l2.val));
            l2 = l2.next;
        }
        String number1String = "";
        while (!stackL1.isEmpty())
        {
            number1String = number1String + stackL1.pop(); //Concatenates the strings.
        }
        String number2String = "";
        while (!stackL2.isEmpty())
        {
            number2String = number2String + stackL2.pop(); //Concatenates the strings.
        }
        BigInteger number1 = new BigInteger(number1String);
        BigInteger number2 = new BigInteger(number2String);
        BigInteger sum = number1.add(number2); //Sum of two reversed LLs.
        //Now we need to make the number into a reversed LL.
        String sumString = sum.toString();
        Stack<String> sumStack = new Stack<>();
        for (int i = 0; i < sumString.length(); i++)
        {
            sumStack.push("" + sumString.charAt(i));
        }
        ListNode head = null;
        ListNode prev = null;
        while (!sumStack.isEmpty())
        {
            ListNode numberNode = new ListNode(Integer.parseInt(sumStack.pop()));
            if (head == null)
            {
                head = numberNode;
            }
            else
            {
                prev.next = numberNode;
            }

            prev = numberNode;
        }
        return head;
    }

    public static void main(String[] args) //Prints 342 + 465
    {
        // Create linked lists representing numbers
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Call the addTwoNumbers method
        ListNode result = addTwoNumbers(l1, l2);

        // Print the result 
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
