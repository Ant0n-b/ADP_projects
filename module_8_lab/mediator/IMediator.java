import java.util.List;

interface IMediator {
    void sendMessage(String message, Colleague colleague);
    void registerColleague(Colleague colleague);
    void sendPrivateMessage(String message, Colleague sender, Colleague recipient);
    void unregisterColleague(Colleague colleague);
}
