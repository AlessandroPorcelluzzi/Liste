public class Lista {
    private Nodo root; // testa
    private Nodo tail; // coda

    public Lista() {
        root = null;
        tail = null;
    }

    public void add(String s) {
        addTail(new Nodo(s));
    }

    public void addHead(Nodo n) {
        if (root == null) {
            root = tail = n;
            return;
        }
        n.setNext(root);
        root.setPrev(n);
        root = n;
    }

    public void addTail(Nodo n) {
        if (root == null) {
            root = tail = n;
            return;
        }
        tail.setNext(n);
        n.setPrev(tail);
        tail = n;
    }


    public void remove(String s) {
        Nodo temp = root;

        while (temp != null) {
            if (temp.getValue().equals(s)) {

                if (temp == root) {
                    root = temp.getNext();
                    if (root != null) root.setPrev(null);
                } 
                else if (temp == tail) {
                    tail = temp.getPrev();
                    if (tail != null) tail.setNext(null);
                } 
                else {
                    temp.getPrev().setNext(temp.getNext());
                    temp.getNext().setPrev(temp.getPrev());
                }
                return;
            }
            temp = temp.getNext();
        }
    }

    
    public boolean exists(String s) {
        Nodo temp = root;
        while (temp != null) {
            if (temp.getValue().equals(s))
                return true;
            temp = temp.getNext();
        }
        return false;
    }

 
    public String toString() {
        String s = "Lista (avanti): ";
        Nodo temp = root;
        while (temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getNext();
        }
        return s;
    }

    public String toReverseString() {
        String s = "Lista (indietro): ";
        Nodo temp = tail;
        while (temp != null) {
            s += temp.getValue() + " - ";
            temp = temp.getPrev();
        }
        return s;
    }
}
