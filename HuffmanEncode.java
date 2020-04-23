public class HuffmanEncode {
    // huffman_expand takes a file in bit-string form and a Huffman encoding tree
    // to expand the bit-string file
    public static String huffman_expand(file, tree) {

        EncodeNode node = tree;
        int cur_bit = read_bit(file);
        String str_out = "";
        while (cur != -1) {
            if (node.isExternal()) {
                str_out += node.getChar();
                node = r;
            }
            if (cur == 0) {node = node.getLeft();}
            else if (cur == 1) {node = node.getRight();}
            }
        } 
    }
    public static void main (String [] args) {
        EncodeNode r1 = new EncodeNode(null, )
        EncodeNode tree = 
    }
}