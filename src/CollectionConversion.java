import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CollectionConversion {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	al.add("A");
	al.add("B");
	
	HashMap<Integer,String> hm= new HashMap<>();
	hm.put(al.size(), al.get(0));
	//Map to ArrayList
/*	HashMap<Integer,String> hm= new HashMap<>();
	hm.put(1, "A");
	hm.put(2, "D");
	hm.put(0, "S");
	
	Set<Integer> s=hm.keySet();
	ArrayList<Integer> a=new ArrayList<>(s);
	System.out.println(a);
	
	Collection<String> c=hm.values();
	ArrayList<String> al1=new ArrayList<>(c);
	System.out.println(al1);*/
	
}
}
