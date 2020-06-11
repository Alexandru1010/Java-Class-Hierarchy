package surprise;

import java.util.Random;

public class FortuneCookies implements ISurprise {

	private static final String[] sayings = {"\"To be natural is such a very difficult pose to keep up\" - Oscar Wilde. ",
						 					"\"Always be a first-rate version of yourself, instead of a second-rate version of somebody else\" - Judy Garldand.",
						 					"\"Your time is limited, so don't waste it living someone else's life\" - Steve Jobs",
						 					"\"Wherever you go, go with all your heart\" - Confucius",
						 					"\"Do your thing and don't care if they like it\" - Tina Fey",
						 					"\"Proverbs are short sentences drawn from long experience\" - Cervantes",
						 					"\"A proverb is one man's wit and all men's wisdom\" - Lord John Russell",
						 					"\"Friendship is always a sweet responsibility, never an opportunity\" - Khalil Gibran",
						 					"\"The language of friendship is not words but meanings\" - Henry David Thoreau",
						 					"\"I would rather walk with a friend in the dark, than alone in the light\" - Helen Kellen",
						 					"\"Arriving at one goal is the starting point to another\" - John Dewey",
						 					"\"If all you can do is crawl, start crawling\" - Rumi",
						 					"\"You don't have to be great to start, but you have to start to be great\" - Joe Sabah",
						 					"\"Learn from yesterday, live for today, hope for tomorrow\" - Albert Einstein",
						 					"\"The way to get started is to quit talking and begin doing\" - Walt Disney",
						 					"\"The brain is wider than the sky.\" - Emily Dickinson",
						 					"\"The happiness of your life depends upon the quality of your thoughts\" - Marcus Aurelius",
						 					"\"The deepest principle in human nature is the craving to be appreciated\" - Wiliam James",
						 					"\"An unexamined life is not worth living\" - Socrates",
						 					"\"Life is not always a matter of holding good cards, but sometimes, playing a poor hand well\" - Jack London"};
	private static final Random random = new Random();
	private  String saying;
	
	public FortuneCookies() {
		
	}
	public FortuneCookies(String message) {
		this.saying = message;
	}
	
	@Override
	public String toString() {
		 return "FortuneCookie";
	}
	
	@Override
	public void enjoy() {
		generate();
	}
	
	public FortuneCookies generate() {
		this.saying = FortuneCookies.sayings[random.nextInt(20)];
		FortuneCookies newCookies = new FortuneCookies(this.saying);
		System.out.println(this.saying);
		return newCookies;
	}
}
