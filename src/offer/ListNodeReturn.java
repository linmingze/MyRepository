package offer;

import java.util.ArrayList;

public class ListNodeReturn {
	public static class ListNode {
	       int val;
	        ListNode next = null;
	
	        ListNode(int val) {
	            this.val = val;
	        }
	    }
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode p = listNode;
        ListNode q = listNode;
        ListNode first = listNode;
         ArrayList<Integer> list= new ArrayList();
        if(p==null)
            return list;
        while(p.next!=null)
        {
            q = p.next;
            p.next = q.next;
            q.next = first;
            first = q;
            
            //p = p.next;
        }
       
        while(q!=null)
        {
            list.add(q.val);
            q = q.next;
        }
        return list;
        
    }
	public static void main(String[] args) {
		int[] a = {67,0,24,58};
		ListNode listNode = new ListNode(-1);
		ListNode p = listNode;
		for(int i=0;i<a.length;i++)
		{
			ListNode listNode2 = new ListNode(a[i]);
			listNode.next = listNode2;
			listNode = listNode.next;
		}
		listNode.next = null;
		ListNode begin = p.next;
		p.next = null;
		while(begin!=null)
		{
			System.out.println(begin.val);
			begin = begin.next;
		}
	}

}
