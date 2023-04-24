package com.example.learningplan.springrecruitment.day01.question02;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 20. 有效的括号
 *
 * @author MaxBrooks 15905898514@163.com
 * @version 2023/4/5 14:57
 * @since JDK17
 */

public class IsValid {

    /**
     * 作者：jyd
     * 链接：<a href="https://leetcode.cn/problems/valid-parentheses/solution/valid-parentheses-fu-zhu-zhan-fa-by-jin407891080/">...</a>
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    private static final Map<Character,Character> MAP = new HashMap<Character,Character>(){{
        put('{','}');
        put('[',']');
        put('(',')');
        put('?','?');
    }};

    public boolean isValid(String s) {
        if(s.length() > 0 && !MAP.containsKey(s.charAt(0))) {
            return false;
        }
        LinkedList<Character> stack = new LinkedList<Character>() {{ add('?'); }};
        for(Character c : s.toCharArray()){
            if(MAP.containsKey(c)) {
                stack.addLast(c);
            } else if(!MAP.get(stack.removeLast()).equals(c)) {
                return false;
            }
        }
        return stack.size() == 1;
    }
}
