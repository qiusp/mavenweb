package config;

import lombok.Data;

@Data
public class Bean0 {

    private String name;

    public void run(){
        System.out.println("Bean0");
    }
}
