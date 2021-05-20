package entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: Jingxv Zhang
 * 2021/5/20  10:22
 * TODO
 */
@Component
@Data
public class Dog {
    private  int id;
    private String name;
}
