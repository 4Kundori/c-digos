import java.time.LocalDate;

public class Agendamento {
    public static void main(String[] args) {
        LocalDate base = LocalDate.of(2025, 6, 1);
        int days = 7;
        LocalDate newData = base.plusDays(days * 2 - 3);
        System.out.println(newData.getDayOfMonth());
    }
}
