package com.uploadFile.api.service;

import com.uploadFile.api.entity.FileResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface FileService {
   public List<FileResponse> uploadFile(List<MultipartFile> files) throws IOException;
}
