public class Main {
    public static void main(String[] args) {
        HtmlTag tag = new HtmlTag();
        DivElements divElements = new DivElements();
        tag.add(divElements);
        PElement p = new PElement();
        divElements.add(p);
        StringElement stringElement = new StringElement("Stroka 1");
        p.add(stringElement);
        System.out.println(tag.render());
    }
}