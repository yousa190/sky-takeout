package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @param employeeDTO
     */

    void save(EmployeeDTO employeeDTO);

    /**
     * 分页查询
     * @param queryDTO
     * @return
     */
    PageResult pageQurery(EmployeePageQueryDTO queryDTO);

    /**
     * 启用禁用
     * @param status
     * @param id
     */
    void enable(Integer status, Long id);

    /**
     * 查询员工
     * @param id
     * @return
     */
    Employee getEmpById(Long id);

    void update(EmployeeDTO employeeDTO);
}
