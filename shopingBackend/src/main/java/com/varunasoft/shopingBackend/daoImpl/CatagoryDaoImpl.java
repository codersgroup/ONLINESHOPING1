package com.varunasoft.shopingBackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.varunasoft.shopingBackend.dao.CatagoryDao;
import com.varunasoft.shopingBackend.dto.Catagory;


@Repository("catagoryDao")
public class CatagoryDaoImpl implements CatagoryDao {

	private static List<Catagory> Catagories=new ArrayList<>();
	
	static {
		Catagory catagory=new Catagory();
		catagory.setId(1);
		catagory.setName("Mobile");
		catagory.setDiscription("This mobile Discription");
		catagory.setImgUrl("url");
		catagory.setActive(true);
		
		Catagories.add(catagory);
		
		
		catagory=new Catagory();
		catagory.setId(2);
		catagory.setName("Laptop");
		catagory.setDiscription("This Laptop Discription");
		catagory.setImgUrl("url");
		catagory.setActive(true);
		
		Catagories.add(catagory);
		
		catagory=new Catagory();
		catagory.setId(3);
		catagory.setName("Television");
		catagory.setDiscription("This Television Discription");
		catagory.setImgUrl("url");
		catagory.setActive(true);
		
		Catagories.add(catagory);
	}
	
	
	@Override
	public List<Catagory> list() {
		
		return Catagories;
	}


	@Override
	public Catagory getCatagory(int id) {
		for(Catagory catagory: Catagories) {
			if(catagory.getId()==id)
				return catagory;
		}
		return null;
	}

}
