import java.util.ArrayList;
public class DogKennel
	{
		static ArrayList <Dog> kennel = new ArrayList<Dog>();
		public static void main(String[] args)
			{
				fillArray();
			}

		private static void fillArray()
			{
				kennel.add(new Dog("George", "Boston Terrier", 3, 21));
				
			}

	}
