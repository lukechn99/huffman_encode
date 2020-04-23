// ObjectNode.java
// Similar to IntNode.java except ObjectNode.java uses
// more general Object data in place of int data
// March 2019

public class EncodeNode {

    private char data;
    private EncodeNode next;
    
    public EncodeNode() {}  // default constructor

    public EncodeNode(char chr, EncodeNode left, EncodeNode right) {
        this.chr = chr;
        this.left = left;
        this.right = right;
    }

    // accessor methods

    public char getChar() {return chr;}
    public void setData(char value) {data = value;}
    public EncodeNode getLeft() {return left;}
    public EncodeNode getRight() {return right;}

    public boolean isExternal() {return left == null && right == null;}
    public boolean isInternal() {return !isExternal();}

    public void setNext(ObjectNode ptr) {
        next = ptr;
    }

    /*public boolean equals(Object anotherObject) {
        // returns true iff both fields of
        // the corresponding nodes are ==

        if (anotherObject instanceof ObjectNode) {
			ObjectNode temp = (ObjectNode) anotherObject; 
			if (data == temp.getData() &&
				next == temp.getNext())
            return true;
        }
        return false;
    }*/

    public String toString() {
        return data.toString();
    }

    // build Huffman tree artificially
    public static void main(String[] args) {
        // tests the ObjectNode class by building a short list of 
        // various data items

        ObjectNode start = null;
        ObjectNode ptr;
        
        System.out.println("Adding \"ABC\"");
        start = new ObjectNode("ABC", start);
        System.out.println("Adding \"xyz\"");
        start = new ObjectNode("xyz", start);
        System.out.println("Adding 800");
        start = new ObjectNode(800, start);  // automatic "boxing"
        System.out.println("Adding 3.14");
        start = new ObjectNode(3.14, start); // automatic "boxing"
        System.out.println("Adding true");
        start = new ObjectNode(true, start); // automatic "boxing"
        System.out.println("Adding \"OK\"");
        start = new ObjectNode("OK", start);

        System.out.println("\nList of data items entered in reverse...");
        ptr = start;
        while (ptr != null) {
            System.out.println(ptr.toString());
            ptr = ptr.getNext();
        }

    }  // main

}  // ObjectNode
