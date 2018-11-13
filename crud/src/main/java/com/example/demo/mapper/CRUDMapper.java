package com.example.demo.mapper;

import com.example.demo.entity.DbcenterSequence;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CRUDMapper {

    /**
     * 获取所有序列
     *
     * @return 所有序列
     */
    List<DbcenterSequence> getAllDbcenterSequence(@Param("page") int page,@Param("size") int size );

    /**
     * 增
     * @param ds DbcenterSequence
     * @return Affected rows
     */
    int insertData(DbcenterSequence ds);

    /**
     * 改
     * @param ds DbcenterSequence
     * @return Affected rows
     */
    int updateData(DbcenterSequence ds);

    /**
     * 删
     * @param UUID DbcenterSequence
     * @return Affected rows
     */
    int deleteData(String UUID);

    /**
     * 全文检索
     * @param desc 描述
     * @return DbcenterSequence
     */
    DbcenterSequence searchDesc(String desc);



}
