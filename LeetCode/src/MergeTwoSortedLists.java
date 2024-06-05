public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //Beats 100%
        ListNode headNode = null;
        ListNode prev = null;
        if (list1 == null)
        {
            return list2;
        }
        if (list2 == null)
        {
            return list1;
        }
        while (list1 != null && list2 != null)
        {
            if (list1.val <= list2.val)
            {
                ListNode currentNode = new ListNode(list1.val);
                if (headNode == null)
                {
                    headNode = currentNode;
                }
                else
                {
                    prev.next = currentNode;
                }
                prev = currentNode;
                list1 = list1.next;
            }
            else // list1 > list2
            {
                ListNode currentNode = new ListNode(list2.val);
                if (headNode == null)
                {
                    headNode = currentNode;
                }
                else
                {
                    prev.next = currentNode;
                }
                prev = currentNode;
                list2 = list2.next;
            }
        }
        if (list1 == null) //still nodes in list2
        {
            while (list2 != null)
            {
                ListNode currentNode = new ListNode(list2.val);
                prev.next = currentNode;
                prev = currentNode;
                list2 = list2.next;
            }
        }
        else if (list2 == null)
        {
            while (list1 != null)
            {
                ListNode currentNode = new ListNode(list1.val);
                prev.next = currentNode;
                prev = currentNode;
                list1 = list1.next;
            }
        }


        return headNode;
    }

    public static void main(String args[])
    {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // Creating the second linked list
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode head = mergeTwoLists(list1, list2);
        printLinkedList(head);
    }

    public static void printLinkedList(ListNode node)
    {
        System.out.print("Linked list: ");
        while (node != null)
        {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

}
