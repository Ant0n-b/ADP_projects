public class Image implements IPrototype {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public IPrototype clone() {
        return new Image(this.url);
    }
}