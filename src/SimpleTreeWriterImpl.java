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
			destination.println("the list is empty");
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
}
