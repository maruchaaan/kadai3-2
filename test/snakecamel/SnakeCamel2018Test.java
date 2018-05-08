package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamel2018Test {

	@Test
	public void snakeToCamelcaseでスネイクケースabc_def_ghiからキャメルケースAbcDefGhiに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGhi";
		String actual = scu.snakeToCamelcase("abc_def_ghi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakecaseでキャメルケースAbcDefGhiからスネイクケースabc_def_ghiに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = scu.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでabcからAbcに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.capitalize("abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでAbcからabcに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.uncapitalize("Abc");
		assertThat(actual, is(expected));
	}
}
