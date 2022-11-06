public class StringElement extends HTML{

    private String value;

    public StringElement(String value) {
        this.value = value;
    }
    @Override
    public String render() {
        return value;
    }
}
