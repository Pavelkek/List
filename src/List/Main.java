package List;

public class Main {
    public static void main(String[] args){
        StockArrayList<String> st = new StockArrayList<>();
        st.add("Товар 1");
        st.add("Товар 2");
        for(String s : st){
            System.out.println(s);
        }
        StockLinkedList<String> str = new StockLinkedList<>();
        str.add("Товар 3");
        str.add("Товар 4");
        for(String s : str){
            System.out.println(s);
        }

    }
}
