// Binary tree Inorder traversal using Iterative Solution

//Definition for a binary tree node.
// LEFT - ROOT - RIGHT
//--------------------------------------
 public class TreeNode {
      int data;
      TreeNode left;
      TreeNode right;
      TreeNode(int val) { data = val; left = null, right = null }
 }
 class Solution {
    public List<Integer> inorder(TreeNode root) {
        TreeNode node=root;
        Stack<TreeNode> st=new Stack<TreeNode>();
        List<Integer> l=new ArrayList<Integer>();
        while(true){
            if(node!=null){
                st.push(node);
                //System.out.println(node.data);
                node=node.left;
            }
            else{
                if(st.empty()){
                    break;
                }
                node=st.pop();
                //System.out.println(node.data+"*");
                l.add(node.data);
                node=node.right;
                //System.out.println(node.right+"**");
            }
        }
        return l;
    }
}


/// Time Complexity -> O(N)
/// Space Complexity -> O(N)
