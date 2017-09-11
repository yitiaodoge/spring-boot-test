package com.example.sbm.rest;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.sbm.domain.UploadFileInfo;
import com.example.sbm.service.FileExecuteService;

@RestController
@RequestMapping(value = "/api")
public class FileRest {

	@Autowired
	private FileExecuteService service;

	@RequestMapping(value = "/saveFileInfo", method = RequestMethod.POST)
	public int saveFileInfo() {
		
		UploadFileInfo fileInfo = new UploadFileInfo();
		fileInfo.setBatchId(UUID.randomUUID().toString().replace("-", ""));
		fileInfo.setFileName("2");
		fileInfo.setFilePath("3");
		fileInfo.setUploadTime(new Date().getTime());
		return service.saveFile(fileInfo);

	}
	
	@RequestMapping(value = "/getUUID",method = RequestMethod.POST)
	public String getUUID() {
		
		
	
		return UUID.randomUUID().toString();
			
		
	}
	
	@RequestMapping(value = "/getUploadFileInfo",method = RequestMethod.POST)
	public List<UploadFileInfo> getUploadFileInfo() {
		
		return service.getUploadFileInfo();
		
	}

}
