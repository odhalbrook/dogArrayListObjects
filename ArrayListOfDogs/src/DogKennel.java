import java.util.ArrayList;
public class DogKennel
	{
		static ArrayList <Dog> kennel = new ArrayList<Dog>();
		public static void main(String[] args)
			{
				fillArray();
				printDog();
				averages();
			}


		private static void fillArray()
			{
				kennel.add(new Dog("George", "Boston Terrier", 3, 21.4));
				kennel.add(new Dog("Larry", "French Bulldog", 2, 26.1));
				kennel.add(new Dog("Luke", "Pitbull", 1, 14.7));
				kennel.add(new Dog("John", "Beagle", 7, 15.5));
				kennel.add(new Dog("James", "Pug", 3, 28.3));
				
			}

		private static void printDog()
			{
				for(int i = 0; i < kennel.size(); i++)
					{
						System.out.println(kennel.get(i).getName() + " is a " + kennel.get(i).getBreed() + " and weighs " + kennel.get(i).getWeight() + " pounds.");
					}
				
			}
		
		private static void averages()
			{
				 double totalAge = 0;
				for(int i = 0; i < kennel.size(); i++)
					{
						totalAge = totalAge + kennel.get(i).getAge();
					}
				double averageAge = 0;
				
				averageAge = totalAge / kennel.size();
				
				System.out.println("The average age of all the dogs is " + averageAge + " pounds.");
				
				double totalWeight = 0;
				
				for(int i = 0; i < kennel.size(); i++)
					{
						totalWeight = totalWeight + kennel.get(i).getWeight();
					}
				System.out.println("and the combined weight is " + totalWeight + " pounds.");
			}
	}
