package com.company.HLD;

import java.util.HashMap;

public class LRUCache {
    int storage;
    public class LRUNode {
        int key;
        int value;

        LRUNode next;
        LRUNode prev;

        public LRUNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    LRUNode firstNode = new LRUNode(-1,-1);
    LRUNode lastNode = new LRUNode(-1,-1);

    public LRUCache(int storage) {
        this.storage = storage;
        firstNode.next = lastNode;
        lastNode.prev = firstNode;
    }
    HashMap<Integer, LRUNode> cacheItems = new HashMap<Integer,LRUNode>();

    public void addNode(LRUNode newFirstNode){
        LRUNode temp = firstNode.next;

        newFirstNode.next = temp;
        newFirstNode.prev = firstNode;

        firstNode.next = newFirstNode;
        temp.prev = newFirstNode;
    }

    public void deleteNode(LRUNode deleteNode) {
        LRUNode nextTemp = deleteNode.next;
        LRUNode prevTemp = deleteNode.prev;

        nextTemp.prev = prevTemp;
        prevTemp.next = nextTemp;
    }

    public void moveToFront(LRUNode nodeToChange){
        deleteNode(nodeToChange);
        addNode(nodeToChange);
    }

    public void put(int key, int val) {
        if(cacheItems.containsKey(key)){
            LRUNode updateNode = cacheItems.get(key);
            updateNode.value = val;
            moveToFront(updateNode);
        } else {
            LRUNode newNode = new LRUNode(key, val);
            if(cacheItems.size() == this.storage) {
                cacheItems.remove(lastNode.prev.key);
                deleteNode(lastNode.prev);
            }
            addNode(newNode);
            cacheItems.put(key, newNode);
        }
    }

    public int get(int key) {
        if(cacheItems.containsKey(key)){
            LRUNode fetchedNode = cacheItems.get(key);
            moveToFront(fetchedNode);
            return fetchedNode.value;
        }
        return -1;
    }
}
