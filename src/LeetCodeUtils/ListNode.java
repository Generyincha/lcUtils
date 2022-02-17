package LeetCodeUtils;

/**
 * @author ustbwjw
 * @create 2022-02-17 17:48
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    public static ListNode createList(int[] nums){
        if(nums.length==0) return null;
        ListNode root = new ListNode(nums[0]);
        ListNode cur=root;
        for(int i=1;i<nums.length;i++){
            ListNode node = new ListNode(nums[i]);
            cur.next=node;
            cur=node;
        }
        return root;
    }

    public static void printList(ListNode head){
        while(head!=null){
            System.out.print(head.val+" ");
            head=head.next;
        }
    }
}
