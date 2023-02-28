package com.example.CRUDSpringBoot;

import java.util.List;
import java.util.Optional;

public interface StudentsInterfaceService {
    public List<StudentsModel> list();
    public Optional<StudentsModel> listById (int id);
    public int save (StudentsModel studentsModel);
    public void delete (int id);

}
