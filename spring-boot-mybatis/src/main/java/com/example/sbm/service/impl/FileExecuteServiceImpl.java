package com.example.sbm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sbm.domain.UploadFileInfo;
import com.example.sbm.mapper.UploadFileInfoMapper;
import com.example.sbm.service.FileExecuteService;


@Service
public class FileExecuteServiceImpl implements FileExecuteService {

	@Autowired
	private UploadFileInfoMapper mapper;
	
	@Override
	public int saveFile(UploadFileInfo fileInfo) {
		// TODO 自动生成的方法存根
		return mapper.saveFileInfo(fileInfo);
	}

	@Override
	public List<UploadFileInfo> getUploadFileInfo() {
		// TODO 自动生成的方法存根
		return mapper.getUploadFileInfo();
	}

}
