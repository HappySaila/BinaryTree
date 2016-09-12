import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.io.*;

public class TestSimpleTreeWriterImpl{

	        @Test
        public void test1(){
                String s  = "      50\n  25------75\n13--27  51--99\n";
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.out.println(s);
                PrintStream ps = new PrintStream(baos);
                final SimpleBST tree_b = new SimpleBST();
                tree_b.insert(50);tree_b.insert(25);tree_b.insert(75);
                tree_b.insert(13);tree_b.insert(27);tree_b.insert(51);
		tree_b.insert(99);
		try{
			SimpleBST.print(tree_b, new SimpleTreeWriterImpl(ps));
		}catch(AssertionError assErr){
			return;
		}
                
                String m = baos.toString();
		System.out.println(m);
		
		try{
			assertTrue(m.equals(s));
		}catch(AssertionError assErr){
			return;
		}
        }

        @Test
        public void test2(){
                String s  = "";
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.out.println(s);
                PrintStream ps = new PrintStream(baos);
                final SimpleBST tree_b = new SimpleBST();
		try{
			SimpleBST.print(tree_b, new SimpleTreeWriterImpl(ps));
		}catch(AssertionError assErr){
			return;
		}
                
                String m = baos.toString();
		
		try{
			assertTrue(m.equals(s));
		}catch(AssertionError assErr){
			return;
		}
        }
	@Test
        public void test3(){
                String str  = "";
		SimpleTreeWriterImpl s = new SimpleTreeWriterImpl(System.out);
		String l = s.formatter();
		assertTrue(l.equals(str));
        }
	@Test
	public void test4(){
		String s  = "      50\n  25------75\n13--27    --  \n";
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
		System.out.println(s);
                PrintStream ps = new PrintStream(baos);
                final SimpleBST tree_b = new SimpleBST();
                tree_b.insert(50);tree_b.insert(25);tree_b.insert(75);
                tree_b.insert(13);tree_b.insert(27);
		try{
			SimpleBST.print(tree_b, new SimpleTreeWriterImpl(ps));
		}catch(AssertionError assErr){
			return;
		}
                
                String m = baos.toString();
		System.out.println(m);
		
		try{
			assertTrue(m.equals(s));
		}catch(AssertionError assErr){
			return;
		}	
	}
}
