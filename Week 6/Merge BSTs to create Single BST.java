class Solution {
    public TreeNode canMerge(List<TreeNode> trees) {
        Set<Integer> leafNodes = new HashSet<>();
        for(TreeNode node : trees){
            if(node.left != null){
                leafNodes.add(node.left.val);
            }
            if(node.right != null){
                leafNodes.add(node.right.val);
            }

        }
        TreeNode root = null;
        for(TreeNode node : trees){
            if(!leafNodes.contains(node.val)){ 
                root = node;
            }
        }
        if(root == null){
            return null;
        }


        Map<Integer,TreeNode> rootNodes = new HashMap<>();
        for(TreeNode node : trees){
            if(node != root){ 
                rootNodes.put(node.val,node);
            }
        }
        root = mergeBST(root,rootNodes);
        if(validateBST(root,new int[] {-1}) && rootNodes.size() == 0){
            return root;
        }
        return null;

    }
    TreeNode mergeBST(TreeNode root,Map<Integer,TreeNode> rootNodes){

        if(root == null){
            return null;
        }
        if(rootNodes.containsKey(root.val)){
            TreeNode node = rootNodes.get(root.val);
            root.left = node.left;
            root.right = node.right;

            rootNodes.remove(root.val);

        }

        root.left = mergeBST(root.left,rootNodes);
        root.right = mergeBST(root.right,rootNodes);

        return root;
    }

    boolean validateBST(TreeNode root,int []prev){
        if(root != null){

            if(! validateBST(root.left,prev)){
                return false;
            }

            if(prev[0] != -1 && root.val <= prev[0]){
                return false;
            }

            prev[0] = root.val;

            return validateBST(root.right,prev);
        }

        return true;
    }
}
