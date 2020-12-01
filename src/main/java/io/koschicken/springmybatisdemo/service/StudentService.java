package io.koschicken.springmybatisdemo.service;

import io.koschicken.springmybatisdemo.domain.Student;
import io.koschicken.springmybatisdemo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    public Student getById(Integer id) {
        return studentMapper.getById(id);
    }

    public void insert(Student student) {
        studentMapper.insert(student);
    }

    public void update(Student student) {
        studentMapper.update(student);
    }

    public void delete(Integer id) {
        studentMapper.delete(id);
    }
}
