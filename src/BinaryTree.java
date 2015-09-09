public class BinaryTree<E>{
	E node;
	BinaryTree<E> left = null;
	BinaryTree<E> right = null;
	
	public BinaryTree(E value){
		this.node = value;
	}

	/**
	 * @return the left
	 */
	public BinaryTree<E> getLeft() {
		return left;
	}

	/**
	 * @return the right
	 */
	public BinaryTree<E> getRight() {
		return right;
	}

	/**
	 * @param left the left to set
	 */
	public void setLeft(BinaryTree<E> left) {
		this.left = left;
	}

	/**
	 * @param right the right to set
	 */
	public void setRight(BinaryTree<E> right) {
		this.right = right;
	}

	/**
	 * @return the node
	 */
	public E getNode() {
		return node;
	}
}