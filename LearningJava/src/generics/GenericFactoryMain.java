package generics;

public class GenericFactoryMain {

	public static void main(String[] args) throws IllegalAccessException, InstantiationException {
		GenericFactory<SampleClass> gf = new GenericFactory<SampleClass>(SampleClass.class);

		SampleClass sc = gf.createInstance();
		
		System.out.println(sc);
		
		
		////
		SampleClass sc2 = new SampleClass();
		System.out.println(sc2);
		
		SampleClass sc3 = SampleClass.class.newInstance();
		System.out.println(sc3);
	}

}
