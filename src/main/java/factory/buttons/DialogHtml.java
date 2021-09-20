package factory.buttons;

public class DialogHtml extends Dialog {
    @Override
    public Button createButton() {
        return new ButtonHtml();
    }
}
