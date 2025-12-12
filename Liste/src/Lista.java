public class Lista {
    Nodo root;

    public Lista(){
        root = null;
    }
    
    public void add(String s){
        Nodo n = new Nodo(s);
        addTail(n);
    }

    public void addHead (Nodo n) {
       Nodo tmp = root;
        root=n;
        n.setNext(tmp);
    }



    public void addTail (Nodo n) {
        if (root==null) {
            root=n;
            return;
        }

        Nodo temp= root;
        while (temp.getNext()!=null) temp=temp.getNext();
        temp.setNext(n);
    }

    public void remove(String s){

    }

    public boolean exists(String s){
        return true;
    }

    public String toString() {
        String s="la lista contiene:";
        Nodo temp=root;
        while (temp!=null) {
            s+=temp.getValue()+" - ";
            temp=temp.getNext();
        }
        return s + "\n";
    }

}
