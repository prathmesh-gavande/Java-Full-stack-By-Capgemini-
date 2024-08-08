package Linkedlist;

import java.util.LinkedList;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		ll1.add(4);
		ll1.add(6);
		ll1.add(8);
		
		LinkedList<Integer>ll2=new LinkedList<Integer>();
		ll2.add(1);
		ll2.add(7);
		ll2.add(9);
		
		LinkedList<Integer>ans=new LinkedList<Integer>();
		
		int i=0,j=0;
		
		while(i<ll1.size() && j<ll2.size()) {
			if(ll1.get(i)<ll2.get(j)) {
				ans.add(ll1.get(i));
				i++;
			}
			else {
				ans.add(ll2.get(j));
				j++;
			}
		}
		while(i<ll1.size()) {
			ans.add(ll1.get(i));
			i++;
		}
		while(j<ll2.size()) {
			ans.add(ll2.get(j));
			j++;
		}
		System.out.print(ans);
	}

}
