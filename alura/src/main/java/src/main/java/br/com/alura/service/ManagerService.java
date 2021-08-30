package src.main.java.br.com.alura.service;

import src.main.java.br.com.alura.dto.CourseApprovalDto;
import src.main.java.br.com.alura.dto.ManagerDTO;
import src.main.java.br.com.alura.modelo.Course;
import src.main.java.br.com.alura.modelo.Manager;

import java.time.LocalDateTime;

public class ManagerService {

    public void ApproveCourse(CourseApprovalDto courseApproval, ManagerDTO manager) {

        if(courseApproval.getApprovedBy().equals(manager.getId())){
            //devolver erro
        } ;
            //atualizar valor no banco de dados no course aproval




    }

    public void CreateCourse( Long id,String name, String category,int workload){



        Course curso = Course.builder().id(id).name(name).category(category).workload(workload).build();
        //passar o curso para o banco de dados
    }


}