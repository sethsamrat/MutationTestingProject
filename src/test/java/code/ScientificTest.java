package code;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;



public class ScientificTest {
    Scientific g = new Scientific();

    @Test
    public void tsadd1()
    {
        Assert.assertEquals(35.0F + "", g.addition(27F, 8F) + "");
    }

    @Test
    public void tsadd2()
    {
        Assert.assertEquals(33.1F + "", g.addition(25.6F, 7.5F)+ "");
    }

    @Test
    public void tssub1()
    {
        Assert.assertEquals(30.0F+ "", g.subtraction(50F, 20F) + "");
    }

    @Test
    public void tssub2()
    {
        Assert.assertEquals(11.6F + "", g.subtraction(18.5F, 6.9F) + "");
    }

    @Test
    public void tsmul()
    {
        Assert.assertEquals(63.0F + "", g.multiply(9F, 7F) + "");
    }

    @Test
    public void tsmul2()
    {
        Assert.assertEquals(36.0F + "", g.multiply(12F, 3F) + "");
    }


    @Test
    public void tsdiv1()
    {
        Assert.assertEquals(5.0F + "", g.division(100F, 20F) + "");
    }

    @Test
    public void tsdiv2()
    {
        Assert.assertEquals(0.0F + "", g.division(63F, 0.0F) + "");
    }

    @Test
    public void tsdiv3()
    {
        Assert.assertEquals(4.0F + "", g.division(4.8F, 1.2F) + "");
    }

    @Test
    public void tsmod1()
    {
        Assert.assertEquals(3 + "", g.modulo(7, 4) + "");
    }

    @Test
    public void tsmod2()
    {
        Assert.assertEquals(-1 + "", g.modulo(7, 0) + "");
    }

    @Test
    public void tsmod3()
    {
        Assert.assertEquals(-1 + "", g.modulo(7, -4) + "");
    }

    @Test
    public void tssquare_it()
    {
        Assert.assertEquals(12.25F + "", g.square_it(3.5F) + "");
    }

    @Test
    public void tssqur1()
    {
        Assert.assertEquals(81F + "", g.square_it(9F) + "");
    }


    @Test
    public void tscub1()
    {
        Assert.assertEquals(27F + "", g.cube_it(3F) + "");
    }

    @Test
    public void ts_sq_root()
    {
        Assert.assertEquals(4F + "", g.square_root_it((float) 16F) + "");
    }

    @Test
    public void ts_sq_root2()
    {
        Assert.assertEquals(-1.0F + "", g.square_root_it((float) -8.9F)+ "");
    }

    @Test
    public void ts_cube_root()
    {
        Assert.assertEquals(3F + "", g.cube_root_it(27F) + "");
    }

    @Test
    public void tsfact1()
    {
        Assert.assertEquals(720, g.factorial_of_it(6));
    }

    @Test
    public void ts_fact2()
    {
        Assert.assertEquals(-1, g.factorial_of_it(-9));
    }


    @Test
    public void ts_inverse1()
    {
        Assert.assertEquals(0.04F + "", g.inverse_of_it(25) + "");
    }

    @Test
    public void ts_inverse2()
    {
        Assert.assertEquals(0.0F + "", g.inverse_of_it(0) + "");
    }

    @Test
    public void ts_pow_base_10()
    {
        Assert.assertEquals(100F + "", g.power_base_10(2) + "");
    }

    @Test
    public void ts_power10_1()
    {
        Assert.assertEquals(0.01F + "", g.power_base_10(-2) + "");
    }

    @Test
    public void ts_exp_of()
    {
        Assert.assertEquals(20.085537F + "", g.exponent_of(3)+ "");
    }

    @Test
    public void ts_perm()
    {
        Assert.assertEquals(12, g.permutations_of(4, 2));
    }

    @Test
    public void ts_perm_1()
    {
        Assert.assertEquals(-1, g.permutations_of(4, -1));
    }

    @Test
    public void tsperm_2()
    {
        Assert.assertEquals(-1, g.permutations_of(-1, 2));
    }

    @Test
    public void ts_perm_3()
    {
        Assert.assertEquals(-1, g.permutations_of(4, 6));
    }

    @Test
    public void tscomb()
    {
        Assert.assertEquals(6, g.combinations_of(4, 2));
    }

    @Test
    public void tscomb_1()
    {
        Assert.assertEquals(-1, g.combinations_of(4, -2));
    }

    @Test
    public void tscomb_2()
    {
        Assert.assertEquals(-1, g.combinations_of(4, 6));
    }

    @Test
    public void ts_comb_3()
    {
        Assert.assertEquals(-1, g.combinations_of(-4, 2));
    }

    @Test
    public void ts_equ()
    {

        Assert.assertEquals((float) -0.5 + "", g.solve_equations(2, 3, 1) + "");
    }

