
public class Dog
	{
		String name;
		String breed;
		int age;
		double weight;
		
		public Dog (String n, String b, int a, double w)
		{
			name = n;
			breed = b;
			age = a;
			weight = w;
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public String getBreed()
			{
				return breed;
			}

		public void setBreed(String breed)
			{
				this.breed = breed;
			}

		public int getAge()
			{
				return age;
			}

		public void setAge(int age)
			{
				this.age = age;
			}

		public double getWeight()
			{
				return weight;
			}

		public void setWeight(double weight)
			{
				this.weight = weight;
			}
		
	}
