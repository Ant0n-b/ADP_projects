public interface ISubject {
    void registerObserver(IObserver observer);  // Регистрация наблюдателя
    void removeObserver(IObserver observer);    // Удаление наблюдателя
    void notifyObservers();                     // Уведомление всех наблюдателей
}

