package exercise_20_date;

import java.time.Instant;
import java.util.Date;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Date moment1 = Date.from(Instant.parse("2018-06-21T13:05:44-03:00"));
		String title1 = "Traveling to New Zealand";
		String content1 = "I'm going to visit this wonderful country!";
		int likes1 = 12;
		Post post1 = new Post(moment1, title1, content1, likes1);
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome!"));

		System.out.println(post1);
		
		Date moment2 = Date.from(Instant.parse("2018-07-28T23:14:19-03:00"));
		String title2 = "Good night guys";
		String content2 = "See you tomorrow";
		int likes2 = 5;
		Post post2 = new Post(moment2, title2, content2, likes2);
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post2);
	}

}
