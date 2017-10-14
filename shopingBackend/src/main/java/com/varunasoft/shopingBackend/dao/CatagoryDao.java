package com.varunasoft.shopingBackend.dao;

import java.util.List;

import com.varunasoft.shopingBackend.dto.Catagory;

public interface CatagoryDao
{
	public List<Catagory> list();
	
	public Catagory getCatagory(int id);

}
