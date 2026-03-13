package ListIter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListaIterador<S> {


    public static void main(String[] args) {

        ArrayList<String> ias = new ArrayList<>(Arrays.asList("ChatGPT", "Geminy", "copilot", "DEEPSEEK", "Perplexity"));

        ListIterator<String> it = ias.listIterator();

        while(it.hasNext()){

            System.out.println(it.nextIndex());
            String ia = it.next();
            System.out.println(it.nextIndex());
            System.out.println(ia);
        }

        while (it.hasPrevious()){

            String ia = it.previous();
            System.out.println(ia);

            if(ia.equals("Deepseek")){
                it.add("claude");
            }

        }


    }


}
