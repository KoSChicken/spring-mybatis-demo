package io.koschicken.springmybatisdemo;

import io.koschicken.springmybatisdemo.domain.Student;
import io.koschicken.springmybatisdemo.service.StudentService;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentMapperTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentMapperTest.class);

    @Autowired
    private StudentService studentService;

    @Test
    void testGetAll() {
        List<Student> all = studentService.getAll();
        assertNotNull(all);
        all.forEach(student -> LOGGER.info("{}", student));
    }

    @Test
    void testGetById() {
        Student student = studentService.getById(1);
        assertNotNull(student);
        LOGGER.info("{}", student);
    }

    @Test
    void testInsert() {
        Student student = new Student();
        student.setSName("张三");
        student.setMark(new BigDecimal("95.5"));
        student.setSex("男");
        studentService.insert(student);
    }

    @Test
    void testUpdate() {
        Student student = studentService.getById(1);
        student.setSName("王五");
        studentService.update(student);
    }

    @Test
    void testDelete() {
        studentService.delete(8);
    }
}
