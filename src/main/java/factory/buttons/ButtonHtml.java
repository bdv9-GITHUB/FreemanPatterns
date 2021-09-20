package factory.buttons;

/**
 * Реализация HTML кнопок.
 */
public class ButtonHtml implements Button {
    @Override
    public void onClick() {
        System.out.println("HtmlButton click!!!");
    }
}
