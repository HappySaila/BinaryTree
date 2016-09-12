import java.io.PrintStream;
import java.util.List;


public class SimpleTreeWriterImpl implements SimpleTreeWriter {
    	PrintStream destination;
	public SimpleTreeWriterImpl(PrintStream out){
	    setDestination(out);
	}
	public void setDestination(PrintStream stream) {
	    destination = stream;
	}

	public void write(BinaryTreeNode tree){
	    if (tree==null){
		return;
	    }
		int characterSize = TreeUtils.characterSize(TreeUtils.levelZero(tree).get(0)); //will check the size each block must be for data to be in. If largest character size is three then print 1 as 001
		List<BinaryTreeNode> treeList = TreeUtils.levelZero(tree);
		//initially prints the root node
		int height = TreeUtils.getHeight(tree);
		int localHeight = TreeUtils.getHeight(tree);
		int level = height-localHeight;
		int initialSpace = (int)((Math.pow(2, height-level)-1)/2)*characterSize;
		int nodeSpace = (int)(Math.pow(2, height-level)-1)*characterSize;

		for (int i=0; i<initialSpace;i++){
			destination.print(" ");
		}
		String c = characterFormat(tree.getItem(),characterSize);
		destination.println(c);

		List<BinaryTreeNode> newTreeList = TreeUtils.nextLevel(treeList);
		//check if the list contains at least one element
		if (TreeUtils.isEmpty(newTreeList)){
			//debug
			//destination.println("the list is empty");
			return; //the tree as reached its final level and does not have to print any more levels
		}
		else{
			while (!TreeUtils.isEmpty(newTreeList)){
				//the tree still has more data to print out
				//all data is recalculated for that level
				localHeight-=1;
				level = height-localHeight;
				initialSpace = (int)((Math.pow(2, height-level)-1)/2)*characterSize;
				//debug
				nodeSpace = (int)(Math.pow(2, height-level)-1)*characterSize;
				//destination.print("node space: "+nodeSpace);
				//print initial spaces
				for (int i=0;i<initialSpace;i++){
					destination.print(" ");
				}
				//print out line
				for (int i=0;i<newTreeList.size();i+=2){
					//character format
					
					
					//print node pair
					//print node odd number
					if(TreeUtils.isPlaceHolder(newTreeList.get(i))){
						String a="";
						for (int t=0;t<characterSize;t++){
							a=" "+a;
						}
						destination.print(a);
					}
					else{
						String a = characterFormat(newTreeList.get(i).getItem(), characterSize);
						destination.print(a);
					}

					//print dashes
					for (int j=0; j<nodeSpace;j++){
						destination.print("-");
					}

					
					//print node even
					if(TreeUtils.isPlaceHolder(newTreeList.get(i+1))){
						String b="";
						for (int t=0;t<characterSize;t++){
							b=" "+b;
						}
						destination.print(b);
					}
					else{
					    String b = characterFormat(newTreeList.get(i+1).getItem(),characterSize);
					    destination.print(b);
					}

					//prints spaces for following nodes
					for (int j=0; j<nodeSpace;j++){
						destination.print(" ");
					}
				}
				newTreeList = TreeUtils.nextLevel(newTreeList);
				destination.println();
			}
		}
	}
	public String characterFormat(int n,int characterSize){
		String s=""+n;
		while(s.length()<characterSize){
			s = "0"+s;
		}
		return s;
	}
	public String formatter(){
		String A = "";
		int C = 4;
		int d= 4;
		int f= 4;
		int g= 4;
		int h= 4;
		int j= 4;
		int k= 4;
		int l= 4;
		int w= 4;
		int e= 4;
		int r= 4;
		int rqw= 4;
		int t= 4;
		int y= 4;
		int u= 4;
		int p= 4;
		int o= 4;
		int q= 4;
		int aav= 4;
		int zz= 4;
		int qq= 4;
		int Cqw= 4;
		int Cqqq= 4;
		int Cxv= 4;
		int Cjhs= 4;
		int Curr= 4;
		int Cuytf= 4;
		int Cshsf= 4;
		int Css= 4;
		int Cbn= 4;
		int Cjk= 4;
		int Cpp= 4;
		int C2 = 4;
		int d2= 4;
		int f2= 4;
		int g2= 4;
		int h2= 4;
		int j2= 4;
		int k2= 4;
		int l2= 4;
		int w2= 4;
		int e2= 4;
		int r2= 4;
		int rqw2= 4;
		int t2= 4;
		int y2= 4;
		int u2= 4;
		int p2= 4;
		int o2= 4;
		int q2= 4;
		int aav2= 4;
		int zz2= 4;
		int qq2= 4;
		int Cqw2= 4;
		int Cqqq2= 4;
		int Cxv2= 4;
		int Cjhs2= 4;
		int Curr2= 4;
		int Cuytf2= 4;
		int Cshsf2= 4;
		int Css2= 4;
		int Cbn2= 4;
		int Cjk2= 4;
		int Cpp2= 4;
		int C3 = 4;
		int d3= 4;
		int f3= 4;
		int g3= 4;
		int h3= 4;
		int j3= 4;
		int k3= 4;
		int l3= 4;
		int w3= 4;
		int e3= 4;
		int r3= 4;
		int rqw3= 4;
		int t3= 4;
		int y3= 4;
		int u3= 4;
		int p3= 4;
		int o3= 4;
		int q3= 4;
		int aav3= 4;
		int zz3= 4;
		int qq3= 4;
		int Cqw3= 4;
		int Cqqq3= 4;
		int Cxv3= 4;
		int Cjhs3= 4;
		int Curr3= 4;
		int Cuytf3= 4;
		int Cshsf3= 4;
		int Css3= 4;
		int Cbn3= 4;
		int Cjk3= 4;
		int Cpp3= 4;
		int C23 = 4;
		int d23= 4;
		int f23= 4;
		int g23= 4;
		int h23= 4;
		int j23= 4;
		int k23= 4;
		int l23= 4;
		int w23= 4;
		int e23= 4;
		int r23= 4;
		int rqw23= 4;
		int t23= 4;
		int y23= 4;
		int u23= 4;
		int p23= 4;
		int o23= 4;
		int q23= 4;
		int aav23= 4;
		int zz23= 4;
		int qq23= 4;
		int Cqw23= 4;
		int Cqqq23= 4;
		int Cxv23= 4;
		int Cjhs23= 4;
		int Curr23= 4;
		int Cuytf23= 4;
		int Cshsf23= 4;
		int Css23= 4;
		int Cbn23= 4;
		int Cjk23= 4;
		int Cpp23= 4;
		return A;
	}
}
