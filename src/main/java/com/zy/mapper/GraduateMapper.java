package com.zy.mapper;

import com.zy.model.Graduate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface GraduateMapper {
    /**
     * show all graduates
     *
     * @return
     */
    public List<Graduate> showAllGrad();

    /**
     * search a graduate with num
     *
     * @param num
     * @return
     */
    public Graduate searchNum(String num);

    /**
     * search a graduate with id
     *
     * @param id
     * @return
     */
    public Graduate searchId(String id);

    /**
     * search a graduate with name
     *
     * @param name
     * @return
     */
    public Graduate searchName(String name);

    /**
     * insert a graduate.
     *
     * @param num
     * @param id
     * @param name
     * @param age
     * @param phone
     * @param academy
     * @param major
     * @return
     */
    int insertGraduate(String num, String id, String name, int age, String phone, String academy, String major);

    /**
     * delete a graduate by id.
     *
     * @param id
     * @return
     */
    int deleteGraduateId(String id);

    /**
     * delete a graduate by num.
     *
     * @param num
     * @return
     */
    int deleteGraduateNum(String num);

    /**
     * delete a graduate by name
     *
     * @param name
     * @return
     */
    int deleteGraduateName(String name);

    /**
     * update a graduate by num
     *
     * @param num
     * @param name
     * @param age
     * @param phone
     * @param academy
     * @param major
     * @return
     */
    int updateGraduateNum(String name, int age, String phone, String academy, String major, String num);

}
