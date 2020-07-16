package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeMap;
import java.util.Map.Entry;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO
{
	public TreeMap<Integer,Skill> skillCount() throws Exception 
	{
		Connection con=ConnectionManager.getConnection();
		Statement st =  con.createStatement();
		TreeMap<Integer,Skill> map=new TreeMap<Integer,Skill>();	
		int raiding = 0;
		int defending = 0;
		int jumping = 0;
		
		ResultSet rs = st.executeQuery("SELECT * FROM PLAYER");		
		while(rs.next())
		{
			if(rs.getInt(4)==1)
			{
				jumping++;
			}
			else if(rs.getInt(4)==2)
			{
				defending++;
			}
			else if(rs.getInt(4)==3)
			{
				raiding++;
			}
		}
		Integer i1=new Integer(raiding);
		Integer i2=new Integer(defending);
		Integer i3=new Integer(jumping);
		
		Skill s1=new Skill((long)1,"raider");
		Skill s2=new Skill((long)2,"defender");
		Skill s3=new Skill((long)3,"jumper");
		
		map.put(i1,s1);
		map.put(i2,s2);
		map.put(i3,s3);
		con.close();	
		return map;
	
	}
	
}