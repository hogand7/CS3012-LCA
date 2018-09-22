import static org.junit.Assert.*;

import org.junit.Test;

public class LCATests {
	
	@Test 
	public void testConstructor() {
		LCA tree = new LCA(); 
	    tree.root = new Node(1); 
	    tree.root.left = new Node(2); 
	    tree.root.right = new Node(3);
	}

	@Test
	public void testPositiveLCA() {
		LCA graph  = new LCA(); 
	    graph.root = new Node(1); 
	    graph.root.left  = new Node(2); 
	    graph.root.right = new Node(3); 
	    graph.root.left.left  = new Node(4); 
	    graph.root.left.right = new Node(5); 
	    graph.root.right.left  = new Node(6); 
	    graph.root.right.right = new Node(7); 
	    
	    assertEquals("Check normal tree" ,2, tree.findLCA(4,5));
	    assertEquals("Check normal tree" ,1, tree.findLCA(4,6));
	    assertEquals("Check normal tree" ,1, tree.findLCA(3,4));
	    assertEquals("Check normal tree" ,2, tree.findLCA(2,4));

	}
	
	@Test
	public void testNegativeLCA() {
		LCA graph  = new LCA(); 
	    graph.root = new Node(-1); 
	    graph.root.left  = new Node(-2); 
	    graph.root.right = new Node(-3); 
	    graph.root.left.left  = new Node(-4); 
	    graph.root.left.right = new Node(-5); 
	    graph.root.right.left  = new Node(-6); 
	    graph.root.right.right = new Node(-7); 
	    
	    assertEquals("Check normal tree" ,-2, tree.findLCA(-4,-5));
	    assertEquals("Check normal tree" ,-1, tree.findLCA(-4,-6));
	    assertEquals("Check normal tree" ,-1, tree.findLCA(-3,-4));
	    assertEquals("Check normal tree" ,-2, tree.findLCA(-2,-4));

	}

}
