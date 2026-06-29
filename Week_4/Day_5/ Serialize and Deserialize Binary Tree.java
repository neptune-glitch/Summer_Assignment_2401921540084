/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    public String serialize(TreeNode root) {

        if (root == null) {
            return "null,";
        }

        return root.val + "," +
               serialize(root.left) +
               serialize(root.right);
    }

    public TreeNode deserialize(String data) {

        String[] arr = data.split(",");
        Queue<String> q = new LinkedList<>();

        for (String s : arr) {
            q.offer(s);
        }

        return buildTree(q);
    }

    private TreeNode buildTree(Queue<String> q) {

        String val = q.poll();

        if (val.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(val));

        root.left = buildTree(q);
        root.right = buildTree(q);

        return root;
    }
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));