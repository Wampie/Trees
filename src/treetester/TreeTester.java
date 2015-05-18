/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package treetester;

import java.util.ArrayList;

/**
 *
 * @author ajmajand
 */
public class TreeTester {

    private class TreeNode<T> {
        private T data;
        private TreeNode<T> parent;
        private ArrayList<TreeNode<T>> children;
        
        public T getData() {
            return data;
        }
        
        public TreeNode<T> getParent() {
            return parent;
        }
        
        public void setParent(TreeNode<T> p) {
            this.parent = p;
        }
        
        public void addChildren(TreeNode<T> c) {
            c.setParent(this);
            children.add(c);
        }
        
        public void addChildren(ArrayList<TreeNode<T>> list) {
            for (TreeNode<T> treeNode : list) {
                treeNode.setParent(this);
            }
            children = list;
        }
    }
    
    private class NodeData {
        public String name;
        public double ev;
        public double entropy;
        public int count;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
