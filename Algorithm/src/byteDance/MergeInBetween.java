package byteDance;


/**
 * 给你两个链表 list1 和 list2 ，它们包含的元素分别为 n 个和 m 个。
 * 请你将 list1 中第 a 个节点到第 b 个节点删除，并将list2 接在被删除节点的位置。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-in-between-linked-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
 class ListNodeTwo { int val;
    ListNodeTwo next;
    ListNodeTwo() {}
    ListNodeTwo(int val) { this.val = val; }
    ListNodeTwo(int val, ListNodeTwo next) { this.val = val; this.next = next; }
 }

public class MergeInBetween {
    public ListNodeTwo mergeInBetween(ListNodeTwo list1, int a, int b, ListNodeTwo list2) {
        ListNodeTwo retListNodeTwo = new ListNodeTwo(0);
        ListNodeTwo l,r;

        return retListNodeTwo;
    }
}
