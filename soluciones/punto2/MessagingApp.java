public class MessagingApp {
    public static void main(String[] args) {
        MessageNotifier notifier = new MessageNotifier();

        Device phone = new Device("Celular");
        Device tablet = new Device("Tablet");
        Device laptop = new Device("Portátil");

        notifier.addObserver(phone);
        notifier.addObserver(tablet);

        notifier.receiveNewMessage("Mensaje 1 enviado");

        notifier.removeObserver(tablet);
        notifier.receiveNewMessage("Mensaje 2 sin notificar a la tablet");

        Device smartwatch = new Device("Reloj");
        notifier.addObserver(smartwatch);

        notifier.addObserver(laptop);
        notifier.receiveNewMessage("Mensaje 3 notificando al portátil, el reloj y el celular");

        notifier.addObserver(tablet);
        notifier.receiveNewMessage("Mensaje 4 notificando a todos los dispositivos");
    }
}
