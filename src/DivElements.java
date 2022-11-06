public class DivElements extends HtmlTag{

    @Override
    public String render() {
        return "<div>" + super.render() + "</div>";
    }
}
