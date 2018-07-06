package algorithm;

public class Merge1 {
        public ListNode Merge(ListNode list1,ListNode list2) {
            if (list1 == null) {
                return list2;
            }
            if (list2 == null) {
                return list1;
            }
            ListNode mergehead =null,current =null;
           while (list1!= null && list2 != null){
               if (list1.val<list2.val){
                   if (mergehead==null)
                   {mergehead=current=list1;}
                   else{
                       current.next=list1;
                       current=current.next;
                   }
                   list1=list1.next;
               }else {
                   if (mergehead==null)
                   {mergehead=current=list2;}
                   else{
                       current.next=list2;
                       current=current.next;
                   }
                   list2=list2.next;
               }
           }
            if (list1 == null) {
                current.next=list2;
            }else {
               current.next=list1;
            }
            return mergehead;
        }

}
