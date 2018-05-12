package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamel2018Test {

	@Test
	public void snakeToCamelcaseでスネイクケースabcからキャメルケースAbcに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.snakeToCamelcase("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelCaseでスネイクケースabc_defからキャメルケースAbcDefに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("abc_def");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelCaseでスネイクケースabc_def_ghからキャメルケースAbcDefGhに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = scu.snakeToCamelcase("abc_def_gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでスネイクケースabc__def__ghからキャメルケースAbcDefGhに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = scu.snakeToCamelcase("abc__def__gh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void snakeToCamelcaseでスネイクケース_abc_def__からキャメルケースAbcDefに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakeCaseでキャメルケースAbcDefGhiからスネイクケースabc_def_ghiに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_ghi";
		String actual = scu.camelToSnakecase("AbcDefGhi");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakeCaseでキャメルケースAbcからスネイクケースabcに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc";
		String actual = scu.camelToSnakecase("Abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakeCaseでキャメルケースAbcDefからスネイクケースabc_defに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = scu.camelToSnakecase("AbcDef");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void camelToSnakeCaseでキャメルケースAbcDefGhからスネイクケースabc_def_ghに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = scu.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでxyzからXyzに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = scu.capitalize("abc");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeで空文字から空文字に変更できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "";
		String actual = scu.capitalize("");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void capitalizeでaからAに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "A";
		String actual = scu.capitalize("a");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeで空文字から空文字に変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "";
		String actual = scu.uncapitalize("");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでXyzからxyzに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = scu.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
	
	@Test
	public void uncapitalizeでAからaに変換できる() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "a";
		String actual = scu.uncapitalize("A");
		assertThat(actual, is(expected));
	}
}
