import java.util.*; 
public class Set_example<T>
{ 
    public Set<T> a;
    public Set<T> b;
    public Set<T> result;
	public static void main(String args[]) 
	{ 
	    //This code is for String operations on set
	    Set_example<String> s=new Set_example<String>();
		s.a = new HashSet<String>(); 
		s.a.addAll(Arrays.asList(new String[] { "A", "B", "C", "D" })); 
		s.b = new HashSet<String>(); 
		s.b.addAll(Arrays.asList(new String[] { "q", "B", "C", "D" })); 
		s.result=s.union(s.a,s.b);
		System.out.print("result of the two Set"); 
		System.out.println(s.result); 
		
		s.result=s.intersection(s.a,s.b);
		System.out.print("result of the two Set"); 
		System.out.println(s.result);
		
		s.result=s.difference(s.a,s.b);
		System.out.print("result of the two Set"); 
		System.out.println(s.result);
		
		
		//This code is for integer operations on set
		Set_example<Integer> s1=new Set_example<Integer>();
		s1.a = new HashSet<Integer>(); 
        s1.a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0})); 
        s1.b = new HashSet<Integer>(); 
        s1.b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5})); 
        
        s1.result=s.union(s1.a,s1.b);
		System.out.print("result of the two Set"); 
		System.out.println(s1.result); 
		
		s1.result=s1.intersection(s1.a,s1.b);
		System.out.print("result of the two Set"); 
		System.out.println(s1.result);
		
		s1.result=s.difference(s1.a,s1.b);
		System.out.print("result of the two Set"); 
		System.out.println(s1.result);
	} 
	public Set union(Set x,Set y)
	{
	    Set<T> u = new HashSet<T>(x); 
		u.addAll(y); 
		return u;
	}
	public Set intersection(Set x,Set y)
	{
	    Set<T> i = new HashSet<T>(x); 
		i.retainAll(y); 
		return i;
	}
	public Set difference(Set x,Set y)
	{
	    Set<T> d = new HashSet<T>(x); 
		d.removeAll(y); 
		return d;
	}
} 

