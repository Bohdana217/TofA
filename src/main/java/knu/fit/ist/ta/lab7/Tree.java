/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knu.fit.ist.ta.lab7;

import java.util.*;

/**
 *
 * @author admin
 */
public class Tree {

    Node root;

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public Tree(List<Integer> arr) {
        int start = 0;
        int end = arr.size() - 1;
        this.root = fromSortedListRecursive(arr, start, end);
    }

    private Node fromSortedListRecursive(List<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        if (start == end) {
            return new Node(arr.get(start));
        }

        int mid = (start + end) / 2;

        Node res = new Node(arr.get(mid));
        res.left = fromSortedListRecursive(arr, start, mid - 1);
        res.right = fromSortedListRecursive(arr, mid + 1, end);
        return res;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    private boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public int findLargestValue(Node root) {
        return root.right == null ? root.value : findLargestValue(root.right);
    }

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {

            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;

        }
        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }
        current.right = deleteRecursive(current.right, value);
        return current;
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }
     

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    

    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public String getPostOrder() {
        StringBuilder str = new StringBuilder();
        this.traversePostOrder(this.root, str);
        return str.toString();
    }

    public void traversePostOrder(Node node, StringBuilder str) {
        if (node != null) {
            traversePostOrder(node.left, str);
            traversePostOrder(node.right, str);
            str.append(" " + node.value);
        }
    }

    
}
