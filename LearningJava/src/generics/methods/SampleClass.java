package generics.methods;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

public class SampleClass {
public static<T> T AddandReturn(T element, Collection<T> c)
{
	c.add(element);
	return element;
	
}
	
	public static void main(String[] args)
	{
		String sel="abc";
		List<String> l=new ArrayList<String>();
		String s=SampleClass.AddandReturn(sel, l);
		System.out.println(s);
		
		Integer iel=new Integer(123);
		List<Integer> l1=new ArrayList<Integer>();
		Integer i=SampleClass.AddandReturn(iel, l1);
		System.out.println(i);
		
		
		
	}
}
