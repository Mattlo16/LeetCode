public class Intersection_Of_Two_Linked_Lists {
    //Beats 99%

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        if (headA == null || headB == null)
        {
            return null;
        }
        ListNode Ptr1 = headA;
        ListNode Ptr2 = headB;
        
        while (Ptr1 != Ptr2)
        {
            if (Ptr1 == null)
            {
                Ptr1 = headB;
            }
            else
            {
                Ptr1 = Ptr1.next;
            }
            if (Ptr2 == null)
            {
                Ptr2 = headA;
            }
            else
            {
                Ptr2 = Ptr2.next;
            }
        }
        return Ptr1;
    }
}
