package factory.buttons;

/**
 * Реализация нативных кнопок операционной системы.
 */
public class ButtonWindows implements Button {
    @Override
    public void onClick() {
        System.out.println("Windows button click!!!");
    }
}