    @Test
    public void ts_equ1()
    {

        Assert.assertEquals((float) 0.0 + "", g.solve_equations(1, 1, 1) + "");
    }

    @Test
    public void ts_solve_equ2()
    {

        Assert.assertEquals((float) -1.0 + "", g.solve_equations(1, 2, 1) + "");
    }

    @Test
    public void ts_rad_to_degree()
    {
        Assert.assertEquals(57.32484F + "", g.rad_to_degree(1) + "");
    }

    @Test
    public void ts_oct_to_bin1()
    {
        Assert.assertEquals(101110, g.oct_to_bin(56));
    }

    @Test
    public void ts_oct_to_bin2()
    {
        Assert.assertEquals(100, g.oct_to_bin(4));
    }

    @Test
    public void ts_dec_to_hex()
    {
        Assert.assertEquals("38", g.dec_to_hex(56));
    }

    @Test
    public void ts_dec_to_hex2()
    {
        Assert.assertEquals("-1", g.dec_to_hex(-4));
    }

    @Test
    public void ts_hex_to_dec()
    {
        Assert.assertEquals(162, g.hex_to_dec("A2"));
    }

    @Test
    public void ts_oct_to_dec()
    {
        Assert.assertEquals(32, g.oct_to_dec(40));
    }

    @Test
    public void ts_oct_to_bin()
    {
        Assert.assertEquals(110, g.oct_to_bin(6));
    }


    @Test
    public void ts_oct_to_hex()
    {
        Assert.assertEquals("1", g.oct_to_hex(1));
    }

    @Test
    public void ts_bin_to_dec()
    {
        Assert.assertEquals(4, g.bin_to_dec(4));
    }

    @Test
    public void ts_bin_to_hex()
    {
        Assert.assertEquals("4", g.bin_to_hex(4));
    }

    @Test
    public void ts_oct_to_bin3()
    {
        Assert.assertEquals(1000, g.oct_to_bin(10));
    }



    @Test
    public void ts_deg_to_rad()
    {
        Assert.assertEquals(3.14F + "", g.degree_to_rad(180) + "");
    }

    @Test
    public void ts_trigo_sin()
    {
        Assert.assertEquals(0.8509035F + "", g.trigo_sin(45) + "");
    }

    @Test
    public void tst_trigo_cosin()
    {
        Assert.assertEquals(0.52532196F + "", g.trigo_cosin(45) + "");
    }
    @Test
    public void ts_trigo_tan()
    {
        Assert.assertEquals(1.61977519F + "", g.trigo_tan(45) + "");
    }

    @Test
    public void tc1() {
        Assert.assertEquals(g.reScaleDouble(60.0), g.timeConverter("1", "Minutes", "Seconds"));
    }

    @Test
    public void tc2() {
        Assert.assertEquals(g.reScaleDouble(3600.0), g.timeConverter("1", "Hours", "Seconds"));
    }

    @Test
    public void tc3() {
        Assert.assertEquals(g.reScaleDouble(172800.0), g.timeConverter("2", "Days", "Seconds"));
    }

    @Test
    public void tc4() {
        Assert.assertEquals(g.reScaleDouble(1 / 604800.0), g.timeConverter("1", "Seconds", "Weeks"));
    }

    @Test
    public void tc5() {
        Assert.assertEquals(g.reScaleDouble(2.628e+6), g.timeConverter("1", "Months", "Seconds"));
    }

    @Test
    public void tc6() {
        Assert.assertEquals(g.reScaleDouble(1 / 3.154e+7), g.timeConverter("1", "Seconds", "Years"));
    }

    @Test
    public void tc7() {
        Assert.assertEquals(g.reScaleDouble(1 * 60.0), g.timeConverter("1", "Hours", "Minutes"));
    }

    @Test
    public void tc8() {
        Assert.assertEquals(g.reScaleDouble(1 / 60.0), g.timeConverter("1", "Minutes", "Hours"));
    }

    @Test
    public void tc9() {
        Assert.assertEquals(g.reScaleDouble(1440.0), g.timeConverter("1", "Days", "Minutes"));
    }

    @Test
    public void tc10() {
        Assert.assertEquals(g.reScaleDouble(1 / 10080.0), g.timeConverter("1", "Minutes", "Weeks"));
    }

    @Test
    public void tc11() {
        Assert.assertEquals(g.reScaleDouble(43800.0), g.timeConverter("1", "Months", "Minutes"));
    }

    @Test
    public void tc12() {
        Assert.assertEquals(g.reScaleDouble(3.170577045022194E-8), g.timeConverter("1", "Seconds", "Years"));
    }

    @Test
    public void tc13() {
        Assert.assertEquals(g.reScaleDouble(1 / 3600.0), g.timeConverter("1", "Seconds", "Hours"));
    }

