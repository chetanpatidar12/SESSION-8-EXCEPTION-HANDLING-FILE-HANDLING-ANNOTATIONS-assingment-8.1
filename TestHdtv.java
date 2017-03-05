package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import com.java.collection.HdtvComprator.NameComprator;

public class TestHdtv {
	
	

	
	
	
	public static void main(String[] args) {
		
	
		List<Hdtv>  tvs=new ArrayList<>();

			
			tvs.add(new Hdtv("bpl", 50));
			tvs.add(new Hdtv("apple", 45));
			tvs.add(new Hdtv("samsung", 90));
			
			
			Collections.sort(tvs, new HdtvComprator());
			Iterator itr2=tvs.iterator();  
			while(itr2.hasNext()){  
			Hdtv st=(Hdtv)itr2.next();  
			System.out.println(st.size+" "+st.bandname+"");  	
			
			NameComprator n=new NameComprator();
			
			
			Collections.sort(tvs, n);
			Iterator itr=tvs.iterator();  
			while(itr.hasNext()){  
			Hdtv st1=(Hdtv)itr2.next();  
			System.out.println(st1.size+" "+st1.bandname+"");  
		
	}}
}
}
