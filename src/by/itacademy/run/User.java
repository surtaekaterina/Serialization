package by.itacademy.run;
import java.io.Serializable;

public class User implements Serializable {
	
		@SuppressWarnings("unused")
		private String name;
		private transient Adress adress;
		public final static int year = 2018;
		public static int id;
		

		public User(String name) {
			this.name = name;
		}

		public User(String name, Adress adress) {
			this.name = name;
			this.adress = adress;
		}

		@Override
		public String toString() {
			if (adress != null) {
				return "User [name=" + name + "]" + id + year +adress.toString();
			} else {
				return "User [name=" + name + "]";
			}
		}

	}

