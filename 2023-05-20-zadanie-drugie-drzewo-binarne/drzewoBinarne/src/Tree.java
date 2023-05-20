public class Tree {
    private Node node;

    public void add(int value) {
        if(this.node == null) {
            this.node = new Node (value);
        } else {
            if(value > this.node.getValue() && this.node.getRight() == null) {
                this.node.setRight(new Node(value));
                } else if(value < this.node.getValue() && this.node.getLeft() == null){
                this.node.setLeft(new Node (value));
                } else if(value > this.node.getValue() && this.node.getRight() != null){
                    
            }
    }
    private void addToTree(Node n, int value) {
        if(n == null) {
            new Node(value);
        }
    }
}
