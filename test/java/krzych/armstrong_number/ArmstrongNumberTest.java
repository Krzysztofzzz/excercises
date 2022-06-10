package krzych.armstrong_number;

import org.junit.Assert;
import org.junit.Test;

public class ArmstrongNumberTest {

    private ArmstrongNumber armstrongNumber = new ArmstrongNumber();

    @Test
    public void whenNumberIsArmstrongNumberReturnTrue() {
        Assert.assertTrue(armstrongNumber.isArmstrong(0));
        Assert.assertTrue(armstrongNumber.isArmstrong(1));
        Assert.assertTrue(armstrongNumber.isArmstrong(153));
        Assert.assertTrue(armstrongNumber.isArmstrong(370));
        Assert.assertTrue(armstrongNumber.isArmstrong(371));
        Assert.assertTrue(armstrongNumber.isArmstrong(407));
    }

    @Test
    public void whenNumberIsNotArmstrongNumberReturnFalse() {
        Assert.assertFalse(armstrongNumber.isArmstrong(234));
        Assert.assertFalse(armstrongNumber.isArmstrong(2));
        Assert.assertFalse(armstrongNumber.isArmstrong(23));
        Assert.assertFalse(armstrongNumber.isArmstrong(1241124));
    }
}