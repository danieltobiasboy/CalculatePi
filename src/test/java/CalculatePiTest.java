import org.junit.jupiter.api.Test;
import org.tinyprojects.CalculatePiUtils;

public class CalculatePiTest {

    @Test
    void testCalculatePi_0_DecimalPoints() {
        double result = CalculatePiUtils.calculatePiToNthDecimalPoint(0);

        assert result == 3.0;
    }

    @Test
    void testCalculatePiManager_1_DecimalPoints() {
        double result = CalculatePiUtils.calculatePiToNthDecimalPoint(1);

        assert result == 3.1;
    }

    @Test
    void testCalculatePiManager_2_DecimalPoints() {
        double result = CalculatePiUtils.calculatePiToNthDecimalPoint(2);

        assert result == 3.14;
    }

    @Test
    void testCalculatePiManager_3_DecimalPoints() {
        double result = CalculatePiUtils.calculatePiToNthDecimalPoint(3);

        assert result == 3.142;
    }

    @Test
    void testCalculatePiManager_4_DecimalPoints() {
        double result = CalculatePiUtils.calculatePiToNthDecimalPoint(4);

        assert result == 3.1416;
    }

    @Test
    void testCalculatePiManager_5_DecimalPoints() {
        double result = CalculatePiUtils.calculatePiToNthDecimalPoint(5);

        assert result == 3.14159;
    }

    @Test
    void testCalculatePiManager_6_DecimalPoints() {
        double result = CalculatePiUtils.calculatePiToNthDecimalPoint(6);

        assert result == 3.141593;
    }

    @Test
    void testCalculatePiManager_7_DecimalPoints() {
        double result = CalculatePiUtils.calculatePiToNthDecimalPoint(7);

        assert result == 3.1415927;
    }

    @Test
    void testCalculatePiManager_8_DecimalPoints() {
        double result = CalculatePiUtils.calculatePiToNthDecimalPoint(8);

        assert result == 3.14159265;
    }

}
