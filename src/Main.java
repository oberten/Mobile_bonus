public class Main {
    public static void main(String[] args) {
        int balanc = 1100;
        int amount = 300;
        int totalBalanc = balanc + amount;

        int bonus;
        if (totalBalanc > 1000) {
            bonus = (totalBalanc / 100);
            System.out.println(totalBalanc);
            System.out.println(bonus);
        } else {
            bonus = (totalBalanc);
            System.out.println(totalBalanc);
            System.out.println(bonus = 0);
        }
    }
}








