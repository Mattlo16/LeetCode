import java.util.HashMap;

public class LinkedListCycle {
    /* My first solution, works but can be more efficient.
    public boolean hasCycle(ListNode head) {
        
        if (head == null)
        {
            return false;
        }

        HashMap<ListNode, ListNode> nodesMap = new HashMap<ListNode, ListNode>();
        while (head != null)
        {
            if (nodesMap.containsKey(head))
            {
                return true;
            }
            else
            {
                nodesMap.put(head, head);
            }
            head = head.next;
        }
        return false;
    }
    */

    //Second solution, much more efficient, beats 100% of users.
    //Both code snippets are O(n) but this one is slightly faster.
    public boolean hasCycle(ListNode head) {
        if (head == null)
        {
            return false;
        }
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        while (fastPtr != null && fastPtr.next != null)
        {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (fastPtr == slowPtr)
            {
                return true;
            }
        }
        return false;
    }
}
