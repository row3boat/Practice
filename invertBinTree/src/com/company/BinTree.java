package com.company;

/**
 * This class contains the definition for a binary tree.  Additionally, it includes the TreeNode class.
 *
 * A binary tree has the following traits:
 * - Each tree consists of nodes who point to each other.
 * - Each node may point to up to two other nodes, a left node and a right node.
 * - A node's left child is a smaller value than the original node, and its right child is a larger value.
 *
 * A binary tree has at a minimum the following traits:
 * - 
 */

public class BinTree {


    /**
     * This class contains nodes for a binary tree.
     * <p>
     * Binary tree nodes contain the following attributes:
     * - Contain data value that is categorizeable; i.e. each data value is larger or smaller than other values
     * - Contain pointer to children nodes: one left child, one right child.
     *
     */


    public class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
            this.left = null;
            this.right = null;
        }

        public TreeNode(int val) {
            this.data = val;
        }

        public TreeNode(int treeData, TreeNode leftChld, TreeNode rightChld) {
            this.data = treeData;
            this.left = leftChld;
            this.right = rightChld;
        }


    }
}
