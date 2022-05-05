package com.comcast.lambda;

@FunctionalInterface
interface IBooking {
	public void bookMyShow();
}

@FunctionalInterface
interface IShow {
	public void bookMyShow(String movie);
}

public class LambdaFirstDemo {

	public static void main(String[] args) {
		String movie = "cucumber";
		IBooking iBook = new IBooking() {
			@Override
			public void bookMyShow() {
				System.out.println("Book my show by iBook for " + movie);
			}
		};
		
		IBooking iBook1 = () -> {
			System.out.println("ok");
		};
		
		IShow iShow = (show) -> {
			System.out.println("Book my show by iShow for " + show);
		};
		
		iBook.bookMyShow();
		iBook1.bookMyShow();
		iShow.bookMyShow(movie);
	}

}
