public class DocumentManager {
    public IPrototype createDocument(IPrototype prototype) {
        return prototype.clone();
    }
}
