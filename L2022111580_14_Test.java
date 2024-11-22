import org.example.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
测试原则
覆盖常见场景：输入字符串的长度与字符的排列要覆盖常见的有效和无效情况。
边界测试：考虑极短字符串、极长字符串，以及临界值情况。
异常情况：验证无效输入（例如，空字符串、包含非数字字符）。
功能完整性：确保逻辑中所有分支都被测试到。

测试用例
正常用例
"25525511135"：["255.255.11.135", "255.255.111.35"]
"0000"：["0.0.0.0"]
"101023"：["1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"]
边界用例
长度不足："123"，结果：[]
长度过长："1234567890123"，结果：[]
前导零："010010"，结果：["0.10.0.10", "0.100.1.0"]
无效输入
非数字字符："abc123"，结果：[]
超过 255 的段："256256256256"，结果：[]
*/

import java.util.Arrays;
import java.util.List;

public class L2022111580_14_Test {

    //正常用例
    @Test
    public void testRestoreIpAddresses1() {
        Solution solution = new Solution();
        List<String> result = solution.restoreIpAddresses("25525511135");
        List<String> expected = Arrays.asList("255.255.11.135", "255.255.111.35");
        assertEquals(expected, result, "The result should match the expected IP addresses.");
    }

    //边界用例
    @Test
    public void testRestoreIpAddresses2() {
        Solution solution = new Solution();
        List<String> result = solution.restoreIpAddresses("0000");
        List<String> expected = Arrays.asList("0.0.0.0");
        assertEquals(expected, result, "The result should be '0.0.0.0'.");
    }

    //无效用例
    @Test
    public void testRestoreIpAddresses3() {
        Solution solution = new Solution();
        List<String> result = solution.restoreIpAddresses("101023");
        List<String> expected = Arrays.asList("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        assertEquals(expected, result, "The result should match the expected IP addresses.");
    }
}
