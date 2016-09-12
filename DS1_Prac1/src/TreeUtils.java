import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 * Utility procedures for binary tree structures.
 * 
 * @version 25/2/2015
 */
public class TreeUtils {
        
    /**
     * Determine whether one tree node structure is similar (has the same structure) as another.
     */
    public static boolean similar(BinaryTreeNode A_Node, BinaryTreeNode B_Node){
    	//empty trees are equal in structure ** base case
    	if (A_Node == null && B_Node == null){
    		return true;
    	}
    	//empty trees that have different nodes are not equal in structure
    	else if ( (A_Node == null && B_Node != null) || (A_Node != null && B_Node == null) ){
    		return false;
    	}
    	//will only return true if the entire tree is the same else
    	//one false will break the recursion line
    	//recursive step
    	else return similar(A_Node.getLeft(), B_Node.getLeft()) && similar(A_Node.getRight(),B_Node.getRight());
    }
    
    
    
    /**
     * Obtain a list containing the root node of the given structure i.e. tNode itself.
     */
    public static List<BinaryTreeNode> levelZero(BinaryTreeNode tNode) {
    	List<BinaryTreeNode> tNodeList = new ArrayList<BinaryTreeNode>();
    	tNodeList.add(tNode);
		return tNodeList;
    }
    
    public static int characterSize(BinaryTreeNode node){
    	if (node==null){
    		return 0;
    	}
		return Math.max(String.valueOf(node.getItem()).length(), Math.max(characterSize(node.getLeft()), characterSize(node.getRight())));
    }
    /**
     * Given a list of nodes, obtain the next level. 
     * 
     * <p>
     * If the tree structure is incomplete, <code>BinaryTreeNode.EMPTY_NODE</code> is inserted as a place holder for each
     * missing node.
     * </p>
     */
    public static List<BinaryTreeNode> nextLevel(List<BinaryTreeNode> level) {
		List<BinaryTreeNode> nextLevel = new ArrayList<BinaryTreeNode>();
		for (BinaryTreeNode node : level){
			if (!node.hasLeft()){
				nextLevel.add(BinaryTreeNode.EMPTY_NODE);
			}
			else {
				nextLevel.add(node.getLeft());
			}
			if (!node.hasRight()){
				nextLevel.add(BinaryTreeNode.EMPTY_NODE);
			}
			else{
				nextLevel.add(node.getRight());
			}
		}
		return nextLevel;
    }
    
    /**
     * Determine whether node is a place holder i.e. <code>node==BinaryTreeNode.EMPTY_NODE</code>
     */
    public static boolean isPlaceHolder(BinaryTreeNode node) {
		if (node == BinaryTreeNode.EMPTY_NODE){
			return true;
		}
		return false;
    }
    public static int getHeight(BinaryTreeNode node) { 
        if (node == null) {
            return 0;
        }
        else {
            return node.getHeight(); 
        }
    }
    //will return true if the list only contains empty nodes
    public static boolean isEmpty(List<BinaryTreeNode> treeList){
    	for (BinaryTreeNode node : treeList){
    		if (node!=BinaryTreeNode.EMPTY_NODE){
    			return false;
    		}
    	}
    	return true;
    }
}
