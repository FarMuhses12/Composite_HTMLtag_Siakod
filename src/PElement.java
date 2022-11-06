public class PElement extends HtmlTag{

    @Override
    public String render() {
        return "<p>" + super.render() + "</p>";
    }
}
