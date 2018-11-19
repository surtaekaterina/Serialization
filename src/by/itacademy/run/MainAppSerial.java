package by.itacademy.run;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class MainAppSerial {

	private static void serializeObject(Object obj) {

		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("user"))) {

			// String str = "Hello world!";
			os.writeObject(obj);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static Object deSerializeObject() {
		Object obj = null;
		// FileInputStream fis = null;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user"))) {
			obj = ois.readObject();
			// String srt2 = (String) ois.readObject();
			// System.out.println(srt2);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return obj;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		User user = new User("Igor Blinov");
		User user1 = new User("Pavel Pavlov", new Adress("Minsk"));
		//serializeObject(user);
		serializeObject(user1);
		// String str = (String)deSerializeObject();
		// System.out.println(str);
		User user2 = (User) deSerializeObject();
		System.out.println(user2);
	}

}



