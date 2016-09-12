import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import java.io.*;

public class TestSimpleTreeWriterImpl{

	        @Test
        public void test1(){
                String s  = "      50\n  25------75\n13--27  51--99\n";
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                PrintStream ps = new PrintStream(baos);
                final SimpleBST tree_b = new SimpleBST();
                tree_b.insert(50);tree_b.insert(25);tree_b.insert(75);
                tree_b.insert(13);tree_b.insert(27);tree_b.insert(51);tree_b.insert(99);
                SimpleBST.print(tree_b, new SimpleTreeWriterImpl(ps));
                String m = baos.toString();
                assertTrue(m.equals(s));
        }
}
