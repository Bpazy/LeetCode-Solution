LeetCode解题

[详细解题过程](http://blog.csdn.net/hanziyuan08)

在src/test/java/SolutionTest.java中写测试

**Example:** src/test/java/SolutionTest.java

```
@Test
public void testReverseVowels() throws Exception {
    QADataReader reader = new QADataReader("src/test/resources/reverse_vowels.data");
    for (int i = 0; i < reader.size(); i++) {
        Assert.assertEquals(s.reverseVowels(reader.getRaw(i)), reader.getExpect(i));
    }
}
```

</br>
在/src/test/resources/*.data中写数据, 原始数据和期望值之间用 | 分隔

**Example:** src/test/resources/reverse_vowels.data

```
hello | holle
```
