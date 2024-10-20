import java.util.ArrayList;
import java.util.List;

class ChatMediator implements IMediator {
    private List<Colleague> colleagues;
    private List<String> messageHistory;

    public ChatMediator() {
        this.colleagues = new ArrayList<>();
        this.messageHistory = new ArrayList<>();
    }

    public void registerColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void unregisterColleague(Colleague colleague) {
        colleagues.remove(colleague);
    }

    public void sendMessage(String message, Colleague sender) {
        messageHistory.add(message);
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receiveMessage(message);
            }
        }
    }

    public void sendPrivateMessage(String message, Colleague sender, Colleague recipient) {
        if (colleagues.contains(recipient)) {
            recipient.receiveMessage("Приватное сообщение от " + sender.getName() + ": " + message);
        }
    }

    public List<String> getMessageHistory() {
        return messageHistory;
    }
}