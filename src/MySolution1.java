class MySolution1 {
    public Node connect(Node root) {
        Node nextH = null; // самый левый элемент в след строке
        Node head, cur, prev = null;

        head = root;
        while (head != null) {
            while (head != null) {

                if (head.left != null) {
                    cur = head.left;

                    if (prev != null) prev.next = cur;
                    prev = cur;

                    if (nextH == null)
                        nextH = cur;
                }
                if (head.right != null) {
                    cur = head.right;

                    if (prev != null) prev.next = cur;
                    prev = cur;

                    if (nextH == null)
                        nextH = head.right;
                }

                head = head.next;
            }
            head = nextH;
            prev = null;
            nextH = null;
        }
        return root;
    }
}