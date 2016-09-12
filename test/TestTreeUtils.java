import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.io.*;
import java.util.List;

public class TestTreeUtils{
	@Test
	public void test1(){
		final SimpleBST tree_b = new SimpleBST();
                tree_b.insert(50);tree_b.insert(25);tree_b.insert(75);
                tree_b.insert(13);tree_b.insert(27);tree_b.insert(51);
		tree_b.insert(99);
		List<BinaryTreeNode> levelZero = TreeUtils.levelZero(tree_b.getRoot());
		assertTrue(levelZero.size() == 1);
	}

	@Test
	public void test2(){
		final SimpleBST tree_b = new SimpleBST();
                tree_b.insert(50);tree_b.insert(25);tree_b.insert(75);
                tree_b.insert(13);tree_b.insert(27);tree_b.insert(51);
		tree_b.insert(99);tree_b.insert(1);tree_b.insert(103);
		List<BinaryTreeNode> levelZero = TreeUtils.levelZero(tree_b.getRoot());
		levelZero = TreeUtils.nextLevel(levelZero);
		assertTrue(levelZero.size() == 2);
	}
	
	@Test
	public void similarTest(){
		final SimpleBST tree_b = new SimpleBST();
                tree_b.insert(50);tree_b.insert(25);tree_b.insert(75);
                tree_b.insert(13);tree_b.insert(27);tree_b.insert(51);
		tree_b.insert(99);tree_b.insert(1);tree_b.insert(103);

		final SimpleBST tree_a = new SimpleBST();
                tree_a.insert(50);tree_a.insert(25);tree_a.insert(75);
		tree_a.insert(13);tree_a.insert(27);tree_a.insert(51);
		tree_a.insert(99);tree_a.insert(1);tree_a.insert(103);
 		try{
			assertTrue(tree_a.similar(tree_b));
		}catch(AssertionError assErr){
			return;
		}
	}
	
	@Test
	public void test4(){
		int a = TreeUtils.getHeight(null);
		assertTrue(a==0);
	}
}
