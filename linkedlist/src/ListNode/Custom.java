package ListNode;

public class Custom {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode Next=head.next;
        while(pres!=null){
            if(Next==null){
                head=pres;

            }
            pres.next=prev;
            prev=pres;
            pres=Next;
            if(Next!=null){
                Next=Next.next;
            }


        }
        head=prev;
        return head;
    }
    public boolean isPalindrome(ListNode head) {

        ListNode mid=middleNode(head);
        ListNode headsecond=reverseList(mid);

        while(head!=null && headsecond!=null){
            if(head.val!=headsecond.val){
                return false;
            }
            head=head.next;
            headsecond=headsecond.next;
        }

        return true;

    }
//    public ListNode reverseList(ListNode node){
//        ListNode prev=null;
//        ListNode pres=node;
//        ListNode Next=pres.next;
//
//        while(pres!=null){
//            pres.next=prev;
//            prev=pres;
//            pres=Next;
//            if(Next!=null){
//                Next=Next.next;
//            }
//
//        }
//        node=prev;
//        return node;
//
//
//    }
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!= null){
            ListNode temp=slow.next;
            slow=temp;
            temp=fast.next.next;
            fast=temp;

        }

        return slow;
    }
    public ListNode reverseList(ListNode head,int left,int right){
        if(left==right){
            return head;
        }
        ListNode pres=head;
        ListNode prev=null;
        for(int i=0;pres!= null && i<left-1;i++){
            prev=pres;
            pres=pres.next;
        }
        ListNode last=prev;
        ListNode newEnd=pres;
        ListNode Next=pres.next;
        for(int i=0;pres!=null && i<right-left+1;i++){
            pres.next=prev;

            prev=pres;
            pres=Next;
            if(Next!=null){
                Next=Next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }

        newEnd.next=pres;
        return head;


    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode rightside=mid.next;
        mid.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(rightside);

        return merge(left,right);
    }

    public ListNode getMid(ListNode L){
        ListNode s=L;
        ListNode f=L.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode ret;
        if(l1.val<=l2.val){
            ret=l1;
            l1=l1.next;
        }else{
            ret=l2;
            l2=l2.next;
        }
        ListNode tempret=ret;
        while(l1 !=null && l2 !=null){
            if(l1.val<=l2.val){
                tempret.next=l1;
                l1=l1.next;
            }else{
                tempret.next=l2;
                l2=l2.next;
            }
            tempret=tempret.next;
        }
        if(l1!=null){
            tempret.next=l1;
        }else{
            tempret.next=l2;
        }
        return ret;

    }
}
