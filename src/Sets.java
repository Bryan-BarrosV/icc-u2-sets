import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public Sets() {

    }

    public Set<String> construirHashSet() {
        Set<String> palabras = new HashSet<>();
        palabras.add("Laptop");
        palabras.add("Manzana");
        palabras.add("Pera");
        palabras.add("Celular");
        palabras.add("Laptop");
        palabras.add("Pera");
        palabras.add("Laptop");
        return palabras;
    }

    public Set<String> construirLinkedListHashSet() {
        Set<String> palabrasLinked = new HashSet<>();
        palabrasLinked.add("Laptop");
        palabrasLinked.add("Manzana");
        palabrasLinked.add("Pera");
        palabrasLinked.add("Celular");
        palabrasLinked.add("Laptop");
        palabrasLinked.add("Pera");
        palabrasLinked.add("Laptop");
        return palabrasLinked;
    }

    public Set<String> construirTreeSet() {
        Set<String> palabrasTree = new TreeSet<>();
        palabrasTree.add("Laptop");
        palabrasTree.add("Manzana");
        palabrasTree.add("Pera");
        palabrasTree.add("Celular");
        palabrasTree.add("Laptop");
        palabrasTree.add("Pera");
        palabrasTree.add("Laptop");
        return palabrasTree;
    }

    public Set<String> construirTreeSetConComparador() {
        //Crear un comparador
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //Primero - Compararamos la longitud
                int result = Integer.compare(s1.length(), s2.length());
                
                //Si tienen la misma longitud, comparamos alfabeticamente
                if(result == 0) {
                    return result = s1.compareToIgnoreCase(s2);
                }

                return result;
            }
        };
        
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");
        return miTreeSet;
    }
    
    public Set<String> construirTreeSetConComparadorInverso() {
        Comparator<String> comparadorLongitud = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int result = Integer.compare(s2.length(), s1.length());
                if(result == 0) {
                    return result = s2.compareToIgnoreCase(s1);
                }

                return result;
            }
        };
        
        Set<String> miTreeSet = new TreeSet<>(comparadorLongitud);
        miTreeSet.add("Laptop");
        miTreeSet.add("Manzana");
        miTreeSet.add("Pera");
        miTreeSet.add("Celular");
        miTreeSet.add("Laptop");
        miTreeSet.add("Pera");
        miTreeSet.add("Laptop");
        miTreeSet.add("Celulas");
        return miTreeSet;
    }
}