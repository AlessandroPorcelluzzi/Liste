public class App {
    public static void main (String[] args){
        Lista l= new Lista();
        l.addTail(new Nodo ("mario"));
        l.addTail(new Nodo ("giulio"));
        l.addHead(new Nodo ("francesco"));
        l.add("juve magica juve");
        System.out.println (l);
     }
}
