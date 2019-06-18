package eight;

class BonusTime {

    private BonusTime() {

    }

    public static String bonusTime(int salary, boolean bonus) {
//        return bonus ? "�" + 10 * salary : "�" + salary;
        int finalSalary = salary;

        if (bonus) {
            finalSalary = salary * 10;
        }

        return "\u00A3" + String.valueOf(finalSalary);

    }
}
