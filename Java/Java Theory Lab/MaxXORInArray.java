import java.util.*;

public class MaxXORInArray {

    static class TrieNode {
        TrieNode[] children = new TrieNode[2]; 
    }

    static class Trie {
        TrieNode root = new TrieNode();

       
        public void insert(int num) {
            TrieNode node = root;
            for (int i = 31; i >= 0; i--) { 
                int bit = (num >> i) & 1;
                if (node.children[bit] == null) {
                    node.children[bit] = new TrieNode();
                }
                node = node.children[bit];
            }
        }

      
        public int getMaxXOR(int num) {
            TrieNode node = root;
            int maxXor = 0;
            for (int i = 31; i >= 0; i--) {
                int bit = (num >> i) & 1;
                int toggledBit = 1 - bit; 
                if (node.children[toggledBit] != null) {
                    maxXor |= (1 << i); 
                    node = node.children[toggledBit];
                } else {
                    node = node.children[bit];
                }
            }
            return maxXor;
        }
    }

    public static int findMaximumXOR(int[] nums) {
        Trie trie = new Trie();
        int maxXor = 0;
        trie.insert(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            maxXor = Math.max(maxXor, trie.getMaxXOR(nums[i]));
            trie.insert(nums[i]);
        }

        return maxXor;
    }

    public static void main(String[] args) {
        int[] nums = {3, 10, 5, 25, 2, 8};
        System.out.println("Maximum XOR is: " + findMaximumXOR(nums)); // Output: 28
    }
}
