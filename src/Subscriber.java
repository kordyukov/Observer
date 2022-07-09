import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancy) {
        System.out.println("Привет " + name + " У нас есть некоторые изменения в вакансиях \n"+ vacancy);
    }
}
