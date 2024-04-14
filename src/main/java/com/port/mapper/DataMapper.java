package com.port.mapper;


import com.port.entity.DataUnit;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import java.util.Map;

@Mapper
public interface DataMapper {
    @Select("select id, name, reported_ETA, latest_position from mtraffic_ningbo where id <= ${page * pageSize} and id > ${(page - 1) * pageSize}")
    List<Map<String, Object>> selectNingBo(Integer page, Integer pageSize);
    @Select("SELECT * from mtraffic_ningbo where id = #{id}")
    DataUnit findByIdNingBo(Integer id);
    @Select("select id, name, reported_ETA, latest_position from mtraffic_shanghai where id <= ${page * pageSize} and id > ${(page - 1) * pageSize}")
    List<Map<String, Object>> selectShangHai(Integer page, Integer pageSize);
    @Select("SELECT * from mtraffic_shanghai where id = #{id}")
    DataUnit findByIdShangHai(Integer id);
}
