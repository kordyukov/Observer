import java.util.ArrayList;
import java.util.List;

public class Product implements Observed {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();;

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
           this.subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
           this.subscribers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: subscribers) {
            o.handleEvent(vacancies);
        }
    }
}
