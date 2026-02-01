package com.university;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {

    private ProfessorDAO professorDAO = new ProfessorDAO();

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorDAO.getAllProfessors();
    }
}
