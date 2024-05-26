import java.util.ArrayList;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //Beats 100% on runtime, my first Medium question I solved eficiently without any guidance! :D
        ArrayList<ListNode> nodeList = new ArrayList<>();
        ListNode ptr = head;
        if (head.next == null || head == null)
        {
            return null;
        }
        while (ptr != null)
        {
            nodeList.add(ptr);
            ptr = ptr.next;
        }
        int index = nodeList.size() - n;
        if (index == 0)
        {
            head = head.next;
            return head;
        }
        nodeList.get(index -1).next = nodeList.get(index).next;
    
        return head;
    }
}
