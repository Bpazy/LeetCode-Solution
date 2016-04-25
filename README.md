LeetCode解题

[详细解题过程](http://blog.csdn.net/hanziyuan08)

在src/test/java/SolutionTest.java中写测试，在/src/test/resources/*.data中写数据
@Test
public void testReverseVowels() throws Exception {
    QADataReader reader = new QADataReader("src/test/resources/reverse_vowels.data");
    for (int i = 0; i < reader.size(); i++) {
        Assert.assertEquals(s.reverseVowels(reader.getQuestion(i)), reader.getAnswer(i));
    }
}