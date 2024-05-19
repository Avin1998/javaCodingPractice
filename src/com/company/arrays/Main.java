package com.company.arrays;

import com.company.HLD.UniqueIDGenerator;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Stack;
public class Main {
    public static int[] dijkstrasAlgorithm(int start, int[][][] edges) {
        // Write your code here.
        Stack<Integer> curElements = new Stack<Integer>();
        int[] resultArray = new int[edges.length];
        Arrays.fill(resultArray, Integer.MAX_VALUE);
        resultArray[start] = 0;
        for (int[] vertexLinks : edges[start]) {
            curElements.push(vertexLinks[0]);
            resultArray[vertexLinks[0]] = vertexLinks[1];
        }
        while(!curElements.isEmpty()) {
            int topLinkedVertex = curElements.pop();
            for(int[] vertexLinks : edges[topLinkedVertex]) {
                curElements.push(vertexLinks[0]);
                resultArray[vertexLinks[0]] = Math.min(resultArray[vertexLinks[0]], resultArray[topLinkedVertex] + vertexLinks[1]);
            }
        }
        for(int i = 0 ; i < resultArray.length; i++) {
            resultArray[i] = resultArray[i] == Integer.MAX_VALUE ? -1 : resultArray[i];
        }
        return resultArray;
    }
    public static void main(String[] args) {
//        LRUCache newCache = new LRUCache(3);
//        int [][][] edges = {{{1,7}},{{2,6},{3,20},{4,3}},{{3,14}},{{4,2}},{},{}};
//
//        int[] resultArray = dijkstrasAlgorithm(0, edges);
//
//        for(int i: resultArray) {
//            System.out.println(i);
//        }
//        newCache.put(1,2);
//        newCache.put(2,3);
//        newCache.put(3,3);
//        newCache.put(1,4);
//        newCache.get(3);
//        newCache.put(4,1);
//        System.out.println(newCache.get(2));
        UniqueIDGenerator newGenerator = new UniqueIDGenerator();
        LocalDateTime currentTime = LocalDateTime.now();
        try{
            System.out.println(newGenerator.getEpoch(currentTime));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}