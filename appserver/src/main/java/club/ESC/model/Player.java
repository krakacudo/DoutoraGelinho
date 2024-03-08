package club.ESC.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Player {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private int age;
    @Field
    private String rank;
    @Field
    private String division;
    @Field
    private int lp;

    public Player(String name, int age, String rank, String division, int lp){
        this.name=name;
        this.age=age;
        this.rank=rank;
        this.division=division;
        this.lp=lp;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getRank(){
        return rank;
    }

    public String getDivision(){
        return division;
    }
    
    public int getLP(){
        return lp;
    }
    
}
