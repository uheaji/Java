package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Comment {
	private int id;
	private String content;
}
public class json01 {

	public static void main(String[] args) {
		// 자바 -> JSON(String) :호환이 쉽다 toJson
		Comment ct1 = new Comment(1,"댓글1");
		Gson gson = new Gson();
		String ct1Json = gson.toJson(ct1);
		System.out.println(ct1Json);

		
		// Json(String) -> 자바
		Comment ct2 = gson.fromJson(ct1Json, Comment.class);
		System.out.println(ct2.getId());
		System.out.println(ct2.getContent());
	}

}
