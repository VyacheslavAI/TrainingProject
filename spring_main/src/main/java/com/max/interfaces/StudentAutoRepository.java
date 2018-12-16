package com.max.interfaces;


import com.max.beans.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StudentAutoRepository extends JpaRepository<Student, Long>, StudentRepo {

    @Query("select s from Student s where s.name = :name")
    Student getByName(@Param("name") String name);

//    Student readByName(String name);
//    Student findByName(String name);
//    int countByName(String name);
//
//    List<Student> getDistinctByName(String name);
//    Student getDistinctByNameAndId(String name, int id);
}
