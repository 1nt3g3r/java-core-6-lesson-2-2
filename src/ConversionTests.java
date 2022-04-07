import java.math.BigDecimal;

public class ConversionTests {
    public static void main(String[] args) {
        float x = (float) -58888888888888999999999999999999999999988888888888.5d;
        System.out.println("x = " + x);

        int i = (int) 555555555555555551L;
        System.out.println("i = " + i);

        int intValue = (int) 5.7d;
        System.out.println("intValue = " + intValue);

        System.out.println("Math.round(5.7d) = " + Math.round(5.7d));

        float fValue = 0.3f + 0.3f + 0.1f + 0.2f;
        System.out.println("fValue = " + fValue);

        BigDecimal bdResult =
                new BigDecimal("0.3")
                .add(new BigDecimal("0.3"))
                .add(new BigDecimal("0.1"))
                .add(new BigDecimal("0.2"));
        System.out.println("bdResult = " + bdResult);
    }
}
