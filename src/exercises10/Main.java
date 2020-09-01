package exercises10;
/*
а) Создать класс Товар, имеющий переменные имя, цена, рейтинг.
б) Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
в) Создать класс Basket, содержащий массив купленных товаров.
г) Создать класс User, содержащий логин, пароль и объект класса Basket. Создать объект класса User.
(Интернет магазин)
 */

public class Main {
    public static void main(String[] args) {
        Product massProduct[] = new Product[5];
        Product massProduct1[] = new Product[5];
        Product apple = new Product("яблоко","156",10);
        Product product1 = new Product("апельсин","15",8);
        Product product2 = new Product("молоко","111",9);
        Product product3 = new Product("Хлеб","12",5);
        Product product4 = new Product("Сок","15",2);
        massProduct[0] = apple;
        massProduct[1] = product1;
        massProduct[2] = product2;
        massProduct[3] = product3;
        massProduct[4] = product4;

        massProduct1[0] = apple;
        massProduct1[1] = product1;
        massProduct1[2] = product2;
        massProduct1[3] = product3;
        massProduct1[4] = product4;


        Category category1 = new Category("продукты питания",massProduct);
        Category category2 = new Category("продукты питания",massProduct1);

        Basket basket1  = new Basket("продукты","1548",10,massProduct);

        User user = new User("admin","123",basket1);
    }
}
