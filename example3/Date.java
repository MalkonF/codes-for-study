package example3;

public class Date {

    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year) {

        if (month <= 0 || month > 12) {
            throw new IllegalArgumentException("month(" + month + ") must be 1-12");
        }

        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
            throw new IllegalArgumentException("day(" + day + ") out-of-range fo the specified month and year");//verifica se os dias estão corretos de acordo com a qnt de dias de cada mês(daysPerMonth)
        }
         //checa mês fev e ano bissexto
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-ange for the specified month and year");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        System.out.printf(
                "Date object constructor fo date %s%n", this); //chama o próprio obj q é o método toString
    }

    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}
