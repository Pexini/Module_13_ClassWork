package OutOFMemory;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> hugeList = new LinkedList<>();
        while (true) {
            hugeList.add("Ha-ha out of memory");
        }
    }
}
