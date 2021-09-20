package factory.buttons;

/**
 * Базовый класс фабрики. Заметьте, что "фабрика" – это всего лишь
 * дополнительная роль для класса. Он уже имеет какую-то бизнес-логику, в
 * которой требуется создание разнообразных продуктов.
 */
public abstract class Dialog {
    /**
     * Подклассы будут переопределять этот метод, чтобы создавать конкретные
     * объекты, разные для каждой фабрики.
     */
    public abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.onClick();
    }
}
