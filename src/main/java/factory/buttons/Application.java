package factory.buttons;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Application {
    private static Dialog dialog;

    public static void main(String[] args) {
        /**
         * Приложение создаёт определённую фабрику в зависимости от конфигурации или
         * окружения.
         */
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new DialogWindows();
        } else {
            dialog = new DialogHtml();
        }

        /**
         * Весь остальной клиентский код работает с фабрикой и продуктами только
         * через общий интерфейс, поэтому для него неважно какая фабрика была
         * создана.
         */
        dialog.render();
    }
}
