package Sprint4_4.Theme3_5.Lesson4_8;

public class MobilePhone extends Phone {

    private final String number;

    public MobilePhone(String number) {
        super(number);
        this.number = number;
    }

    public void sendMessange(String messageText, String targetNumber) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }

    @Override
    public void makeCall(String targetNumber) {
        System.out.println("Звоним с номера " + number);
        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }
}
