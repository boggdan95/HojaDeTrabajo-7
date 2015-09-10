import java.util.Stack;

public class BinaryTreeSet{
	BinaryTree<Asociacion> root = null;
	Comparador comparador = new Comparador();
	protected Stack<BinaryTree<Asociacion>> todo = new Stack<BinaryTree<Asociacion>>();
	int counter = 0;
	
	/**
	 * Locate.
	 *
	 * @param root the root
	 * @param value the value
	 * @return the binary tree
	 */
	//Locate method
	public BinaryTree<Asociacion> locate(BinaryTree<Asociacion> root, String value){
		String rootValue = root.getNode().getKey();
		BinaryTree<Asociacion> child;
		
		//found at root: done
		if(rootValue.equals(value)) return root;
		//look left if less-than, right if greater-than
		if(comparador.comparar(rootValue, value)==1){
			child = root.getRight();
		} else {
			child = root.getLeft();
		}
		
		//no child there: not in tree, return this node, else keep searching
		if(child==null){
			return root;
		} else {
			return locate(child, value);
		}
	}
	
	//Add method
	public void add(Asociacion asociacion){
		BinaryTree<Asociacion> newNode = new BinaryTree<Asociacion>(asociacion);
		
		//Add value to binary search tree
		//if there's no root, create value at root
		if(root==null){
			root = newNode;
			counter++;
		} else {
			BinaryTree<Asociacion> insertLocation = locate(root, asociacion.getKey());
			String nodeValue = insertLocation.getNode().getKey();
			//If the newNode is greater than insertLocation, set it to the right.
			if(comparador.comparar(asociacion.getKey(), nodeValue)==1){
				insertLocation.setLeft(newNode);
				counter++;
			} 
			//If the newNode is lower than insertLocation, set it to the left.
			if(comparador.comparar(asociacion.getKey(), nodeValue)==-1){
				insertLocation.setRight(newNode);
				counter++;
			} 
			//If the newNode is equal to insertLocation the newNode isn't added to the tree.
			
		}
	}
	
	//Add translation method
	public void addTranslation(String english, String spanish){
		add(new Asociacion(english,spanish));
	}
	
	//Get translation method
	public String getTranslation(String english){
		if(root==null){
			return null;
		}
		
		BinaryTree<Asociacion> possibleLocation = locate(root, english);
		if(possibleLocation.getNode().getKey().equals(english)){
			return possibleLocation.getNode().getValue();
		} else {
			return "*"+english+"*";
		}
	}
	
	//Get words quantity method
	public int getWordsQuantity(){
		return counter;
	}
	
	//Reset Iterator method
	public void resetIterator(){
		todo.clear();
		//Stack is empty. Push nodes from root to leftmost descendant
		BinaryTree<Asociacion> current = root;
		while(current!=null){
			todo.push(current);
			current = current.getLeft();
		}
	}
	
	//Next method
	public Asociacion next(){
		BinaryTree<Asociacion> old = todo.pop();
		Asociacion result = old.getNode();
		//We know this node has no unconsidered left children; if this node has right child,
		//we push the right child and its leftmost descendants:
		//else
		//	top element of stack is next node to be visited
		if(old.getRight()!=null){
			BinaryTree<Asociacion> current = old.getRight();
			do{
				todo.push(current);
				current = current.getLeft();
			} while(current!=null);
		}
		
		return result;
	}
	
	public boolean hasNext(){
		return !todo.isEmpty();
	}
}
