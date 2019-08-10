package com.hmc.Utils;

import java.util.Collection;

/**
 * Author:meice Huang
 * Time: 2019-08-06 11:55
 */
public class StringUtils {

    public static String join(Collection<String> coll, String delim) {
        if (coll == null) {
            return null;
        }
        if (delim.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean isFirst = true;
        for (String s : coll) {
            if (isFirst) {
                isFirst = false;
            } else {
                sb.append(delim);
            }
            sb.append(s);
        }
        return sb.toString();
    }
}
