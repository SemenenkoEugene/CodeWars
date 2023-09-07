package Sprint4_4.Theme3_5.Lesson4_8;

public class Smartphone extends MobilePhone {

    private final String number;

    public Smartphone(String number) {
        super(number);
        this.number = number;
    }

    public void makeCall(String targetNumber, String appName) {
        System.out.println("Звоним с номера " + number);
        System.out.println("Позвоним через приложение " + appName + " по номеру " + targetNumber);
        System.out.println("Привет!");
    }

    public final void sendEmail(String email, String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

    @Override
    public void sendMessange(String messageText, String targetNumber) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }

}
