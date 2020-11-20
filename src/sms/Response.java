package sms;

public class Response {
	String group_id;
	String error_list;
	String success_count;
	String error_count;

	public static void main(String[] args) {
		String data = "{\"group_id\":\"R2GdBCjLcLtNSbha\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";

		data = data.replace("{", "");
		data = data.replace("}", "");
		

		String[] s = data.split(",");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}

		Response res = new Response();

	}
}
