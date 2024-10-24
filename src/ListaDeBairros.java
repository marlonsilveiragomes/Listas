import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaDeBairros {
    public static void main(String[] args) {
        ArrayList<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Itacorubi");
        listaArrayList.add("Santa Mônica");
        listaArrayList.add("Trindade");

        LinkedList<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Roçado");
        listaLinkedList.add("Kobrasol");

        System.out.println("Lista de Bairros ArrayList: " + listaArrayList);

        System.out.println("Lista de Bairros LinkedList: " + listaLinkedList);

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}
