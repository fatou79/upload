package com.fatou.springbootfileupload.service;

import org.springframework.web.multipart.MultipartFile;

import com.fatou.springbootfileupload.entity.Attachment;

public interface AttachmentService {

	Attachment saveAttachment(MultipartFile file) throws Exception;
	Attachment getAttachment(String fileId) throws Exception;
}
