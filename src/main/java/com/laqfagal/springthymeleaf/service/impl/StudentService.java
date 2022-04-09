package com.laqfagal.springthymeleaf.service.impl;

import com.laqfagal.springthymeleaf.model.Student;
import com.laqfagal.springthymeleaf.repository.IStudentRepository;
import com.laqfagal.springthymeleaf.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    private IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> getStudentByName(String name) {
        return studentRepository.findByNameContaining(name);
    }

}