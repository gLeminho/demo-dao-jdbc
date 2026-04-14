package application;

import java.util.List;

import modelEntities.Department;
import modelDao.DaoFactory;
import modelDao.DepartmentDao;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        Department department = new Department(null,"Jogos");

        System.out.println("Test 1 insert\n");

        departmentDao.insert(department);

        System.out.println("Test 2 update\n");

        department.setName("Jogos2");
        departmentDao.update(department);

       // System.out.println("Test 3 delebyId");

        //departmentDao.deleteById(6);

        System.out.println("Test 4 findById\n");

        System.out.println(departmentDao.findById(2));

        System.out.println("FindAll test");
        
        List<Department> all = departmentDao.findAll();

        all.forEach(System.out:: println);
    }
}
