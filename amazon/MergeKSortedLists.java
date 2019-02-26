package amazon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {
	//https://leetcode.com/problems/merge-k-sorted-lists/discuss/10528/A-java-solution-based-on-Priority-Queue
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeKSortedLists sortedlist=new MergeKSortedLists();
		LinkedNode head=new LinkedNode(1);
		head.next=new LinkedNode(2);
		head.next.next=new LinkedNode(4);
		
		LinkedNode head2=new LinkedNode(1);
		head2.next=new LinkedNode(3);
		head2.next.next=new LinkedNode(4);
		
		LinkedNode head3=new LinkedNode(2);
		head3.next=new LinkedNode(4);
		head3.next.next=new LinkedNode(6);
				
		List<LinkedNode> Lists=new ArrayList<LinkedNode>();
		Lists.add(head);Lists.add(head2);Lists.add(head3);
		
	    sortedlist.mergeKLists(Lists);
 	}
//
//	private void build(LinkedNode[] Lists) {
//		// TODO Auto-generated method stub
//		int interval=1;
//		int len=Lists.length;
//		int i=0;
//		while(interval<len){
//			while(i<len){
//				int j=i+interval;
//				Lists[i]=merge(Lists[i], Lists[j]);
//				i=j;
//			}
//		interval*=2;
//		}
//	}
//
//	private LinkedNode merge(LinkedNode head1, LinkedNode head2) {
//		// TODO Auto-generated method stub
//		LinkedNode temp1=head1;
//		LinkedNode temp2=head2;
//		while(head1!=null){
//			
//			if(head1.data<head2.data){
//				LinkedNode temp=head1.next;
//				head1.next=head2;
//				head1=temp;
//			}
//			else if(head1.data>head2.data) {
//				LinkedNode temp=head2.next;
//				head2.next=head1;
//				head2=temp;
//			}
//			
//			
//		}
	
		
//	}
	
	public LinkedNode mergeKLists(List<LinkedNode> lists) {
        if (lists==null||lists.size()==0) return null;
        
        PriorityQueue<LinkedNode> queue= new PriorityQueue<LinkedNode>(lists.size(),new Comparator<LinkedNode>(){
            @Override
            public int compare(LinkedNode o1,LinkedNode o2){
                if (o1.data<o2.data)
                    return -1;
                else if (o1.data==o2.data)
                    return 0;
                else 
                    return 1;
            }
        });
        
        LinkedNode dummy = new LinkedNode(0);
        LinkedNode tail=dummy;
        
        for (LinkedNode node:lists)
            if (node!=null)
                queue.add(node);
            
        while (!queue.isEmpty()){
            tail.next=queue.poll();
            tail=tail.next;
            
            if (tail.next!=null)
                queue.add(tail.next);
        }
        return dummy.next;
    }

}
