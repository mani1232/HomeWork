/* TODO
    Задание 2
    ------------
    1) При помощи ArrayList создайте
    перечень товаров из 5-и наименований.
    2) Проверьте наличие одного из
    наименований в перечне.
    3) Сообщение о результатах как
    положительной, так и отрицательной
    проверки должно выводиться.
    4) Ввод поиска сделайте средствами
    Scanner.
    5) Формирование перечня, ввод поиска
    и вывод результата сделайте каждый в
    отдельном методе.
 */


package ArrayList.Task2;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Product> list = new ArrayList<>(5);

    public static void main(String[] args) {
        addDefaultProducts();

    }

    public static void addDefaultProducts() {
        list.add(new Product("Apples", true));
        list.add(new Product("Oranges", true));
        list.add(new Product("apricot", false));
        list.add(new Product("banana", false));
        list.add(new Product("kiwi", true));
    }

    public static void checkById(int id){
        if (list.get(id).inStock()) System.out.printf("%s inStock \n", list.get(id).name());
    }

}
