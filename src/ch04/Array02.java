package ch04;

class Job {

}

class Police extends Job {
	String name = "°æÂû";
}

class Doctor extends Job {
	String name = "ÀÇ»ç";
}

public class Array02 {
	public static void main(String[] args) {
		Job[] j = new Job[2];
		j[0] = new Police();
		j[1] = new Doctor();
		
		
	}

}
