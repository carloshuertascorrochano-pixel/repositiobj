package insti;

public class institutoapp {
    public static void main(String[] args) {

        instituto Instituto = new instituto(" ", " ");
        instituto mariablasco = new instituto("mariablasco", "san vicente");

        mariablasco.setnombre(null);
        System.out.println(Instituto);
        System.out.println(mariablasco);

    }
}