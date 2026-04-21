public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {10, 0, -5, 5, 15, 2};
        runBubbleSort();
    }

    public static void runBubbleSort() {
        System.out.println("Metodo Burbuja");
        int[] numeros = {-5, 10, 2, 0, 7};

        BubbleSort bubbleSort = new BubbleSort();

        bubbleSort.printArreglo(numeros);
        System.out.println();

        bubbleSort.sortAscendente(numeros);
        bubbleSort.printArreglo(numeros);
        System.out.println();

        bubbleSort.sortDescendente(numeros);
        bubbleSort.printArreglo(numeros);
        System.out.println();

        bubbleSort.sort(numeros, true);
        bubbleSort.printArreglo(numeros);
        System.out.println();

        bubbleSort.sort(numeros, false);
        bubbleSort.printArreglo(numeros);
        System.out.println();
    }
}