    @Test
    public void tc14() {
        Assert.assertEquals(g.reScaleDouble(1 * 60.0), g.timeConverter("1", "Hours", "Minutes"));
    }

    @Test
    public void tc15() {
        Assert.assertEquals(g.reScaleDouble(7.0), g.timeConverter("1", "Weeks", "Days"));
    }

    @Test
    public void tc16() {
        Assert.assertEquals(g.reScaleDouble(504.0), g.timeConverter("3", "Weeks", "Hours"));
    }

    @Test
    public void tc17() {
        Assert.assertEquals(g.reScaleDouble(1 / 730.0), g.timeConverter("1", "Hours", "Months"));
    }

    @Test
    public void tc18() {
        Assert.assertEquals(g.reScaleDouble(1 * 8760.0), g.timeConverter("1", "Years", "Hours"));
    }

    @Test
    public void tc19() {
        Assert.assertEquals(g.reScaleDouble(4 * 86400.0), g.timeConverter("4", "Days", "Seconds"));
    }

    @Test
    public void tc20() {
        Assert.assertEquals(g.reScaleDouble(8 * 1440.0), g.timeConverter("8", "Days", "Minutes"));
    }

    @Test
    public void tc21() {
        Assert.assertEquals(g.reScaleDouble(7 * 24.0), g.timeConverter("7", "Days", "Hours"));
    }

    @Test
    public void tc22() {
        Assert.assertEquals(g.reScaleDouble(5 * 7.0), g.timeConverter("5", "Weeks", "Days"));
    }

    @Test
    public void tc23() {
        Assert.assertEquals(g.reScaleDouble(1 / 30.417), g.timeConverter("1", "Days", "Months"));
    }

    @Test
    public void tc24() {
        Assert.assertEquals(g.reScaleDouble(7 * 365.0), g.timeConverter("7", "Years", "Days"));
    }

    @Test
    public void tc25() {
        Assert.assertEquals(g.reScaleDouble(3 * 604800.0), g.timeConverter("3", "Weeks", "Seconds"));
    }

    @Test
    public void tc26() {
        Assert.assertEquals(g.reScaleDouble(5 * 10080.0), g.timeConverter("5", "Weeks", "Minutes"));
    }

    @Test
    public void tc27() {
        Assert.assertEquals(g.reScaleDouble(7 * 168.0), g.timeConverter("7", "Weeks", "Hours"));
    }

    @Test
    public void tc28() {
        Assert.assertEquals(g.reScaleDouble(6 * 7.0), g.timeConverter("6", "Weeks", "Days"));
    }

    @Test
    public void tc29() {
        Assert.assertEquals(g.reScaleDouble(1 * 4.345), g.timeConverter("1", "Months", "Weeks"));
    }

    @Test
    public void tc30() {
        Assert.assertEquals(g.reScaleDouble(1 * 52.143), g.timeConverter("1", "Years", "Weeks"));
    }

    @Test
    public void tc31() {
        Assert.assertEquals("2628000", g.timeConverter("1", "Months", "Seconds"));
    }

    @Test
    public void tc32() {
        Assert.assertEquals(g.reScaleDouble(3 * 43800.0), g.timeConverter("3", "Months", "Minutes"));
    }

    @Test
    public void tc33() {
        Assert.assertEquals(g.reScaleDouble(7 * 730.0), g.timeConverter("7", "Months", "Hours"));
    }

    @Test
    public void tc34() {
        Assert.assertEquals(g.reScaleDouble(6 * 30.417), g.timeConverter("6", "Months", "Days"));
    }

    @Test
    public void tc35() {
        Assert.assertEquals(g.reScaleDouble(4 * 4.345), g.timeConverter("4", "Months", "Weeks"));
    }

    @Test
    public void tc36() {
        Assert.assertEquals(g.reScaleDouble(1 / 12.0), g.timeConverter("1", "Months", "Years"));
    }

    @Test
    public void tc37() {
        Assert.assertEquals(g.reScaleDouble(2 * 3.154e+7), g.timeConverter("2", "Years", "Seconds"));
    }

    @Test
    public void tc38() {
        Assert.assertEquals(g.reScaleDouble(3 * 525600.0), g.timeConverter("3", "Years", "Minutes"));
    }

    @Test
    public void tc39() {
        Assert.assertEquals(g.reScaleDouble(1 * 8760.0), g.timeConverter("1", "Years", "Hours"));
    }

    @Test
    public void tc40() {
        Assert.assertEquals(g.reScaleDouble(1 / 365.0), g.timeConverter("1", "Days", "Years"));
    }

    @Test
    public void tc41() {
        Assert.assertEquals("52.143", g.timeConverter("1", "Years", "Weeks"));
    }

    @Test
    public void tc42() {
        Assert.assertEquals(g.reScaleDouble(8 * 12.0), g.timeConverter("8", "Years", "Months"));
    }



}

