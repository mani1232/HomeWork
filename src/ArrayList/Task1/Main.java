package ArrayList.Task1;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Human> list = new ArrayList<>(5);


    public static void main(String[] args) {
        addDefaultHumans();
        showHumans();
    }

    public static void addDefaultHumans() {
        list.add(new Human("Alex", "454353535455"));
        list.add(new Human("Nikita", "15466456546"));
        list.add(new Human("Vasa", "549396564"));
        list.add(new Human("Lisa", "54654654645"));
        list.add(new Human("Nasty", "52187885461"));
    }

    public static void showHumans() {
        for (Human h : list) {
            System.out.printf("%s %s \n", h.name(), h.telephone());
        }
    }

}
