public class SimpleLisp {

    class Pair {
        Object first;
        Object rest;

        Pair(Object f, Object r) {
            this.first = f;
            this.rest = r;
        }
    }

    String eval(String data) {
        return "";
    }

    String read(String data) {
        return "";
    }

    public static void main(String args) {
        System.out.print("Lisp REPL\n\n");
        System.out.print(">> ");
      
        StringBuffer buffer = new StringBuffer();
        while(fgets(buffer, 256, stdin)) {
            System.out.print(eval(read(buffer)));
            System.out.print(">> ");
        }      
    }
}