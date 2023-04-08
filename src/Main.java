public class Main {
    public static void main(String[] args) {
        int check = 100; // у клиента на счету 100 р.
        int refill = 1800; // пополнение счета на такую сумму

        int bonus = 0; // расчет бонуса
        if (refill > 1000) {
            bonus = refill / 100;
        }
        int finalBalance = check + refill + bonus;
        System.out.println("Баланс:" + finalBalance);
        System.out.println("Бонус:" + bonus);
    }
}