package com.example.CRUDSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentsService implements StudentsInterfaceService {
    @Autowired
    private StudentsInterface data;
    @Override
    public List<StudentsModel> list() {
        return (List<StudentsModel>) data.findAll();
    }

    @Override
    public Optional<StudentsModel> listById(int idStudent) {
        return data.findById(idStudent);
    }

    @Override
    public int save(StudentsModel studentsModel) {
        int answer = 0;
        StudentsModel studentsModel1 = data.save(studentsModel);
        if(!studentsModel1.equals(null)) {
            answer = 1;
        }
        return answer;
    }

    @Override
    public void delete(int idStudent) {
        data.deleteById(idStudent);
    }
}
