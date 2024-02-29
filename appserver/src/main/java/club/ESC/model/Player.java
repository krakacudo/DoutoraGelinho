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
