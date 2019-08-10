package com.hmc.myThread;

import com.hmc.Utils.StringUtils;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Author:meice Huang
 * Time: 2019-08-06 14:08
 */
public class TestStringUtils {

    @Test
    public void testJoin() {
        Set<String> setString = new HashSet<>();
        setString.add("刘备");
        setString.add("关羽");
        setString.add("张飞");
        System.out.println(StringUtils.join(setString,";"));
    }
}
