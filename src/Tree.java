public class Tree {

    private class Node {
        public int value;
        public Node leftChild;
        public Node rightChild;
    }

    Node root = new Node();


    public void insert(int value) {
        boolean inserted = false;
        Node currentNodeToCompare = root;
        // Checking if tree is empty
        if(root.value == 0) {
            root.value = value;
            inserted = true;
        }while(!inserted) {
            if(value < currentNodeToCompare.value) {
                if(currentNodeToCompare.leftChild != null) {
                    currentNodeToCompare = currentNodeToCompare.leftChild;
                }else{
                    currentNodeToCompare.leftChild = new Node();
                    currentNodeToCompare.leftChild.value = value;
                    inserted = true;
                }
            }else if(value > currentNodeToCompare.value) {
                if(currentNodeToCompare.rightChild!= null) {
                    currentNodeToCompare = currentNodeToCompare.rightChild;
                }else{
                    currentNodeToCompare.rightChild = new Node();
                    currentNodeToCompare.rightChild.value = value;
                    inserted = true;
                }
            }
        }
    }

    public void printTree() {

    }
}
