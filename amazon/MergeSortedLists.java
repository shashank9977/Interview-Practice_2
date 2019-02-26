package amazon;

import java.util.Comparator;
import java.util.PriorityQueue;
class sortcomparator implements Comparator<LinkedNode>{
	@Override
	public int compare(LinkedNode n1, LinkedNode n2) {
		// TODO Auto-generated method stub
		if(n1.data<n2.data){
			return -1;
		}
		else if(n1.data==n2.data){
			return 0;	
		}
		else return 1;
	}
}

public class MergeSortedLists {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSortedLists sortedlist=new MergeSortedLists();
		LinkedNode head=new LinkedNode(1);
		head.next=new LinkedNode(2);
		head.next.next=new LinkedNode(4);
		
		LinkedNode head2=new LinkedNode(1);
		head2.next=new LinkedNode(3);
		head2.next.next=new LinkedNode(4);
		sortedlist.merge(head,head2); // using priorityqueue
	}

	private void merge(LinkedNode head1, LinkedNode head2) {
		sortcomparator spc=new sortcomparator();
		PriorityQueue<LinkedNode> queue=new PriorityQueue<LinkedNode>(spc);
		while(head1!=null){
			queue.add(head1);
			head1=head1.next;
		}
		while(head2!=null){
			queue.add(head2);
			head2=head2.next;
		}
		while(!queue.isEmpty()){
			System.out.print(queue.poll().data);
		}
	}

}
