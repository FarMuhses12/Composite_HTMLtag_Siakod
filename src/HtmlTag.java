import java.util.ArrayList;
import java.util.List;

public class HtmlTag extends HTML {

    List<HTML> components = new ArrayList<>();

    public void add(HTML tag) {
        components.add(tag);
    }

    public void remove(HTML tag) {
        components.remove(tag);
    }
    @Override
    public String render() {
        String str = "";
        for (HTML c : components){
            str += c.render();
        }
        return str;
    }
}
