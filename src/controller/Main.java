package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.TreeMap;

import dao.SkillDAO;
import model.Skill;

public class Main
{
	public static void main(String args[])throws Exception
	{
		SkillDAO skilldao = new SkillDAO();
		
		TreeMap<Integer,Skill> map = new TreeMap<Integer,Skill>();
		map=skilldao.skillCount();
		System.out.println("Skill"+"\t"+"Players");
		
		for(Entry<Integer,Skill> e: map.entrySet())
		{
			int  count=e.getKey();
			Skill skill=e.getValue();
			System.out.println(skill.getSkillName() + "\t" + count);
		}	
	}
}
