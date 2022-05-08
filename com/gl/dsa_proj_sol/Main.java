package com.gl.dsa_proj_sol;

import java.io.*;


class Node
{
   int val;
   Node left, right;
   
   Node(int item)
   {
       val = item;
       left = right = null;
   }
}

class Main
{
   public static Node node;
   static Node prevNode = null;
   static Node headNode = null;
  

   static void BinaryTreeToSekewed(Node root,
                                 int order)
   {
      
       if(root == null)
       {
           return;
       }
      
       // Condition to check the order in which the skewed tree to maintained
       if(order > 0)
       {
           BinaryTreeToSekewed(root.right, order);
       }
       else
       {
           BinaryTreeToSekewed(root.left, order);
       }
       Node rightNode = root.right;
       Node leftNode = root.left;
      
       // Condition to check if the root Node of the skewed tree is not defined
       if(headNode == null)
       {
           headNode = root;
           root.left = null;
           prevNode = root;
       }
       else
       {
           prevNode.right = root;
           root.left = null;
           prevNode = root;
       }
      
       // Similarly recurse for the left right subtree on the basis of the order required
       if (order > 0)
       {
           BinaryTreeToSekewed(leftNode, order);
       }
       else
       {
           BinaryTreeToSekewed(rightNode, order);
       }
   }
  
   // Function to traverse the right skewed tree using recursion
   static void traverseRightSkewed(Node root)
   {
       if(root == null)
       {
           return;
       }
       System.out.print(root.val + " ");
       traverseRightSkewed(root.right);       
   }
  
   // Driver Code
   public static void main (String[] args)
   {
     
       Main tree = new Main();
       tree.node = new Node(50);
       tree.node.left = new Node(30);
       tree.node.right = new Node(60);
       tree.node.left.left = new Node(10);
       tree.node.right.left= new Node(55);
      
       int order = 0;
       BinaryTreeToSekewed(node, order);
       traverseRightSkewed(headNode);
   }
}
