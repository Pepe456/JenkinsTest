import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class PrimeGeneratorTest {

	@Test
	public void testZero() {
		int input = 0;
		List<Integer> result = Arrays.asList(0);
		assertThat(PrimeGenerator.generate(input), is(result));		
	}
	
	@Test
	public void testOne() {
		int input = 1;
		List<Integer> result = Arrays.asList(1);
		assertThat(PrimeGenerator.generate(input), is(result));		
	}
	
	@Test
	public void testFour() {
		int input = 4;
		List<Integer> result = Arrays.asList(2,2);
		assertThat(PrimeGenerator.generate(input), is(result));		
	}
	
	@Test
	public void testSix() {
		int input = 6;
		List<Integer> result = Arrays.asList(2,3);
		assertThat(PrimeGenerator.generate(input), is(result));		
	}
	
	@Test
	public void testEight() {
		int input = 8;
		List<Integer> result = Arrays.asList(2,2,2);
		List<Integer> generate = PrimeGenerator.generate(input);
		assertThat(generate, is(result));		
	}
	
	

}
