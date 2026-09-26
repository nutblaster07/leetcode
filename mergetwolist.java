/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
 */

import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode current=list1;

        while(current!=null){
            arr.add(current.val);
            current=current.next;
        }

        current =list2;
        while(current !=null){
            arr.add(current.val);
            current=current.next;
        }
        Collections.sort(arr);
        ListNode dummy=new ListNode(0);
        current=dummy;
        for(int value : arr){
            current.next=new ListNode(value);
            current=current.next;
        }
        return dummy.next;

    }
}