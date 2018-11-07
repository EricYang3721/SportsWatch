package se.sportswatch.Models;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String name;
	private String email;
    private int[] favTeams;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setFavteams(int[] favTeams){
        // for(Team t : favTeams){
        //     this.favTeams.add(t);
        // }
        this.favTeams = favTeams;
    }

    public int[] getFavteams(){
        return favTeams;
	}
	
	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}


}