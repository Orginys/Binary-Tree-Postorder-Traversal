import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        // Initialize the result list to store the values in postorder
        List<Integer> result = new ArrayList<>();

        // Call the helper function to perform recursive postorder traversal
        postorderHelper(root, result);

        // Return the result list containing the postorder traversal of nodes' values
        return result;
    }

    private void postorderHelper(TreeNode node, List<Integer> result) {
        // Base case: if the current node is null, return immediately
        if (node == null) {
            return;
        }

        // Recursively traverse the left subtree
        postorderHelper(node.left, result);

        // Recursively traverse the right subtree
        postorderHelper(node.right, result);

        // Visit the current node and add its value to the result list
        result.add(node.val);
    }
}