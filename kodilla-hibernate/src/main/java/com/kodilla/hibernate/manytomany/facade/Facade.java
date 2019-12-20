package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    public CompanyDao companyDao;

    @Autowired
    public EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> getCompanyBySomeName(String name) throws NotFoundExceptionCE {
        List<Company> companies = companyDao.retrieveCompanies3Characters(name);
        LOGGER.info("Searching for company containing letters " + name);
        if (companies.size() <= 0) {
            LOGGER.error(NotFoundExceptionCE.ERR_NOT_FOUND_COMPANY);
            throw new NotFoundExceptionCE(NotFoundExceptionCE.ERR_NOT_FOUND_COMPANY);
        }
        LOGGER.info("Company was found! " + companies);
        return companies;
    }

    public List<Employee> getEmployeeBySomeName(String lastName) throws NotFoundExceptionCE {
        List<Employee> employees = employeeDao.retrieveEmployeesWithLastname(lastName);
        LOGGER.info("Searching for employee with names containing letters " + lastName);
        if (employees.size() <= 0) {
            LOGGER.error(NotFoundExceptionCE.ERR_NOT_FOUND_EMPLOYEE);
            throw new NotFoundExceptionCE(NotFoundExceptionCE.ERR_NOT_FOUND_EMPLOYEE);
        }
        LOGGER.info("Employee was found! " + employees);
        return employees;
    }
}
