import java.util.Stack;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode ptr = head;
        Stack<ListNode> stack = new Stack<>();
        while (ptr != null)
        {
            stack.push(ptr);
            ptr = ptr.next;
        }
        ListNode headPtr = null;
        ListNode prev = null;
        while (!stack.isEmpty())
        {
            ListNode newNode = stack.pop();
            ListNode copyOfNewNode = new ListNode(newNode.val);
            if (headPtr == null)
            {
                headPtr = copyOfNewNode;
            }
            else
            {
                prev.next = copyOfNewNode;
            }

            prev = copyOfNewNode;
        }
        return headPtr;
    }

    public static void main(String args[])
    {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.print("Linked list before reversal: ");
        printLinkedList(head);
        ListNode newHead = reverseList(head);
        System.out.println();
        System.out.print("Linked list after reversal: ");
        printLinkedList(newHead);
    }

    public static void printLinkedList(ListNode head)
    {
        ListNode ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.val + " ");
            ptr = ptr.next;
        }
    }
}
