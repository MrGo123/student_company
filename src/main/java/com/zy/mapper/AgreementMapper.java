package com.zy.mapper;

import com.zy.model.Agreement;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface AgreementMapper {
    /**
     * dao层，操作数据库
     *
     * @return
     */
    public List<Agreement> showAllAgr();

    /**
     * search an agreement with id;
     *
     * @param id
     * @return
     */
    public Agreement searchId(String id);

    /**
     * insertAgreement
     * @param agreement
     * @return
     */
    int insertAgreement(Agreement agreement);

    /**
     * delete an agreement
     * @param id
     * @return
     */
    int deleteAgreement(String id);

    /**
     * update an agreement
     * @param agreement
     * @return
     */
    int updateAgreement(Agreement agreement);
}
