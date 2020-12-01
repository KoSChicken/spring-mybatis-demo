package io.koschicken.springmybatisdemo.mapper;

import io.koschicken.springmybatisdemo.domain.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("select * from student")
    List<Student> getAll();

    @Select("select * from student where id = #{id}")
    Student getById(Integer id);

    @Insert({"insert into student(sname, mark, sex) values (#{sName}, #{mark}, #{sex})"})
    void insert(Student student);

    @Update({"update student set sname = #{sName}, mark = #{mark}, sex = #{sex} where id = #{id}"})
    void update(Student student);

    @Delete("delete from student where id = #{id}")
    void delete(Integer id);
}
