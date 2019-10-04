package dao;

import model.RoleOfficeKey;

public interface RoleOfficeMapper {
    int deleteByPrimaryKey(RoleOfficeKey key);

    int insert(RoleOfficeKey record);

    int insertSelective(RoleOfficeKey record);
}