public class Person {
	private final String name;
	private final int age;

	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}

	public String getName(){ return this.name;}
	public int getAge() { return this.age;}

	@Override
	public String toString(){
		return String.format("Hello my name is %s and I am %s years old",name,age);
	}
}