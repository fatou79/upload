package com.fatou.springbootfileupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatou.springbootfileupload.entity.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,String> {

}
