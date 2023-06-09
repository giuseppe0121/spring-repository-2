package com.example.springrepository2.repository;


import com.example.springrepository2.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Repository for ProgrammingLanguage table"))
public interface ProgrammingRepository extends JpaRepository<ProgrammingLanguage,Long> {


}
