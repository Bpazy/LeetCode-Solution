import java.util.*;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int start = 0, end = 0;
        for (int num : nums) {
            if (set.add(num)) {
                end++;
            } else return true;
            if (end - start > k) {
                set.remove(nums[start]);
                start++;
            }
        }
        return false;
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.contains(num)) set.add(num);
            else return true;
        }
        return false;
    }

    public void moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] == 0) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = 0;
                }
            }
        }
    }

    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] flag = new boolean[n];
        int result = 1;
        for (int i = 3; i < n; i = i + 2) {
            if (!flag[i - 1]) {
                result++;
                for (int k = 3; k * i < n; k = k + 2) {
                    if (!flag[k * i - 1])
                        flag[k * i - 1] = true;
                }
            }
        }
        return result;
    }

    public int[] plusOne(int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i];
            digits[i] = (temp + carry) % 10;
            carry = (temp + carry) / 10;
            if (carry == 0) break;
        }
        if (carry != 0) {
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = carry;
            return result;
        }
        return digits;
    }

    public int removeElement(int[] nums, int val) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 1)
            return 1;
        int length = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[length++] = nums[i];
            }
        }
        return length;
    }

    public int removeDuplicates2(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int length = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                if (count < 2) {
                    nums[length++] = nums[i];
                }
                count++;
            } else {
                count = 1;
                nums[length++] = nums[i];
            }
        }
        return length;
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            fast = fast.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        List<ListNode> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }
        Comparator<ListNode> comparator = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        };
        Collections.sort(list, comparator);
        ListNode first = null;
        for (int i = list.size() - 1; i > 0; i--) {
            if (i == list.size() - 1) {
                list.get(i).next = null;
            }
            ListNode pre = list.get(i - 1);
            pre.next = list.get(i);
            if (i == 1) {
                first = list.get(i - 1);
            }
        }
        return first;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode current = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        if (l1 == null) current.next = l2;
        if (l2 == null) current.next = l1;
        return head.next;
    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null)
            return null;
        ListNode temp = head;
        LinkedList<ListNode> linkedList = new LinkedList<>();
        while (temp != null) {
            linkedList.add(temp);
            temp = temp.next;
        }
        int size = linkedList.size();
        if (size == n) {
            return head.next;
        }
        ListNode pre = linkedList.get(size - n - 1);
        if (n == 1) {
            pre.next = null;
        } else {
            pre.next = linkedList.get(size - n + 1);
        }
        return head;
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head.next;
        head.next = temp.next;
        temp.next = head;
        ListNode node = temp.next.next;
        ListNode pre = temp.next;
        if (node == null)
            return temp;
        while (node.next != null) {
            System.out.println(node.val);
            ListNode t = node.next;
            node.next = t.next;
            t.next = node;
            pre.next = t;
            if (node.next == null)
                break;
            pre = node;
            node = node.next;
        }
        return temp;
    }
}
