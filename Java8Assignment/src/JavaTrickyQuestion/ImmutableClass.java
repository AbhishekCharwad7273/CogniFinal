package JavaTrickyQuestion;

final class ImmutableDemo {

	private final int id;
	private final String name;

	public ImmutableDemo(int id, String name) {

		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

public final class ImmutableClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImmutableDemo obj = new ImmutableDemo(1, "Abhi");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}

}
