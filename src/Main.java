public class Main {
    public static void main(String[] args) {
    Product product = new Product();
    product.addVacancy("First");
    product.addVacancy("Second");

    Observer firstSubscribe = new Subscriber("Denis");
    Observer secondSubscribe = new Subscriber("Ivan");

    product.addObserver(firstSubscribe);
    product.addObserver(secondSubscribe);

    product.addVacancy("Tree");
    product.removeObserver(firstSubscribe);
    product.removeVacancy("First");

    }
}
