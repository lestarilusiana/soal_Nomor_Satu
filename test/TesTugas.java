/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fungsi_perhitungan.Fungsi_Hitung;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lusiana
 */
public class TesTugas {
    
    public TesTugas() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @SuppressWarnings("static-access")
    //@Test
    // public void hello() {}
    Fungsi_Hitung tes = new Fungsi_Hitung();
    @SuppressWarnings("static-access")
	//@Test
	public void getFaktorialTest() {
		double exp1 = 120;
		double act1 = tes.getFaktorial(5);
		assertEquals(exp1, act1,0);

		double exp2 = 0;
		double act2 = tes.getFaktorial(-5);
		assertEquals(exp2, act2,0);

		double exp3 = 720;
		double act3 = tes.getFaktorial(6);
		assertEquals(exp3, act3,0);
	}

	@SuppressWarnings("static-access")
	//@Test
	public void getPerkalianTest() {
		double expected1 = 30;
		double actual1 = tes.getPerkalian(5, 6);
		assertEquals(expected1, actual1,0);

		double expected2 = -30;
		double actual2 = tes.getPerkalian(-5, 6);
		assertEquals(expected2, actual2,0);
		
		double expected3= 30;
		double actual3= tes.getPerkalian(-5, -6);
		assertEquals(expected3, actual3,0);
	}
	
	@SuppressWarnings("static-access")
	//@Test
	public void getPerpangkatanTest() {
		double actual= tes.getPerpangkatan(3, 3);
		assertEquals(27, actual,0);
		
		double actual2= tes.getPerpangkatan(2, -2);
		assertEquals(0.25, actual2,0);
		
		double actual3= tes.getPerpangkatan(-2, 2);
		assertEquals(4, actual3,0);
		
		double actual4= tes.getPerpangkatan(-2, 3);
		assertEquals(-8, actual4,0);
	}
	
	@SuppressWarnings("static-access")
	//@Test
	public void getPermutasiTest() {
		double actual=tes.getPermutasi(5, 3);
		assertEquals(60, actual,0);
		
		double actual2=tes.getPermutasi(5, -3);
		assertEquals(0, actual2,0);
		
		double actual3=tes.getPermutasi(-5, 3);
		assertEquals(0, actual3,0);
		
		double actual4=tes.getPermutasi(-5, -3);
		assertEquals(0, actual4,0);
	}
        
        @SuppressWarnings("static-access")
	//@Test
        
        public void getRandomValueUniqTest(){
        int exp1 = 7;
        int act1 = tes.getRandomValueUniq(7).size();
        assertEquals(exp1, act1);
        
        int exp2 = 9;
        int act2 = tes.getRandomValueUniq(-9).size();
        assertEquals(exp2, act2);
        
        int exp3 = -7;
        int act3 = tes.getRandomValueUniq(-7).size();
        assertEquals(exp3, act3);
        }
        
        @SuppressWarnings("static-access")
	//@Test        
        public void getPrima(){
        int exp1 = 7;
        int act1 = tes.getRandomValueUniq(7).size();
        assertEquals(exp1, act1);
        
        int exp2 = 9;
        int act2 = tes.getRandomValueUniq(-9).size();
        assertEquals(exp2, act2);
        
        int exp3 = -7;
        int act3 = tes.getRandomValueUniq(-7).size();
        assertEquals(exp3, act3);
        }
        
        @SuppressWarnings("static-access")
	//@Test
        public void tesFibonacci(){
            ArrayList exp = new ArrayList();
            exp.add(0);
            exp.add(1);
            exp.add(1);
            exp.add(2);
            exp.add(3);
            ArrayList act = tes.getFibonacci(5);
            assertEquals(exp, act);
            
//            ArrayList exp1 = new ArrayList();
//            exp.add(0);
//            exp.add(1);
//            exp.add(2);
//            exp.add(2);
//            exp.add(3);
//            ArrayList act1 = tes.getFibonacci(5);
//            assertEquals(exp1, act1);
        }
        
        @SuppressWarnings("static-access")
	//@Test
        public void tesPrima(){
            ArrayList exp = new ArrayList();
            exp.add(2);
            exp.add(3);
            exp.add(5);
            exp.add(7);
            exp.add(11);
            ArrayList act = tes.getPrima(12);
            assertEquals(exp, act);
        }
        
        @SuppressWarnings("static-access")
	@Test
        public void tesPecahan(){
            int[][] exp=new int [10][2];
            exp[0][0]=(100000);
            exp[0][1]=(1);
            exp[1][0]=(50000);
            exp[1][1]=(1);
            exp[2][0]=(20000);
            exp[3][0]=(10000);
            exp[4][0]=(5000);
            exp[5][0]=(2000);
            exp[6][0]=(1000);
            exp[7][0]=(500);
            exp[8][0]=(200);
            exp[9][0]=(100);
            int[][] act = tes.getPecahan(150000);
            Assert.assertArrayEquals(exp, act);
        }
               
}
