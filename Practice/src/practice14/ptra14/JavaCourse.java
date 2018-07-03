package practice14.ptra14;

import practice14.common.Course;

public class JavaCourse implements Course {

	public String getCourseName() {
		return PREFIX+"Java";
	}
	public String[] getCourseUnit() {
		String[] courseunit = {"式と演算","制御構文","メゾッド","配列","オブジェクト指向","継承","高度な継承"};
		return courseunit;
	}
}
/*
 * ★ common.Courseを実装した、JavaCourseクラスを作成してください
 *
 * コース名称
 * 		「【Eラーニング】Java」
 * 単元
 * 		式と演算
 * 		制御構文
 * 		メソッド
 * 		配列
 * 		オブジェクト指向
 * 		継承
 * 		高度な継承
 */
