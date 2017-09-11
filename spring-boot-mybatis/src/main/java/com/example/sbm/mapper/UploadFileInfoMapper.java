package com.example.sbm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.example.sbm.domain.UploadFileInfo;

@Mapper
public interface UploadFileInfoMapper {

	@Insert("insert into upload_file_info(batch_id,file_name,file_path,upload_time) values(#{batchId},#{fileName},#{filePath},#{uploadTime})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
	public int saveFileInfo(UploadFileInfo fileInfo);
	
	@Select("select * from upload_file_info")
	@Results({
		@Result(property="batchId",column="batch_id"),
		@Result(property="fileName",column="file_name"),
		@Result(property="filePath",column="file_path"),
		@Result(property="uploadTime",column="upload_time")
	})
	public List<UploadFileInfo> getUploadFileInfo();

}
