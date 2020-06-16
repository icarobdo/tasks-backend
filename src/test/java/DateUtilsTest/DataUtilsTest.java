package DateUtilsTest;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import br.ce.wcaquino.taskbackend.utils.DateUtils;

public class DataUtilsTest {
	@Test
	public void deverRetornarTrueParaDataFutura() {
		LocalDate date = LocalDate.of(2030, 01, 01);
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void deverRetornarTrueParaDataPassada() {
		LocalDate date = LocalDate.of(2010, 01, 01);
		Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
	}
	
	@Test
	public void deverRetornarTrueParaDataPresente() {
		LocalDate date = LocalDate.now();
		Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
	}

}
