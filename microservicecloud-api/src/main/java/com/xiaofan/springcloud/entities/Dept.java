package com.xiaofan.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("serial")
@NoArgsConstructor//生成无参构造
@Data//生成set和get方法
@Accessors(chain=true)//链式写法
public class Dept implements Serializable { //必须序列化

    private Long  deptno;   //主键
    private String  dname;   //部门名称
    private String  db_source;//来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public static void main(String[] args) {
        Dept dept = new Dept();
        dept.setDeptno(11L).setDname("aaa");//链式写法
        System.out.println(dept);

    }

}
