package com.hmc.TestUtils;

import com.hmc.Utils.EnumUtils;
import com.hmc.value.Week;

/**
 * Author:meice Huang
 * Time: 2019-08-06 10:53
 */
public class TestMyUtils {
    public static void main(String[] args) {
        EnumUtils.noErrorValueOf(Week.class,"WON");
    }
}
