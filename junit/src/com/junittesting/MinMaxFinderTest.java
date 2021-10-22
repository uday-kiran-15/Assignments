package com.junittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class MinMaxFinderTest {

		@Test
		//Taking positive values
		void test1() {
			MinMaxFinder o= new MinMaxFinder();
			int[] a= {5, 4, 87, 54 ,63 ,41 ,24 ,84 ,91};
			int[] expectedresult= {4,91};
			assertArrayEquals(expectedresult, o.findMinMax(a));
		}
		
		@Test
		// Taking same values
		void test2() {
			MinMaxFinder o= new MinMaxFinder();
			int[] a= {7,7,7,7,7,7,7,7,7};
			int[] expectedresult= {7,7};
			assertArrayEquals(expectedresult, o.findMinMax(a));
		}
		
		@Test
		// Taking Negative values
		void test3() {
			MinMaxFinder o= new MinMaxFinder();
			int[] a= {-5, -4, -88, -41, -63, -91, -74, -84, -51};
			int[] expectedresult= {-91,-4};
			assertArrayEquals(expectedresult, o.findMinMax(a));
		}
	}


