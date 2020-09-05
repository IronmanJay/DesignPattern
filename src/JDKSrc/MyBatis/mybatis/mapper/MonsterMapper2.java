package JDKSrc.MyBatis.mybatis.mapper;

import JDKSrc.MyBatis.mybatis.entity.Monster2;

import java.util.List;


public interface MonsterMapper2 {

    //添加方法
    public void addMonster(Monster2 monster);

    //查询所有的Monster
    public List<Monster2> findAllMonster();


}
