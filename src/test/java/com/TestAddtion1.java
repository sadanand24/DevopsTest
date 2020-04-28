package com;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.Addition1;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestAddtion1 {

	@Test
	public void testAdd() {
		Addition1 ad = new Addition1();
		Integer a = 5;
		Integer b = 5;
		System.out.println(a+b);
		Assertions.assertEquals(ad.add1(a, b), 10);
	}
	
}