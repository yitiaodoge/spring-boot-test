package com.example.sbm.service;

import java.util.List;

import com.example.sbm.domain.UploadFileInfo;

public interface FileExecuteService {

	public int saveFile(UploadFileInfo fileInfo);
	
	public List<UploadFileInfo> getUploadFileInfo();

}
