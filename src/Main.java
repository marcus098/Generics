public class Main {

    public static void main(String[] args) {
        ListaLinkata<String> listaLinkata = new ListaLinkata<>();
        listaLinkata.addFirst("ciao");
        listaLinkata.addFirst("come");
        listaLinkata.addFirst("come");
        System.out.println(listaLinkata);
        listaLinkata.removeFirst();
        System.out.println(listaLinkata);
    }
}
