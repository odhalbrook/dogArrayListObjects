import java.util.ArrayList;
public class DogKennel
	{
		static ArrayList <Dog> kennel = new ArrayList<Dog>();
		public static void main(String[] args)
			{
				fillArray();
				printDog();
			}


		private static void fillArray()
			{
				kennel.add(new Dog("George", "Boston Terrier", 3, 21));
				kennel.add(new Dog("Larry", "French Bulldog", 2, 26));
				kennel.add(new Dog("Luke", "Pitbull", 1, 14));
				kennel.add(new Dog("John", "Beagle", 7, 15));
				kennel.add(new Dog("James", "Pug", 3, 28));
				
			}

		private static void printDog()
			{
				// TODO Auto-generated method stub
				
			}
	}
