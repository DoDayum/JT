package com.baiyu.huaWei;


import java.util.*;

/**
 * @author BaiYu
 * @version 1.0
 * @date 2020/12/8 17:42
 */
public class Test01 {
    public static void main(String[] args) {
        String[] a = {"1", "2", "1", "2", "1", "1", "3", "3", "3", "3", "1", "4", "4"};

        HashMap<String, Integer> aHashMap = new HashMap<>();
        int b = 1;
        for (int i = 0; i <= a.length - 1; i++) {
            if (!aHashMap.containsKey(a[i])) {//判断是否存在
                aHashMap.put(a[i], b);
            } else {
                Integer c = aHashMap.get(a[i]) + 1;
                aHashMap.remove(a[i]);
                aHashMap.put(a[i], c);
            }
        }

        System.out.println(aHashMap);

        Integer[] aLength = new Integer[aHashMap.values().size()];
        int e = 0;
        for (Map.Entry<String, Integer> entry : aHashMap.entrySet()) {
            Integer value = entry.getValue();//aHashMap的Value
            aLength[e++] = value;
        }
        Arrays.sort(aLength,Collections.reverseOrder());
        for (Integer r : aLength) {
        }
        


    }
}
