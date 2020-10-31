package com.zy.mapper;

import com.zy.model.Company;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CompanyMapper {
    /**
     * show all company
     * @return
     */
    List<Company> showAllCom();

    /**
     * search a company with id
     * @param id
     * @return
     */
    Company searchCompanyId(String id);

    /**
     * search a company with name
     * there will be more than one Company used the same name,so the result will be more than one object,
     * that's why we need to use list
     * @param name
     * @return
     */
    List<Company> searchCompanyName(String name);

    /**
     * insert a company
     * @param company
     * @return
     */
    int insertCompany(Company company);

    /**
     * delete a company by id.
     * @param id
     * @return
     */
    int deleteCompany(String id);

    /**
     * update a company
     * @param id
     * @param name
     * @param phone
     * @param addr
     * @return
     */
    int updateCompany(String id, String name,String phone, String addr);
}
