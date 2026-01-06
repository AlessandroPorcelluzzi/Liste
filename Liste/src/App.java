public class App {
    public static void main(String[] args) {

        Lista l = new Lista();

        l.addTail(new Nodo("mario"));
        l.addTail(new Nodo("giulio"));
        l.addHead(new Nodo("francesco"));
        l.add("juve magica juve");

        System.out.println(l);
        System.out.println(l.toReverseString());

        System.out.println("Esiste 'mario'? " + l.exists("mario"));
        System.out.println("Esiste 'anna'? " + l.exists("anna"));

        System.out.println("Rimuovo 'giulio'");
        l.remove("giulio");

        System.out.println(l);
        System.out.println(l.toReverseString());
    }
}
