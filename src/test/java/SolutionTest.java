import main.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    private Solution s = new Solution();

    @Test
    public void testReverseVowels() throws Exception {
        QADataReader reader = new QADataReader("src/test/resources/reverse_vowels.data");
        for (int i = 0; i < reader.size(); i++) {
            Assert.assertEquals(s.reverseVowels(reader.getRaw(i)), reader.getExpect(i));
        }
    }

    @Test
    public void testRotate() throws Exception {
        int[] nums = {1, 2, 3};
        s.rotate(nums, 4);
        Assert.assertArrayEquals(new int[]{3, 1, 2}, nums);
    }

    @Test
    public void testContainsNearbyDuplicate() throws Exception {
        int[] nums = {1, 2, 1};
        boolean result = s.containsNearbyDuplicate(nums, 1);
        Assert.assertFalse(result);
    }

    @Test
    public void testContainsDuplicate() throws Exception {
        int[] nums = {1, 2, 1};
        boolean result = s.containsDuplicate(nums);
        Assert.assertTrue(result);
    }

    @Test
    public void testMoveZeroes() throws Exception {
        int[] nums = {1, 0, 2, 1, 0, 9, 1};
        int[] numsResult = {1, 2, 1, 9, 1, 0, 0};
        s.moveZeroes(nums);
        Assert.assertArrayEquals(nums, numsResult);
    }

    @Test
    public void testCountPrimes() throws Exception {

    }

    @Test
    public void testPlusOne() throws Exception {
        int[] nums = {9};
        int[] result = s.plusOne(nums);
        Assert.assertArrayEquals(result, new int[]{1, 0});
    }

    @Test
    public void testRemoveElement() throws Exception {
        int[] nums = {3, 2, 2, 3};
        int result = s.removeElement(nums, 3);
        Assert.assertEquals(result, 2);
        Assert.assertEquals(nums[0], 2);
        Assert.assertEquals(nums[1], 2);
    }

    @Test
    public void testRemoveDuplicates() throws Exception {

    }

    @Test
    public void testRemoveDuplicates2() throws Exception {

    }

    @Test
    public void testHasCycle() throws Exception {

    }

    @Test
    public void testSortList() throws Exception {

    }

    @Test
    public void testMergeTwoLists() throws Exception {

    }

    @Test
    public void testDeleteNode() throws Exception {

    }

    @Test
    public void testRemoveNthFromEnd() throws Exception {

    }

    @Test
    public void testSwapPairs() throws Exception {

    }
}