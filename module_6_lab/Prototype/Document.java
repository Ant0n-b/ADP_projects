import java.util.ArrayList;
import java.util.List;

public class Document implements IPrototype {
    private String title;
    private String content;
    private List<Section> sections;
    private List<Image> images;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
        this.sections = new ArrayList<>();
        this.images = new ArrayList<>();
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public void addImage(Image image) {
        images.add(image);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Section> getSections() {
        return sections;
    }

    public List<Image> getImages() {
        return images;
    }

    @Override
    public IPrototype clone() {
        Document clonedDoc = new Document(this.title, this.content);
        for (Section section : sections) {
            clonedDoc.addSection((Section) section.clone());
        }
        for (Image image : images) {
            clonedDoc.addImage((Image) image.clone());
        }
        return clonedDoc;
    }
}
