/*
 * PatternGenerator.java
 * 
 * Copyright 2018 Robert Micheals <robert@parrot>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.*;

class main {
	
	static int V2;
	static int V1;
	static int init;
		
	public static void main (String[] args) {
		
		initiate();
		//testbox();
		alg();
		
	}


	
	public static void initiate() {
		Random initialrng = new Random();
		init = initialrng.nextInt(5);
		System.out.println("Initial:" + init);
		
		Random firstrng = new Random();
		V1 = firstrng.nextInt(30)+1;
		
		Random secrng = new Random();
		V2 = secrng.nextInt(30)+1;
	}



	
	public static void testbox() {
		/*
		double tst = Math.round(4.5);
		int wyoming = (int) tst;
		System.out.println(wyoming);
		
		double y = Math.log(4);
		System.out.println(y);
		*/
	}
	
	public static void alg() {
		
		int Vmulti = V1 * V2;
		double Vlog = Math.log(Vmulti);
		int Vlog2 = (int) Math.round(Vlog);
		System.out.println("Repeater:" + Vlog2);
		for (init=init; init <= 40; init=init) {
			init = init + Vlog2;
			System.out.println(init);
		}
	}
}
