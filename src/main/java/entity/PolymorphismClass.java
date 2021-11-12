package entity;

import java.util.List;

public class PolymorphismClass {		
		
		public List<String> message;
		
		public List<String> getMessage() {
			return message;
		}

		public void setMessage(List<String> message) {
			this.message = message;
		}

		public String printPolymorphism(String message) {
			String newMessage= message + " Polymorphism 1";
			return newMessage;
			
		}
		
		public String  printPolymorphism(String message, Integer number) {
			String newMessage= message + number + " Polymorphism 2";
			return newMessage;
			
		}

	}


