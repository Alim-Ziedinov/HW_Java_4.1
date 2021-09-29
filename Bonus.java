public class Bonus {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 15_000;
        int miles = service.calculate(price);
        String str = String.format("Ваш бонус составил: %s миль.", miles);
        System.out.println(str);
    }
}
