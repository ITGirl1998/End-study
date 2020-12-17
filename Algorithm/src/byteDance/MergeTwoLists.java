package byteDance;

class ListNodeOne {
    int val;
    ListNodeOne next;
    ListNodeOne(int x) { val = x; }
 }

/**
 *输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 *示例1：
 *输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 *来源：力扣（LeetCode）
 *链接：https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof
 *著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * 输出：1->1->2->3->4->4
 */

public class MergeTwoLists {
    public static void main(String[] args) {
        ListNodeOne l1 = new ListNodeOne(1);
        ListNodeOne l2 = new ListNodeOne(2);
        System.out.println( mergeTwoLists(l1, l2));
    }

    public static ListNodeOne mergeTwoLists(ListNodeOne l1, ListNodeOne l2) {
        ListNodeOne newListNode = new ListNodeOne(0),per = newListNode;
        while (l1 != null  && l2 != null){
            if(l1.val > l2.val){
                per.next = l2;
                l2 = l2.next;
            }else{
                per.next = l1;
                l1 = l1.next;
            }
            per = per.next;
        }
        per.next = l1 !=null ? l1 : l2;
        return  newListNode.next;
    }
}
