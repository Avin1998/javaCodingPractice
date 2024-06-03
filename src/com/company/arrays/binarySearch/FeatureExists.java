package com.company.arrays.binarySearch;

import java.math.BigInteger;

import static javax.management.Query.and;

public class FeatureExists {
    public static void main(String[] args) {
        BigInteger result = BigInteger.valueOf(10289);
        BigInteger feature = BigInteger.valueOf(0x0000000000040000L);
        System.out.println(result);
        System.out.println(feature);

        System.out.println(result.and(feature).equals(feature));
    }
}
